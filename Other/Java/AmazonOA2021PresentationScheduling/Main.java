package AmazonOA2021PresentationScheduling;

/*
A special events coordinator for Amazon Web Services is planning to host a series of
presentations by different companies for a Day 1 Orientation. The coordinator has a list of
companies along with their respective arrival times and their duration of stay. Only one
company can be presenting at any time. Given each company's arrival time and the duration
they will stay, determine the maximum number of presentations that can be hosted during the orientation.

Example:
n = 5
arrival = [1, 3, 3, 5, 7]
durations = [2, 2, 1, 2, 1]

Companies:
                             ___
                     _______
             xxx
             _______
     _______
0   1   2   3   4   5   6   7   8

OR

                             ___
                     _______
             xxxxxxx
             ___
     _______
0   1   2   3   4   5   6   7   8

The first company arrives at time 1 and stays for 2 hours. At time 3, two caompanies arrive, but
only 1 can stay for either 1 or 2 hours. The next companies arrive at times 5 and 7 and do not
conflict with any others. In total, there can be a maximum of 4 promotional events.

Function Description
Complete the function maxEvents in the editor below.

maxEvents has the following parameter(s):
    int arrival[n]: an array of integers where ith element is the arrival time of the ith company
    int duration[n]: an array of integers where ith element is the duration that the ith company's stay at the career fair

Returns:
    int: the maximum number of promotional events that can be hosted.

Constraints:
    1 <= n <= 50
    1 <= arrival[i] <= 1000
    1 <= duration[i] <= 1000
    Both the 'arrival' array and the 'duration' array will have an equal number of elements

 */

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

    }
    
    // this passed all tests
    public static int maxEvents(List<Integer> arrival, List<Integer> duration) {
        int numOfMeetings = 0;

        List<Meeting> list = new ArrayList<>();
        for (int i = 0; i < arrival.size(); i++) {
            list.add(new Meeting(arrival.get(i), arrival.get(i) + duration.get(i)));
        }
        list.sort(Comparator.comparingInt(i -> i.end));

        int previous = Integer.MIN_VALUE;

        for (Meeting m : list) {
            if (m.start >= previous) {
                numOfMeetings++;
                previous = m.end;
            }
        }

        return numOfMeetings;
    }
}

class Meeting {
    int start;
    int end;
    Meeting(int start, int end) {
        this.start = start;
        this.end = end;
    }
}
