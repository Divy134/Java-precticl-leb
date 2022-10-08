// **THIS PROGRAM IS PREPARED BY DIVY_21CE134**
package practice.Part_5;

public class Practical_6 {
        public static void main(String[] args) {

            int a = 5;
            double b = 5.65;
    
            Integer obj1 = Integer.valueOf(a);
            Double obj2 = Double.valueOf(b);
    
            if (obj1 instanceof Integer) {
                System.out.println("Integer's object is created");
            }
    
            if (obj2 instanceof Double) {
                System.out.println("Double's object is created");
            }
        }
    }

