import java.util.*;

public class A1113317_0317_1 {
    public static void main(String[] argv){

        Scanner sc = new Scanner(System.in);

        System.out.println("請輸入數字n:");
        int n = sc.nextInt();

        System.out.println("請輸入數字m:");
        int m = sc.nextInt();

        int[][] a = new int[n][m];
        for(int i = 0 ; i < n ; i++ ){
            for(int j = 0 ; j < m ; j++){
                a[i][j] = (i+1)*(j+1);
            }
        }
        for(int[] first:a){
            for(int second:first){
                System.out.print(second + " ");
            }
            System.out.println();
        }
    }
}
