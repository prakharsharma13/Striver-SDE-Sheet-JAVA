public class MaxNestingDepthParenthesis {
    public static int maxDepth(String s) {
        int n = s.length();
        int para = 0;
        int count = 0;

        for(int i=0; i<n; i++){
            if(s.charAt(i) == '('){
                para++;
            }
            count = Math.max(para, count);
            if(s.charAt(i) == ')'){
                para--;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String s = "(1+(2*3)+((8)/4))+1";
        System.out.println(maxDepth(s));
    }
}
