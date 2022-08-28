import java.util.Scanner;
import static java.lang.System.out;

public class BasePlusCommisionEmployee extends Employee{
    static int empID;
    static String empName;
    static double totalSales;
    static double baseSalary;
    
    static Employee main2 = new Employee();
    static Employee.ThirdGroup G3 = main2.new ThirdGroup();

    // Getter
    public String getName() {
        return empName;
    }

    // Setter
    public void setName(String empNew) {
        BasePlusCommisionEmployee.empName = empNew;
    }

    public static void TestingMain() {

        for (int i = 1; i <= G3.empList.length; i++) {
            out.println(i + ". " + G3.empList[i - 1]);
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

        if (Integer.valueOf(main.getName()) <= G3.empList.length) {
            switch(Integer.valueOf(main.getName())){
                case 1:
                    empName = G3.empList[0];
                    empID = G3.idList[0];
                    totalSales = G3.TotalSalesList[0];
                    break;
                case 2:
                    empName = G3.empList[1];
                    empID = G3.idList[1];
                    totalSales = G3.TotalSalesList[1];
                    break;
                case 3:
                    empName = G3.empList[2];
                    empID = G3.idList[2];
                    totalSales = G3.TotalSalesList[2];
                    break;
                case 4:
                    empName = G3.empList[3];
                    empID = G3.idList[3];
                    totalSales = G3.TotalSalesList[3];
                    break;
                case 5:
                    empName = G3.empList[4];
                    empID = G3.idList[4];
                    totalSales = G3.TotalSalesList[4];
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
            e.getCause();
            return false;
        }
    }
}
