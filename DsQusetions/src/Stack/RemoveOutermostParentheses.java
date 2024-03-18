package Stack;

import java.util.Stack;

public class RemoveOutermostParentheses {

    public static void main(String[] args) {

        String str = "(()())((()))";
        System.out.println(removeOuterParentheses(str));
    }

    public static String removeOuterParentheses(String str) {

        Stack<Character> bracket = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='('){
                if(!bracket.isEmpty()){
                    sb.append(str.charAt(i));
                }
                bracket.push(str.charAt(i));
            }else{
                bracket.pop();
                if(!bracket.isEmpty()){
                    sb.append(str.charAt(i));
                }
            }
        }
        return sb.toString();
    }
}

/*
dry run
(()())((()))
st = (
s = (, st = ((
pop, st = (, s = ()
s = ()(, st = ((
pop, st = (, s = ()()
pop, st = ,
st = (
s = ()()(, st = ((
s = ()()((, st = (((,
pop, st = ((, s = ()()(()
pop, st = (, s = ()()(())
pop, st = , return s
*/
