import java.util.*;

interface IPrinter    //create a 1st interface..
{
    void IP();     //default method
}
interface IScanner     //to create a 2nd interface..
{
    void IS();     //default methode
}
class concret implements IPrinter , IScanner    //impliments both interface
{
    public void IP()
    {
        System.out.println("IPrinter called");
    }
    public void IS()
    {
        System.out.println("IScanner called");
    }
}
public class Practical2
{
    public static void main(String args[])
    {
        Vector <concret> vct = new Vector<concret>();
        for (int i = 0; i < 5; i++) {
            vct.add(new concret());
        }
        for (int i = 0; i < 5; i++)
        {
            vct.get(i).IS();
            vct.get(i).IP();
        }
        System.out.println("**THIS PROGRAM IS PREPARED BY DIVY_21CE134**");
    }
}
