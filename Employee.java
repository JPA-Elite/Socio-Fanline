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
        double[] totalPiecesFinished = { 324, 120, 87, 45, 101 };
        double[] TotalSalesList = { 13499, 42870, 113457, 10700, 5200 };
    }

    // default constructor
    public Employee() {
    }

    // public String Extract_Computation(){
    // return null;
    // }
    public Employee(String group_Type) {
        ArrayList<Object> compute_salary01 = new ArrayList<Object>();
        ArrayList<Object> compute_salary02 = new ArrayList<Object>();
        ArrayList<Object> compute_salary03 = new ArrayList<Object>();
        ArrayList<Object> compute_salary04 = new ArrayList<Object>();
        if (group_Type.equals("1st")) {
            for (int i = 0; i < G1.TotalhoursList.length; i++) {
                compute_salary01.add("Php." + HourlyEmployee.computeSalary(G1.TotalhoursList[i], G1.rateList[i]));
            }
            for (int i = 0; i < G2.TotalSalesList.length; i++) {
                compute_salary02.add("Php." + CommisionEmployee.computeSalary(G2.TotalSalesList[i]));
            }
            for (int i = 0; i < G3.TotalSalesList.length; i++) {
                compute_salary03.add("Php." + BasePlusCommisionEmployee.computeSalary(G3.TotalSalesList[i],
                        BasePlusCommisionEmployee.baseSalary));
            }
            // for (int i = 0; i < G4.TotalSalesList.length; i++) {
            // compute_salary04.add("Php." +
            // CommisionEmployee.computeSalary(G2.TotalSalesList[i]));
            // }
            out.println("Employee Name: " + Arrays.toString(G1.empList)
                    + "\nId: " + Arrays.toString(G1.idList)
                    + "\nType: " + G1.name + "\n"
                    + "\nTotal Salaries: " + compute_salary01.toString() + "\n");
        } else if (group_Type.equals("2nd")) {
            out.println("Employee Name: " + Arrays.toString(G2.empList)
                    + "\nId: " + Arrays.toString(G2.idList)
                    + "\nType: " + G2.name + "\n"
                    + "\nTotal Salaries: " + compute_salary02.toString() + "\n");
        } else if (group_Type.equals("3rd")) {
            out.println("Employee Name: " + Arrays.toString(G3.empList)
                    + "\nId: " + Arrays.toString(G3.idList)
                    + "\nType: " + G3.name + "\n"
                    + "\nTotal Salaries: " + compute_salary03.toString() + "\n");
        } else if (group_Type.equals("4th")) {
            out.println("Employee Name: " + Arrays.toString(G4.empList)
                    + "\nId: " + Arrays.toString(G4.idList)
                    + "\nType: " + G4.name + "\n");
        }
    }

    public static void main(String[] args) throws Exception {
        Employee[] main = new Employee[4];
        out.println("---------------------------------List of Employees-------------------------------------\n");
        main[0] = new Employee("1st");
        main[1] = new Employee("2nd");
        main[2] = new Employee("3rd");
        main[3] = new Employee("4th");
    }

}
