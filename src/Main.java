public class Main {
    public static void main(String[] args) {

        int firstNumber = 1;
        int secondNumber = 1;
        int sum;
        System.out.println(firstNumber);
        System.out.println(secondNumber);

        for (int i = 0; i < 12; i++) {
                sum = firstNumber+secondNumber;
                firstNumber = secondNumber;
                secondNumber = sum;
                System.out.println(sum);
        }
    }
}