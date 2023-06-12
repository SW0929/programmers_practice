package practice_Java;


import java.util.Stack;

public class nSameNum {
    public static void main(String args[]) {
        int arr[] = {1,1,3,3,0,1,1};
        System.out.println(nSameNumSolution(arr));
    }
    public static Stack nSameNumSolution(int []arr) {
        Stack<Integer> stack = new Stack<Integer>();
        for (int i = 0; i < arr.length; i++){
            if (stack.empty()){
                stack.push(arr[i]);
            }else{
                if (stack.peek() != arr[i]){
                    stack.push(arr[i]);
                }
            }
        }
        return stack;
    }
}


