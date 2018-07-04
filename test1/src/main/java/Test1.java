import java.lang.reflect.Method;
import java.util.ArrayList;

public class Test1 {
    public static void main(String[] args) throws Exception{
        ArrayList<Integer> list =  new ArrayList<Integer>();
        list.add(2);
        Class c = list.getClass();
        Method method = c.getDeclaredMethod("add",Object.class);
        method.invoke(list,"333");
       // list.stream().forEach(s -> System.out.println(s));
        System.out.println(list);
    }
}
