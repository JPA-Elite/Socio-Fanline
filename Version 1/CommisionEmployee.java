import java.util.*;
import java.time.*;
import static java.lang.System.out;

public class CommisionEmployee {
    static CommisionEmployee main = new CommisionEmployee();
    static int empID;
    static String empName;
    static double totalSales;
    static String computed;
    static Scanner obj = new Scanner(System.in);
    static HashMap<String, Object> employee_list = new HashMap<String, Object>();
    static Object[][] employee_info = { { null, null, null, null }, { null, null, null, null },
            { null, null, null, null }, { null, null, null, null }, { null, null, null, null } };
    static int count = 0;

    // Default constructor
    public CommisionEmployee() {
        LocalDate mydate = LocalDate.now();
        LocalTime mytime = LocalTime.now();
        out.println("----------Commision Employees----------\nDate: "
                + mydate + "\nTime " + mytime + "\n" +
                "--------------------\n");
    }

    public static void main(String[] args) {
        TestingMain(21103103, "Joseph Tan", 10499);
        TestingMain(123256743, "Jovie Bendijo", 32870);
        TestingMain(12345271, "Albert Cruz", 123457);
        TestingMain(10345023, "Rafael Mae Sanchez", 9700);
        TestingMain(23487965, "Rodrigo Martinez", 53200);

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
                            CommisionEmployee.empID = Integer.valueOf(employee_info[0][0].toString());
                            CommisionEmployee.empName = employee_info[0][1].toString();
                            CommisionEmployee.totalSales = Double.valueOf(employee_info[0][2].toString());

                            break;
                        case 2:
                            CommisionEmployee.empID = Integer.valueOf(employee_info[1][0].toString());
                            CommisionEmployee.empName = employee_info[1][1].toString();
                            CommisionEmployee.totalSales = Double.valueOf(employee_info[1][2].toString());
                            break;
                        case 3:
                            CommisionEmployee.empID = Integer.valueOf(employee_info[2][0].toString());
                            CommisionEmployee.empName = employee_info[2][1].toString();
                            CommisionEmployee.totalSales = Double.valueOf(employee_info[2][2].toString());
                            break;
                        case 4:
                            CommisionEmployee.empID = Integer.valueOf(employee_info[3][0].toString());
                            CommisionEmployee.empName = employee_info[3][1].toString();
                            CommisionEmployee.totalSales = Double.valueOf(employee_info[3][2].toString());
                            break;
                        case 5:
                            CommisionEmployee.empID = Integer.valueOf(employee_info[4][0].toString());
                            CommisionEmployee.empName = employee_info[4][1].toString();
                            CommisionEmployee.totalSales = Double.valueOf(employee_info[4][2].toString());
                            break;
                        default:
                            break;
                    }
                    while (true) {
                        main.displayInfo(empID, empName, totalSales);
                        out.println("Click \'okay\' to show information.");
                        String input2 = obj.nextLine();
                        if (input2.equals("okay")) {
                            String compute = computeSalary(totalSales);
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
        return empName;
    }

    // Setter
    public void setName(String empNew) {
        CommisionEmployee.empName = empNew;
    }

    // converts all information into a string
    public String toString() {
        return "\n" + displayInfo(empID, empName, totalSales) + "\nTotal salary: Php."
                + computed;

    }

    // displays information
    public Object displayInfo(int empID, String empName, double totalSales) {
        String Result = "Employee Name: " + empName + "\nEmployee ID: " + empID +
                "\nTotal Sales: Php." + totalSales;
        return Result;

    }

    // compute employee's salary
    static String computeSalary(double totalSales) {
        double result = 0;
        if (totalSales <= 10000) {
            result = totalSales * 0.05;
        } else if (totalSales > 10000 && totalSales < 50000) {
            result = totalSales * 0.10;
        } else if (totalSales > 50000 && totalSales < 100000) {
            result = totalSales * 0.15;
        } else if (totalSales > 100000) {
            result = totalSales * 0.30;
        }
        return String.valueOf(result);
    }

    public static void TestingMain(int empID, String empName, double totalSales) {
        employee_info[count][0] = empID;
        employee_info[count][1] = empName;
        employee_info[count][2] = totalSales;
        String formatted = String.format(
                (count + 1) + ". \n" +
                        "Employee's ID: " + empID
                        + "\nEmployee's Name: " + empName
                        + "\nTotal Sales: Php." + totalSales + "\n");
        employee_list.put(empName, formatted);
        out.println(formatted);
        count++;

    }
}