public class MathOperations {
    
    public int add(int a, int b) {
        return a + b;
    }
    
    public double add(double a, double b, double c) {
        return a + b + c;
    }
    
    public String add(String str1, String str2) {
        return str1 + str2;
    }
    
    public static void main(String[] args) {
        MathOperations mathOps = new MathOperations();
        
        int resultInt = mathOps.add(2, 3);
        System.out.println("Sum of two integers: " + resultInt);
        
        double resultDouble = mathOps.add(2.5, 3.7, 1.8);
        System.out.println("Sum of three doubles: " + resultDouble);
        
        String resultString = mathOps.add("Hello ", "World");
        System.out.println("Concatenated string: " + resultString);
    }
}
