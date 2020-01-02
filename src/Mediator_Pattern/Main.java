package Mediator_Pattern;

public class Main {
    public static void main(String[] args) {
        IChatRoom chatroom = new Mediator();
        User user1 = new ChatUser(chatroom,"1", "Ah kmav");
        User user2 = new ChatUser(chatroom, "2", "Ah Vira");

        chatroom.addUser(user1);
        chatroom.addUser(user2);

        user1.send("Hello Ah Vira", "2");
        user2.send("Hey Ah Kmav", "1");
    }
}
