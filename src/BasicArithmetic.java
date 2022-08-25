public class BasicArithmetic {
    public static void main(String[] args) {
        int num1 = 100;
        int num2 = 150;

        int sum = num1+num2; // Addition
        System.out.println(num1 +" + "+ num2 +" = "+ sum);

        int subtract = num1 - num2; // Subtraction
        System.out.println(num1 +" - "+ num2 +" = "+subtract);

        float quotient = (float)num1 / (float)num2; // Division
        System.out.println(num1 +" / "+ num2 +" = "+quotient);

        int product = num1 * num2; // Multiplication
        System.out.println(num1 +" * "+ num2 +" = "+product);
    }
}
