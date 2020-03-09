public class Result {
    public static String canReach(int x1, int y1, int x2, int y2) {
        if (x1 == x2 && y1 == y2)
            return ("Yes");

        return recursiveFunc(x1, y1, x2, y2) ? "Yes" : "No";
    }

    public static boolean recursiveFunc(int x1, int y1, int x2, int y2) {
        if (x1 == x2 && y1 == y2)
            return (true);
        if (x1 < x2)
            return recursiveFunc(x1 + y1, y1, x2, y2);
        if (y1 < y2)
            return recursiveFunc(x1, x1 + y1, x2, y2);
        return (false);
    }
}


//    public static String canReach(int x1, int y1, int x2, int y2) {
//
//        if (x1 == x2 && y1 == y2)
//            return ("Yes");
//        if (x2 < 1 || y2 < 1)
//            return ("No");
//
//        while (x1 <= x2) {
//            if (recurseRight(x1, y1, x2, y2))
//                return ("Yes");
//            x1 += y1;
//        }
//        return ("No");
//    }
//    public static boolean recurseRight(int x1, int y1, int x2, int y2) {
//        if (x1 == x2 && y1 == y2)
//            return (true);
//        if (y1 < y2)
//            return recurseRight(x1, x1 + y1, x2, y2);
//        return (false);
//    }
