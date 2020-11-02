package hello;

public class Day1_1026 {
    public static void main(String[] args) {
        System.out.println("这里是我的一个Java文件");

        Puppy1 myPuppy = new Puppy1("tommy");  //下面的语句将创建一个Puppy对象
    }
    public class Dog{
        String breed;   //创建一个字符
        int age;        //创建一个年龄
        String color;   //创建一个颜色
        void barking(){
        }

        void hungry(){
        }

        void sleeping(){

        }
    }
    public class Puppy{                   //定义一个名叫Puppy的构造方法，构造器只有一个参数，name
        public Puppy(String name){
             name = "hello";
        }
    }

    /*创建对象
    * 对象是根据类创建的。在Java中，使用关键字new来创建一个新的对象
    *声明：声明一个对象，包括对象的名称和类型。
    *实例化：使用关键字New来创建一个对象。
    *初始化：使用new创建对象时，会调用构造方法初始化对象。
    * */
    public static class Puppy1{                      //类
        public Puppy1(String name){           //方法
            //这个构造器仅有一个参数：name
            System.out.println("小狗的名字是："+name);
        }
//        Puppy1 myPuppy = new Puppy1("tommy");  //下面的语句将创建一个Puppy对象
    }

    /*访问实例变量的方法
    *通过以创建的对象来访问成员变量和成员方法：创建完对象之后，调用方法或者变量。
    * 实例化对象：Object referenceVariable = new Constructor();
    * 访问类中的变量：referenceVariable（参考变量）.variable（变量）Name;
    * 访问类中的方法：referenceVariable（参考变量）.methodName();
    * */

    public static class Puppy2{
        int puppyAge;
        public Puppy2(String name){
            // 这个构造器仅有一个参数：name
            System.out.println("小狗的名字是 : " + name );
        }

        public void setAge( int age ){
            puppyAge = age;
        }

        public int getAge( ){
            System.out.println("小狗的年龄为 : " + puppyAge );
            return puppyAge;
        }

        public static void main(String[] args){
            /* 创建对象 */
            Puppy2 myPuppy = new Puppy2( "tommy" );
            /* 通过方法来设定age */
            myPuppy.setAge( 2 );
            /* 调用另一个方法获取age */
            myPuppy.getAge( );
            /*你也可以像下面这样访问成员变量 */
            System.out.println("变量值 : " + myPuppy.puppyAge );
        }
    }

    /*
    * 源文件声明规则
    * 一个源文件中只能有一个public类
    * 一个源文件可以有多个非public类
    * 源文件的名称应该和 public 类的类名保持一致。
    *
    *
    * Java包：包主要用来对类和接口进行分类。当开发 Java 程序时，可能编写成百上千的类，因此很有必要对类和接口进行分类。
    * import语句：提供合理路径
    * */

    /*
    * 10-26小结
    * 程序都是从main方法开始执行的，为了执行该程序，必须包含main方法，并且创建一个实例对象。
    * Java有大小写的区分，类名要与文件名统一
    * Java文件中只能有一个Public类
    * */


}
