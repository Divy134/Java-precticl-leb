package JAVA.Part_4;

public class part4_pr_1 {
    public static void main(String args[]) {
        try {
            System.out.println(1 / 0); // ArithmeticException
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            int[] Ex = new int[4];
            System.out.println(Ex[4]); // ArrayIndexOutOfBoundsException
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            Object obj = new Object(); // ClassCastException
            String s_obj = (String) obj;
        } catch (Exception e) {
            e.printStackTrace();
        }

        String st_Ex = null;
        try {
            if (st_Ex.equals("same")) // NullPointerException
            {
                System.out.println("same");
            } else {
                System.out.println("Not same");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("**THIS PROGRAM IS PREPARED BY DIVY_21CE134**");
    }
}
