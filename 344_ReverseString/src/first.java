/**
 * @author Jorsh
 * @version 1.0
 * @date 2020/6/10 9:55 下午
 */
public class first {

    public void reverseString(char[] s) {
        if(s == null || s.length == 0){
            return;
        }
        int i = 0, j = s.length -1;
        while (i < j) {
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
            i++;
            j--;
        }

    }


}
