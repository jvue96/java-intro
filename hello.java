/* hello world application practice */


public class hello {

    public static void main(String[] args) {
        // Prints "Hello, World" to the terminal window.
        System.out.println("Hello World!");
        addNumbers(); 
        helloName();
    }

    // Prints sum of integers 
    static void addNumbers() {
        int a = 5;
        int b = 5;
        int c = 10; 
        int d = 10; 
        System.out.println("The sum of a and b is = " + Integer.sum(a, b));
        System.out.println("The sum of a and b is = " + Integer.sum(c, d));
    }

    static void helloName() {
        String Juno = "Juno"; 
        String Vue = "Vue";
        System.out.println(Juno + " " + Vue);
    }



}