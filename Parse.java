import static java.lang.System.out;

import java.util.Arrays;

// class Hello {
//     String a = "dfef";

//     public class ahem {
//         String b = "god";
//     }
// }

public class Parse extends Employee {

    static Employee main = new Employee();

    static Employee.FirstGroup main2 = main.new FirstGroup();

    public static void main(String[] args) {
        // Hello outer = new Hello();

        // Hello.ahem inner = outer.new ahem();
        // out.println(inner.b);
        parent obj1 = new child();
        obj1.Maya();


       

    }

   

}

class parent {
    void Maya(){
        out.println("hello");
    }
}

class child extends parent {
    
    public void Maya(){
        out.println("hello world");
    }
}
