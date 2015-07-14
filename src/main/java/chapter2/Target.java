package chapter2;

import org.springframework.context.support.GenericXmlApplicationContext;

public class Target {

    private Foo foo;

    private Foo foo2;

    private Bar bar;

    public Target() {
    }

    public Target(Foo foo) {
        System.out.println("Target(Foo) called");
    }

    public Target(Foo foo, Foo foo2) {
        System.out.println("Target(Foo, Bar) called");
    }

    public void setFoo(Foo foo) {
        this.foo = foo;
        System.out.println("Property foo set");
    }

    public void setFoo2(Foo foo2) {
        this.foo2 = foo2;
        System.out.println("Property foo2 set");
    }

    public void setBar(Bar bar) {
        this.bar = bar;
        System.out.println("Property bar set");
    }

    public static void main(String[] args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:autowiring.xml");
        ctx.refresh();
        Target target = null;
        System.out.println("Using byName:\n");
        target = (Target) ctx.getBean("targetByName");
        System.out.println("\nUsing byType:\n");
        target = (Target) ctx.getBean("targetByType");
        System.out.println("\nUsing constructor:\n");
        target = (Target) ctx.getBean("targetConstructor");
    }
}
