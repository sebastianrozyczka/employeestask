public class Employees {
    public static void main(String[] args) {
        Company company = new Company();
        EmployeeCreator employeeCreator = new EmployeeCreator();
        company.add(employeeCreator.create());
        company.add(employeeCreator.create());
        company.add(employeeCreator.create());
        System.out.println(company.get(1));
        System.out.println(company.get(2));
        System.out.println(company.get(3));
    }
}
