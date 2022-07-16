import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        int[] houses0 = {1, 2, 3};
        int[] heaters0 = {2};

        int[] houses1 = {1, 2, 3, 4};
        int[] heaters1 = {1, 4};

        int[] houses2 = {1, 5};
        int[] heaters2 = {2};

        System.out.println("1:" + Solution.findRadius(houses0, heaters0));
        System.out.println("1:" + Solution.findRadius(houses1, heaters1));
        System.out.println("3:" + Solution.findRadius(houses2, heaters2));

    }
}

class Solution {
    public static int findRadius(int[] houses, int[] heaters) {
        Arrays.sort(heaters);
        int result = Integer.MIN_VALUE;


        for (int house : houses) {
            int index = Arrays.binarySearch(heaters, house);
            if (index < 0)
                index = -(index + 1);
            int dist1 = index - 1 >= 0 ? house - heaters[index - 1] : Integer.MAX_VALUE;
            int dist2 = index < heaters.length ? heaters[index] - house : Integer.MAX_VALUE;
            result = Math.max(result, Math.min(dist1, dist2));
        }
        
        return result;
    }
}


// this was a google oa 2022. bombed it :D

/*
 Given the positions of houses and heaters on a horizontal line, return the minimum radius of heaters so that those heaters could cover all houses.

One heater could, but doesn’t have to cover all houses, as long as each house could be covered by a heater (within the minimum radius).
 
Constraints:

1 <= houses.length OR heaters.length 
1 <= houses[i] OR heaters[i]

Example 1:

Input: houses = [1,2,3], heaters = [2]
Output: 1
Explanation: The only heater was placed in position 2, and if we use the radius 1, then all the houses can be warmed.


Example 2:

Input: houses = [2,1,3,4], heaters = [2,5]
Output: 1
Explanation: The two heaters were placed in the position 2 and 5. We need to use radius 1 then all the houses can be warmed.

Example 3:


// 1 2 3 4 5
// < < x > >
// x       x  
//   ^   
Input: houses = [1,5], heaters = [2]
Output: 3

public static int Solution(int[] houses, int[] heaters) {
  Arrays.sort(houses); /*.   6 
  Arrays.sort(heaters); /*. 1,3,4,8,10 .....  
  int MaxOfMins = INT_Min;
  int tempMin = INT_MAX
  int tempArr;
  
  
  for (int i = 0; i < houses; i++) {
    // check middle
    //while()
    if (houses[i] - heaters[heaters.length / 2] < 0) {
      
      // get min distance
      if (Math.abs(houses[i] - heaters[heaters.length / 2]) < tempMin)
         tempMin = Math.abs(houses[i] - heaters[heaters.length / 2];
      if (Math.abs(houses[i] - heaters[heaters.length / 2]; == 0)
         tempMin = 0;
          
          
      // check right
      tempArr = Arrays.copyOfRange(heaters.length / 2, heaters.length, houses);
      int dist = checkMid(tempArr, houses[i], heaters);
      
      

    } else if (>0
              // check left
      tempArr = Arrays.copyOfRange(Arrays.copyOfRange(0, heaters.length / 2, houses);
      int dist = checkMid(tempArr, houses[i], heaters); 
      // replace new max distance
               
               
  }
               
  private static int checkMid(int[] arr, int house, int[] heaters) {
    
  }
  
}


  
  
 */

