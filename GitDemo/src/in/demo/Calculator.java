package in.demo;

public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Calculator c = new Calculator();

      System.out.println("Result = " + c.add(10, 20));
    }
}
