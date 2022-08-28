import java.util.Scanner;
import static java.lang.System.out;

public class CommisionEmployee extends Employee{
    static int empID;
    static String empName;
    static double totalSales;

    static Employee main2 = new Employee();
    static Employee.SecondGroup G2 = main2.new SecondGroup();
    

    
    


    // Getter
    public String getName() {
        return empName;
    }

    // Setter
    public void setName(String empNew) {
        CommisionEmployee.empName = empNew;
    }

    public static void TestingMain() {

        for (int i = 1; i <= G2.empList.length; i++) {
            out.println(i + ". " + G2.empList[i - 1]);
        }
    }

    public CommisionEmployee() {
        TestingMain();
    }


    public static void main(String[] args) {
    
        Scanner obj = new Scanner(System.in);
        CommisionEmployee main = new CommisionEmployee();

        out.println("\nSelect employee: ");
        String input = obj.nextLine();
        
        main.setName(input);

        if (Integer.valueOf(main.getName()) <= G2.empList.length) {
            switch(Integer.valueOf(main.getName())){
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
        }else {
            out.println("Invalid type occurred!");
        }

        displayInfo(empID, empName, totalSales);
        out.println("Click \'okay\' to show salary.");
        String input2 = obj.nextLine();
        String compute = (input2.equals("okay")) ? computeSalary(totalSales)
                    : "Invalid type occurred";
        out.println("Total salary: Php." + compute);
    
        

        

    }

    static void displayInfo(int empID, String empName, double totalSales) {
        out.println("Employee Name: " + empName);
        out.println("Employee ID: " + empID);
        out.println("Total Sales: Php." + totalSales);
     

    }

    static String computeSalary(double totalSales) {
        double result = 0;
        if (totalSales <= 10000){
            result = totalSales * 0.05;
        }
        else if (totalSales > 10000 && totalSales < 50000){
            result = totalSales * 0.10;
        }
        else if (totalSales > 50000 && totalSales < 100000){
            result = totalSales * 0.15;
        }
        else if (totalSales > 100000){
            result = totalSales * 0.30;
        }
        return String.valueOf(result);
    }

}