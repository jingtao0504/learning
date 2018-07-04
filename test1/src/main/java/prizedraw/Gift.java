package prizedraw;

import java.math.BigDecimal;

/**
 * @ClassName Gift
 * @Description TODO
 * @Author 景涛（jingtao@cloud-young.com）
 * @Date 2018/6/8  11:55
 * Version 1.0
 **/
public class Gift {
    //奖品id
    private Integer giftId;
    //奖品名称
    private String giftName;
    //中奖系数
    private BigDecimal  coefficient;

    public Integer getGiftId() {
        return giftId;
    }

    public void setGiftId(Integer giftId) {
        this.giftId = giftId;
    }

    public String getGiftName() {
        return giftName;
    }

    public void setGiftName(String giftName) {
        this.giftName = giftName;
    }

    public BigDecimal getCoefficient() {
        return coefficient;
    }

    public void setCoefficient(BigDecimal coefficient) {
        this.coefficient = coefficient;
    }
}
