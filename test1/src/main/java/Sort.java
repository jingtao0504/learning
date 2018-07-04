/**
 * @Description TODO
 * @Author jingtao
 * @Date 2018/4/27
 */
public class Sort {
    public static void main(String[] args) {
        int a[] = {3,1,5,7,2,4,9,6,10,8};
        selectSort(a);
        for(int i=0;i<a.length;i++) {
            System.out.println(a[i]);
        }
    }

    /*插入排序*/
    static void insertSort(int[] arr){
        //从头部第一个当做已经排好序的，把后面的一个一个的插到已经排好的列表中去。
       for(int i=1;i<arr.length;i++){
           int j;
           //x为待插入元素
           int x=arr[i];
           //通过循环，逐个后移一位找到要插入的位置。
           for(j=i;j>0 && arr[j]<arr[j-1];j--){
               arr[j]=arr[j-1];
           }
           //插入
           arr[j]=x;
       }
    }

    /*选择排序*/
    static void selectSort(int[] a){
        for(int i=0;i<a.length;i++){
            int k=i;
            for (int j=i+1;j<a.length;j++){
                if(a[j]<a[k]){
                    k=j;
                }
            }
            int temp=a[i];
            a[i]=a[k];
            a[k]=temp;
        }
    }
    /*选择排序2*/
    static void selectSort1(int[] a){
        int i,j,min,max,temp;
        for(i=1;i<a.length/2;i++){
            min=i;max=i;
            for (j=i+1;j<a.length-i;j++){
                if(a[j]<a[min]){
                    min=j;
                    continue;
                }
                if(a[j]>a[max]){
                    max=j;
                }
            }
            //该交换操作还可分情况讨论以提高效率
            temp = a[i-1]; a[i-1] = a[min]; a[min] = temp;
            temp = a[a.length-i]; a[a.length-i] = a[max]; a[max] = temp;
        }
    }

    /*快速排序*/
    static   void quickSort(int[] a,int low, int high) {
        if(low<high){ //如果不加这个判断递归会无法退出导致堆栈溢出异常
            int middle=getMiddle(a,low,high);
            quickSort(a,  0,  middle-1);          //递归对低子表递归排序
            quickSort(a,   middle + 1, high);        //递归对高子表递归排序
        }
    }
    static int getMiddle(int[] a, int low, int high){

        int key = a[low];//基准元素，排序中会空出来一个位置
        while(low<high){
            while(low<high && a[high]>=key){//从high开始找比基准小的，与low换位置
                high--;
            }
            a[low]=a[high];
            while(low<high && a[low]<=key){//从low开始找比基准大,放到之前high空出来的位置上
                low++;
            }
            a[high]=a[low];
        }
        a[low]=key;//此时low=high 是基准元素的位置，也是空出来的那个位置
        return low;

    }

    static void qs(int[] a ,int low ,int high ){
        while(low < high){
            int middle = getMiddle1(a,low,high);
            qs(a,low,middle-1);
            qs(a,middle+1,high);
        }
    }

    static int getMiddle1(int[] a ,int low,int high){
        int temp = a[low];
        while(low<high){
            while(low < high && a[high] >= temp){
                high--;
            }
            a[low] = a[high];
            while(low < high && a[low] <= temp){
                low++;
            }
            a[high] = a[low];
        }
        a[low] = temp;
        return low;
    }
}
