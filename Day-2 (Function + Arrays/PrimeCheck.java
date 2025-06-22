import java.util.*;
public class primecheck {
    public static boolean PrimeCheck(int num){
        if (num<=1) return false;

        for(int i=2;i<=Math.sqrt(num); i++){
            if (num%i==0)
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a Number");
        int n = sc.nextInt();

        if(PrimeCheck(n)){
            System.out.println("a prime no");
        }
        else{
            System.out.println("Not Prime no.");
        }
    }
}

