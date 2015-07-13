package chapter2;


import org.springframework.context.support.GenericXmlApplicationContext;

public class UsingSetterInjection {

    public static void main(String[] args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:app-context-xml.xml");
        ctx.refresh();
        MessageRenderer messageRenderer = ctx.getBean("messageRenderer",
                MessageRenderer.class);
        messageRenderer.render();
    }
}


