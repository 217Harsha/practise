package Inheritance;

public class Child extends Parent{
    int i=10;

    public Child(int j) {
        super(j);
        System.out.println("Called Child");
    }
}
