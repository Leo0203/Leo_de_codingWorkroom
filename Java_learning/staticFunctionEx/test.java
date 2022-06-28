package Java_learning.staticFunctionEx;

public class test {

    public static void main(String arg[]){

        staticFunctionEx staticdemo = staticFunctionEx.getInstance();
        System.out.println(staticdemo.static_number);   //1


        staticFunctionEx staticdemo2 = staticFunctionEx.getInstance();
        staticdemo2.normal_number = 1024;
        
        staticFunctionEx staticdemo3 = staticFunctionEx.getInstance();
        System.out.println(staticdemo3.normal_number);  //1024

        //单例模式：任意对象都是一个对象
        System.out.println(staticdemo == staticdemo2);  //true
    }
    
}
