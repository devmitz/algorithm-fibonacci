package fibonacci;

import java.time.Duration;
import java.time.Instant;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc1 = new Scanner(System.in);
        System.out.print("N: ");
        int F = sc1.nextInt();
        Instant startTime = Instant.now();
        
        for(int i = 0; i <= F; i++){
            System.out.println("(" + i + "):" +  App.fibo(i) + "\t");
        }
        Instant endTime = Instant.now();
        Duration totalTime = Duration.between(startTime, endTime);
        System.out.println("Tempo de execução: " + totalTime);  
    }

    private static long fibo(int n) {
        if (n < 2){
            return n;
        }
        else { 
            return fibo(n - 1) + fibo(n - 2);
        }
    }
}
