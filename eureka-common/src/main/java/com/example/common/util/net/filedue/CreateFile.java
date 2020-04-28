package net.filedue;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args) {
        /*System.out.println("开始");
        File f = new File("e:/javacodeCreate/aaa/bbb/ccc");
        //   f.createNewFile(); //创建文件
        System.out.println("中间");
        //   f.mkdirs();//创建目录
        System.out.println("结束");*/
        File f2 = new File("e:/javacodeCreate.txt");
        /*if( f2.exists() ){
            System.out.println("该文件存在");
        }else {
            System.out.println("不存在");
        }*/

        try {
            FileReader fr = new FileReader(f2);

            int ch = 0;
            while((ch = fr.read())!=-1 )
            {
                System.out.print((char)ch+" ");
            }
            //写入内容内容
          FileWriter fw = new FileWriter(f2);
            fw.write("1234567890\t "); //  \t tab制表符
            fw.write("\r\n"+"0987654321"); // \r\n  回车键
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
