// **THIS PROGRAM IS PREPARED BY DIVY_21CE134**
package Part_7;
public class Practical_1 {
    public static <E> void printArray(E[] inputArray) {
        for (E element : inputArray) {
            System.out.printf("%s ", element);
        }
        System.out.println();
    }
    public static void main(String args[]) {

        Integer[] intArray = { 2, 4, 6, 8, 10 };
        Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4 };
        Character[] charArray = { 'H', 'E', 'L', 'L', 'O' };

        System.out.println("Array integerArray:");
        printArray(intArray);

        System.out.println("Array doubleArray:");
        printArray(doubleArray);

        System.out.println("Array characterArray:");
        printArray(charArray);
    }
}
