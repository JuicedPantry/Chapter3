package Chapter3;


/**
 * Write a description of class Multiplication here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Multiplication
{
    int numToMult;
    public static void main(){
        int numToMult=1;
        for(int i=1; i<13;i++){
            for(int j=1; j<13; j++){
                System.out.print(numToMult*j);
                System.out.print(" ");
            }
            System.out.println(" ");
            numToMult++;
        }
    }
}
