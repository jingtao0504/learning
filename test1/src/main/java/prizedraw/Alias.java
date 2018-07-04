package prizedraw;

import java.util.*;

/**
 * @ClassName Alias
 * @Description TODO
 * @Author 景涛（jingtao@cloud-young.com）
 * @Date 2018/6/25  10:09
 * Version 1.0
 **/
public class Alias {
    private final double[] probability;
    private final int[] alias;
    private final int length;
    private final Random rand;


    public Alias(List<Double> prob) {
        this(prob, new Random());
    }


    public Alias(List<Double> prob, Random rand) {
        if (prob == null || rand == null) {
            throw new NullPointerException();
        }
        if (prob.size() == 0) {
            throw new IllegalArgumentException("Probability vector must be nonempty.");
        }

        this.rand = rand;
        this.length = prob.size();
        this.probability = new double[length];
        this.alias = new int[length];


        double[] probtemp = new double[length];
        Deque<Integer> small = new ArrayDeque<Integer>();
        Deque<Integer> large = new ArrayDeque<Integer>();

        for (int i = 0; i < length; i++) {
            probtemp[i] = prob.get(i) * length;
            if (probtemp[i] < 1.0)
                small.add(i);
            else
                large.add(i);
        }


        while (!small.isEmpty() && !large.isEmpty()) {
            int less = small.pop();
            int more = large.pop();
            probability[less] = probtemp[less];
            alias[less] = more;
            probtemp[more] = probtemp[more] - (1.0 - probability[less]);
            if (probtemp[more] < 1.0)
                small.add(more);
            else
                large.add(more);
        }

        while (!small.isEmpty())
            probability[small.pop()] = 1.0;
        while (!large.isEmpty())
            probability[large.pop()] = 1.0;
    }

    /**
     * Samples a value from the underlying distribution.
     */
    public int next() {
        int column = rand.nextInt(length);
        boolean coinToss = rand.nextDouble() < probability[column];
        return coinToss ? column : alias[column];
    }


    /* 概率测试 */
    public static void main(String[] argv) {
        List<Double> prob = new ArrayList<Double>();

        prob.add(0.001);//一等奖
        prob.add(0.05);//二等奖
        prob.add(0.1);//三等奖
        prob.add(0.3);
        prob.add(0.549);
        String[] str = {"一等奖", "二等奖", "三等奖", "四等奖", "未中奖"};
        int[] test = {0, 0, 0, 0};
        Alias am = new Alias(prob);
        int count1 = 0, count2 = 0, count3 = 0, count4 = 0, count5 = 0;
        for (int i = 0; i < 1000; i++) {
            switch (str[am.next()]) {
                case "一等奖":
                    count1 += 1;
                    break;
                case "二等奖":
                    count2 += 1;
                    break;
                case "三等奖":
                    count3 += 1;
                    break;
                case "四等奖":
                    count4 += 1;
                    break;
                case "未中奖":
                    count5 += 1;
                    break;

            }
        }
        System.out.println("一等奖次数:" + count1 + "；二等奖次数：" + count2 + "；三等奖次数：" + count3 + "；四等奖次数：" + count4 + "；未中奖次数：" + count5);

    }
}
