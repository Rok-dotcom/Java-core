import java.util.*;

public class list {
    public static void main(String[] args){
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(groupAnagrams(strs));

//        Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
    }
    public static List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> list = new ArrayList<>();
        List<String> tmpList = new ArrayList<>();
        HashMap<String,Integer> map = new HashMap<>();
        for(String s: strs){
            map.put(s,map.getOrDefault(s,0)+1);
        }

        for(int i=0; i<strs.length; i++){
            String str1 = strs[i];
            // if str's anagram is present in strs then add to tmpList
            for(int j=i+1; j<strs.length; j++){
                String str2 = strs[j];
                if(isAnagram(str1,str2)){
                    if(!list.contains(str1)){
                        tmpList.add(str1);
                    }
                    if(!list.contains(str2)){
                        tmpList.add(str2);
                    }
                }
            }
            list.add(tmpList);
            tmpList.clear();
        }
        return list;
    }
    public static boolean isAnagram(String str1,String str2){
        if(str1.length() != str2.length()) return false;
        for(int i=0; i<str1.length(); i++){
            if(!str2.contains(str1.charAt(i)+"")){
                return false;
            }
        }
        return true;
    }
}