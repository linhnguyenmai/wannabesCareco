import java.util.Scanner;

public class Employee {
    private String name;
    private String position;
    private Integer salary;

//    [accept modifier] [tên class] ([tham số truyền vào] (có hoặc không)) {
//
//    }
    public Employee() {

    }

    public Employee(String name, String position, Integer salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    public void calculateHourlyRate() {
        if (position.toLowerCase().equals("parttime")) {
            salary /= 88; // Hourly rate for part-time
        } else {
            salary /= 176; // Assuming 40 hours/week  = 176 hours/year for full-time
        }
    }

    public void calculateSalaryByHour() {
        if (position == "partime") {
            salary = salary/88;
        }
    }

    @Override
    public String toString() {
        return String.format("%s: %d", name, salary);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter employee name: ");
        String name = scanner.nextLine();

        System.out.print("Enter employee position (FullTime/PartTime): ");
        String position = scanner.nextLine();

        System.out.print("Enter employee salary: ");
        Integer salary = scanner.nextInt();

        Employee employee = new Employee(name, position, salary);
        employee.calculateHourlyRate();

        System.out.println(employee);

        Employee employee1 = new Employee(name, position, salary);

        Employee employee2 = new Employee();
    }
}
