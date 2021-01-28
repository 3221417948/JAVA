package cn.gdcp.常用类;
/*
* 测试自动装箱，自动拆箱
* */
public class TestAutoBox {
    public static void main(String[] args) {
        Integer a=234; // Integer a=Integer.valueOf(234); --自动装箱
        int b=a;  //编译器会修改成 int b=a.intValue(); --自动拆箱
        Integer c=null;
        //  int d=c; Exception in thread "main" java.lang.NullPointerException 自动拆箱：调用了：c.intValue()
        if(c !=null){
            int d=c;
        }
    }
}
