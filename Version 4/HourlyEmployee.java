import java.util.*;
import static java.lang.System.out;

public class HourlyEmployee extends Employee {

    String empName;
    String totalHoursWorked;
    String ratePerHour;
    static String empChoose;
    static int idChoose;
    static double TotalhoursChoose;
    static double rateChoose;
    private String employee;
    static String computed;
    static HourlyEmployee main2 = new HourlyEmployee();
    static Employee.FirstGroup G1 = main2.new FirstGroup();
    static Scanner obj = new Scanner(System.in);
    
    public void computeSalary(){

    }
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

        // a ob = new HourlyEmployee();
        // out.println(ob.toString());

        do {
            out.println("\nSelect employee(exit): ");
            String input = obj.nextLine();

            main.setName(input);

            try {
                if (main.getName().equals("exit")) {
                    System.exit(0);
                } else if (Integer.valueOf(main.getName()) <= G1.empList.length) {
                    switch (Integer.valueOf(main.getName())) {
                        case 1:
                            empChoose = G1.empList[0];
                            idChoose = G1.idList[0];
                            TotalhoursChoose = G1.TotalhoursList[0];
                            rateChoose = G1.rateList[0];

                            break;
                        case 2:
                            empChoose = G1.empList[1];
                            idChoose = G1.idList[1];
                            TotalhoursChoose = G1.TotalhoursList[1];
                            rateChoose = G1.rateList[1];
                            break;
                        case 3:
                            empChoose = G1.empList[2];
                            idChoose = G1.idList[2];
                            TotalhoursChoose = G1.TotalhoursList[2];
                            rateChoose = G1.rateList[2];
                            break;
                        case 4:
                            empChoose = G1.empList[3];
                            idChoose = G1.idList[3];
                            TotalhoursChoose = G1.TotalhoursList[3];
                            rateChoose = G1.rateList[3];
                            break;
                        case 5:
                            empChoose = G1.empList[4];
                            idChoose = G1.idList[4];
                            TotalhoursChoose = G1.TotalhoursList[4];
                            rateChoose = G1.rateList[4];
                            break;
                        default:
                            break;

                    }
                    while (true) {
                        out.println("Click \'okay\' to show information.");
                        String input2 = obj.nextLine();
                        if (input2.equals("okay")) {
                            String compute = main.computeSalary(TotalhoursChoose, rateChoose).toString();
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
    public String computeSalary(double totalHoursWorked, double ratePerHour) {
        float totalHours = (float) totalHoursWorked;
        float overtimeHours = 0;

        if (totalHoursWorked > 40) {
            overtimeHours = (float) (totalHoursWorked - 40);
            totalHours = 40;
        }
        double total = totalHours * ratePerHour + overtimeHours * ratePerHour * 1.5;
        return String.valueOf(total);
    }

    // converts all information into a string
    public String toString() {
        return "\n" + displayInfo(idChoose, empChoose, TotalhoursChoose, rateChoose) + "\nTotal salary: Php."
                + computed;
    }

    public static void TestingMain() {
        // Connected to arrays in Employee.java
        for (int i = 1; i <= G1.empList.length; i++) {
            out.println(i + ". " + G1.empList[i - 1]);
        }
    }

}
