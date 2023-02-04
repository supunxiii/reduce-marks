import java.util.*;
public class reduceMarks{
  public static void main(String args[]){
    int value;
    int[] numArry = new int[10];
    int[] reducArr = new int[10];
    Scanner userinput = new Scanner(System.in);
    System.out.println("Enter your mark: ");
    for (int i = 0; i < 10; i++){
      numArry[i] = userinput.nextInt();
    }for (int a = 0; a < numArry.length; a++){
      value = numArry[a] - (numArry[a]*10/100);
        System.out.println("For the mark you entered "+numArry[a]+ ".");
        System.out.println("Reduced mark is "+value+".");
        reducArr[a] = value;
        System.out.println(Arrays.toString(reducArr));
      } System.out.println("Final marks are: ");
        for(int x = 0; x < reducArr.length; x++){
        System.out.print(reducArr[x]+ " ");
      }
    }
  }
