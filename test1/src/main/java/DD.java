import java.util.Arrays;

public class DD {
    public static void main(String[] args) {
       /* try {

            //获得指定字符串类对象

            Class cla=Class.forName("Test");

            //设置Class对象数组，用于指定构造方法类型

            Class[] cl=new Class[]{int.class,String.class,int.class};
            Class[] c2=new Class[]{int.class,String.class};


            //获得Constructor构造器对象。并指定构造方法类型

            Constructor con=cla.getConstructor(cl);
            Constructor con1=cla.getConstructor(c2);
            Constructor con2=cla.getConstructor();

            //给传入参数赋初值

            Object[] x={new Integer(33),new String("11111111"),new Integer(67)};
            Object[] x1={new Integer(33),new String("11111111")};
            //得到实例

            Object obj=con.newInstance(x);
            Object obj2=con1.newInstance(x1);
            Object obj3=con2.newInstance();

        } catch (Exception e) {

            e.printStackTrace();

        }
       String str = JOptionPane.showInputDialog("dfdsfdsf");
       int    in= JOptionPane.showConfirmDialog(null,"eee");
        JOptionPane.showMessageDialog(null,"dddds");
        System.out.println(str+"              "+in);*/
/*       int maxInt =Integer.MAX_VALUE;
        System.out.println(++maxInt);
        System.out.println(Long.MAX_VALUE);*/
/*List<String> ll=new ArrayList();
ll.add("2");
        ll.add("2");
        ll.add("2");
        ll.add("2");
        ll.stream().forEach(c-> System.out.println(c));
        System.out.println(ll.size());
      String str ="adaadaadaadaadaada";
      int[] arr =getNext(str);
        Arrays.stream(arr).forEach(c-> System.out.println(c));
        String ss="a,b,c,d";
        System.out.println("--------------"+Arrays.asList(ss).size());
      for(int i:arr){
          System.out.print(i+",");
      }*/

    Integer[] ii =new Integer[]{1,2,3,4,5,6};
            Arrays.asList(ii).stream().forEach(c-> System.out.println(c));
    }


    /**
              *@description
              *@param  pattern
              *@return  int[]
              *@author  jingtao
              *@createDate  2018/4/17
              */

               public static int[] getNext(String pattern) {
                 int j = 0, k = -1;
                 int[] next = new int[pattern.length()];
                 next[0] = -1;
                 while (j < pattern.length() - 1) {
                         if (-1 == k || pattern.charAt(j) == pattern.charAt(k)) {
                             if(-1!= k) {
                                 System.out.println("i=" + j + "k=" + k);
                                // System.out.println(pattern.charAt(j) + "---" + pattern.charAt(k));
                             }
                                 j++;
                                 k++;
                                 next[j] = k;
                             } else {
                                k = next[k];
                             }
                     }

                return next;
             }
}
