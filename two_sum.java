public class two_sum {

    public static void main(String[] args) {
        AddTwoNumbers(10, 20);
        SubtractTwoNumbers(50, 30);
    }

    public static void AddTwoNumbers(int firstNumber, int secondNumber){
        int sumOfNumbers = firstNumber + secondNumber;

       // System.out.println(sumOfNumbers);  
       // Introducing Bug
    }

    public static void SubtractTwoNumbers(int firstNumber, int secondNumber){
        int sumOfNumbers = firstNumber - secondNumber;

        System.out.println(sumOfNumbers);
    }

}