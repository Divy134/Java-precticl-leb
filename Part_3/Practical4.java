class Parent {
    // private methods are not overridden...
    
    protected void m2()
    {
        System.out.println("From parent m2()");
    }
}

class Child extends Parent {
    // private methods are not overridden...
    
    @Override    // overriding method
    public void m2()
    {
        System.out.println("From child m2()");
    }
}
public class Practical4 {
    public static void main(String[] args)
    {
        Parent obj1 = new Parent();
        obj1.m2();
        Parent obj2 = new Child();
        obj2.m2();
        System.out.println("**THIS PROGRAM IS PREPARED BY DIVY_21CE134**");
    }
}
