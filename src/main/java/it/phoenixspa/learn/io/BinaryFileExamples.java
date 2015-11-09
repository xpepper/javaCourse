package it.phoenixspa.learn.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BinaryFileExamples {
    public static void main(String args[]) {
        try {
            FileInputStream fileInputStream = new FileInputStream(args[0]);
            FileOutputStream fileOutputStream = new FileOutputStream(args[1]);
            byte[] buffer = new byte[128];
            int bytesRead = fileInputStream.read(buffer);
            while (bytesRead != -1) {
                fileOutputStream.write(buffer, 0, bytesRead);
                bytesRead = fileInputStream.read(buffer);
            }
            fileInputStream.close();
            fileOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
