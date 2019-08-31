package test;

import java.io.BufferedReader;
import java.io.FileReader;

/* User API to read the below textFile and print to console.
 * Use BufferedReader class.
 * Use try....catch block to handle Exception.
 *
 *
 * After reading from file using BufferedReader API, store each word into  & ArrayList
 * Use For Each loop/while loop/Iterator to retrieve data.
 */

public class DataReader {


    public static void main(String[] args) {
        FileReader fr = null;
        BufferedReader br = null;
        String fileName = "C:\\Surprse\\src\\quize\\Sample.txt";

        try {
            fr = new FileReader(fileName);
            br = new BufferedReader(fr);


            String data = "";
            while ((data = br.readLine()) != null) {
                System.out.println(data);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            System.out.println("File was not found");
        } finally {
            try {
                br.close();
                fr.close();
            } catch (Exception ex2) {

            }
        }
    }

}



