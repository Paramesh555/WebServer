package FunctionalInterface;
// functional interface using lambda expressions

class Test2 {
    public static void main(String args[])
    {

        // lambda expression to create the object
        new Thread(() -> {
            System.out.println("New thread created");
        }).start();
//        here we are not callin runnable class directly we are defining the run() method
//        thread constructor excepts the runnable instance so we are not calling it directly
    }
}
