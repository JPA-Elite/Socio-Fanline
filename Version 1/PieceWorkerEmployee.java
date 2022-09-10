import java.util.*;
import java.time.*;
import static java.lang.System.out;

public class PieceWorkerEmployee {
    static int empID;
    static String empName;
    static double totalPiecesFinished;
    static double ratePerPiece = 50;
    static String computed;
    static Scanner obj = new Scanner(System.in);
    static HashMap<String, Object> employee_list = new HashMap<String, Object>();
    static Object[][] employee_info = { { null, null, null, null }, { null, null, null, null },
            { null, null, null, null }, { null, null, null, null }, { null, null, null, null } };
    static int count = 0;

    // Default constructor
    public PieceWorkerEmployee() {
        LocalDate mydate = LocalDate.now();
        LocalTime mytime = LocalTime.now();
        out.println("----------PieceWorker Employees----------\nDate: "
                + mydate + "\nTime " + mytime + "\n" +
                "--------------------\n");
    }

    public static void main(String[] args) {
        PieceWorkerEmployee main = new PieceWorkerEmployee();
        TestingMain(21026113, "Jei ann Bayer", 240);
        TestingMain(401252713, "Cristopher Lawrence", 120);
        TestingMain(05325215, "Joseph Menoza", 87);
        TestingMain(50246013, "Caspher Mae Ann", 45);
        TestingMain(12437515, "Jaymar Sta.Ana", 101);
        String input_store;
        main: while (true) {
            out.println("Select employee(exit): ");
            while (true) {
                String input = obj.nextLine();
                if (isAnumber(input)) {
                    input_store = input;
                    break;
                } else if (input.equals("exit")) {
                    break main;
                } else {
                    out.println("type number only!");
                    continue;
                }
            }
            main.setName(input_store);
            if (Integer.valueOf(main.getName()) <= employee_list.size()) {
                switch (Integer.valueOf(main.getName())) {
                    case 1:
                        PieceWorkerEmployee.empID = Integer.valueOf(employee_info[0][0].toString());
                        PieceWorkerEmployee.empName = employee_info[0][1].toString();
                        PieceWorkerEmployee.totalPiecesFinished = Double.valueOf(employee_info[0][2].toString());
                        break;
                    case 2:
                        PieceWorkerEmployee.empID = Integer.valueOf(employee_info[1][0].toString());
                        PieceWorkerEmployee.empName = employee_info[1][1].toString();
                        PieceWorkerEmployee.totalPiecesFinished = Double.valueOf(employee_info[1][2].toString());
                        break;
                    case 3:
                        PieceWorkerEmployee.empID = Integer.valueOf(employee_info[2][0].toString());
                        PieceWorkerEmployee.empName = employee_info[2][1].toString();
                        PieceWorkerEmployee.totalPiecesFinished = Double.valueOf(employee_info[2][2].toString());
                        break;
                    case 4:
                        PieceWorkerEmployee.empID = Integer.valueOf(employee_info[3][0].toString());
                        PieceWorkerEmployee.empName = employee_info[3][1].toString();
                        PieceWorkerEmployee.totalPiecesFinished = Double.valueOf(employee_info[3][2].toString());
                        break;
                    case 5:
                        PieceWorkerEmployee.empID = Integer.valueOf(employee_info[4][0].toString());
                        PieceWorkerEmployee.empName = employee_info[4][1].toString();
                        PieceWorkerEmployee.totalPiecesFinished = Double.valueOf(employee_info[4][2].toString());
                        break;
                    default:
                        break;
                }
                main.displayInfo(empID, empName, totalPiecesFinished);
                while (true) {
                    out.println("Click \'okay\' to show salary + the rate per piece.\n(ex: okay 100)");
                    try {
                        String[] input3 = obj.nextLine().split(" ");
                        if (input3.length >= 3) {
                            out.println("Format is invalid!");
                        } else {
                            if (input3[0].equals("okay") && isAnumber(input3[1])) {
                                ratePerPiece = Double.parseDouble(input3[1]);
                                computed = computeSalary(totalPiecesFinished, ratePerPiece);
                                out.println(main.toString());
                                break;
                            } else {
                                out.println("Invalid type occurred");
                            }

                        }
                    } catch (Exception e) {
                        out.println("Format is invalid!");
                    }

                }
            } else {
                out.println("Number chosen is invalid!");
            }

        }

    }

    // Getter
    public String getName() {
        return empName;
    }

    // Setter
    public void setName(String empNew) {
        PieceWorkerEmployee.empName = empNew;
    }

    // converts all information into a string
    public String toString() {
        return "\n" + displayInfo(empID, empName, totalPiecesFinished) + "\nTotal salary: Php."
                + computed;
    }

    // displays information
    public Object displayInfo(int empID, String empName, double PieceChoice) {
        String Result = "Employee Name: " + empName + "\nEmployee ID: " + empID +
                "\nTotal Piece Finished: " + Math.round(PieceChoice) + "pc/s";
        return Result;

    }

    // compute employee's salary
    static String computeSalary(double totalPiecesFinished, double ratePerPiece) {
        double result;
        double store;
        double store2;
        store2 = totalPiecesFinished * ratePerPiece;
        store = totalPiecesFinished;

        while (true) {
            if ((store - 100) < 100) {
                break;
            }
            store2 = store2 * 10;
            store = store - 100;
        }

        result = store2;

        return String.valueOf(result);

    }

    // check if format is numerical
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

    public static void TestingMain(int empID, String empName, double totalPiecesFinished) {
        employee_info[count][0] = empID;
        employee_info[count][1] = empName;
        employee_info[count][2] = totalPiecesFinished;
        String formatted = String.format(
                (count + 1) + ". \n" +
                        "Employee's ID: " + empID
                        + "\nEmployee's Name: " + empName
                        + "\nTotal Pieces Finished: " + totalPiecesFinished + "pc/s"
                        + "\n");
        employee_list.put(empName, formatted);
        out.println(formatted);
        count++;

    }
}
