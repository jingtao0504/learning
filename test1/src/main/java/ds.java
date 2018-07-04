import java.util.*;

/**
 * @Description TODO
 * @Author jingtao
 * @Date 2018/4/16
 */
public class ds {
    static String  base = "string";
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        for (int i=0;i< Integer.MAX_VALUE;i++){
            String str = base + base;
            base = str;
            list.add(str.intern());
        }
    }
}
