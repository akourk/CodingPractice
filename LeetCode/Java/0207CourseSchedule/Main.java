import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        int[][] prereq1 = {{0, 1}};
        System.out.println("true:" + Solution.canFinish(2, prereq1));

        int[][] prereq2 = {{1, 0}, {0, 1}};
        System.out.println("false:" + Solution.canFinish(2, prereq2));
    
        int[][] prereq3 = {{0, 1}, {1, 0}};
        System.out.println("false:" + Solution.canFinish(2, prereq3));
    
        int[][] prereq4 = {{1, 0}, {0, 2}, {2, 1}};
        System.out.println("false:" + Solution.canFinish(3, prereq4));
    
        int[][] prereq5 = {{0, 1}, {0, 2}, {1, 3}, {1, 4}, {3, 4}};
        System.out.println("true:" + Solution.canFinish(5, prereq5));

        int[][] prereq6 = {{}};
        System.out.println("true:" + Solution.canFinish(1, prereq6));

        int[][] prereq7 = {{0, 10}, {3, 18}, {5, 5}, {6, 11}, {11, 14}, {13, 1}, {15, 1}};
        System.out.println("false:" + Solution.canFinish(20, prereq7));
    }
}

// much faster and cleaner:
class Solution {
    public static boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> adj = new ArrayList<>();

        if (prerequisites.length < 2)
            return true;

        for(int i=0; i<numCourses; i++){
            adj.add(new ArrayList<>());
        }
        for(int[] x: prerequisites){
            adj.get(x[0]).add(x[1]);
        }
        
        boolean[] vis = new boolean[numCourses];
        boolean[] dfsVis = new boolean[numCourses];
        for(int i=0; i<numCourses; i++){
            if(!vis[i]){
                if(dfs(i, vis, dfsVis, adj)){
                    return false;
                }    
            }
        }
        return true;
    }
    
    public static boolean dfs(int i, boolean[] vis, boolean[] dfsVis, List<List<Integer>> adj){
        vis[i]=true;
        dfsVis[i]=true;
        
        for(int x: adj.get(i)){
            if(!vis[x]){
                if(dfs(x, vis, dfsVis, adj)){
                    return true;
                }
            }
            else if(vis[x] && dfsVis[x]){
                return true;
            }
        }
        
        dfsVis[i]=false;
        return false;
    }
}


/*
// my first attempt:
// this works, but it's ugly and slow.
class Solution {
    public static boolean canFinish(int numCourses, int[][] prerequisites) {
        HashMap<Integer, ArrayList<Integer>> hm = new HashMap<>();

        if (prerequisites.length < 2)
            return true;

        for (int i = 0; i < prerequisites.length; i++) {
            if (!hm.containsKey(prerequisites[i][1])) {
                ArrayList<Integer> al = new ArrayList<>();
                hm.put(prerequisites[i][1], al);
            }
            if (!hm.containsKey(prerequisites[i][0])) {
                ArrayList<Integer> al = new ArrayList<>();
                al.add(prerequisites[i][1]);
                hm.put(prerequisites[i][0], al);
            } else {
                hm.get(prerequisites[i][0]).add(prerequisites[i][1]);
            }
        }
        for (int i = 0; i < numCourses; i++) {
            if (!hm.containsKey(i)) {
                ArrayList<Integer> al = new ArrayList<>();
                hm.put(i, al);
            }
                
        }

        HashSet<Integer> visited = new HashSet<>();

        // prints the keys and their dependencies
        // for (int key : hm.keySet()) {
        //     System.out.print(key + " : ");
        //     for (int value : hm.get(key)) {
        //         System.out.print(value + " ");
        //     }
        //     System.out.println();
        // }

        for (int i = 0; i < numCourses; i++) {
            if (!dfs(i, hm, visited))
                return false;
        }

        return true;
    }
    public static boolean dfs (int course, HashMap<Integer, ArrayList<Integer>> hm, HashSet<Integer> visited) {
        if (visited.contains(course))
            return false;

        if (hm.containsKey(course) && hm.get(course).isEmpty())
            return true;
        
        visited.add(course);

        if (hm.containsKey(course)) {
            for (int prereq : hm.get(course)) {
                if (!dfs(prereq, hm, visited)) {
                    return false;
                }
            }
        }

        visited.remove(course);
        if (hm.containsKey(course))
            hm.remove(course);

        return true;
    }
}

*/