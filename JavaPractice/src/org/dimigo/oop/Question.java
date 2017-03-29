package org.dimigo.oop;

import java.util.Scanner;

/**
 * <pre>
 * org.dimigo.oop
 *   |_Question
 *
 * 1. 개요 :
 * 2. 작성일 : 2017. 3. 29.
 * <pre>
 *
 * @author : Seung
 * @version : 1.0
 */
public class Question {
    public static void main(String args[]){
        StringBuilder q1 = new StringBuilder("가장 좋아하는 가수는? ");
        StringBuilder q2 = new StringBuilder("가장 좋아하는 배우는? ");
        StringBuilder q3 = new StringBuilder("가장 좋아하는 과목은? ");
        String answer1 = new String("빅뱅");
        String answer2 = new String("원빈");
        String answer3 = new String("응용 프로그래밍");

        Scanner scan = new Scanner(System.in);
        System.out.println("1."+q1);
        System.out.println(scan.nextLine().equals(answer1)?"정답입니다!":"틀렸습니다!");
        System.out.println("2."+q2);
        System.out.println(scan.nextLine().equals(answer2)?"정답입니다":"틀렸습니다!");
        System.out.println("3."+q3);
        System.out.println(scan.nextLine().equals(answer3)?"정답입니다!":"틀렸습니다!");

        System.out.println("<< 결과 출력 >>");
        System.out.println(q1.append(answer1 + "입니다"));
        System.out.println(q2.append(answer2 + "입니다"));
        System.out.println(q3.append(answer3 + "입니다"));


    }
}
