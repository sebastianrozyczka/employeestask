import java.util.Scanner;

public class EmployeeCreator {
    public Employee create() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Imię: ");
        String firstName = scanner.nextLine();
        System.out.println("Nazwisko: ");
        String lastName = scanner.nextLine();
        System.out.println("Wypłata: ");
        double salary = scanner.nextDouble();

        return new Employee(firstName, lastName, salary);
    }
}
