package gr.aueb.cf.ch8;

import java.io.IOException;

public class ExceptApp {

    public static void main(String[] args) {
        int ch;
        try {
            ch = getNextChar();
            System.out.println(ch);
        } catch (IOException e) {
            System.out.println("Error in I/O");
        }
    }
    public static int getNextChar() throws IOException{
        int ch = ' ';
        try {
            ch = System.in.read();
        } catch (IOException e){
            e.printStackTrace();
            throw e;
        }
        return ch;
    }
}
