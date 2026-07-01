// 12 June 2026 still pending day 2.day 3.
// 30 June 2026 still pending.
// 1 July Sharam kr bhai

/*
The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)

P   A   H   N
A P L S I I G
Y   I   R
And then read line by line: "PAHNAPLSIIGYIR"

Write the code that will take a string and make this conversion given a number of rows:

string convert(string s, int numRows);


Example 1:

Input: s = "PAYPALISHIRING", numRows = 3
Output: "PAHNAPLSIIGYIR"
Example 2:

Input: s = "PAYPALISHIRING", numRows = 4
Output: "PINALSIGYAHRPI"
Explanation:
P     I    N
A   L S  I G
Y A   H R
P     I
Example 3:

Input: s = "A", numRows = 1
Output: "A"


Constraints:

1 <= s.length <= 1000
s consists of English letters (lower-case and upper-case), ',' and '.'.
1 <= numRows <= 1000
 */

 /* // copy paste solution
       if (numRows == 1 || numRows >= s.length()) {
            return s;
        }

        int idx = 0, d = 1;
        List<Character>[] rows = new ArrayList[numRows];
        for (int i = 0; i < numRows; i++) {
            rows[i] = new ArrayList<>();
        }

        for (char c : s.toCharArray()) {
            rows[idx].add(c);
            if (idx == 0) {
                d = 1;
            } else if (idx == numRows - 1) {
                d = -1;
            }
            idx += d;
        }

        StringBuilder result = new StringBuilder();
        for (List<Character> row : rows) {
            for (char c : row) {
                result.append(c);
            }
        }

        return result.toString();
    }
  */

public class Zig_zag_6 {
    public static void main(String[] args){
        String str = "PAYPALISHIRING";
        int n = 3;
        System.out.println(solution(str,n));
    }
    public static String solution(String s, int numRows){
        StringBuilder sb = new StringBuilder();
        int len = s.length()/numRows;
        int size = len*(numRows-2);
        int gap = numRows-2;
        char[][] arr = new char[3][size];
        sb.append(s.charAt(0));
                               // 0123456789   i+numRows = 0+3 = 3;
//        while(s.length()>i){ // PAYPALISHIRING
//        }
        // traverse in zig-zag manner
        // vertical column and inclined right
        int k =0;
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<numRows; j++){   // vertical traverse
                arr[j][i] = s.charAt(k++);
            }
            // inclined traverse
            i+=gap;

        }
        return "";
    }
}
