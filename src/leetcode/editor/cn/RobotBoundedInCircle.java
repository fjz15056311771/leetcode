package leetcode.editor.cn;
import java.util.ArrayList;
import java.util.List;
public class RobotBoundedInCircle{
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean isRobotBounded(String instructions) {
        int dire = 0,x = 0,y = 0;
        for(int i=0;i<instructions.length();i++){
            char m = instructions.charAt(i);
            if(m == 'L'){
                if(dire==0) dire=3;
                else dire--;
            }
            if(m == 'R'){
                if(dire==3) dire=0;
                else dire++;
            }
            if(m == 'G'){
                switch (dire){
                    case 0:y++;break;
                    case 1:x++;break;
                    case 2:y--;break;
                    case 3:x--;break;
                }
            }
        }
        if(x==0&&y==0) return true;
        if(dire!=0) return true;
        return false;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}