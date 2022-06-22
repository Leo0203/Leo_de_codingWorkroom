package Java_learning.Inheritance_polymorphismEx;

import java.io.IOException;
import java.util.Properties;

public class main {

    public static void main(String args[]) throws IOException, InstantiationException, IllegalAccessException, ClassNotFoundException{

        director Haha = new director();

        singer anonimous_pigeon = new singer("anonimous pigeon");
        dancer silent_republicans = new dancer("silent republicans");
        
        //abstruct class cannot be newed
        //actor normal_actor = new actor("THE normal actor");

        Haha.action(anonimous_pigeon);
        Haha.action(silent_republicans);
        //Haha.action(normal_actor);


        //add rapper, main core code doesnot change (模拟程序升级，要求添加rapper， 核心业务代码不变)
        // rapper YoUo = new rapper("YoUo");
        // Haha.action(YoUo);

        //add a character, without changing the code in the main method (实现main方法中代码不改变的情况下，实现某个角色的升级)
        /*
         * 使用反射和多态实现升级
         */
        Properties props = new Properties();//对应配置文件

        props.load(main.class.getResourceAsStream("actorConfig.properties"));
        //反射实例化配置文件中配置的类

        actor actor = (actor)Class.forName(props.getProperty("rapper")).newInstance();

        actor.setName("YeYeGuy");
        Haha.action(actor);
        //修改配置文件最后的名字（rapper -> rapperV2）即可升级rapper
        

        actor What = new rapper();  //子类实现父类
    }
    
}
