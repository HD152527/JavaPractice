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


        String question[] = {"가장 좋아하는 가수는? ", "가장 좋아하는 배우는? ","가장 좋아하는 과목은? "};
        String answer[] = {"빅뱅", "원빈","응용 프로그래밍"};

        Scanner scan = new Scanner(System.in);

        for(int i=0;i < 3; i++){
            System.out.println((i+1) + "."+question[i]);
            System.out.println(scan.nextLine().equals(answer[i])?"정답입니다!":"틀렸습니다!");
        }

        StringBuilder sb = new StringBuilder();
        System.out.println(sb.append("<< 결과 출력 >>"));
        for(int i=0 ; i<3; i++){
            sb.delete(0, 100);
            System.out.println(sb.append(question[i] + answer[i] + "입니다").toString());

        }
    }
}
