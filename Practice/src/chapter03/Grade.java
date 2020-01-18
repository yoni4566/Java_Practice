package chapter03;

import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();

        char grade;
        if( 90 <= score) {
            grade = 'A';
        } else if(80 <= score) {
            grade = 'B';
        } else if(70 <= score) {
            grade = 'C';
        } else if(60 <= score) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        System.out.println("점수 : " + score);
        System.out.println("학점 : " + grade);

        System.out.println("============삼항연산자==============" );

        int a = 10;
        int b = 20;

        int max;
        max = (a > b) ? a : b;
        System.out.println("max : " + max);
    }
}

