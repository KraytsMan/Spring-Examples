package chapter2;

import chapter1.MessageProvider;
import org.springframework.stereotype.Service;

@Service("messageProvider")
public class HelloWorldMessageProvider implements MessageProvider{
    public String getMessage() {
        return "Hello World!";
    }
}
