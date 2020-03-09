// There is a bot that located at a pair of integer coordinates, (x, y). It must be moved to a
// location with another set of coordinates. Though the bot can move any number of times, it
// can only make the following two types of moves:

// 1: From location (x, y) to location (x + y, y).
// 2: From location (x, y) to location (x, x + y).

// For example, if the bot starts at (1, 1), it might make the following sequence of moves:
// (1, 1) -> (1, 2) -> (3, 2) -> (5, 2). Note that movement will always be either up or to
// the right.

// Given starting and target ending coordinates, determine whether the bot can reach the ending
// coordinates given the rules of the movement.

// Function Description
// Complete the function canReach in the editor below. The function must return the string Yes
// if the bot can reach its goal, otherwise return No.

// canReach has the following parameter(s):
//  x1: integer value, starting x coordinate
//  y1: integer value, starting y coordinate
//  x2: integer value, target x coordinate
//  y2: integer value, target y coordinate

// Constraints
//  1 <= x1, y1, x2, y2 <= 1000

public class Main {
    public static void main(String[] args) {

        System.out.println("Yes: " + Result.canReach(1, 4, 5, 9));
    }
}

