package day13;

import java.util.ArrayList;
import java.util.List;

public class MessageDataBase {

    private static List<Message> messages = new ArrayList<>();

    public static void addNewMessage(User sender, User receiver, String text) {
        messages.add(new Message(sender, receiver, text));
    }

    public static void showDialog(User user_1, User user_2) {
        for(Message message: messages){
            if (message.getSender() == user_1 && message.getReceiver() == user_2
                    || message.getSender() == user_2 && message.getReceiver() == user_1) {

                System.out.println(message.getSender() + ": " + message.getText());
            }
        }
    }

    public static List<Message> getMessages() {
        return messages;
    }
}
