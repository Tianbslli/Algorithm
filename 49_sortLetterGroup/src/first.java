import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Jorsh
 * @version 1.0
 * @date 2020/6/27 10:16 下午
 */
public class first {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List> ans = new HashMap<>();
        for(String s : strs){
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String key = String.valueOf(chars);
            if(!ans.containsKey(key)) {
                ans.put(key,new ArrayList());
            }
            ans.get(key).add(s);

        }
        return new ArrayList<>(ans.values());
    }
}
