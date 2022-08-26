import java.util.Scanner;
import static java.lang.System.out;

public class CommisionEmployee {
    static int empID;
    static String empName;
    static double totalSales;
    static String[] empList = { "Joseph Tan", "Jovie Bendijo",
            "Albert Cruz", "Rafael Mae Sanchez", "Rodrigo Martinez" };

    static int[] idList = { 21103103, 123256743, 12345271, 10345023, 23487965 };
    static double[] TotalSalesList = { 10499, 32870, 123457, 9700, 53200 };


    // Getter
    public String getName() {
        return empName;
    }

    // Setter
    public void setName(String empNew) {
        CommisionEmployee.empName = empNew;
    }

    public static void TestingMain() {

        for (int i = 1; i <= empList.length; i++) {
            out.println(i + ". " + empList[i - 1]);
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

        if (Integer.valueOf(main.getName()) <= empList.length) {
            switch(Integer.valueOf(main.getName())){
                case 1:
                    empName = empList[0];
                    empID = idList[0];
                    totalSales = TotalSalesList[0];
                    break;
                case 2:
                    empName = empList[1];
                    empID = idList[1];
                    totalSales = TotalSalesList[1];
                    break;
                case 3:
                    empName = empList[2];
                    empID = idList[2];
                    totalSales = TotalSalesList[2];
                    break;
                case 4:
                    empName = empList[3];
                    empID = idList[3];
                    totalSales = TotalSalesList[3];
                    break;
                case 5:
                    empName = empList[4];
                    empID = idList[4];
                    totalSales = TotalSalesList[4];
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