package Step4;

import java.io.*;
import java.net.URL;
import java.util.Scanner;


public class ReadFour
{
    /**
     * Yes, you can look at the other 
     * examples in this lab to build your solution here.
     */
        public static void main(String[] args) throws FileNotFoundException {
            URL path = ReadFour.class.getResource("input.txt");
            File file = new File(path.getFile());

            Scanner reading = new Scanner(file);

            while(reading.hasNext()){
                String lineIn = reading.nextLine();
                String[] input = lineIn.split(",");
                int sum = 0;
                for (int i = 0; i < input.length; i ++) {
                    sum += Integer.parseInt(input[i]);
                }
                System.out.println(sum);
            }
            // Print out a running total of all the
            // values in the input file.
        }
        //read input file, add value to a sum, print sum each time you read in a new file.
//    Running total = 4
//    Runnint total = 14
//    Running total = 17

}