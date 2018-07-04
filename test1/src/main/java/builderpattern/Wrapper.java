package builderpattern;

import utils.MathUtils;

/**
 * @ClassName Wrapper
 * @Description TODO
 * @Author 景涛（jingtao@cloud-young.com）
 * @Date 2018/5/3  17:25
 * Version 1.0
 **/
public class Wrapper implements Packing {
    @Override
    public String pack() {
        return "Wrapper";
    }

    public static void main(String[] args) {
        int s = 0;
        try {
            s = MathUtils.intAdd(Integer.MAX_VALUE, 1);
        }catch(Exception e){
            System.out.println("转换错误");
            System.out.println(e.getStackTrace());
        }
        System.out.println(s);
    }
}
