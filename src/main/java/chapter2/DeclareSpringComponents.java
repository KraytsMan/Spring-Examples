package chapter2;

import chapter1.MessageProvider;
import org.springframework.context.support.GenericXmlApplicationContext;

public class DeclareSpringComponents {
    public static void main(String[] args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:app-context-xml.xml");
        ctx.refresh();
        MessageProvider messageProvider = ctx.getBean("messageProvider",
                MessageProvider.class);
        System.out.println(messageProvider.getMessage());
    }
}
