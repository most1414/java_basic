package oop;

// klasa glowna - uruchomieniowa
public class Main {
    public static void main(String[] args) {
        // utworzenie obiektu
        User userOne = new User();
        // odwolanie do pola klasowego
        userOne.name = "Michal";
        userOne.lastName = "Ostrowski";
        userOne.activated = true;
        userOne.salary_net = 5555;
        userOne.gender = 'M';
        // wywolanie metody
        userOne.printUser();

        User userTwo = new User("Adam","Kowalski",'M', false, 4000);
        userTwo.printUser();

        User userThree = new User("Anna","Nowak",'K', true, 8000);
        userThree.printUser();
        double salaryGross = userOne.calculateSalaryGross();
        System.out.println("salaryGross =" + salaryGross);
        System.out.println("Calculated salary gross: "+ userTwo.calculateSalaryGross());
        System.out.println("==============");
        System.out.println(userThree.modifyUserParameters(15000, true));

    }
}
