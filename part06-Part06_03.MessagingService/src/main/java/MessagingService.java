
import java.util.ArrayList;

/**
 * File: MessagingService.java 
 * Author: Anthony Francis 
 * Date: Mar 11, 2020 
 * Purpose:
 */

public class MessagingService {
    
    private ArrayList<Message> message;

    public MessagingService() {
        this.message = new ArrayList<>();
    }

    public void add(Message message) {
        if (message.getContent().length() <= 280) {
            this.message.add(message);
        }
    }

    public ArrayList<Message> getMessages() {
        return this.message;
    }
}
