import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ParticipantFactory factory = new Factory();

        List<User> users = getPredefinedParticipants(factory);
        ChatRoom.setName("Cat fans");
        ChatRoom.addUserToParticipants(users);
        users.get(0).sendMessage("Hello!");
        users.get(1).sendMessage("Hi!");
        users.get(3).sendMessage("Have you a cat?");
        users.get(0).sendMessage("");
        users.get(4).sendMessage(null);
        users.get(1).sendMessage("Yes. ");
        users.get(2).sendMessage("addBot");
        users.get(5).sendMessage("What is your cat name?");
    }

    private static List<User> getPredefinedParticipants(ParticipantFactory factory) {
        List<User> predefinedParticipants = new ArrayList<>();
        predefinedParticipants.add(factory.getUser("Nikolai"));
        predefinedParticipants.add(factory.getUser("Petur"));
        predefinedParticipants.add(factory.getUser("Gergana"));
        predefinedParticipants.add(factory.getUser("Mariq"));
        predefinedParticipants.add(factory.getUser("Dimitur"));
        predefinedParticipants.add(factory.getUser("Ioana"));

        return predefinedParticipants;
    }
}