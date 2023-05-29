package gr.aueb.cf.ch9;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.io.PrintWriter;

public class PrintStreamApp {

    public static void main(String[] args) {

        try (PrintWriter ps = new PrintWriter("C:/JavaTemp/Hello.txt")){
            ps.println("Hello Coding Factory2");
        } catch (FileNotFoundException ex){
            ex.printStackTrace();
        }
    }
}
