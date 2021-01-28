package cn.gdcp;

import java.io.*;

/*InputStream和OutPutStream用法*/
public class exam01 {
    public static void main(String[] args) {
      byte b[]={1,2,3,4,5};
        try {
            OutputStream outputStream=new FileOutputStream("test.txt");
            //创建文件，若文件没有则创建文件；
            for (int x=0;x<b.length;x++){
                outputStream.write(b[x]);//写文件,出现乱码问题 因为OutputStream是字节流
            }
            outputStream.close();

            InputStream inputStream=new FileInputStream("test.txt");
            int size=inputStream.available();
            for (int i = 0; i <size ; i++) {
                System.out.println(inputStream.read() +" ");
            }
            inputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
