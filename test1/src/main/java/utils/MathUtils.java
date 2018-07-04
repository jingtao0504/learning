package utils;

/**
 * @ClassName MathUtils
 * @Description TODO
 * @Author 景涛（jingtao@cloud-young.com）
 * @Date 2018/5/3  18:50
 * Version 1.0
 **/
public class MathUtils  {
    public static Integer intAdd(int a,int b) throws Exception{
        long c = Long.parseLong(a+"") + Long.parseLong(b+"");
        if(c <= Integer.MAX_VALUE && c >= Integer.MIN_VALUE){
            return a + b;
        }else{
            throw new Exception();
        }

    }
}
