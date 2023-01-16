package com.Exer.java;

import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author Email 3394427855@qq.com
 * @version 2023/1/9 23:18
 * @uesr 刘梹晨
 */
public class FinallyTest {
    @Test
    public void test2() {
        FileInputStream fis = null;
        try {
            File file = new File("hello.txt");//文件可能不存在，而出现异常
            fis = new FileInputStream(file);
            int data = fis.read();
            while (data != -1) {
                System.out.print((char) data);
                data = fis.read();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fis != null)
                    fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
