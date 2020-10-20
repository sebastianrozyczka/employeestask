public class Company {
    private Employee[] employees = new Employee[3];
    int nextIndex = 0;

    public String get(int index) {
        return "Pracownik o indexie: " + index + " to: " +
                employees[index - 1].getFirstName()
                + " " + employees[index - 1].getLastName() + ". Jego wypłata to: "
                + employees[index - 1].getSalary() + " zł.";
    }

    public void add(Employee employee) {
            employees[nextIndex] = employee;
            nextIndex++;
    }
}
