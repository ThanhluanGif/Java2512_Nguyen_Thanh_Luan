package Bai4.btvn;

import java.util.Arrays;
import java.util.Scanner;

public class b4 {
    public static void main(String[] args) {
        //MaxMin();
        //SapXep();
        //MaxTwo();
        FindX();
    }
    public static void MaxMin() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }

        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Max = " + max);
        System.out.println("Min = " + min);
    }

    public static void SapXep() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }


        for (int i = 0; i <= arr.length -1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i]  = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void MaxTwo() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        int max = Integer.MIN_VALUE;
        int max2 = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] > max) {
                 max2 = max;
                 max = arr[i];
            }else if (arr[i] > max2 && arr[i] < max){
                max2 = arr[i];
            }

        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Max2 = " + max2);
    }

    public static void FindX() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int x = sc.nextInt();
        boolean timThay = false;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            System.out.println(Arrays.toString(arr));
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] ==  x) {
                System.out.println("Tìm thấy x ở vị trí i = " + i);
                timThay = true;
            }
        }
        if (!timThay) {
            System.out.println("Không tìm thấy x trong mảng");
        }

    }

}
