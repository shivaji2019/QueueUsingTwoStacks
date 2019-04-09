
/*queue using two stacks
 *In this challenge, you must first implement a queue using two stacks. Then process queries, where each query is one of the following 3 types:
 *1 x: Enqueue element into the end of the queue.
 *2: Dequeue the element at the front of the queue.
 *3: Print the element at the front of the queue.
 */



import java.io.*;
import java.util.*;

public class Solution {
    
    public static void pushed(int a, Stack s, Stack s1){
        s.push(a);
    }


    public static void peek(Stack s, Stack s1){
        if(s1.size()>0){
            System.out.println(s1.peek());
        }else{
            while(!s.empty()){
                s1.push(s.pop());
            }
            System.out.println(s1.peek());
        }
    }

    public static void dequeue(Stack s, Stack s1){
        if(s1.size()>0){
            s1.pop();
        }else{
            while(!s.empty()){
                s1.push(s.pop());
            }
            s1.pop();
        }
    }

    public static void main(String[] args) {
        Stack<Integer> stack1 = new Stack();
        Stack<Integer> stack2 = new Stack();

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for(int i=0; i<n; i++) {
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    pushed(sc.nextInt(), stack1, stack2);
                    break;
                case 2:
                    dequeue(stack1, stack2);
                    break;
                case 3:
                    peek(stack1, stack2);
                    break;
                default:
                    break;

            }
        }
    }
}
