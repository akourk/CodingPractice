public class Main {

    public static void main(String[] args) {

        long stuff = 99;
        System.out.print("this is the input: ");
        System.out.println(stuff);
        System.out.print("this is the output ");
        System.out.println(persistence(stuff));

        stuff = 1;
        System.out.print("this is the input: ");
        System.out.println(stuff);
        System.out.print("this is the output ");
        System.out.println(persistence(stuff));

        stuff = 999;
        System.out.print("this is the input: ");
        System.out.println(stuff);
        System.out.print("this is the output ");
        System.out.println(persistence(stuff));

        stuff = 39;
        System.out.print("this is the input: ");
        System.out.println(stuff);
        System.out.print("this is the output ");
        System.out.println(persistence(stuff));
    }

    public static int persistence(long n) {
        int count = 0;
        String s = Long.toString(n);
        if(s.length() <= 1) {
            return 0;
        } else {
            Boolean finished = false;

            while(finished == false) {
                int[] sarray = new int[s.length()];

                for (int i = 0; i < s.length(); i++) {
                    sarray[i] = s.charAt(i) - 48;
                }

                int newnum = sarray[0];

                for (int i = 1; i < s.length(); i++) {
                    newnum = newnum * sarray[i];
                }

                s = Integer.toString(newnum);

                if(s.length() <= 1) {
                    finished = true;
                }
                count++;
            }
        }
        return count;
    }
}
