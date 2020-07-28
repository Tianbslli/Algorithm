import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * @author Jorsh
 * @version 1.0
 * @date 2020/7/10 11:02 下午
 */
public class first {
    class Solution {
        private List<String> output = new LinkedList<>();

        private Map<String, String> phone = new HashMap<>() {
            {
                put("2", "abc");
                put("3", "def");
                put("4", "ghi");
                put("5", "jkl");
                put("6", "mno");
                put("7", "pqrs");
                put("8", "tuv");
                put("9", "wxyz");
            }
        };

        public List<String> letterCombinations(String digits) {
            if (digits == null || digits.isEmpty()) {
                return new LinkedList<String>();
            }
            backtrack("",digits);
            return output;
        }

        public void backtrack(String combination,String next_digits) {
            if (next_digits == null || next_digits.isEmpty()) {
                output.add(combination);
                return;
            }
            String letter = phone.get(next_digits.substring(0, 1));
            for (int i = 0; i < letter.length(); i++) {
                backtrack(combination + letter.substring(i,i+1) , next_digits.substring(1));
            }
        }
    }
}
