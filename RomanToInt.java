import java.util.Scanner;

public class RomanToInt {

    public static void main(String[] args) {
        System.out.println("Enter your roman number: ");
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        System.out.println(romanToInt(s));
    }

    public static int romanToInt(String s) {
        int answer = 0;
        int number = 0;
        int preview = 0;

        for (int i=s.length()-1; i>=0; i--) {
            switch (s.charAt(i)) {
                case 'I':
                    number = 1;
                    break;
                case 'V':
                    number = 5;
                    break;
                case 'X':
                    number = 10;
                    break;
                case 'L':
                    number = 50;
                    break;
                case 'C':
                    number = 100;
                    break;
                case 'D':
                    number = 500;
                    break;
                case 'M':
                    number = 1000;
                    break;
            }

            if (number < preview) {
                answer -= number;
            } else {
                answer += number;
            }
            preview = number;

        }
        return answer;
    }
}

