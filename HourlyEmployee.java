import java.util.Scanner;
import static java.lang.System.out;

public class HourlyEmployee extends Employee{
    int empID;
    String empName;
    String totalHoursWorked;
    String ratePerHour;
    static String empChoose;
    static int idChoose;
    static double TotalhoursChoose;
    static double rateChoose;
    static double initial_salary;

    private String employee;
 

    
    static Employee main2 = new Employee();
    static Employee.FirstGroup G1 = main2.new FirstGroup();
    
    // Getter
    public String getName() {
        return employee;
    }

    // Setter
    public void setName(String empNew) {
        this.employee = empNew;
    }


    public HourlyEmployee() {
        TestingMain();
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
        
        HourlyEmployee main = new HourlyEmployee();
        initial_salary = 250;
        Scanner obj = new Scanner(System.in);
        

        do {
            out.println("\nSelect employee: ");
            String input = obj.nextLine();

            main.setName(input);

            switch (Integer.valueOf(main.getName())) {
                case 1:
                    empChoose = G1.empList[0];
                    idChoose = G1.idList[0];
                    TotalhoursChoose = G1.TotalhoursList[0];
                    rateChoose = G1.rateList[0];

                    break;
                case 2:
                    empChoose = G1.empList[1];
                    idChoose = G1.idList[1];
                    TotalhoursChoose = G1.TotalhoursList[1];
                    rateChoose = G1.rateList[1];
                    break;
                case 3:
                    empChoose = G1.empList[2];
                    idChoose = G1.idList[2];
                    TotalhoursChoose = G1.TotalhoursList[2];
                    rateChoose = G1.rateList[2];
                    break;
                case 4:
                    empChoose = G1.empList[3];
                    idChoose = G1.idList[3];
                    TotalhoursChoose = G1.TotalhoursList[3];
                    rateChoose = G1.rateList[3];
                    break;
                case 5:
                    empChoose = G1.empList[4];
                    idChoose = G1.idList[4];
                    TotalhoursChoose = G1.TotalhoursList[4];
                    rateChoose = G1.rateList[4];
                    break;
                default:
                    break;

            }

            displayInfo(idChoose, empChoose, TotalhoursChoose, rateChoose);
            out.println("Click \'okay\' to show salary.");
            String input2 = obj.nextLine();
            String compute = (input2.equals("okay")) ? computeSalary(TotalhoursChoose, rateChoose).toString()
                    : "Invalid type occurred";
            out.println("Total salary: Php." + compute);

            
        }

        while (true);
        

    }

    static void displayInfo(int empID, String empName, double totalHoursWorked, double ratePerHour) {
        out.println("Employee Name: " + empName);
        out.println("Employee ID: " + empID);
        out.println("Total Hours Worked: " + totalHoursWorked + " hour/s");
        out.println("Rate per Hour: " + ratePerHour + " %");

    }

    static String computeSalary(double totalHoursWorked, double ratePerHour) {
        double total = totalHoursWorked * ratePerHour * initial_salary;
        return String.valueOf(total);
    }

    
    public static void TestingMain() {

        for (int i = 1; i <= G1.empList.length; i++) {
            out.println(i + ". " + G1.empList[i - 1]);
        }
    }

}