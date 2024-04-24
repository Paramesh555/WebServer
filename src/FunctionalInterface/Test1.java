package FunctionalInterface;
//defination-a class which has only one abstract method

//the functiona interfaces are introduced in java 8 before java 8 we used to implement threads like this

class Test1 {
    public static void main(String args[])
    {
        // create anonymous inner class object
        new Thread(new Runnable() {
            @Override public void run()
            {
                System.out.println("New thread created");
            }
        }).start();
    }
}
