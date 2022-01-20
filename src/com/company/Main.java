package com.company;

public class Main {

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7};
        System.out.println(binarySearch(1,array));
        System.out.println(binarySearch(4,array));
        System.out.println(binarySearch(8,array));
        if(binarySearch(5,array) == -1 ){
            System.out.println("Khong tim thay");
        } else {
            System.out.println(binarySearch(5, array));
        }
    }

    public static int binarySearch(int value, int[] array){

        int low = 0;
        int high = array.length - 1;
        int mid;

        while (high >= low){
            mid = (low + high) / 2;
            if(value == array[mid]) {
                return mid;
            } else if (value < array[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

}
