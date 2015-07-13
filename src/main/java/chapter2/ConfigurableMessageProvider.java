package chapter2;


import chapter1.MessageProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service("messageProvider")
public class ConfigurableMessageProvider implements MessageProvider {

    private String message;

    @Autowired
    public ConfigurableMessageProvider(@Value("This is a configurable message")
                                       String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
