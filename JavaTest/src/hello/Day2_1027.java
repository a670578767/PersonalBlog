package hello;

public class Day2_1027 {

    /*
    * JAVA中变量数据类型
    * Java语言中，所有变量在使用前必须声明。
    * 变量类型：1.类变量:独立于方法之外的变量，用static修饰。
    *         2.实例变量：独立于方法之外的变量，不过没有static修饰。
    *         3.局部变量：类的方法中的变量。
    *
    * Java局部变量——只能在方法中使用
    * 局部变量声明在方法，构造方法或者语句块中；
    * 局部变量在方法，构造方法，或者语句块被执行的时候创建，当他们执行完成后，变量将会被销毁。
    * 访问修饰符不能用于局部变量
    * 局部变量只在声明它的方法、构造方法或者语句块中可见；
    * 局部变量是在栈上分配的。
    * 局部变量没有默认值，所以局部变量被声明后，必须经过初始化，才可以使用。
    *
    * */

    static int allClicks = 0;     //类变量
    String str = "hello world";   //实例变量

    public void method(){
        int i = 0;                //局部变量
    }

    /*
    *Java中静态变量和实例变量的区别
    *Java中静态变量属于类，该类不产生对象，通过类名j就可以调用静态变量
    *
    * */
}
