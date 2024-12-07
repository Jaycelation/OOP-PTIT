package Contest;


import java.util.*;
import java.io.*;

public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n-- > 0){
           long a = sc.nextLong();
           long res = maxPrime(a);
           System.out.println(res);
        }
    }
    public static long maxPrime(long n){
        long largest = -1;

        while (n % 2 == 0) {
            largest = 2;
            n /= 2;
        }

        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            while (n % i == 0) {
                largest = i;
                n /= i;
            }
        }

        if (n > 2) {
            largest = n;
        }
        return largest;
    }
}
