package prizedraw;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @ClassName MianTest
 * @Description TODO
 * @Author 景涛（jingtao@cloud-young.com）
 * @Date 2018/6/8  15:15
 * Version 1.0
 **/
public class MianTest {
    public static void main(String[] args) throws Exception{
        List<Gift> giftList = new ArrayList();

        Gift gift = new Gift();
        gift.setCoefficient(new BigDecimal("0.1"));
        gift.setGiftId(1);
        gift.setGiftName("一等奖");
        giftList.add(gift);

        gift = new Gift();
        gift.setCoefficient(new BigDecimal("5"));
        gift.setGiftId(2);
        gift.setGiftName("二等奖");
        giftList.add(gift);

        gift = new Gift();
        gift.setCoefficient(new BigDecimal("1.523"));
        gift.setGiftId(3);
        gift.setGiftName("三等奖");
        giftList.add(gift);

        gift = new Gift();
        gift.setCoefficient(new BigDecimal("8.88"));
        gift.setGiftId(4);
        gift.setGiftName("四等奖");
        giftList.add(gift);

        if(validGiftList(giftList)){
            PrizeDraw pd = new PrizeDraw();


            Runnable r1 = new Runnable() {
                @Override
                public void run() {
                    int count = 0;
                    for(int i = 0 ;i < 10000 ; i++) {
                        PrizeDrawResult result = pd.prizeDraw(giftList);
                        if (result.isDrawn()) {
                            if(result.getGift().getGiftId() == 1){
                                count++;
                            }
                            System.out.println("恭喜获得" + result.getGift().getGiftName());
                        } else {
                            System.out.println("未中奖");
                        }
                        try {
                            Thread.sleep(1000);
                        }catch(Exception e){

                        }
                    }
                    System.out.println("一万次抽奖一等奖中了"+count+"次");
                }
            };
            Runnable r2 = new Runnable() {
                @Override
                public void run() {
                    while(true) {
                        try {
                            Thread.sleep(10000);
                        } catch (Exception e) {

                        }
                        Scanner sc = new Scanner(System.in);
                        System.out.println("输入下标");
                        int index = Integer.valueOf(sc.next());
                        System.out.println("输入概率");
                        String coefficient  =sc.next();
                        giftList.get(index).setCoefficient(new BigDecimal(coefficient));
                    }
                }
            };
            new Thread(r1).start();
            new Thread(r2).start();


        }else{
            System.out.println("概率超出100%");
        }

    }
//验证概率是否超过100
    public static boolean validGiftList(List<Gift> giftList){
        BigDecimal total = BigDecimal.ZERO;
        for(Gift gift : giftList){
            total= total.add(gift.getCoefficient());
        }
        if(total.compareTo(new BigDecimal(100)) <= 0){
            return true;
        }else{
            return false;
        }
    }
}
