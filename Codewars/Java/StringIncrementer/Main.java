// String Incrementer
// Your job is to write a function which increments a string, to
// create a new string. If the string already ends with a number,
// the number should be incremented by 1. If the string does not
// end with a number the number 1 should be appended to the new
// string.

// ex.
// foo -> foo1
// foobar23 -> foobar24
// foo0042 -> foo0043
// foo9 -> foo10
// foo099 -> foo100

// Attention: if the number has leading zeros the amount of digits
// should be considered.


public class Main {

    public static void main(String[] args) {


        System.out.println("foobar000 : foobar001");
        System.out.println(Solution.solution("foobar000"));

        System.out.println("foo : foo1");
        System.out.println(Solution.solution("foo"));

        System.out.println("foobar001 : foobar002");
        System.out.println(Solution.solution("foobar001"));

        System.out.println("foobar99 : foobar100");
        System.out.println(Solution.solution("foobar99"));

        System.out.println("foobar099 : foobar100");
        System.out.println(Solution.solution("foobar099"));

        System.out.println(" : 1");
        System.out.println(Solution.solution(""));

    }
}
