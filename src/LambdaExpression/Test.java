package LambdaExpression;
// Java program to demonstrate lambda expressions
// to implement a user defined functional interface.

// A sample functional interface (An interface with
// single abstract method
//source: https://www.geeksforgeeks.org/lambda-expressions-java-8/
interface FuncInterface
{
    // An abstract function
    void abstractFun(int x);


    // A non-abstract (or default) function
    default void normalFun()
    {
        System.out.println("Hello");
    }
}

class Test
{
    public static void main(String args[])
    {
        //here we are defining what abstractFun() method should do while creating object
        FuncInterface fob = (int x)->System.out.println(2*x);

        // This calls above lambda expression and prints 10.
        fob.abstractFun(5);
    }
}
