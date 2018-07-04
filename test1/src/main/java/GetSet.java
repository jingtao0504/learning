import java.lang.reflect.Field;
import java.util.HashMap;

/**
 * @Description TODO
 * @Author jingtao
 * @Date 2018/4/17
 */
public class GetSet {
    private String str1;
    private String str2;
 /**
  *@description 
  *@param
  *@return  
  *@author  jingtao
  *@createDate  2018/4/17
  */
    public String getStr1() {
        return str1;
    }
    public void setStr1(String str1) {
        this.str1 = str1;
    }

    public String getStr2() {
        return str2;
    }

    public void setStr2(String str2) {
        this.str2 = str2;
    }

    public static void main(String[] args) {
        /*System.out.println(Integer.toString(30,16));
        String str = String.valueOf('c');
        String str2 = String.valueOf(true);
        System.out.println(str);
        System.out.println(Integer.MAX_VALUE);
        HashMap map = new HashMap();
        System.out.println(Integer.toString(2000000000,2));
        System.out.println(1 << 30);*/
        /*System.out.println(tableSizeFor(2000000000));
        System.out.println(1 << 30);
        System.out.println(Integer.toString(30,2));
        System.out.println(Integer.parseInt("1000000000000000000000000000000",2));*/
        //System.out.println(Integer.toString(10,2));
       /* System.out.println(-4 >> 1);
        System.out.println(Integer.toString(-10,2));
        System.out.println(-10 >>> 2);*/

        System.out.println(Integer.toString(2000000000,32));
        System.out.println(-10 >> 2);
        System.out.println(Integer.parseInt("11",2));
        System.out.println(-10 >>>2);
        System.out.println(Integer.parseInt("111111111111111111111111111101",2));

       /* 10000000 00000000 00000000 00001010
                11111111 11111111 11111111 11110110
                00111111 11111111 11111111 11111101
                00100000 00000000 00000000 00000011
                -2
        00111111 11111111 11111111 11111101

                0111
                        110*/
       // System.out.println( 10 >>> 2);
       // System.out.println( 10 >> 2);
        System.out.println(Integer.toString(-10 >> 1,2));
        System.out.println(Integer.toString(-10 >> 2,2));
        System.out.println( -10 >> 2);
        System.out.println(Integer.toString(-10 >> 2,2));
        System.out.println( -10 >>> 2);
    }
    public static void swapOne(int a, int b){
        int aTempValue = a;
        a++;
        b = aTempValue;
    }
    public static void swapTwo(Integer a1, Integer b1) throws Exception {
        Field valueField = Integer.class.getDeclaredField("value");
        valueField.setAccessible(true);
        int tempAValue = valueField.getInt(a1);
        valueField.setInt(a1, b1.intValue());
        valueField.setInt(b1, tempAValue);
    }
    static final int tableSizeFor(int cap) {
        int MAXIMUM_CAPACITY = 1 << 30;
        int n = cap - 1;
        System.out.println(Integer.toString(n,2));
        System.out.println("  "+Integer.toString(n >>> 1,2));
        n |= n >>> 1;
        System.out.println(Integer.toString(n,2));
        System.out.println("  "+Integer.toString(n >>> 1,2));
        n |= n >>> 2;
        System.out.println(Integer.toString(n,2));
        System.out.println("  "+Integer.toString(n >>> 2,2));
        n |= n >>> 4;
        System.out.println(Integer.toString(n,2));
        System.out.println("  "+Integer.toString(n >>> 4,2));
        n |= n >>> 8;
        System.out.println(Integer.toString(n,2));
        System.out.println("  "+Integer.toString(n >>> 8,2));
        n |= n >>> 16;
        System.out.println(Integer.toString(n,2));
        System.out.println("  "+Integer.toString(n >>> 16,2));
        return (n < 0) ? 1 : (n >= MAXIMUM_CAPACITY) ? MAXIMUM_CAPACITY : n + 1;
    }



}
