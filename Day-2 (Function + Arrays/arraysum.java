import java.util.*;

public class arraysum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];
        int sum=0;

        for(int i=0;i<5;i++){
            numbers[i]=sc.nextInt();
            sum+=numbers[i];
        }
        System.out.println(sum);

    }
}
