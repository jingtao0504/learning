package prizedraw;


/**
 * @ClassName LotteryUntil
 * @Description TODO
 * @Author 景涛（jingtao@cloud-young.com）
 * @Date 2018/6/25  10:22
 * Version 1.0
 **/
public class LotteryUntil {
    private int dial[][] = new int[100][100];

    public void valuation(float[] probability) {
        int prize = probability.length;
        int[] num = new int[prize];//每一奖项分布多少次
        float prizeDial = 0;//总的中奖概率
        for (int i = 0; i < prize; i++) {
            prizeDial += probability[i];
            num[i] = (int) (probability[i] * 100);
        }

        System.out.println("总的中奖率" + prizeDial);
        for (int i = 0; i < num.length; i++) {
            System.out.println("每一奖项分布多少次" + num[i]);
        }

        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                //产生一个随机数，如果在中奖概率内，则放入一个中奖数字，否则为0
                if (Math.random() < (prizeDial / 100)) {
                    int v = randoms(prize);
                    if (num[v - 1] > 0) {
                        num[v - 1]--;
                        dial[i][j] = v;
                    } else {
                        dial[i][j] = 0;
                    }
                } else {
                    dial[i][j] = 0;
                }
            }
        }
        int a = 0;
        for (int i = 0; i < prize; i++) {
            while (num[i] > 0) {
                System.out.println(++a);
                setOneDial(i + 1);
                num[i]--;
            }
        }
    }

    private long c = 10000;

    private void setOneDial(int i) {
        if (c > 0) {
            int k = (int) (Math.random() * 100);
            int v = (int) (Math.random() * 100);
            if (dial[k][v] > 0) {
                setOneDial(i);
            } else {
                dial[k][v] = i;
                c--;
            }
        }
    }

    /**
     * @param lt
     * @return 一个小于等于 lt 的整数
     */
    @SuppressWarnings("unused")
    private int randoms(int lt) {
        do {
            int r = (int) (Math.random() * 10);
            if (r > 0 && r <= lt) {
                return r;
            }
        } while (true);
    }
    public void test() {
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        int count4 = 0;
        int count5 = 0;
        int count6 = 0;
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                switch (dial[i][j]) {
                    case 1:
                        count1++;
                        break;
                    case 2:
                        count2++;
                        break;
                    case 3:
                        count3++;
                        break;
                    case 4:
                        count4++;
                        break;
                    case 5:
                        count5++;
                        break;
                    case 6:
                        count6++;
                        break;
                }
                System.out.print(dial[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("验证出现1有多少次：" + count1);
        System.out.println("验证出现2有多少次：" + count2);
        System.out.println("验证出现3有多少次：" + count3);
        System.out.println("验证出现4有多少次：" + count4);
        System.out.println("验证出现5有多少次：" + count5);
        System.out.println("验证出现6有多少次：" + count6);
    }
    public static void main(String[] args) {
        float[] probability = new float[]{0.1f, 4.9f, 15, 20, 25, 30};
        LotteryUntil p = new LotteryUntil();
        p.valuation(probability);
        p.test();
    }
}
