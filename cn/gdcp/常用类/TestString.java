package cn.gdcp.常用类;

public class TestString {
    public static void main(String[] args) {
       /* String str="abxdefg";
        String str2=str.substring(2,5);//截取字符串从2号位截取，起始位置0
        System.out.println(str);
        System.out.println(str2);*/

        String str1="hello"+"java";
        String str2="hellojava";
        System.out.println(str1==str2);//true
        String str3="hello";
        String str4="java";
        String str5=str3+str4;
        System.out.println(str2==str5);//false
        System.out.println(str2.equals(str5));//做字符串比较一定要使用.equals()方法

    }
}
