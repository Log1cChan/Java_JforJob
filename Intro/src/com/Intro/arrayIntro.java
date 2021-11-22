package com.Intro;

import java.util.Arrays;

public class arrayIntro {
    /**
     * @program: Intro
     * @description: Intro to some Array Operation
     * @author: Log1c
     * @create: 2021-11-10 16:58
     **/
    public static void main(String[] args){
        // First method
        int arr[] = new int[]{1,2,3,4,5};
        // Second method
        int arr2[] = {1,2,3,4,5};
        for (int i=0; i<arr.length; i++){
            System.out.println(arr[i] + " " +arr2[i]);
        }

//        foreach
        for (int e:arr){
            System.out.println(e);
        }

        /**
        * @Description: Usage of fill method
        * @Author: Log1c
        * @Date: 2021/11/10
        */
        int a[] = new int[5];
        Arrays.fill(a, 8);
        for(int i=0; i<a.length; i++){
            System.out.print(a[i]);
        }
        System.out.println();
        Arrays.fill(a, 1, 2, 3);
        for(int i=0; i<a.length; i++){
            System.out.print(a[i]);
        }
        System.out.println();
        /**
        * @Description: Usage of sort method
        * @Author: Log1c
        * @Date: 2021/11/10
        */
        int arr3[] = new int[]{23, 42, 12, 6};
        Arrays.sort(arr3);
        for(int i=0; i<arr3.length; i++)
            System.out.print(arr3[i] + " ");
        System.out.println();

        /**
        * @Description: Usage of two methods in copying Array
        * @Author: Log1c
        * @Date: 2021/11/10
        */
        // 1. copyOf
        int arr4[] = new int[]{23, 42, 12};
        int newarr[] = Arrays.copyOf(arr4, 5);
        for (int i=0; i<newarr.length; i++){
            System.out.print(newarr[i] + " ");
        }
        System.out.println();
        // 2. copyOfRange
        int arr5[] = new int[]{23, 42, 12, 84, 10};
        int newarr1[] = Arrays.copyOfRange(arr5, 0, 3);
        for (int i=0; i< newarr1.length; i++){
            System.out.print(newarr1[i] + " ");
        }
        System.out.println();

        /**
        * @Description: Usage of binarySearch()
        * @Author: Log1c
        * @Date: 2021/11/10
        */
        // binarySearch(Object[] a, Object key)
        int ia[] = new int[]{1, 8, 9, 4, 5};
        Arrays.sort(ia);
        int index = Arrays.binarySearch(ia, 4);
        System.out.println("Index of 4: " + index);
        //binarySearch(Object[]a, int fromIndex, int toIndex, Object key)
        String str[] = new String[]{"ab", "cd", "ef", "yz"};
        Arrays.sort(str);
        int index1 = Arrays.binarySearch(str, 0, 2, "cd");
        System.out.println("Index of cd: " + index1);

        /**
        * @Description: This part is about sorting algorithm of array
        * @Author: Log1c
        * @Date: 2021/11/10
        */
        // 1. Bubble Sort
        int[] sa = new int[]{63, 4, 24, 1, 3, 15};
        for (int i=1; i<sa.length; i++){
            for (int j=0; j<sa.length-i; j++){
                if(sa[j]>sa[j+1]){
                    int temp = sa[j];
                    sa[j] = sa[j+1];
                    sa[j+1] = temp;
                }
            }
        }
        for (int i=0; i<sa.length; i++){
            System.out.print(sa[i] + " ");
        }
        System.out.println();

        // 2. Select Sort
        int[] sa1 = new int[]{63, 4, 24, 1, 3, 15};
        int index2;
        for (int i=1; i<sa1.length; i++){
            index2 = 0;
            for (int j=1; j<=sa1.length-i; j++){
                if(sa1[j] > sa1[index2]){
                    index2 = j;
                }
            }
            int temp1 = sa1[sa1.length-i];
            sa1[sa1.length-i] = sa1[index2];
            sa1[index2] = temp1;
        }
        for (int i=0; i<sa1.length; i++){
            System.out.print(sa1[i] + " ");
        }













    }
}
