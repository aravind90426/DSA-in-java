package StackANdQueue.problems;
import  java.util.*;
public class ImplementStackUsingQueues {


        Stack<Integer> first;
        Stack<Integer> second;
        public ImplementStackUsingQueues() {
            first= new Stack<>();
            second = new Stack<>();





        }

        public void push(int x) {
            //if(first.isFull())
            // {

            // }
            first.add(x);
        }

        public int pop() {
            while(!first.isEmpty())
            {
                second.push(first.pop());
            }
            int remove = second.pop();
            while(!second.isEmpty())
            {
                first.push(second.pop());
            }
            return remove;

        }

        public int peek() {
            while(!first.isEmpty())
            {
                second.push(first.pop());
            }
            int remove = second.pop();
            first.push(remove);
            while(!second.isEmpty())
            {
                first.push(second.pop());
            }
            return remove;

        }

        public boolean empty() {
            return first.isEmpty();
        }
    }

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */

