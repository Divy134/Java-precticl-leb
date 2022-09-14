package Part_3.Part_3_pr1;

public class Pr1_Main {
    public static void main(String[] args) {
        Circle c = new Circle(1);
        System.out.println("---->Imformation of Circle.....");
        System.out.println("Area of Circle is :"+c.getArea());
        System.out.println("Perameter of Circle is :"+c.getPerameter());


        Rectangle r = new Rectangle(10,20);
        System.out.println("---->Imformation of Rectangle.....");
        System.out.println("Area of Rectangle is :"+r.getArea());
        System.out.println("Perameter of Rectangle is :"+r.getPerameter());

        System.out.println("\n **THIS PROGRAM IS PREPARED BY DIVY_21CE134**");
    }
}
