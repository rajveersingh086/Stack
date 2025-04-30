import java.util.*;
public class dequeslidwind {
    public int []maxslidingwimdow (int []nums , int k ){
        if (nums == null || k<=0) return new int[0];
        int [] result = new int[nums.length -k +1];

        Deque<Integer> dq = new LinkedList<>();
        for (int i = 0;i<nums.length;i++){
            if (!dq.isEmpty() && dq.peekFirst() <i-k+1){
                dq.pollFirst();
            }
            while (!dq.isEmpty() && nums[dq.peekLast()]<nums[i]){
                dq.peekLast();
            }
            dq.offerLast(i);

            if (i>=k-1){
                result[i-k+1] = nums[dq.peek()];
            }
        }
        return result;
    }
}