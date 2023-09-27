package p1;

import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int num[];
        num = new int[50];
        Random d = new Random();
int changecounter = 0;
int changecounter2 = 0;
int changecounter3 = 0;
 int S = 0;
 int D = 0;
        for (int i=0;i<num.length;i++){
            num[i]=50-d.nextInt(101);

            if(num[i]<0) {
                changecounter++;
            }
            System.out.println(num[i]);
            if(num[i]>0) {
                changecounter2++;
            }
            if(num[i]==0) {
                changecounter3++;
            }
            if(num[i]>0) {
                S = S +num[i];
            }
            if(num[i]<0) {
                D = D +num[i];

            }

        }
        System.out.println("col-vo - elementov:  "+ changecounter);
        System.out.println("col-vo + elementov:  "+ changecounter2);
        System.out.println("col-vo 0 elementov:  "+ changecounter3);
        System.out.println("Summa + elementov: " +S );
        System.out.println("Summa - elementov: " +D );
        System.out.printf("srednee: %d  ",((S+D)/(changecounter+changecounter2)));



    }

}

