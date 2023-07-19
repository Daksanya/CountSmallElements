import java.util.Scanner;

public class CountSmallElements {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array=new int[n];
        for(int i=0;i<n;i++){
            array[i]=scanner.nextInt();
        }
        count(array,n);
    }
    public static void count(int array[],int n){

        int result[]= new int[n];
        for(int i=0;i<n;i++){
            int count=0;
            for (int j=i+1;j<n;j++){
                if(array[i]>array[j]){
                    count++;
                }
            }
            result[i]=count;
        }
        for(int i=0;i<n;i++){
            System.out.print(result[i]+" ");
        }
    }

}