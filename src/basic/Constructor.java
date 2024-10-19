package basic;

class A{
    private int a;
    private int b;

    //Default Constructor
    A(){
        a = 10;
        b = 20;
    }

    //Parameterized Constructor
    A(int a, int b){
        this.a = a;
        this.b = b;
    }

    public void display(){
        System.out.println("a: "+ a +" and b: "+ b);
    }
}

public class Constructor {
    public static void main(String[] args) {
        A a = new A();
        System.out.println("Default Constructor: ");
        a.display();

        A a1 = new A(10, 0);
        System.out.println("Parameterized Constructor: ");
        a1.display();
    }
}
