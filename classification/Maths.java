import java.util.HashMap;
import java.util.Map;

public class Maths {
    //整数反转
    public int reverse(int x) {
        int result=0;
        while(x!=0){
            if(result<Integer.MIN_VALUE/10||result>Integer.MAX_VALUE/10){
                return 0;
            }
            int digit = x%10;
            x = x/10;
            result = result*10+digit;
        }
        return result;
    }

    //回文数
    public boolean isPalindrome(int x) {
        int reversNum = 0;
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        } else {
            while (x > reversNum) {
                reversNum = reversNum * 10 + x % 10;
                x /= 10;
            }
            return reversNum == x || reversNum / 10 == x;
        }
    }

    //罗马数字转整数
    public int romanToInt(String s) {
        Map<Character,Integer> map = new HashMap<Character,Integer>(){{
            put('I',1);
            put('V',5);
            put('X',10);
            put('L',50);
            put('C',100);
            put('D',500);
            put('M',1000);
        }};
        int ans=0;
        for(int i=0;i<s.length();i++){
            int value = map.get(s.charAt(i));
            if(i<s.length()-1 && map.get(s.charAt(i+1))>value){
                ans -= value;
            }else{
                ans += value;
            }
        }
        return ans;
    }

    //
}
