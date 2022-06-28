public class Solution13 {
    public int romanToInt(String s) {
        int[] convertedRoman = new int[s.length()];
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == 'I') convertedRoman[i] = 1;
            else if(s.charAt(i) == 'V') convertedRoman[i] = 5;
            else if(s.charAt(i) == 'X') convertedRoman[i] = 10;
            else if(s.charAt(i) == 'L') convertedRoman[i] = 50;
            else if(s.charAt(i) == 'C') convertedRoman[i] = 100;
            else if(s.charAt(i) == 'D') convertedRoman[i] = 500;
            else if(s.charAt(i) == 'M') convertedRoman[i] = 1000;
        }
        for(int i = 0; i < s.length(); i++) System.out.println(convertedRoman[i]);
        return decimalCalculator(convertedRoman, s.length());
        }
        
    private int decimalCalculator(int[] convertedRoman, int length) {
        int sum = 0;
        for(int i = 0; i < length; i++) {
            if(i != (length - 1) && convertedRoman[i] < convertedRoman[i + 1]) {
                sum += convertedRoman[i + 1] - convertedRoman[i];
                i++;
            } else sum += convertedRoman[i];
        } return sum;
    }
}
