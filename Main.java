public class Main {
    public static void main(String[] args) {

        System.out.println(Claculator.sum(7,3));
        System.out.println(Claculator.sub(10,5));

        Claculator cal = new Claculator();
        // Creating new Varaible -> cal , from the class Claculator
        // This new Viribale can only call the Functions that is not static and the below example
        System.out.println(cal.name);
    }
}
