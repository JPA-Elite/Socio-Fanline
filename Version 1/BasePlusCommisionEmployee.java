import java.util.*;
import java.time.*;
import static java.lang.System.out;

public class BasePlusCommisionEmployee {

    static int empID;
    static String empName;
    static double totalSales;
    // initial base salary
    static double baseSalary = 5000;
    static String computed;
    static Scanner obj = new Scanner(System.in);
    static HashMap<String, Object> employee_list = new HashMap<String, Object>();
    static Object[][] employee_info = { { null, null, null, null }, { null, null, null, null },
            { null, null, null, null }, { null, null, null, null }, { null, null, null, null } };
    static int count = 0;

    // Default constructor
    public BasePlusCommisionEmployee() {
        LocalDate mydate = LocalDate.now();
        LocalTime mytime = LocalTime.now();
        out.println("----------BasePlusCommision Employees----------\nDate: "
                + mydate + "\nTime " + mytime + "\n" +
                "--------------------\n");
    }

    public static void main(String[] args) {
        BasePlusCommisionEmployee main = new BasePlusCommisionEmployee();
        TestingMain(21123113, "Mary grace Galan", 13499);
        TestingMain(421256743, "Mikey Ferrer", 42870);
        TestingMain(15345275, "Jhon Vincent Arnaiz", 113457);
        TestingMain(70245023, "Lady ann Lebosada", 10700);
        TestingMain(13487565, "Christian Lance", 5200);
        String input_store;

        do {

            while (true) {
                out.println("\nAdd base salary to the employees: ");
                while (true) {
                    String input = obj.nextLine();
                    if (isAnumber(input)) {
                        input_store = input;
                        break;
                    } else {
                        out.println("type numbers only!");
                        continue;
                    }
                }
                baseSalary = Double.parseDouble(input_store);
                out.println("Select employee(exit): ");
                String input2 = obj.nextLine();
                main.setName(input2);
                try {
                    if (main.getName().equals("exit")) {
                        System.exit(0);
                    } else if (Integer.valueOf(main.getName()) <= employee_list.size()) {
                        switch (Integer.valueOf(main.getName())) {
                            case 1:
                                BasePlusCommisionEmployee.empID = Integer.valueOf(employee_info[0][0].toString());
                                BasePlusCommisionEmployee.empName = employee_info[0][1].toString();
                                BasePlusCommisionEmployee.totalSales = Double.valueOf(employee_info[0][2].toString());

                                break;
                            case 2:
                                BasePlusCommisionEmployee.empID = Integer.valueOf(employee_info[1][0].toString());
                                BasePlusCommisionEmployee.empName = employee_info[1][1].toString();
                                BasePlusCommisionEmployee.totalSales = Double.valueOf(employee_info[1][2].toString());
                                break;
                            case 3:
                                BasePlusCommisionEmployee.empID = Integer.valueOf(employee_info[2][0].toString());
                                BasePlusCommisionEmployee.empName = employee_info[2][1].toString();
                                BasePlusCommisionEmployee.totalSales = Double.valueOf(employee_info[2][2].toString());

                                break;
                            case 4:
                                BasePlusCommisionEmployee.empID = Integer.valueOf(employee_info[3][0].toString());
                                BasePlusCommisionEmployee.empName = employee_info[3][1].toString();
                                BasePlusCommisionEmployee.totalSales = Double.valueOf(employee_info[3][2].toString());

                                break;
                            case 5:
                                BasePlusCommisionEmployee.empID = Integer.valueOf(employee_info[4][0].toString());
                                BasePlusCommisionEmployee.empName = employee_info[4][1].toString();
                                BasePlusCommisionEmployee.totalSales = Double.valueOf(employee_info[4][2].toString());

                                break;
                            default:
                                break;
                        }
                        main.displayInfo(empID, empName, totalSales, baseSalary);
                        out.println("Click \'okay\' to show information");
                        String input3 = obj.nextLine();
                        try {
                            if (input3.equals("okay")) {
                                String compute = computeSalary(totalSales, baseSalary);
                                computed = compute;
                                out.println(main.toString());
                            } else {
                                out.println("Invalid type occurred!");
                            }
                        } catch (Exception e) {
                            out.println("Invalid type occurred!");
                        }
                    } else {
                        out.println("Number chosen is invalid!");
                    }

                } catch (NumberFormatException e) {
                    out.println("Invalid type occurred!");
                }
            }

        } while (true);

    }

    // Getter
    public String getName() {
        return empName;
    }

    // Setter
    public void setName(String empNew) {
        BasePlusCommisionEmployee.empName = empNew;
    }

    // compute employee's salary
    static String computeSalary(double totalSales, double baseSalary) {
        double result = 0;
        if (totalSales <= 10000) {
            result = (totalSales * 0.05) + baseSalary;
        } else if (totalSales > 10000 && totalSales < 50000) {
            result = (totalSales * 0.10) + baseSalary;
        } else if (totalSales > 50000 && totalSales < 100000) {
            result = (totalSales * 0.15) + baseSalary;
        } else if (totalSales > 100000) {
            result = (totalSales * 0.30) + baseSalary;
        }
        return String.valueOf(result);
    }

    // displays information
    public Object displayInfo(int empID, String empName, double totalSales, double baseSalary) {
        String Result = "Employee Name: " + empName + "\nEmployee ID: " + empID +
                "\nTotal Sales: Php." + totalSales +
                "\nBase salary: Php." + baseSalary;
        return Result;
    }

    // converts all information into a string
    public String toString() {
        return "\n" + displayInfo(empID, empName, totalSales, baseSalary) + "\nTotal salary: Php."
                + computed;
    }

    private static boolean isAnumber(String text) {

        if (text.equals("") || text == null) {
            return false;
        }
        try {
            Double.parseDouble(text);
            return true;
        } catch (NumberFormatException e) {
            e.getMessage();
            e.getCause();
            return false;
        }
    }

    public static void TestingMain(int empID, String empName, double totalSales) {
        employee_info[count][0] = empID;
        employee_info[count][1] = empName;
        employee_info[count][2] = totalSales;
        String formatted = String.format(
                (count + 1) + ". \n" +
                        "Employee's ID: " + empID
                        + "\nEmployee's Name: " + empName
                        + "\nTotal Sales: Php." + totalSales
                        + "\n");
        employee_list.put(empName, formatted);
        out.println(formatted);
        count++;

    }
}
