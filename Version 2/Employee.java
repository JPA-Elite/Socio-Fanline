import static java.lang.System.out;

import java.util.ArrayList;
import java.util.Arrays;

public class Employee {
    // static HourlyEmployee hEmployee = new HourlyEmployee();
    // static CommisionEmployee cEmployee = new CommisionEmployee();
    // static BasePlusCommisionEmployee bEmployee = new BasePlusCommisionEmployee();
    // static PieceWorkerEmployee pEmployee = new PieceWorkerEmployee();

    static Employee main = new Employee();
    static Employee.FirstGroup G1 = main.new FirstGroup();
    static Employee.SecondGroup G2 = main.new SecondGroup();
    static Employee.ThirdGroup G3 = main.new ThirdGroup();
    static Employee.FourthGroup G4 = main.new FourthGroup();
    ArrayList<Object> compute_salary = new ArrayList<Object>();

    // HourlyEmployees
    public class FirstGroup {
        String name = "Hourly Employees";
        String[] empList = { "Joshua Algadipe", "Janrae Fagaragan",
                "Jan Nino Baoc", "Mark Joseph Molina", "Juspher Balangyao" };

        int[] idList = { 21103808, 323456743, 12343276, 98345623, 23467865 };

        double[] TotalhoursList = { 23, 20, 20, 19, 23 };
        double[] rateList = { 200, 200, 200, 200, 200 };
    }

    // CommisionEmployees
    public class SecondGroup {
        String name = "Commision Employees";
        String[] empList = { "Joseph Tan", "Jovie Bendijo",
                "Albert Cruz", "Rafael Mae Sanchez", "Rodrigo Martinez" };

        int[] idList = { 21103103, 123256743, 12345271, 10345023, 23487965 };

        double[] TotalSalesList = { 10499, 32870, 123457, 9700, 53200 };
    }

    // BasePlusCommisionEmployees
    public class ThirdGroup {
        String name = "Base Plus Commision Employees";
        String[] empList = { "Mary grace Galan", "Mikey Ferrer",
                "Jhon Vincent Arnaiz", "Lady ann Lebosada", "Christian Lance" };

        int[] idList = { 21123113, 421256743, 15345275, 70245023, 13487565 };

        double[] TotalSalesList = { 13499, 42870, 113457, 10700, 5200 };
    }

    // PieceWorkerEmployee
    public class FourthGroup {
        String name = "PieceWorker Employees";
        String[] empList = { "Jei ann Bayer", "Cristopher Lawrence",
                "Joseph Menoza", "Caspher Mae Ann", "Jaymar Sta.Ana" };

        int[] idList = { 21026113, 401252713, 05325215, 50246013, 12437515 };
        double[] totalPiecesFinished = { 240, 120, 87, 45, 101 };
    }

    // default constructor
    public Employee() {
    }

    public Employee(String group_Type) {

        if (group_Type.equals("1st")) {
            for (int i = 0; i < G1.TotalhoursList.length; i++) {
                compute_salary.add("Php." + HourlyEmployee.computeSalary(G1.TotalhoursList[i], G1.rateList[i]));
            }
            out.println("Employees' Name: " + Arrays.toString(G1.empList)
                    + "\nId: " + Arrays.toString(G1.idList)
                    + "\nType: " + G1.name + "\n"
                    + "Total Salaries: " + compute_salary.toString() + "\n");
        } else if (group_Type.equals("2nd")) {
            for (int i = 0; i < G2.TotalSalesList.length; i++) {
                compute_salary.add("Php." + CommisionEmployee.computeSalary(G2.TotalSalesList[i]));
            }
            out.println("Employees' Name: " + Arrays.toString(G2.empList)
                    + "\nId: " + Arrays.toString(G2.idList)
                    + "\nType: " + G2.name + "\n"
                    + "Total Salaries: " + compute_salary.toString() + "\n");
        } else if (group_Type.equals("3rd")) {
            for (int i = 0; i < G3.TotalSalesList.length; i++) {
                compute_salary.add("Php." + BasePlusCommisionEmployee.computeSalary(G3.TotalSalesList[i],
                        BasePlusCommisionEmployee.baseSalary));
            }
            out.println("Employees' Name: " + Arrays.toString(G3.empList)
                    + "\nId: " + Arrays.toString(G3.idList)
                    + "\nType: " + G3.name + "\n"
                    + "Total Salaries: " + compute_salary.toString() + "\n");
        } else if (group_Type.equals("4th")) {
            for (int i = 0; i < G4.totalPiecesFinished.length; i++) {
                compute_salary.add("Php." + PieceWorkerEmployee.computeSalary(G4.totalPiecesFinished[i],
                        PieceWorkerEmployee.ratePerPiece));
            }
            out.println("Employees' Name: " + Arrays.toString(G4.empList)
                    + "\nId: " + Arrays.toString(G4.idList)
                    + "\nType: " + G4.name + "\n"
                    + "Total Salaries: " + compute_salary.toString() + "\n");
        }
    }

    public static void main(String[] args) throws Exception {
        Employee[] main2 = new Employee[4];
        out.println("---------------------------------List of Employees-------------------------------------\n");
        main2[0] = new Employee("1st");
        main.compute_salary.clear();
        main2[1] = new Employee("2nd");
        main.compute_salary.clear();
        main2[2] = new Employee("3rd");
        main.compute_salary.clear();
        main2[3] = new Employee("4th");
        main.compute_salary.clear();
    }

}
