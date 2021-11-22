package LeetCode155MinStack;

// Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.

// - push(x)    -- Push an element x onto stack.
// - pop()      -- Removes the element on top of the stack.
// - top()      -- Get the top element.
// - getMin()   -- Retrieve the minimum element in the stack.

// Ex:
// Input:
// ["MinStack", "push", "push", "push", "getMin", "pop", "top", "getMin"]
// [[], [-2], [0], [-3], [], [], [], []]

// Output:
// [null, null, null, null, 03, null, 0, -2]

// Explanation:
// MinStack minStack = new MinStack();
// minStack.push(-2);
// minStack.push(0);
// minStack.push(-3);
// minStack.getMin();   // return -3
// minStack.pop();
// minStack.top();      // return 0
// minStack.getMin();   // return -2

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        System.out.println(minStack.getMin());   // return -3
        minStack.pop();
        System.out.println(minStack.top());      // return 0
        System.out.println(minStack.getMin());   // return -2
    }
}

class MinStack {
    private int min;
    private ArrayList<Integer> stack;

    public MinStack() {
        min = Integer.MAX_VALUE;
        stack = new ArrayList<Integer>();
    }

    public void push(int x) {
        stack.add(x);
        if (x < min)
            min = x;
    }

    public void pop() {
        if (!stack.isEmpty()) {
            int x = stack.remove(stack.size() - 1);
            if (x == min) {
                min = Integer.MAX_VALUE;
                for (int i : stack)
                    if (i < min)
                        min = i;
            }
        }
    }

    public int top() {
        return stack.get(stack.size() - 1);
    }

    public int getMin() {
        return min;
    }
}