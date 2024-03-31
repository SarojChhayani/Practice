public class Maths {
    static Maths maths = new Maths();
    // create the object to access Instance members of the class - global
    //we can't create object for variable and data type
    // we can create object only for class
    static int a = 40;
    // initialisation data type
    static int b = 35;
    //initialisation data type
    static int answer;

    static void addition() {
        //static method no return no parameter method
        answer = a + b;
        System.out.println("addition of 40 and 35 is =" + answer);
    }

    static void subtraction() {
        //static method no return no parameter method
        answer = a - b;
        System.out.println("subtraction of 40 and 35 is =" + answer);
    }

    void multiplication(int a, int b) {
        //Instance method no return with parameter method
        answer = a * b;
        System.out.println("multiplication of " + a + " and " + b + " is =" + answer);
    }

    void division(int a, int b) {
        //Instance method no return with parameter method
        answer = a / b;
        System.out.println("division of " + a + " and " + b + " is =" + answer);
    }

    public static void main(String[] args) {
        addition();//static method in static area no extra step required.
        subtraction();//static method in static area no extra step required.
        maths.multiplication(45, 2);// Instance method calling through object.
        maths.division(40, 2);// Instance method calling through object.
    }
}
