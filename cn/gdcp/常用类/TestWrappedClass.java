package cn.gdcp.常用类;
/*
* 测试包装类
* Integer类的使用，其他包装类类似
* */
public class TestWrappedClass {
    public static void main(String[] args) {
        //基本数据类型转成包装类对象
        Integer a=new Integer(6);
        Integer b=Integer.valueOf(30);

        //包装类对象转成基本数据类型
        int c=b.intValue();
        double d=b.doubleValue();

        //字符串转成包装类对象
        Integer e=new Integer("999");
        //Integer e=new Integer("999奥特曼"); Exception in thread "main" java.lang.NumberFormatException: For input string: "999奥特曼"
        Integer f=Integer.parseInt("8955");

        //包装类对象转成字符串
        String str=f.toString();
        System.out.println(a); System.out.println(b);System.out.println(c);
        System.out.println(d); System.out.println(e); System.out.println(f);





        //常见的常量
        System.out.println("int类型最大的整数："+Integer.MAX_VALUE);
        System.out.println("int类型最大的整数："+Integer.MIN_VALUE);


    }
}
