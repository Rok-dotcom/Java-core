// 4 june 2026

public class LC_316_remove_duplicate {
    public static void main(String[] args){
//        I have used 3 approaches on this problem
/*
after third method i got passes 231/290 cases now i going to apply prefix and suffix
approach;
this below code passes 231/290 cases
 */
        /*
            class Solution {
    public String removeDuplicateLetters(String s) {
        // find smallest index
        int smallIdx = 123;
        int idx=-1;
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch<smallIdx){
                smallIdx = (int)ch;
                idx = i;
            }
        }
        StringBuilder sb = new StringBuilder();
        //traverse loop from smallest idx to last idx;
        for(int i=idx; i<s.length(); i++){
            if(!sb.toString().contains(s.charAt(i)+"")){
                sb.append(s.charAt(i)+"");
            }
        }
        // now traverse from start to idx
        for(int i=idx-1; i>=0; i--){
            if(!sb.toString().contains(s.charAt(i)+"")){
                sb.insert(0,s.charAt(i)+"");
            }
        }
        return sb.toString();
    }
}
         */
    }
}
