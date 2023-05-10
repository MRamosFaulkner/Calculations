import java.util.Scanner;

public class Calculations {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int firstNum = Integer.valueOf(scanner.nextLine());

        System.out.println("Enter another number: ");
        int secondNum = Integer.valueOf(scanner.nextLine());

        // Add the two numbers
        int addedNum = firstNum + secondNum;
        System.out.println("\n"+firstNum + " + " + secondNum + " = " + addedNum);

        int subtractedNum = firstNum - secondNum;
        System.out.println(firstNum + " - " + secondNum + " = " + subtractedNum);

        int multiplyNum = firstNum * secondNum;
        System.out.println(firstNum + " * " + secondNum + " = " + multiplyNum);

        double divideNum = firstNum / secondNum;
        System.out.println(firstNum + " / " + secondNum + " = " + divideNum);

        int remainderNum = firstNum % secondNum;
        System.out.println(firstNum + " % " + secondNum + " = " + remainderNum);

        }

    }