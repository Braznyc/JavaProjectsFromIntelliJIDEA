package Abstract_Classes_And_Interfaces;

public abstract class ClassWithAbstractMeth {  // Notice that all methods are public or protected. They cannot be private or static. Can't be private because they have to be accessed by other classes. Can't be static because they cannot be instantiated directly from this super class.
    public abstract int absMeth1(String s);
    public abstract String absMeth2();
    public abstract  String absMeth3(int num);
    protected abstract boolean absMeth4(String str);
    abstract float absMeth5(int num, String str);

    public static void main(String[] args) {
        System.out.println("This is a class with abstract methods");
    }
}