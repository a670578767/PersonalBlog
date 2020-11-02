package test;

public class Test_1027 {

    public void pugAge(){     //定义了一个方法

        int age =3;
        age = age + 7;
        System.out.println("小狗的年龄是："+age);

    }

    public static void main(String[] args) {

        Test_1027 test = new Test_1027();   //创建对象
        test.pugAge();                      //对象调用方法
    }
}
