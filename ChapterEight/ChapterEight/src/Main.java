import java.util.Scanner;

public class Main {
    //task
    public void TaskOne() {
        int[][] array = new int[3][4];
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a 3-by-4 matrix row by row:");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = input.nextInt();
            }
        }
        int numRows = array.length;
        int numCols = array[0].length;
        int []colSum = new int[numCols];
        for (int i = 0; i<numCols; i++){
            int sum = 0;
            for (int j = 0; j<numRows; j++){
                sum+=array[j][i];
                colSum[i] = sum;

            }
        }
        for(int l = 0; l<colSum.length; l++){
            System.out.println("Sum of of elements at column " + l + " is "+colSum[l]);
        }
    }
    public void TaskTwo(){
        int sum = 0;
        Scanner input = new Scanner(System.in);
        int [][]array = new int[4][4];
        System.out.println("Enter a 4-by-4 matrix row by row:");
        for (int i = 0; i<array.length; i++){
            for (int j = 0; j<array[i].length; j++){
                array[i][j] = input.nextInt();
            }
        }
        for (int i = 0; i<array.length; i++){
            for (int j = 0; j<array[i].length; j++){
                if(i==j){
                    sum += array[i][j];
                }
            }
        }
        System.out.println("Sum of the elements in the major diagonal is " + sum);
    }
    public void TaskSix(){
        int sum = 0;
        Scanner input = new Scanner(System.in);

    }
    public static void main(String[] args) {
        Main object = new Main();
        object.TaskTwo();
    }
}