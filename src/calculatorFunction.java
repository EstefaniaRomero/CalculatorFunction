import java.util.Scanner;
public class calculatorFunction {
    public static void main(String[] args) {

        takeOption();


        String option = "";
        if (option == "S") {

            calculaterAddition();
        } else {

            calculateSubstraction();
        }
    }

    private static void takeOption() {

        String option = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("Què vols fer? Sumar(S) o Restar(s)");
        option = sc.nextLine();
    }


    private static void calculateSubstraction () {

            int num1 = askForNumber();
            int num2 = askForNumber();
            int result = substractTwoNumber(num1, num2);
            printResult(result);
        }

        private static int substractTwoNumber ( int num1, int num2){

            return num1 - num2;
        }

        private static void calculaterAddition () {

            int num1 = askForNumber();
            int num2 = askForNumber();
            int result = addTwoNumber(num1, num2);
            printResult(result);
        }

        private static void printResult ( int result){
            System.out.println("Resultat: " + result);
        }
        private static int addTwoNumber ( int num1, int num2){
            return num1 + num2;
        }
        private static int askForNumber () {
            System.out.println("Número a operar:");
            Scanner sc = new Scanner(System.in);
            return sc.nextInt();
        }
    }
