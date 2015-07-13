package chapter1;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class MessageSupportFactory {
    private static MessageSupportFactory instance = null;
    private Properties properties = null;
    private MessageRenderer renderer = null;
    private MessageProvider provider = null;

    public MessageSupportFactory() {
        properties = new Properties();
        try {
            properties.load(new FileInputStream("src/main/resources/msf.properties"));
            String rendererClass = properties.getProperty("renderer.class");
            String providerClass = properties.getProperty("provider.class");
            try {
                renderer = (MessageRenderer) Class.forName(rendererClass).newInstance();
                provider = (MessageProvider) Class.forName(providerClass).newInstance();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    static {
        instance = new MessageSupportFactory();
    }
    public static MessageSupportFactory getInstance() {
        return instance;
    }
    public MessageRenderer getMessageRenderer() {
        return renderer;
    }
    public MessageProvider getMessageProvider() {
        return provider;
    }

}
