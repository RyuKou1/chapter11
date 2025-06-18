package chapter11;

public class Main {
    public static void main(String[] args) {
        Fool fool = new Fool();
        fool.talk();
        fool.watch();
        fool.hear();
        fool.attack(new Matango());
        fool.run();
    }
}
