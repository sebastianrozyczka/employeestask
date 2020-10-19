import java.util.Scanner;

public class EmployeeCreator {
    Employee create() {
        Scanner scanner = new Scanner(System.in);
        Employee employee = new Employee();

        System.out.println("Imię: ");
        employee.setFirstName(scanner.nextLine());
        System.out.println("Nazwisko: ");
        employee.setLastName(scanner.nextLine());
        System.out.println("Wypłata: ");
        employee.setSalary(scanner.nextDouble());

        return employee;
    }
}
