package cn.gdcp.常用类;

public class TestStringBuilder {
    public static void main(String[] args) {
        String str;
        StringBuilder builder=new StringBuilder();
        builder.append("abcdefgh");
        System.out.println(Integer.toHexString(builder.hashCode()));//获取内存地址
        System.out.println(builder);
        builder.setCharAt(2,'m');
        System.out.println(Integer.toHexString(builder.hashCode()));
        System.out.println(builder);

    }
}
