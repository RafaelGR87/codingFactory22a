package gr.aueb.cf.ch9;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class Homework9 {

    public static void main(String[] args) {
        String line ;
        String [] student = new String[4];
        double averageGrade = 0.0;
        try {
            BufferedReader bf = new BufferedReader(new FileReader("C:/JavaTemp/grades.txt"));
            FileOutputStream fos = new FileOutputStream("C:/JavaTemp/primOut.txt", true);
            PrintStream ps = new PrintStream(fos);
            FileOutputStream fos2 = new FileOutputStream("C:/JavaTemp/log.txt", true);
            PrintStream ps2 = new PrintStream(fos2);

            while ((line = bf.readLine()) != null) {
                student = line.split(" +");

                int grade1 = Integer.parseInt(student[2]);
                int grade2 = Integer.parseInt(student[3]);

                if (grade1 < 0 || grade2 <0){
                    ps2.println("O/H μαθητής/τρια " + student[0] + " " +student[1] + " έχει λανθασμένη βαθμολογία (μικρότερη του 0)");
                } else if (grade1 > 10 || grade2 > 10) {
                    ps2.println("O/Η μαθητής/τρια " + student[0] + " " +student[1] + " έχει λανθασμένη βαθμολογία (μεγαλύτερη του 10)");
                } else {
                    averageGrade = (grade1 + grade2)/2.0;
                    ps.printf("%s %s %.1f%n", student[0], student[1], averageGrade);
                }
            }
            bf.close();
            ps.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
