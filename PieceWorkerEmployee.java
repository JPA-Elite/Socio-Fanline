import java.util.*;
import static java.lang.System.out;

public class PieceWorkerEmployee extends Employee {
    static int empID;
    static String empName;
    static double PieceChoice;
    static double ratePerPiece = 100;
    static String computed;
    static Employee main2 = new Employee();
    static Employee.FourthGroup G4 = main2.new FourthGroup();

    public PieceWorkerEmployee() {
        TestingMain();
    }

    public static void main(String[] args) {
        String input_store;
        Scanner obj = new Scanner(System.in);
        PieceWorkerEmployee main = new PieceWorkerEmployee();
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
            if (Integer.valueOf(main.getName()) <= G4.empList.length) {
                switch (Integer.valueOf(main.getName())) {
                    case 1:
                        empName = G4.empList[0];
                        empID = G4.idList[0];
                        PieceChoice = G4.totalPiecesFinished[0];
                        break;
                    case 2:
                        empName = G4.empList[1];
                        empID = G4.idList[1];
                        PieceChoice = G4.totalPiecesFinished[1];
                        break;
                    case 3:
                        empName = G4.empList[2];
                        empID = G4.idList[2];
                        PieceChoice = G4.totalPiecesFinished[2];
                        break;
                    case 4:
                        empName = G4.empList[3];
                        empID = G4.idList[3];
                        PieceChoice = G4.totalPiecesFinished[3];
                        break;
                    case 5:
                        empName = G4.empList[4];
                        empID = G4.idList[4];
                        PieceChoice = G4.totalPiecesFinished[4];
                        break;
                    default:
                        break;
                }
                main.displayInfo(empID, empName, PieceChoice);
                while (true) {
                    out.println("Click \'okay\' to show salary + the rate per piece.\n(ex: okay 100)");
                    try {
                        String[] input3 = obj.nextLine().split(" ");
                        if (input3.length >= 3) {
                            out.println("Format is invalid!");
                        } else {
                            if (input3[0].equals("okay") && isAnumber(input3[1])) {
                                ratePerPiece = Double.parseDouble(input3[1]);
                                computed = computeSalary(PieceChoice, ratePerPiece);
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

    public static void TestingMain() {

        for (int i = 1; i <= G4.empList.length; i++) {
            out.println(i + ". " + G4.empList[i - 1]);
        }
    }

    public String toString() {
        return "\n" + displayInfo(empID, empName, PieceChoice) + "\nTotal salary: Php."
                + computed;
    }

    public Object displayInfo(int empID, String empName, double PieceChoice) {
        String Result = "Employee Name: " + empName + "\nEmployee ID: " + empID +
                "\nTotal Piece Finished: " + Math.round(PieceChoice) + "pc/s";
        return Result;

    }

    static String computeSalary(double PieceChoice, double ratePerPiece) {
        double result;
        double store;
        double store2;
        store2 = PieceChoice * ratePerPiece;
        store = PieceChoice;

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
}
