package test;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        System.out.println("1、b 2、b 3、d 4、b 5、d");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        showTriangle(n);
        String s = sc.next();
        reverseString(s);
        int num = sc.nextInt();
        isPalindrome(num);
        ShuiXianHua();
        arraysDemo();
    }

    public static void showTriangle(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }

    public static void reverseString(String s) {
        char[] chars = s.toCharArray(); // 字符串转化为字符数组
        char temp;
        for (int i = 0, j = chars.length - 1; i < chars.length / 2; i++, j--) {
            temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
        }
        String s1 = String.valueOf(chars);//字符数组转化为字符串
        System.out.println(s1);
    }

    public static void isPalindrome(int num) {
        boolean flag = false;
        int sum = 0, temp;
        for (int i = num; i > 0; i /= 10) {
            temp = i % 10;
            sum = sum * 10 + temp;
        }
        if (sum == num) {
            flag = true;
        }
        if (flag) {
            System.out.println("是的");
        } else
            System.out.println("不是");
    }

    public static void ShuiXianHua() {
        for (int i = 100; i < 1000; i++) {
            int a = i / 100;
            int b = i % 100 / 10;
            int c = i % 10;
            if (a * a * a + b * b * b + c * c * c == i) {
                System.out.println(i);

            }
        }
    }

    public static void arraysDemo() {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[10];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        int min = a[0], max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            } else if (a[i] < min) {
                min = a[i];
            }
        }
        System.out.println(min + max + "\nmax:" + max + "\nmin:" + min);
    }
}
