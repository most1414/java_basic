package staticClass;

public class Main {
    public static void main(String[] args) {

        // Odwolanie do skladowej statycznej
        // 1. Nie wymaga utworzenia obiektu
        // 2. Odwolujemy sie poprzedzajac skladowa nazwa klasy
        // 3. jest tylko jedna kopia skladowej statycznej w ramach klasy
        User user1 = new User("x", "x");
        System.out.println(user1);
        System.out.println(User.globalId);
        User user2 = new User("y", "y");
        System.out.println(user2);
        User.incrementGlobalId();
        System.out.println(User.globalId);
        User user3 = new User("z", "z");
        System.out.println(user3);
    }
}
