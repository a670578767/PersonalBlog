package test;

import com.sun.xml.internal.bind.v2.runtime.output.StAXExStreamWriterOutput;

public class Test_1027_1 {

   /*
   * 类构造对象时调用的方法，有参和无参。
   * 构造出一个类的实例，
   * 构造方法的名字与类名相同，没有返回类型，void也没有
   * 不能被修饰符修饰。
   * */

    //这个实例变量对子类可见
    public String name ;
    //私有变量，仅在该类可见
    private double salary;
    //创建一个构造方法，给name赋值。
    public Test_1027_1(){
        name = "HELLO";
    }
    //设定salary的值
    public void setSalary(double empSal){
        salary = empSal;
    }
    //打印输出结果
    public void printemp(){

        System.out.println("名字："+name);
        System.out.println("薪水："+salary);

    }
    public static void main(String[] args) {
        Test_1027_1 test = new Test_1027_1();
        test.setSalary(1000.0);
        test.printemp();
    }

}
