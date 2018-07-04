package prizedraw;

import org.apache.tomcat.jni.Time;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @ClassName PrizeDraw
 * @Description TODO
 * @Author 景涛（jingtao@cloud-young.com）
 * @Date 2018/6/8  12:09
 * Version 1.0
 **/
public class PrizeDraw {
    public PrizeDrawResult prizeDraw(List<Gift> giftList){
        PrizeDrawResult prizeDrawResult = new PrizeDrawResult();
        //放大倍数
        int times = getTimes(giftList);
        //获取奖品区间
        List<Section> sectionList = setSctionList(giftList,times);
        Random random = new Random();
        Gift gift = getGift(sectionList,random.nextInt(100*times)+1);
        if(gift == null){
            prizeDrawResult.setDrawn(false);
        }else{
            prizeDrawResult.setDrawn(true);
            prizeDrawResult.setGift(gift);
        }
        return prizeDrawResult;
    }
//计算放大倍数
    public int getTimes(List<Gift> giftList){
        int fix = 0;
        for(Gift gift :giftList){
            String minCoefficient = gift.getCoefficient().toString();
            if(minCoefficient.indexOf(".") != -1){
                int f = minCoefficient.substring(minCoefficient.indexOf(".")).length()-1;
                if(f > fix){
                    fix = f;
                }
            }

        }
        StringBuffer sb = new StringBuffer("1");
        for(int i = 0 ; i < fix ; i++){
            sb.append("0");
        }
        return Integer.parseInt(sb.toString());
    }

    public List<Section> setSctionList(List<Gift> giftList,int times){
        List<Section> sectionList = new ArrayList();
        int border = 0;
        Section s ;
        for(Gift gift :giftList){
            s = new Section();
            s.setBegin(border+1);
            int section = gift.getCoefficient().multiply(new BigDecimal(times)).intValue();
            s.setEnd(border+section);
            s.setGiftId(gift.getGiftId());
            s.setGift(gift);
            border+=section;
            sectionList.add(s);
        }
        return sectionList;
    }
//获取礼品id  没中奖则返回0
    public Gift getGift(List<Section> sections ,int random){
        System.out.println("随机数是"+random);
        for(Section section : sections){
            if(section.inSection(random)){
                return section.getGift();
            }
        }
        return null;
    }
}
