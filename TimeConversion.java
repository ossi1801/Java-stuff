import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;
import java.util.Date;

public class Solution {

    /*
     * Complete the timeConversion function below.
     */
    static String timeConversion(String s) {
       
     DateFormat Psdf = new SimpleDateFormat("hh:mm:ssaa");
     DateFormat Fsdf = new SimpleDateFormat("HH:mm:ss");
     Date time = null;
     String output = "";
     try{time = Psdf.parse(s);} catch  (Exception ex) {return ex.toString();}
     
     output = Fsdf.format(time);
     return output;
   
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scan.nextLine();

        String result = timeConversion(s);

        bw.write(result);
        bw.newLine();

        bw.close();
    }
}
