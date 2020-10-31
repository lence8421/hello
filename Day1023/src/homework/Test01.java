package homework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Author: 潜行陌路
 * @Date 2020/10/23 17:45
 */
public class Test01 {
    public static void main(String[] args) {
        copyFile("D:\\javaSECode\\javasexxx\\3d.avi","D:\\javaSECode\\javasexxx\\ccdxx.avi");
    }

    public static void copyFile(String x , String y) {
        try (FileInputStream inputStream = new FileInputStream(x);
             FileOutputStream fileOutputStream = new FileOutputStream(y))
        {
            byte[] bytes = new byte[1024*8];
            int len;
            while ((len = inputStream.read(bytes)) != -1) {
                fileOutputStream.write(bytes);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
