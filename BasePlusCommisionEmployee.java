import java.util.Scanner;
import static java.lang.System.out;

public class BasePlusCommisionEmployee {
    static int empID;
    static String empName;
    static double totalSales;
    static String[] empList = { "Mary grace Galan", "Mikey Ferrer",
            "Jhon Vincent Arnaiz", "Lady ann Lebosada", "Christian Lance" };
    static double baseSalary;

    static int[] idList = { 21123113, 421256743, 15345275, 70245023, 13487565 };
    static double[] TotalSalesList = { 13499, 42870, 113457, 10700, 5200 };


    // Getter
    public String getName() {
        return empName;
    }

    // Setter
    public void setName(String empNew) {
        BasePlusCommisionEmployee.empName = empNew;
    }

    public static void TestingMain() {

        for (int i = 1; i <= empList.length; i++) {
            out.println(i + ". " + empList[i - 1]);
        }
    }

    public BasePlusCommisionEmployee() {
        TestingMain();
    }


    public static void main(String[] args) {
        String input_store;
        Scanner obj = new Scanner(System.in);
        BasePlusCommisionEmployee main = new BasePlusCommisionEmployee();
        
        out.println("\nAdd base salary to the employees: ");
        while (true) {
            String input = obj.nextLine();
            if (isAnumber(input)) {
                input_store = input;
                break;
            }
            else {
                out.println("type number only!");
                continue;
            }
        }

        baseSalary = Double.parseDouble(input_store);
      
        out.println("Select employee: ");
        String input2 = obj.nextLine();
        
        main.setName(input2);

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

        displayInfo(empID, empName, totalSales, baseSalary);
        out.println("Click \'okay\' to show salary + the base salary.");
        String input3 = obj.nextLine();
        String compute = (input3.equals("okay")) ? computeSalary(totalSales, baseSalary)
                    : "Invalid type occurred";
        out.println("Total salary: Php." + compute);

        
    
      

        

    }

    static void displayInfo(int empID, String empName, double totalSales, double baseSalary) {
        out.println("Employee Name: " + empName);
        out.println("Employee ID: " + empID);
        out.println("Total Sales: Php." + totalSales);
        out.println("Base salary: Php." + baseSalary);
     

    }

    static String computeSalary(double totalSales, double baseSalary) {
        double result = 0;
        if (totalSales <= 10000){
            result = (totalSales * 0.05) + baseSalary;
        }
        else if (totalSales > 10000 && totalSales < 50000){
            result = (totalSales * 0.10) + baseSalary;
        }
        else if (totalSales > 50000 && totalSales < 100000){
            result = (totalSales * 0.15) + baseSalary;
        }
        else if (totalSales > 100000){
            result = (totalSales * 0.30) + baseSalary;
        }
        return String.valueOf(result);
    }


    private static boolean isAnumber(String text){
        
        if (text.equals("") || text == null) {
            return false;
        }

        try {
            Double.parseDouble(text);
            return true;
        }
        catch (NumberFormatException e) {
            e.getMessage();
            return false;
        }
    }
}
