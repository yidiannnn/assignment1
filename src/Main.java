public class Main {
    public static void main(String[] args) {

        User u1 = new User(1, "Aether");
        User u2 = new User(2, "Dana");

        Building b1 = new Building("Library", 200);
        Building b2 = new Building("Lab", 50);

        u1.print();
        u2.print();

        b1.print();
        b2.print();

        if (b1.getCapacity() > b2.getCapacity()) {
            System.out.println(b1.getName() + " is bigger than " + b2.getName());
        } else {
            System.out.println(b2.getName() + " is bigger than " + b1.getName());
        }
    }
}