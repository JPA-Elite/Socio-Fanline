import java.util.*;
import java.time.*;
import static java.lang.System.out;

public class HourlyEmployee {
    String empName;
    String empID;
    String totalHoursWorked;
    String ratePerHour;
    String empChoose;
    int idChoose;
    double TotalhoursChoose;
    double rateChoose;
    private String employee;
    static String computed;
    static Scanner obj = new Scanner(System.in);
    static HourlyEmployee main = new HourlyEmployee();
    static HashMap<String, Object> employee_list = new HashMap<String, Object>();
    static Object[][] employee_info = { { null, null, null, null }, { null, null, null, null },
            { null, null, null, null }, { null, null, null, null }, { null, null, null, null } };
    static int count = 0;

    // Default constructor
    public HourlyEmployee() {
        LocalDate mydate = LocalDate.now();
        LocalTime mytime = LocalTime.now();
        out.println("----------Hourly Employees----------\nDate: "
                + mydate + "\nTime " + mytime + "\n" +
                "--------------------\n");

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
        TestingMain(211037808, "Joshua Algadipe", 23, 200);
        TestingMain(323456743, "Janrae Fagaragan", 20, 200);
        TestingMain(12343276, "Jan Nino Baoc", 20, 200);
        TestingMain(98345623, "Mark Joseph Molina", 19, 200);
        TestingMain(23467865, "Juspher Balangyao", 23, 200);
        do {
            out.println("\nSelect employee(exit): ");
            String input = obj.nextLine();

            main.setName(input);
            try {
                if (main.getName().equals("exit")) {
                    System.exit(0);
                } else if (Integer.valueOf(main.getName()) <= employee_list.size()) {
                    switch (Integer.valueOf(main.getName())) {
                        case 1:
                            main.idChoose = Integer.valueOf(employee_info[0][0].toString());
                            main.empChoose = employee_info[0][1].toString();
                            main.TotalhoursChoose = Double.valueOf(employee_info[0][2].toString());
                            main.rateChoose = Double.valueOf(employee_info[0][3].toString());
                            break;
                        case 2:
                            main.idChoose = Integer.valueOf(employee_info[1][0].toString());
                            main.empChoose = employee_info[1][1].toString();
                            main.TotalhoursChoose = Double.valueOf(employee_info[1][2].toString());
                            main.rateChoose = Double.valueOf(employee_info[1][3].toString());

                            break;
                        case 3:
                            main.idChoose = Integer.valueOf(employee_info[2][0].toString());
                            main.empChoose = employee_info[2][1].toString();
                            main.TotalhoursChoose = Double.valueOf(employee_info[2][2].toString());
                            main.rateChoose = Double.valueOf(employee_info[2][3].toString());
                            break;
                        case 4:
                            main.idChoose = Integer.valueOf(employee_info[3][0].toString());
                            main.empChoose = employee_info[3][1].toString();
                            main.TotalhoursChoose = Double.valueOf(employee_info[3][2].toString());
                            main.rateChoose = Double.valueOf(employee_info[3][3].toString());
                            break;
                        case 5:
                            main.idChoose = Integer.valueOf(employee_info[4][0].toString());
                            main.empChoose = employee_info[4][1].toString();
                            main.TotalhoursChoose = Double.valueOf(employee_info[4][2].toString());
                            main.rateChoose = Double.valueOf(employee_info[4][3].toString());
                            break;
                        default:
                            break;

                    }
                    while (true) {
                        out.println("Click \'okay\' to show information.");
                        String input2 = obj.nextLine();
                        if (input2.equals("okay")) {
                            String compute = computeSalary(main.TotalhoursChoose, main.rateChoose).toString();
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
    static String computeSalary(double totalHoursWorked, double ratePerHour) {
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

    public static void TestingMain(int empID, String empName, double totalHoursWorked, double ratePerHour) {
        employee_info[count][0] = empID;
        employee_info[count][1] = empName;
        employee_info[count][2] = totalHoursWorked;
        employee_info[count][3] = ratePerHour;
        String formatted = String.format(
                (count + 1) + ". \n" +
                        "Employee's ID: " + empID
                        + "\nEmployee's Name: " + empName
                        + "\nTotal Hours Worked: " + totalHoursWorked + "hr/s"
                        + "\nRate per Hour: Php." + ratePerHour + "\n");
        employee_list.put(empName, formatted);
        out.println(formatted);
        count++;

    }

}
