package leetcode.editor.cn;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams{
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
//        Map<String,List<String>> map = new HashMap<String,List<String>>();
//        for(String str : strs){
//            int[] count = new int[26];
//            for(int i=0;i<str.length();i++){
//                count[str.charAt(i)-'a']++;
//            }
//            StringBuffer sb = new StringBuffer();
//            for(int i=0; i<count.length; i++){
//                sb.append((char)(count[i]));
//            }
//            List<String> temp = map.getOrDefault(sb.toString(), new ArrayList<String>());
//            temp.add(str);
//            map.put(sb.toString(),temp);
//            }
//        return new ArrayList<List<String>>(map.values());
//        }
        Map<String,List<String>> map = new HashMap<>();
        for(String str : strs){
            int[] count = new int[26];
            for(int i=0;i<str.length();i++){
                count[str.charAt(i)-'a']++;
            }
            StringBuffer sb = new StringBuffer();
            for(int i=0;i<count.length;i++){
                sb.append((char) count[i]);
            }
            List<String> list = map.getOrDefault(sb.toString(),new ArrayList<String>());
            list.add(str);
            map.put(sb.toString(),list);
        }
        return new ArrayList<List<String>>(map.values());
    }

    }

//leetcode submit region end(Prohibit modification and deletion)

}