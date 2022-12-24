package day13;

public class Test {
    public static void main(String[] args) {

        User user_1 = new User("user_1");
        User user_2 = new User("user_2");
        User user_3 = new User("user_3");

        user_1.sendMessage(user_2, "Hello from user_1");
        user_1.sendMessage(user_2, "How are you?");

        user_2.sendMessage(user_1, "Hey, user_1");
        user_2.sendMessage(user_1, "I'm user_2. Nice to meet you.");
        user_2.sendMessage(user_1, "I'm fine! And you?");

        user_3.sendMessage(user_1, "Hi! My name is user_3");
        user_3.sendMessage(user_1, "Do you remember me?");
        user_3.sendMessage(user_1, "We went to the same school");

        user_1.sendMessage(user_3, "Hey, user_3. Sure! I remember you.");
        user_1.sendMessage(user_3, "So nice to see you again");
        user_1.sendMessage(user_3, "Let's meet up. Are you free tomorrow?");

        user_3.sendMessage(user_1, "Yep, I'm free tomorrow. Let's go.");

        MessageDataBase.showDialog(user_1, user_3);
        System.out.println("----------------------------------------");
        MessageDataBase.showDialog(user_1, user_2);


    }
}
