
/**
 * Write a description of class GradeCalculator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner; // To allow program to take input from user

public class GradeCalculator
{
    public static void main (String[] args) /* main method for program to know where to begin */ {
    Scanner takeinput = new Scanner(System.in); //takeinput created as a scanner which will take input.
    double[] marks = new double[30]; //Creation of marks array with 30 memory slots.
    
    //Take input for 30 marks
    for(int i=0; i < 30; i++){
        while(true){
            System.out.println("Enter mark for student" + (i+1) + ": ");
            double mark = takeinput.nextDouble();
            //condition for marks validation
            if (mark >=0 && mark<=30 ){
                marks[i] = mark;
                break; //End loop once all condition met for all input.
            }
            // mark>= 0 && mark <=30 is the condition to be checked as 0 is the minimum possible marks and 30 is the highest possible mark.
            else{
                System.out.println("Warning : Marks must be between 0 & 30, please Input valid Number"); //to let user know their entry is invalid and have to enter new number
            }
        }
    }
    


//Print all 30 input marks 
System.out.println("Marks for all students: ");
for (double mark : marks) {
    System.out.print(mark + " " + ",");
}
System.out.println();

//Calculate Highest Mark by comparing
double maximum = marks[0]; //initialize maximum and set first value as maximum
for (double mark : marks){
    if (mark > maximum){
        maximum = mark;
    }
}
System.out.println("Highest mark is: " + maximum);

//Calculate Lowest Mark
double minimum = marks[0]; //initialize minimum and set first value as minimum
for (double mark : marks){
    if (mark < minimum){
        minimum = mark; 
    }
}
System.out.println("Lowest mark is: " + minimum);
}
}
