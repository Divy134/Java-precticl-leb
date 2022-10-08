// **THIS PROGRAM IS PREPARED BY DIVY_21CE134**
package Part_7;
public class Practical_2 {

    static int count(String str, String word) {
        String arr[] = str.split(" ");

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (word.equals(arr[i]))
                count++;
        }
        return count;
    }
    public static void main(String args[]) {
        String str = "Java Programming";
        String word = "Practical_7";
        System.out.println(count(str, word));
    }
}
