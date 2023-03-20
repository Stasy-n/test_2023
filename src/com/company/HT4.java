package com.company;

public class HT4 {
    public static void main(String[] args) {
//        for (int i = 0; i < 10; i++) {
//            //System.out.print(i);
//            for (int j = 0; j < 10-i; j++) {
//                System.out.print(j+ "   ");
//            }
//            System.out.println("\n");
//        }
//        for (int i = 9; i >=0 ; i--) {
//            System.out.print(i);
//            if(i==9){
//                for ( i = 1; i < 10; i++) {
//                    System.out.print(i);
//                }
//            }
//        }
//        for (int i = 0; i <=9 ; i++) {
//            for (int k = 0; k < i; k++) {
//                System.out.print("   ");
//            }
//            for (int j = 0; j <=9-i ; j++) {
//
//                System.out.print(j+ "  ");
//            }
//            System.out.println("\n");
//        }
        boolean reverse = false;
        for (int i = 0; i <=9 ; i++) {
            for (int k = 0; k < i; k++) {
                System.out.print("  ");
            }
            int count = 0;
            for (int j = 9-i; ;) {

                System.out.print(j+ " ");

                if(j == 0)
                {
                   reverse = true;
                }

                if(reverse)
                {
                    j++;
                }else{
                    j--;
                }

                count++;
                if(count == 19 - i*2)
                {
                    reverse = false;
                    break;
                }
            }
            System.out.println();
        }

    //Задача №1
    //
    //Дан массив:
    //int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
    //необходимо вывести сумму всех значений массива.
//
   // int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
//    int sum = 0;
//    for (int i = 0; i < array.length; i++) {
//        sum +=array[i];
//    }
//        System.out.println(sum);

    //Задача №2

        //необходимо вывести максимальное значение массива.
//        int max = array[0];
//        for (int i = 1; i < array.length; i++) {
//            if(max<array[i])
//            {
//                max = array[i];
//            }
//        }
//        System.out.println("max =" + max);
//        int min = array[0];
//        for (int i = 1; i < array.length; i++) {
//            if(array[i]<min)
//            {
//                min = array[i];
//            }
//        }
//        System.out.println("min =" + min);

        //Задача №4
        //
        //Дан массив:
//        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
//        //необходимо вывести среднее арифметическое всех значений массива.
//        int sum = 0;
//        for (int i = 0; i < array.length; i++) {
//            sum += array[i];
//        }
      //  System.out.println("arithmetic min = " + sum*1.0/ array.length);

        //Задача №5

        //Дан массив:
        //int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        //необходимо вывести сумму элементов массива.

    }
}
