package chapter2;

import chapter1.MessageProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("messageRenderer")
public class StandardOutMessageRenderer implements MessageRenderer {

    private MessageProvider provider = null;

    public void render() {
        if (provider == null) {
            throw new RuntimeException(
                    "You must set the property messageProvider of class:"
                            + StandardOutMessageRenderer.class.getName());
        }
        System.out.println(provider.getMessage());
    }

    @Autowired
    public void setMessageProvider(MessageProvider provider) {
        this.provider= provider;
    }

    public MessageProvider getMessageProvider() {
        return this.provider;
    }
}
