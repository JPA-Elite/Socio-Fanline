import java.util.Scanner;
import static java.lang.System.out;

public class HourlyEmployee {
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
    static String[] empList = { "Joshua Algadipe", "Janrae Fagaragan",
            "Jan Nino Baoc", "Mark Joseph Molina", "Juspher Balangyao" };

    static int[] idList = { 21103808, 323456743, 12343276, 98345623, 23467865 };

    static double[] TotalhoursList = { 23, 20, 20, 19, 23 };
    static double[] rateList = { 0.90, 0.80, 0.70, 0.75, 0.89 };

    // Getter
    public String getName() {
        return employee;
    }

    // Setter
    public void setName(String empNew) {
        this.employee = empNew;
    }

    public static void TestingMain() {

        for (int i = 1; i <= empList.length; i++) {
            out.println(i + ". " + empList[i - 1]);
        }
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
        initial_salary = 250;
        Scanner obj = new Scanner(System.in);
        HourlyEmployee main = new HourlyEmployee();

        do {
            out.println("\nSelect employee: ");
            String input = obj.nextLine();

            main.setName(input);

            switch (Integer.valueOf(main.getName())) {
                case 1:
                    empChoose = empList[0];
                    idChoose = idList[0];
                    TotalhoursChoose = TotalhoursList[0];
                    rateChoose = rateList[0];

                    break;
                case 2:
                    empChoose = empList[1];
                    idChoose = idList[1];
                    TotalhoursChoose = TotalhoursList[1];
                    rateChoose = rateList[1];
                    break;
                case 3:
                    empChoose = empList[2];
                    idChoose = idList[2];
                    TotalhoursChoose = TotalhoursList[2];
                    rateChoose = rateList[2];
                    break;
                case 4:
                    empChoose = empList[3];
                    idChoose = idList[3];
                    TotalhoursChoose = TotalhoursList[3];
                    rateChoose = rateList[3];
                    break;
                case 5:
                    empChoose = empList[4];
                    idChoose = idList[4];
                    TotalhoursChoose = TotalhoursList[4];
                    rateChoose = rateList[4];
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

}