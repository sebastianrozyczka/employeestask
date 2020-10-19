public class Employees {
    public static void main(String[] args) {
        Employee[] employees = new Employee[2];
        double payouts = 0;
        EmployeeCreator employeeCreator = new EmployeeCreator();
        for(int i = 0; i < employees.length; i++){
            employees[i] = employeeCreator.create();
            payouts += employees[i].getSalary();
        }
        System.out.println("Suma wypłat pracowników: " + payouts);
    }
}
