package day13;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String username;
    private List<User> subscribtion;

    public User(String username) {
        this.username = username;
        this.subscribtion = new ArrayList<>();
    }

    public void subscribe(User user) {
        this.subscribtion.add(user);
    }

    public String getUsername() {
        return username;
    }

    public List<User> getSubscriptions() {
        return subscribtion;
    }

    public boolean isSubscribe(User user) {
        for(User currentUser: subscribtion) {
            if(currentUser.getUsername().equals(user.getUsername())) {
                return true;
            }
        }
        return false;
    }

    public boolean isFriend(User user) {
        return this.isSubscribe(user) && user.isSubscribe(this);
    }

    public void sendMessage(User user, String text) {
        MessageDataBase.addNewMessage(this, user, text);
    }

    public String toString(){
        return username;
    }
}
