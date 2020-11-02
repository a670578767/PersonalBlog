package hello;

public class Day6_1102 {

    public static void main(String[] args) {

        int[] art;
        //创建数组
        double[] myList = new double[5];       // 首选的方法
        art = new int[3];
        //赋值
        art[0] = 1;
        art[1] = 2;
        art[2] = 3;

        myList[0] = 3.2;
        myList[4] = 2.5 ;
        //循环遍历art
        for (int i = 0; i < art.length; i++) {
//            System.out.println(art[i] + "");
        }
        //循环遍历myList
        for (int j = 0; j < myList.length; j++) {
//            System.out.println(myList + "");
        }
        //二维数组创建
        String[][] str = new String[3][4];
        System.out.println("str的长度="+str.length);
//        str[0][0] = "hello";
        for (int k= 0;k< str.length;k++){
            for (int p = 0;p<=k;p++){
                System.out.println(str[k][p]+"");
                System.out.println(str.length+"");
            }
        }
    }

}
