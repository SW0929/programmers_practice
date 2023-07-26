package stack_queue;

import java.util.Stack;

public class proper_bracket {
    public static void main(String[] args) {

        System.out.println(properBracketSolution02(")()("));
    }
    //효율성 테스트 2번 실패
    //Stack 에 문자 하나씩만 누적된다면 자료구조 사용하는 것이 시간 오래 걸림
    //즉, 효율성이 떨어짐
    static boolean properBracketSolution(String s) {
        boolean answer = false;
        Stack<Character> stack = new Stack<>();

        if (s.length() % 2 == 1 || s.charAt(0) == ')' || s.charAt(s.length()-1) == '('){
            return false;
        }else {
            for (int i = 0; i < s.length(); i++){
                stack.push(s.charAt(i));
                if (stack.firstElement() == ')'){
                    return false;
                }
                if (stack.peek() == ')'){
                    stack.pop();
                    stack.pop();
                }
            }
        }
        if (stack.isEmpty()){
            answer = true;
        }
        return answer;
    }
    static boolean properBracketSolution02(String s) {
        int cntUnpair = 0;
        for (char ch : s.toCharArray()) {
            //괄호가 모두 완성되면 cntUnpair가 0임으로 return true
            cntUnpair += ch == '(' ? 1 : -1;
            if (cntUnpair < 0) return false;
        }
        return cntUnpair == 0;
    }
}
