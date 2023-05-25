//Written By: Mr. Ashutosh Kumar
import java.util.*;
public class Arrays4 {
    public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      int rows = sc.nextInt();
      int cols = sc.nextInt();
      int [][] numbers = new int[rows][cols];
      for(int i=0; i<rows; i++){
        for(int j=0; j<cols; j++){
            numbers[i][j] = sc.nextInt();
        }
      }
//output
for(int i=0; i<rows; i++){
    for(int j=0; j<cols; j++){
        System.out.println(numbers[i][j] + " " );
    }
    System.out.println( );
}
        
    }

}
