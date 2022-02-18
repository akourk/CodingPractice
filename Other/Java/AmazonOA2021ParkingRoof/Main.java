package AmazonOA2021ParkingRoof;
/*
Amazon logistics would like to quickly set up a roof over a parking lot. There are many cars
parked in the parking lot and the lot is in a straight line. There are n cars currently parked and a
roofer needs to cover them with a roof. The requirement is that at least k cars currently in the lot
are covered by the roof. Determine the minimum length of the roof to cover k cars.

Example:
n = 4
cars = [6, 2, 12, 7]
k = 3

          ________________      <- length = 7
  ___________                   <- length = 6
  x       x x            x
1 2 3 4 5 6 7 8 9 10 11 12

Two roofs that cover three cars are possible: one covering spots 2 through 7 with a length of 6,
and another covering slots 6 through 12 with a length of 7. The shortest roof that meets the
requirement is of length 6.

Function Description

Complete the function carParkingRoof in the editor below.
carParkingRoof has the following parameter(s):
    int cars[n]: the parking spots where cars are parked
    int k: the number of cars that have to be covered by the roof
Returns:
    int: the minimum length of a roof that covers k cars where they are parked currently.

Constraints:
    1 <= n <= 10^5
    1 <= k <= n
    1 <= cars[i] <= 10^14
    All spots taken by cars are unique
 */

import java.util.List;

public class Main {

    // this passed all tests
    public static long carParkingRoof(List<Long> cars, int k) {
        cars.sort(null);

        long size = cars.get(cars.size() - 1) - cars.get(0) + 1;
        if (cars.size() == k)
            return size;

        for (int i = 0; i < cars.size() - k; i++)
            if (cars.get(i + k - 1) - cars.get(i) < size)
                size = cars.get(i + k - 1) - cars.get(i) + 1;

        return size;
    }
    public static void main(String[] args) {

    }
}

