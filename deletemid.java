package stack;
import java.util.*;
public class deletemid {
    
    // Function to delete middle element of a stack.
    public void deleteMid(Stack<Integer> s) {
        int si = s.size();
        int mid = si /2;
        
        Stack <Integer> temp = new Stack <>();
        for (int i =0;i<mid;i++){
            temp.push(s.pop());
        }
        s.pop();
        while (!temp.isEmpty()){
            s.push(temp.pop());
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        deletemid obj = new deletemid();

        System.out.println("Enter the number of elements in the stack:");
        int n = sc.nextInt();

        System.out.println("Enter the elements of the stack:");
        for (int i = 0; i < n; i++) {
            stack.push(sc.nextInt());
        }

        System.out.println("Original Stack: " + stack);
        obj.deleteMid(stack);
        System.out.println("Stack after deleting the middle element: " + stack);
    }
}

