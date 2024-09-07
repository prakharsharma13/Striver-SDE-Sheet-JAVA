
public class RemoveOutermostParentheses{
    public static  String removeParentheses(String s){
        int count = 0;
        StringBuilder ans = new StringBuilder();

        for(char c : s.toCharArray()){
            if(c == '('){
                if(count != 0){
                    ans.append(c);
                }
                count++;
            }else{
                if(count > 1){
                    ans.append(c);
                }
                count--;
            }

        }
        return ans.toString();
    }
    public static void main(String[] args) {
        String s = "(()())(())(()(()))";
        System.out.println(removeParentheses(s));
    }
}

