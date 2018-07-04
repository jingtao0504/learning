package prizedraw;

/**
 * @ClassName Section
 * @Description TODO
 * @Author 景涛（jingtao@cloud-young.com）
 * @Date 2018/6/8  14:41
 * Version 1.0
 **/
public class Section {
    private int begin;
    private int end;
    private int giftId;
    private Gift gift;

    public Gift getGift() {
        return gift;
    }

    public void setGift(Gift gift) {
        this.gift = gift;
    }

    public int getBegin() {
        return begin;
    }

    public void setBegin(int begin) {
        this.begin = begin;
    }

    public void setEnd(int end) {
        this.end = end;
    }

    public int getEnd() {
        return end;
    }

    public int getGiftId() {
        return giftId;
    }

    public void setGiftId(int giftId) {
        this.giftId = giftId;
    }

    public boolean inSection(int random){
        if(random <= end && random >= begin){
            return true;
        }else{
            return false;
        }
    }
}
