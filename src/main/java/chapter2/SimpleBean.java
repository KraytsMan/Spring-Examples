package chapter2;


import org.springframework.context.support.GenericXmlApplicationContext;

public class SimpleBean {

    public String name;

    public int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "SimpleBean{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {
        GenericXmlApplicationContext context = new GenericXmlApplicationContext();
        context.load("classpath:app-context-xml.xml");
        context.refresh();
        SimpleBean parent = (SimpleBean) context.getBean("inheritParent");
        SimpleBean child = (SimpleBean) context.getBean("inheritChild");
        System.out.println("Parent:\n" + parent);
        System.out.println("Child:\n" + child);
    }
}
