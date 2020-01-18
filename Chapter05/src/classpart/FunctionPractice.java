package classpart;

public class FunctionPractice {

    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    public static int sub(int num1, int num2) {
        return num1 - num2;
    }

    public static int mul(int num1, int num2) {
        return num1 * num2;
    }

    public static int div(int num1, int num2) {
        return num1 / num2;
    }

    public static int mod(int num1, int num2) {
        return num1 % num2;
    }

    public static void main(String[] args) {
        int num1 = 100;
        int num2 = 50;

        int addResult = add(num1, num2);
        int subResult = sub(num1, num2);
        int mulResult = mul(num1, num2);
        int divResult = div(num1, num2);
        int modResult = mod(num1, num2);

        System.out.println("=====Result=====");
        System.out.println("num1 + num2 = " + addResult);
        System.out.println("num1 - num2 = " + subResult);
        System.out.println("num1 * num2 = " + mulResult);
        System.out.println("num1 / num2 = " + divResult);
        System.out.println("num1 % num2 = " + modResult);
    }
}
