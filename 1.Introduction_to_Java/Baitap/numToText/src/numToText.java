import java.util.Scanner;
public class numToText<Static, unit, num> {
    private static String ones, tens, hundred;
    static void ones(int num) {
        switch (num) {
            case 1:
                ones = "One"; break;
            case 2:
                ones = "Two"; break;
            case 3:
                ones = "Three"; break;
            case 4:
                ones = "Four"; break;
            case 5:
                ones = "Five"; break;
            case 6:
                ones = "Six"; break;
            case 7:
                ones = "Seven"; break;
            case 8:
                ones = "Eight"; break;
            case 9:
                ones = "Nine"; break;
            case 10:
                ones = "ten"; break;
            case 11:
                ones = "eleven"; break;
            case 12:
                ones = "Twelve"; break;
            case 13:
                ones = "Thirteen"; break;
            case 14:
                ones = "Fourteen"; break;
            case 15:
                ones = "Fifteen"; break;
            case 16:
                ones = "Sixteen"; break;
            case 17:
                ones = "Seventeen"; break;
            case 18:
                ones = "Eighteen"; break;
            case 19:
                ones = "Nineteen"; break;
            default:
                System.out.println("");
        }
    }

    static void tens(int num) {
        switch (num) {
            case 20:
                tens = "Twenty"; break;
            case 30:
                tens = "Thirty"; break;
            case 40:
                tens = "Fourty"; break;
            case 50:
                tens = "Fifty"; break;
            case 60:
                tens = "Sixty"; break;
            case 70:
                tens = "Seventy"; break;
            case 80:
                tens = "Eighty"; break;
            case 90:
                tens = "Ninety"; break;
            default:
                tens = "";
        }
    }

    static void hundred(int num) {
        switch (num) {
            case 100:
                hundred = "One Hundred"; break;
            case 200:
                hundred = "Two Hundred"; break;
            case 300:
                hundred = "Three Hundred"; break;
            case 400:
                hundred = "Four Hundred"; break;
            case 500:
                hundred = "Five Hundred"; break;
            case 600:
                hundred = "Six Hundred"; break;
            case 700:
                hundred = "Sven Hundred"; break;
            case 800:
                hundred = "Eight Hundred"; break;
            case 900:
                hundred = "Nine Hundred"; break;
            default:
                hundred = "";
        }
    }
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        System.out.println("Nhap 1 so");
        int ones_1, tens_1, hundred_1;
        int num = scanner.nextInt();
        if(num <= 20){
            ones(num);
            System.out.println(ones);
        } else if (num < 100 && num > 20){
            ones_1 = num % 10;
            tens_1 = num - ones_1;
            ones(ones_1);
            tens(tens_1);
            System.out.println(tens + ones_1);
        } else if (num < 1000 && num >= 100){
            tens_1 = num % 100;
            if (tens_1 <= 20){
                hundred_1 = num - tens_1;
                hundred(hundred_1);
                ones(tens_1);
                System.out.println(hundred + " and " + ones);
            }
            else {
                hundred_1 = num - tens_1;
                ones_1 = tens_1 % 10;
                tens_1 = tens_1 - ones_1;
                ones(ones_1);
                tens(tens_1);
                hundred(hundred_1);
                System.out.println(hundred + " and " + tens + " " + ones);
            }
        }
    }
}