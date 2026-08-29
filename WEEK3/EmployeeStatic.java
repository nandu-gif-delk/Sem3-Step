public class EmployeeStatic {
    String empName;
    double salary;

    static String companyName = "Bright Horizon Technologies";
    static int employeeCount = 0;

    EmployeeStatic(String empName, double salary) {
        this.empName = empName;
        this.salary = salary;
        employeeCount++;
    }

    static void printCompanyInfo() {
        System.out.println(companyName);
        System.out.println("Employees on record: " + employeeCount);
    }

    public static void main(String[] args) {
        EmployeeStatic emp1 = new EmployeeStatic("Arjun", 50000);
        EmployeeStatic emp2 = new EmployeeStatic("Priya", 60000);
        EmployeeStatic emp3 = new EmployeeStatic("Rahul", 55000);

        EmployeeStatic.printCompanyInfo();
    }
}