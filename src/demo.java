import java.util.Scanner;
public class demo {
    public static String sohangdonvi(int number) {
        String voidnumberdonvi = "";
        switch (number) {
            case 0:
                voidnumberdonvi = "zero";
                break;
            case 1:
                voidnumberdonvi = "one";
                break;
            case 2:
                voidnumberdonvi = "two";
                break;
            case 3:
                voidnumberdonvi = "three";
                break;
            case 4:
                voidnumberdonvi = "four";
                break;
            case 5:
                voidnumberdonvi = "five";
                break;
            case 6:
                voidnumberdonvi = "six";
                break;
            case 7:
                voidnumberdonvi = "seven";
                break;
            case 8:
                voidnumberdonvi = "eight";
                break;
            case 9:
                voidnumberdonvi = "nine";
                break;
        }
        return voidnumberdonvi;
    }
    public static String insotu10den20(int number) {
        String voidnumber10den20 = "";
        switch (number) {
            case 10:
                voidnumber10den20 = "Ten";
                break;
            case 11:
                voidnumber10den20 = "Eleven";
                break;
            case 12:
                voidnumber10den20 = "Twelve";
                break;
            case 13:
                voidnumber10den20 = "Thirteen";
                break;
            case 14:
                voidnumber10den20 = "Fourteen";
                break;
            case 15:
                voidnumber10den20 = "Fifteen";
                break;
            case 16:
                voidnumber10den20 = "Sixteen";
                break;
            case 17:
                voidnumber10den20 = "Seventeen";
                break;
            case 18:
                voidnumber10den20 = "Eighteen";
                break;
            case 19:
                voidnumber10den20 = "Nineteen";
                break;
        }
        return voidnumber10den20;
    }
    public static String sohangchuc(int number) {
        String voidnumber20den99 = "";
        switch (number) {
            case 2:
                voidnumber20den99 = "Twenty";
                break;
            case 3:
                voidnumber20den99 = "Thirty";
                break;
            case 4:
                voidnumber20den99 = "Forty";
                break;
            case 5:
                voidnumber20den99 = "Fifty";
                break;
            case 6:
                voidnumber20den99 = "Sixty";
                break;
            case 7:
                voidnumber20den99 = "Seventy";
                break;
            case 8:
                voidnumber20den99 = "Eighty";
                break;
            case 9:
                voidnumber20den99 = "Ninety";
                break;
        }
        return voidnumber20den99;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int number = scanner.nextInt();
        if (number >= 0 && number < 10) {
            sohangdonvi(number);
            System.out.println(sohangdonvi(number));
        }
        if (number > 999) {
            System.out.println("Out of ability");
        }
        if (number >= 10 && number < 20) {
            insotu10den20(number);
            System.out.println(insotu10den20(number));
        }
        if (number >= 20 && number < 100) {
            int hangchuc = number/10;
            sohangchuc(hangchuc);
            int hangdonvi = number % 10;
            sohangdonvi(hangdonvi);
            System.out.println(sohangchuc(hangchuc) + " " +  sohangdonvi(hangdonvi));
        }
        if (number >= 100 && number < 1000) {
            int hangtram = number / 100;
            sohangdonvi(hangtram);
            int hangchuc = (number % 100) / 10;
            sohangchuc(hangchuc);
            int hangdonvi = number % 10;
            sohangdonvi(hangdonvi);
            System.out.println(sohangdonvi(hangtram) + " hundred " + sohangchuc(hangchuc) + " " + sohangdonvi(hangdonvi));
        }
    }
}

