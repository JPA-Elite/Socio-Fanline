import java.util.*;
import static java.lang.System.out;

public class CommisionEmployee extends Employee {
    static int empID;
    static String empName;
    static double totalSales;
    static String computed;
    static Employee main2 = new Employee();
    static Employee.SecondGroup G2 = main2.new SecondGroup();
    static Scanner obj = new Scanner(System.in);

    // Default constructor
    public CommisionEmployee() {
        TestingMain();
    }

    public static void main(String[] args) {

        CommisionEmployee main = new CommisionEmployee();

        do {
            out.println("\nSelect employee(exit): ");
            String input = obj.nextLine();

            main.setName(input);
            try {
                if (main.getName().equals("exit")) {
                    System.exit(0);
                } else if (Integer.valueOf(main.getName()) <= G2.empList.length) {
                    switch (Integer.valueOf(main.getName())) {
                        case 1:
                            empName = G2.empList[0];
                            empID = G2.idList[0];
                            totalSales = G2.TotalSalesList[0];
                            break;
                        case 2:
                            empName = G2.empList[1];
                            empID = G2.idList[1];
                            totalSales = G2.TotalSalesList[1];
                            break;
                        case 3:
                            empName = G2.empList[2];
                            empID = G2.idList[2];
                            totalSales = G2.TotalSalesList[2];
                            break;
                        case 4:
                            empName = G2.empList[3];
                            empID = G2.idList[3];
                            totalSales = G2.TotalSalesList[3];
                            break;
                        case 5:
                            empName = G2.empList[4];
                            empID = G2.idList[4];
                            totalSales = G2.TotalSalesList[4];
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

    public static void TestingMain() {
        // Connected to arrays in Employee.java
        for (int i = 1; i <= G2.empList.length; i++) {
            out.println(i + ". " + G2.empList[i - 1]);
        }
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

}