import java.util.Scanner;
public class TwoDArray {
    public static void main(String[] args) {
        int[][] arr = randomArray();
        System.out.println();
        
        displayArr(arr);

        System.out.println("\nTotal value in array = " + findSum(arr));       
    }

    public static int[][] randomArray(){
        int[][] m = new int[3][3];
        for(int i=0;i<m.length;i++){
            for(int j=0;j<m[0].length;j++){
                m[i][j] = (int)(Math.random()*10);
            }
        }
        return m ;
    }

    public static int[][] getArray(){
        Scanner input = new Scanner(System.in);
        System.out.print("Input the value to array 3x3 :");
        int[][] m = new int[3][3];
        for(int i=0;i<m.length;i++){
            for(int j=0;j<m[0].length;j++){
                m[i][j] = input.nextInt();
            }
        }
        return m;
    }

    public static int findSum(int[][] arr){
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                sum +=arr[i][j];
            }
        }
        return sum;
    }

    public static void displayArr(int[][] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

}
