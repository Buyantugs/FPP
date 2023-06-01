package day4;

public class MySingleton {
    private static MySingleton instance1=null;
    private static MySingleton instance2=null;
    private static MySingleton instance3=null;
    private MySingleton(){
    }
    public static MySingleton getInstance1(){
        if(instance1==null){
            instance1=new MySingleton();
        }
        return instance1;
    }
    public static MySingleton getInstance2(){
        if(instance2==null){
            instance2=new MySingleton();
        }
        return instance2;
    }

    public static MySingleton getInstance3(){
        if(instance3==null){
            instance3=new MySingleton();
        }
        return instance3;
    }

}
