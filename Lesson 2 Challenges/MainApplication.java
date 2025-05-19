public class MainApplication {
    public static void main(String[] args) {
        Admin a1 = new Admin(1212, "Jackson", "1524x");
        User u1 = new User(4567, "Thomas");

        a1.performOperation(new Update());
        u1.performOperation(new View());
    }
}
