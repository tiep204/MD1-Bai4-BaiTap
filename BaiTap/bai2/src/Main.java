import re.StopWatch;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        ///b1. khai bao va khoi tao 10000 phan tu

        int arrInt[] = new int[10000];
        for (int i = 0; i < arrInt.length; i++) {
            arrInt[i] = (int) Math.random()*10000;

        }

        //b2. start dong ho de bat dau dem thoi gian giai thuat selection sort thuc hien
        StopWatch sw = new StopWatch();
        //b3. thuc hien giai thuat selection sort de sap sep nang so nguyen 10000 phan tu
        for (int i = 0; i < arrInt.length-1; i++) {
            for (int j = i+1; j < args.length ; j++) {
                if(arrInt[i]>arrInt[j]){
                    int temp = arrInt[i];
                    arrInt[i] = arrInt[j];
                    arrInt[j] = temp;
                }
            }
        }
        //b4. stop dong de tinh so thoi gian thuc hien giai thuat
        sw.stop();
        ///b5. in so thoi gian thuc hien giai thuat
        sw.getElapsedTime();
        System.out.println("thoi gian thuc hien giai thuat la: "+sw.getElapsedTime());
    }
}