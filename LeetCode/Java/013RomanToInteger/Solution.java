import java.util.HashMap;

public class Solution {

    public static int romanNumeralConverter(String roman) {

        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int num = 0;

        for(int i = 0; i < roman.length(); i++) {
            if (i < roman.length() - 1 && map.get(roman.charAt(i)) < map.get(roman.charAt(i+1))) {
                num = num - map.get(roman.charAt(i));
            } else {
                num = num + map.get(roman.charAt(i));
            }
        }
        return num;
    }
}


/*

// or with switch statements: This runs faster, I think.

class Solution {
   public int romanToInt(String s) {
    int nums[]=new int[s.length()];
    for(int i=0;i<s.length();i++){
        switch (s.charAt(i)){
            case 'M':
                nums[i]=1000;
                break;
            case 'D':
                nums[i]=500;
                break;
            case 'C':
                nums[i]=100;
                break;
            case 'L':
                nums[i]=50;
                break;
            case 'X' :
                nums[i]=10;
                break;
            case 'V':
                nums[i]=5;
                break;
            case 'I':
                nums[i]=1;
                break;
        }
    }
    int sum=0;
    for(int i=0;i<nums.length-1;i++){
        if(nums[i]<nums[i+1])
            sum-=nums[i];
        else
            sum+=nums[i];
    }
    return sum+nums[nums.length-1];
}
}
 */