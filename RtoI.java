import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.lang.Math;

 class RtoI {
    public static int romanToInteger(String Roman) {

        Map<Character, Integer> romtoI = new HashMap<>();
        romtoI.put('I', 1);
        romtoI.put('V', 5);
        romtoI.put('X', 10);
        romtoI.put('L', 50);
        romtoI.put('C', 100);
        romtoI.put('D', 500);
        romtoI.put('M', 1000);

        int res = 0;
        int prevval = 0; 
        for (int i = Roman.length() - 1; i >= 0; i--) {
            char currentChar = Roman.charAt(i);
            int currentValue = romtoI.get(currentChar);

            if (prevval <=currentValue) {
                res += prevval;
            } else {
                res -=prevval ;
            }

            prevval = currentValue;
        }

        res += prevval;

        return Math.abs(res);
    }

     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Roman numeral: ");
        String roman = scanner.nextLine();

        int result = romanToInteger(roman);
        System.out.println("Integer Number is : " + result);
    }
}
