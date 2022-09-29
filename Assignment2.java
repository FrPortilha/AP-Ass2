import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Arrays;
import java.lang.*;
/**
* Our main method. It parses the input files and chooses the method
* to execute based on the argument
* @param args The command line arguments.
* @throws java.io.FileNotFoundException when we can't read a file
* @author Michal & Ymro & Rolf
*/
public class Assignment2 {
    /**
     * Main method for assignment 2. Uses command line arguments to discern which
    assignment question
     * to execute and which relevant file to read as input for the specific 
    assignment questions.
     * 
     * @param args Command-line arguments. args[0] is understood as the question 
    number (1-5)
     *  and args[1] is understood as the input file path for that particular 
    question.
     * @throws FileNotFoundException When the specified input file is not found.
     */
    public static void main(String[] args) throws FileNotFoundException {
        // Get the question number
        String questionNumberArg = args[0];
        int questionNumber = Integer.parseInt(questionNumberArg);
        // Get the input file name
        String inputFileName = args[1];
        // Do a large switch statement over the question number.
        Scanner inputFile;
        switch(questionNumber) {
            case 1:
            // Open the input file
            inputFile = new Scanner(new File(inputFileName));
            String str = inputFile.nextLine();
            //String[] inputs = inputFile.nextLine().split(";");
            System.out.println(str);
            // Read a differance 
            String[] inputArrayString = str.split(",");
            System.out.println(Arrays.toString(inputArrayString));
            //int difference = Integer.parseInt(inputs[1]);
            // Read an input array
            Integer[] input1 = new Integer[inputArrayString.length];
            for (int i = 0; i < inputArrayString.length; i++)
            input1[i] = Integer.parseInt(inputArrayString[i]);
            question1(input1);
            inputFile.close();
            break;
            case 2:
            break;
            case 3:
            break;
            case 4:
            break;
            case 5:
            break;
            default:
            System.out.println("Invalid question number!");
        }
    }
    /** Solves question 1, 
     * @param input - input array of Integer
     * @param diff - the difference of two elements given by the input file
     */
    public static void question1(Integer[] input) {
        System.out.println(Arrays.toString(input));
    }
}