public class Company {
    private Employee[] employees = new Employee[3];
    private int nextIndex = 0;

    public Employee get(int index) {
        return employees[index];
    }

    public void add(Employee employee) {
            employees[nextIndex] = employee;
            nextIndex++;
    }
}
