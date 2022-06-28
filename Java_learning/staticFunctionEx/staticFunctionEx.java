package Java_learning.staticFunctionEx;


public class staticFunctionEx {

    private static staticFunctionEx me = null; //只允许实例话一次


    //单例模式
    private staticFunctionEx(){
        //构造方法定义为私有
        me = this;
    }

    /**
     * 得到当前类的实例
     */

    public static staticFunctionEx getInstance(){
        if(me == null){
            me = new staticFunctionEx(); //唯一一次实例化
        }

        return me;
    }
    //类属性，对于这个类不变，先于类的实例存在
    public static int static_number = 1;
    public int normal_number = 1;


    public void test(){
        static_number++;
        normal_number++;
    } 

    //静态方法只能调用静态属性和方法
    public static void test2(){
        static_number++;
        //normal_number++;
    }       

    // public static void main(String args[]){
    //     staticFunctionEx staticdemo1 = new staticFunctionEx();
    //     staticdemo1.test();

    //     System.out.println(staticdemo1.static_number);
    //     System.out.println(staticdemo1.normal_number);
    //     //print 2 for both result

    //     staticFunctionEx staticdemo2 = new staticFunctionEx();
    //     staticdemo2.test();

    //     System.out.println(staticdemo1.static_number);
    //     System.out.println(staticdemo1.normal_number);
        
    // }
    
}