package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        int testCases = scan.nextInt();


        for (int x = 0; x < testCases; x++) {
            int carts = scan.nextInt();
            int[] train = new int[carts];
            for (int i = 0; i < carts; i++) {
                // will add carts to the train array
                train[i] = scan.nextInt();
            }

            //start bubble sort
            int count = 0, temp;
            boolean flag = true;   // set flag to true to begin first pass
            //holding variable

            while (flag) {
                flag = false;    //set flag to false awaiting a possible swap

                for (int j = 0; j < train.length - 1; j++) {
                    if (train[j] > train[j + 1]) {
                        temp = train[j];                //swap elements
                        train[j] = train[j + 1];
                        train[j + 1] = temp;
                        flag = true;              //shows a swap occurred
                        count++;
                    }
                }
            }
            System.out.println("Optimal train swapping takes " + count + " swaps.");
        }
    }
}


