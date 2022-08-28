import java.util.ArrayList;
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
   

    public static void main(String[] args) {

        // Employee Hourly_employees = new HourlyEmployee();
        // Employee Commision_employees = new CommisionEmployee();
        // Employee BasePlusCommision_employees = new BasePlusCommisionEmployee();
        // Employee PieceWorker_employees = new PieceWorkerEmployee();
        Group1List();
        Group2List();
        Group3List();
        Group4List();
        
        
    }

    public static void Group1List() {
        for(int i = 0; i < G1.empList.length; i++) {
            storeGroup1.add(G1.empList[i]);
        }
    }
    public static void Group2List() {
        for(int i = 0; i < G2.empList.length; i++) {
            storeGroup2.add(G2.empList[i]);
        }
    }
    public static void Group3List() {
        for(int i = 0; i < G3.empList.length; i++) {
            storeGroup3.add(G3.empList[i]);
        }
    }
    public static void Group4List() {
        for(int i = 0; i < G4.empList.length; i++) {
            storeGroup4.add(G4.empList[i]);
        }
    }

    

}
