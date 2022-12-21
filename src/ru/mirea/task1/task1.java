package ru.mirea.task1;

import java.util.Random;
import java.util.Scanner;
public class task1 {
    public static void enter_array(int[] a, Scanner scanner){
        System.out.println("Введите "+a.length+" чисел: ");
        for(int i=0;i<a.length;i++){
            a[i]=scanner.nextInt();
        }
    }
    public static void print_array(int[] a){
        System.out.print("Массив: ");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println("\n");
    }
    public static void print_sum(int[] a){
        int summ=0;
        for(int i=0;i<a.length;i++){
            summ+=a[i];

        }
        System.out.println("Сумма через цикл for " + summ);
        summ=0;
        int i=0;
        while(i<a.length){
            summ+=a[i];
            i++;
        }
        System.out.println("Сумма через цикл while " + summ);
        summ=0;
        i=0;
        do{
            summ+=a[i];
            i++;
        }while (i<a.length);
        System.out.println("Сумма через цикл do while " + summ);
    }
    public static void print_args(String[] args){
        for(int i=0;i< args.length;i++){
            System.out.print(args[i]+", ");
        }
        System.out.print("\n");
    }
    public static void harmonic_series(Scanner scanner){
        int flag;
        System.out.print("1. В виде обыкновенной дроби\n"+"2. В виде десятичной дроби\n"+"Ваш выбор:");
        flag=scanner.nextInt();
        if(flag==2) {
            double a = 1;
            for (double i = 1; i < 11; i++) {
                System.out.printf("%.5f ",a/i);
            }
            System.out.println();
        } else if (flag==1) {
            for (int i = 1; i < 11; i++) {
                System.out.printf("%s ", "1/"+i);
            }
            System.out.print("\n");
        }
    }
    public static void enter_rand_array(int[] a){
        Random random = new Random();
        for(int i=0;i<a.length;i++){
            a[i]= random.nextInt(50);
        }
    }
    public static void sort_alg(int[] a){
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]>a[j]){
                    int t=a[i];
                    a[i]=a[j];
                    a[j]=t;
                }
            }
        }
    }
    public static int Factorial(int numb){
        int result = 1;
        while(numb > 0){
            result *= numb;
            numb--;
        }

        return result;
    }
    public static void main(String[] args) {
        int comm=-1;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива:");
        int[] a=new int[scanner.nextInt()];
        while(comm!=0){
            System.out.print("1. Сумма элементов массива\n"+"2. Аргументы командной строки\n"+"" +
                    "3. Вывод гармонического ряда\n"+
                    "4. Сортировка массива случайных чисел\n"+ "5. Получение факториала числа\n"+ "0. Для выхода из программы\n"+"Введите номер задачи: ");
            comm=scanner.nextInt();
            switch (comm){

                case 1->{
                    enter_array(a,scanner);
                    print_sum(a);
                }
                case 2->{
                    print_args(args);
                }
                case 3->{
                    harmonic_series(scanner);
                }
                case 4->{
                    enter_rand_array(a);
                    print_array(a);
                    sort_alg(a);
                    print_array(a);
                }
                case 5->{
                    int numb=0;
                    while(numb<=0){
                        System.out.print("Введите число: ");
                        numb=scanner.nextInt();
                        if(numb<=0){
                            System.out.print("Введите положительное число\n");
                        }
                    }

                    System.out.print("Факториал: "+Factorial(numb)+"\n");
                }
                default -> {
                    return;
                }
            }
        }
    }
}