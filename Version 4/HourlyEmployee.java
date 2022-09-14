import java.util.*;
import static java.lang.System.out;

class HourlyEmployee_ extends Employee {
    public String computeSalary() {
        double totalHours = Double.valueOf(HourlyEmployee.TotalhoursChoose);
        float overtimeHours = 0;

        if (Double.valueOf(HourlyEmployee.TotalhoursChoose) > 40) {
            overtimeHours = (float) (Double.valueOf(HourlyEmployee.TotalhoursChoose) - 40);
            totalHours = 40;
        }
        double total = totalHours * Double.valueOf(HourlyEmployee.rateChoose) +
                overtimeHours * Double.valueOf(HourlyEmployee.rateChoose) * 1.5;
        return String.valueOf(total);
    }
}

public class HourlyEmployee {

    String empName;
    String totalHoursWorked;
    String ratePerHour;
    static String empChoose;
    static int idChoose;
    static double TotalhoursChoose;
    static double rateChoose;
    private String employee;
    static String computed;
    static HourlyEmployee_ main2 = new HourlyEmployee_();
    static HourlyEmployee_.FirstGroup Group1 = main2.new FirstGroup();
    static Scanner obj = new Scanner(System.in);

    // Default constructor

    public HourlyEmployee() {
        TestingMain();
    }

    public HourlyEmployee(int newTotalHours, int ratePerHour) {
        newTotalHours = Integer.valueOf(totalHoursWorked);
        ratePerHour = Integer.valueOf(ratePerHour);
    }

    public HourlyEmployee(double newTotalHours, double ratePerHour) {
        newTotalHours = Double.valueOf(totalHoursWorked);
        ratePerHour = Double.valueOf(ratePerHour);
    }

    public static void main(String[] args) {
        HourlyEmployee main = new HourlyEmployee();
        do {
            out.println("\nSelect employee(exit): ");
            String input = obj.nextLine();

            main.setName(input);

            try {
                if (main.getName().equals("exit")) {
                    System.exit(0);
                } else if (Integer.valueOf(main.getName()) <= Group1.empList.length) {
                    switch (Integer.valueOf(main.getName())) {
                        case 1:
                            empChoose = Group1.empList[0];
                            idChoose = Group1.idList[0];
                            TotalhoursChoose = Group1.TotalhoursList[0];
                            rateChoose = Group1.rateList[0];

                            break;
                        case 2:
                            empChoose = Group1.empList[1];
                            idChoose = Group1.idList[1];
                            TotalhoursChoose = Group1.TotalhoursList[1];
                            rateChoose = Group1.rateList[1];
                            break;
                        case 3:
                            empChoose = Group1.empList[2];
                            idChoose = Group1.idList[2];
                            TotalhoursChoose = Group1.TotalhoursList[2];
                            rateChoose = Group1.rateList[2];
                            break;
                        case 4:
                            empChoose = Group1.empList[3];
                            idChoose = Group1.idList[3];
                            TotalhoursChoose = Group1.TotalhoursList[3];
                            rateChoose = Group1.rateList[3];
                            break;
                        case 5:
                            empChoose = Group1.empList[4];
                            idChoose = Group1.idList[4];
                            TotalhoursChoose = Group1.TotalhoursList[4];
                            rateChoose = Group1.rateList[4];
                            break;
                        default:
                            break;

                    }
                    while (true) {
                        out.println("Click \'okay\' to show information.");
                        String input2 = obj.nextLine();
                        if (input2.equals("okay")) {
                            String compute = main2.computeSalary().toString();
                            computed = compute;
                            out.println(main.toString());
                            break;
                        } else {
                            out.println("Invalid type occurred!");
                        }
                    }

                } else {
                    out.println("Number chosen is invalid!");
                }

            } catch (NumberFormatException e) {
                out.println("Invalid type occurred!");
            }

        } while (true);

    }

    // Getter
    public String getName() {
        return employee;
    }

    // Setter
    public void setName(String empNew) {
        this.employee = empNew;
    }

    // displays information
    public Object displayInfo(int empID, String empName, double totalHoursWorked, double ratePerHour) {
        String Result = "Employee Name: " + empName + "\nEmployee ID: " + empID +
                "\nTotal Hours Worked: " + totalHoursWorked + " hour/s" +
                "\nRate per Hour: Php." + ratePerHour;
        return Result;
    }

    // compute employee's salary

    // converts all information into a string
    public String toString() {
        return "\n" + displayInfo(idChoose, empChoose, TotalhoursChoose, rateChoose) + "\nTotal salary: Php."
                + computed;
    }

    public static void TestingMain() {
        // Connected to arrays in Employee.java
        for (int i = 1; i <= Group1.empList.length; i++) {
            out.println(i + ". " + Group1.empList[i - 1]);
        }
    }

}
