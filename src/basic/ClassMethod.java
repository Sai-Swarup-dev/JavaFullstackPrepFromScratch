package basic;

class Decleration{
    private int a;
    private int b;

    //constructor
    Decleration(int n1, int n2){
        this.a = n1;
        this.b = n2;
    }

    //function Decleration
    public void SumOfTwoNum(){
        //int c = a+b;
        System.out.println(a +" + "+ b +" = "+ (a+b));
    }
}
public class ClassMethod {
    public static void main(String[] args) {
        //object creation
        Decleration d = new Decleration(10, 20);
        d.SumOfTwoNum(); //function call
    }
}


//Note
/*
 * Class: is a blueprint for object creation
 * Object: is a instance of a class
 * Method: is a building block of code which is used when it was called
 * Constructor: special building block to initilized the variable
 */