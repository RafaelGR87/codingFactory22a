package gr.aueb.cf.ch9;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyRawDataApp {

    public static void main(String[] args) {

        int b = 0;
        int count = 0;
        byte[] buffer = new byte[4096];

        try (FileInputStream in = new FileInputStream("C:/tmp/sql.png");
             FileOutputStream out = new FileOutputStream("C:/tmp/sqlout2.png")){

            while ((b = in.read(buffer)) != -1){
                out.write(buffer, 0, b);
                count++;
            }
        } catch (IOException e){
            throw new RuntimeException();
        }
        System.out.println(count);
    }
}
