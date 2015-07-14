package chapter2;

import org.springframework.context.support.GenericXmlApplicationContext;

public class BeanNameAliasing {
    public static void main(String[] args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:app-context-xml.xml");
        ctx.refresh();
        String name1 = (String) ctx.getBean("name1");
        String name2 = (String) ctx.getBean("name2");
        String name3 = (String) ctx.getBean("name3");
        String name4 = (String) ctx.getBean("name4");
        String name5 = (String) ctx.getBean("name5");
        String name6 = (String) ctx.getBean("name6");

        System.out.println(name1 == name2);
        System.out.println(name2 == name3);
        System.out.println(name3 == name4);
        System.out.println(name4 == name5);
        System.out.println(name5 == name6);

    }
}
