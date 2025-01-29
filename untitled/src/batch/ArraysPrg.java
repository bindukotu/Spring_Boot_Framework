package batch;

import java.util.Scanner;

public class ArraysPrg {
    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("size of array ");
//        int size=sc.nextInt();
//        int[] id1=new int[size];
//        System.out.println("read array");
//        for(int i=0;i<size;i++){
//            id1[i]=sc.nextInt();
//        }
//        System.out.println("print values");
//        for(int i=0;i<size;i++){
//            System.out.println(id1[i]);        }
        int[] id={1,2,3,4,5};
        for(int i=id.length-1;i>=0;i--){
            System.out.println(id[i]);
        }
    }
}
