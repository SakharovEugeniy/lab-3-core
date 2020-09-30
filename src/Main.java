import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println();
        Scanner scanner = new Scanner(System.in);
        String userInput = "";
        System.out.println("Welcome to the calculator from E.G. Sakharov.");
        System.out.println("To exit the program, enter   q");
        while (!userInput.equals("q")) {
            try {
                System.out.println("Enter the first number:");
                double firstNumber = Double.parseDouble(scanner.nextLine());
                System.out.println("Enter the second number:");
                double secondNumber = Double.parseDouble(scanner.nextLine());
                System.out.println("Enter one of the following characters: + , - , * , / , !");
                userInput = scanner.nextLine();
                double result;

                switch (userInput) {
                    case "+":
                        result = plus(firstNumber, secondNumber);
                        break;
                    case "-":
                        result = minus(firstNumber, secondNumber);
                        break;
                    case "*":
                        result = multipl(firstNumber, secondNumber);
                        break;
                    case "/":
                        if (secondNumber != 0) {
                            result = del(firstNumber, secondNumber);
                        } else {
                            System.out.println("You cannot divide by 0");
                            continue;
                        }
                        break;
                    case "!":
                        System.out.print("Factorial, calculated from the first number you entered:  ");
                        result = fact((int) firstNumber);
                        break;
                    default:
                        System.out.println("Sorry, you have entered incorrect data. Try again.");
                        continue;
                }
                System.out.println(result);
            } catch (NumberFormatException e){
                System.out.println("Sorry, you have entered incorrect data. Try again.");
                System.out.println();
            }
        }
    }

    private static double plus(double numberOne, double numberTwo){
        return numberOne + numberTwo;
    }
    private static double minus(double numberOne, double numberTwo){
        return numberOne - numberTwo;
    }
    private static double multipl(double numberOne, double numberTwo){
        return numberOne * numberTwo;
    }
    private static double del(double numberOne, double numberTwo){
        return numberOne / numberTwo;
    }
    private static int fact(int numberOne){
        int res = 1;
        for(int i = 1; i <= numberOne; i++){
            res *= i;
        }
        return res;
    }
}
