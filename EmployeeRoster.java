import java.util.ArrayList;
import static java.lang.System.out;
import java.util.Scanner;
import java.util.Formatter;

public class EmployeeRoster extends Employee {
    // static String[] EmployeeGroupList1 = { };
    // static String[] EmployeeGroupList2 = { };
    // static String[] EmployeeGroupList3 = { };
    // static String[] EmployeeGroupList4 = { };
    static Employee employee = new Employee();
    static Employee.FirstGroup G1 = employee.new FirstGroup();
    static Employee.SecondGroup G2 = employee.new SecondGroup();
    static Employee.ThirdGroup G3 = employee.new ThirdGroup();
    static Employee.FourthGroup G4 = employee.new FourthGroup();

    static ArrayList<String> storeGroup1 = new ArrayList<String>();
    static ArrayList<String> storeGroup2 = new ArrayList<String>();
    static ArrayList<String> storeGroup3 = new ArrayList<String>();
    static ArrayList<String> storeGroup4 = new ArrayList<String>();
    static ArrayList<String> storeTypesEmployees = new ArrayList<String>();
    String list_types;
    static Formatter form = new Formatter();

    // Constructor
    public EmployeeRoster() {
        String store = "";
        int count = 0;
        storeTypesEmployees.add(G1.name);
        storeTypesEmployees.add(G2.name);
        storeTypesEmployees.add(G3.name);
        storeTypesEmployees.add(G4.name);
        storeTypesEmployees.add("All Employees");
        storeTypesEmployees.add("Other options");

        for (String i : storeTypesEmployees) {
            count++;
            store += String.format("%d. ", count) + i.concat("\n");
        }

        list_types = store;

    }

    public static void main(String[] args) {

        EmployeeRoster main = new EmployeeRoster();
        Scanner in = new Scanner(System.in);

        Group1List();
        Group2List();
        Group3List();
        Group4List();
        out.println(String.format("Types of Employees:\n%s\nSelect option: ", main.list_types));
        String inputted = in.nextLine();
        in.close();
        if (isAnumber(inputted)) {
            switch (Integer.parseInt(inputted)) {
                case 1:
                    out.println("Hourly Employees\n");
                    out.println(String.format("Total no. of employees: %s", countHourlyEmployee()));
                    out.println(String.format("List of employees: "));
                    displayHourlyEmployee();

                    break;
                case 2:
                    out.println("Piece Worker Employees\n");
                    out.println(String.format("Total no. of employees: %s", countPeiceWorkerEmployee()));
                    out.println(String.format("List of employees: "));
                    displayPeiceWorkerEmployee();
                    break;
                case 3:
                    out.println("Commission Employees\n");
                    out.println(String.format("Total no. of employees: %s", countCommissionEmployee()));
                    out.println(String.format("List of employees: "));
                    displayCommissionEmployee();
                    break;
                case 4:
                    out.println("Base-Plus Commission Employees\n");
                    out.println(String.format("Total no. of employees: %s", countBasePlusCommissionEmployee()));
                    out.println(String.format("List of employees: "));
                    displayBasePlusCommissionEmployee();
                    break;
                case 5:
                    form.format("%86s", "-----All Employees-----\n\n");
                    displayEmployee();
                    break;
                case 6:
                    

                default:
                    out.println("Incorrect number selected!");
                    break;
            }

        } else {
            out.println("Invalid type occurred!");

        }

    }

    public static void Group1List() {
        for (int i = 0; i < G1.empList.length; i++) {
            storeGroup1.add(G1.empList[i]);
        }
    }

    public static void Group2List() {
        for (int i = 0; i < G2.empList.length; i++) {
            storeGroup2.add(G2.empList[i]);
        }
    }

    public static void Group3List() {
        for (int i = 0; i < G3.empList.length; i++) {
            storeGroup3.add(G3.empList[i]);
        }
    }

    public static void Group4List() {
        for (int i = 0; i < G4.empList.length; i++) {
            storeGroup4.add(G4.empList[i]);
        }
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

    public static int countHourlyEmployee() {
        return storeGroup1.size();
    }

    public static int countPeiceWorkerEmployee() {
        return storeGroup2.size();
    }

    public static int countCommissionEmployee() {
        return storeGroup3.size();
    }

    public static int countBasePlusCommissionEmployee() {
        return storeGroup4.size();
    }
    //

    public static void displayHourlyEmployee() {
        for (int i = 0; i < storeGroup1.size(); i++) {
            out.println(storeGroup1.get(i));
        }
    }

    public static void displayPeiceWorkerEmployee() {
        for (int i = 0; i < storeGroup2.size(); i++) {
            out.println(storeGroup2.get(i));
        }
    }

    public static void displayCommissionEmployee() {
        for (int i = 0; i < storeGroup3.size(); i++) {
            out.println(storeGroup3.get(i));
        }
    }

    public static void displayBasePlusCommissionEmployee() {
        for (int i = 0; i < storeGroup4.size(); i++) {
            out.println(storeGroup4.get(i));
        }
    }

    public static void displayEmployee() {

        form.format("%40s %40s %40s\n", "Employee Id", "Employee Name", "Employee Type");
        for (int i = 0; i < G1.empList.length; i++) {
            form.format("%40s %40s %40s\n", G1.idList[i], G1.empList[i], G1.name);
        }
        for (int i = 0; i < G2.empList.length; i++) {
            form.format("%40s %40ss %40s\n", G2.idList[i], G2.empList[i], G2.name);
        }
        for (int i = 0; i < G3.empList.length; i++) {
            form.format("%40s %40s %45s\n", G3.idList[i], G3.empList[i], G3.name);
        }
        for (int i = 0; i < G4.empList.length; i++) {
            form.format("%40s %40s %40s\n", G4.idList[i], G4.empList[i], G4.name);
        }
        out.println(form);
        form.close();

    }

    public static Object addEmployee(int empID, String empName) {
        return "wdwd";
    }

}
