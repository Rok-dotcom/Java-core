// 3 June 2026

public class Problem56_mergeIntervales {
    public static void main(String[] args){
    // this is the graph question but solved it by my method some of the
    // test cases runs but others are not run i have copy pasted the the
    // the solution given by leetcode . Let's solve after learning graph
    // I have spent around 2hrs 15 min
        /*
        class Solution {
    public int[][] merge(int[][] intervals) {
        List<Integer> list = new ArrayList<>();
        HashMap<Integer,String> map = new HashMap<>();

        for(int i=0; i<intervals.length; i++){
                int st = intervals[i][0];
                int end = intervals[i][1];
                String str = st+","+end;
                boolean flag = true;
                for(int j=st; j<=end; j++){
                    if(map.containsKey(j)){
                        flag = false;
                        int max = Integer.MAX_VALUE;
                        int min = Integer.MIN_VALUE;
                        String s = map.get(j);
                        int minSt = s.charAt(0)-'0';
                        int maxEnd = s.charAt(2)-'0';
                        if(minSt>=st){  // for min value
                            min = st;
                        }else{
                            min = minSt;
                        }

                        if(maxEnd>=end){  // for max value
                            max = maxEnd;
                        }else{
                            max = end;
                        }
                        list.add(min);
                        list.add(max);
                        break;
                    }else{
                        map.put(j,str);
                    }

                }
                if(flag){
                    list.add(st);
                    list.add(end);
                }
        }
        int size = list.size()/2;
        int[][] ans = new int[size][2];
        int count =0;
        for(int i=0; i<ans.length; i++){
            for(int j=0; j<ans[i].length; j++){
                int n = list.get(count++);
                ans[i][j] = n;
            }
        }
        return ans;
    }
}

         */
    }
}
