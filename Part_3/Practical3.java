package JAVA.Part-3;

interface P{
    void itfP();
}
interface P1 extends P
{
    void itfP1();
}
interface P2 extends P
{
    void itfP2();
}
interface P12 extends P1,P2   //entends p1 and p2 interface..
{
    void itfP12();
}
class invokes implements P12
{
    public void itfP()
    {
        System.out.println("Interface P is called");
    }
    public void itfP1() {
        System.out.println("Interface P1 is called");
    }
    public void itfP2()
    {
        System.out.println("Interface P2 is called");
    }
    public void itfP12()
    {
        System.out.println("Interface P12 is called");
    }
}

public class Practical3 {
    public static void main(String args[])
    {
        invokes i = new invokes();
        i.itfP();
        i.itfP1();
        i.itfP2();
        i.itfP12();
        System.out.println("**THIS PROGRAM IS PREPARED BY DIVY_21CE134**");
    }
}

