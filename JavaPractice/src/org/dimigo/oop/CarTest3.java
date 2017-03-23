package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *   |_CarTest
 *
 * 1. 개요 :
 * 2. 작성일 : 2017. 3. 23.
 * <pre>
 *
 * @author : Seung
 * @version : 1.0
 */
public class CarTest3 extends Car3 {
    public static void main(String[] args) {
        Car3 genesis = new Car3("현대자동차", "제네시스", "검정색", 255, 50000000);
        Car3 K7 = new Car3("기아자동차", "K7", "흰색", 246);
        Car3 SM7 = new Car3("삼성자동차", "SM7", "회색");

        System.out.println("<< 자동차 목록 >>");
        System.out.printf("제조사명 : %s\n모델명 : %s\n색상 : %s\n최대속도 %dkm\n가격 : %,d원\n\n",genesis.getCompany(),genesis.getModel(),genesis.getColor(),genesis.getMaxSpeed(),genesis.getPrice());
        System.out.printf("제조사명 : %s\n모델명 : %s\n색상 : %s\n최대속도 %dkm\n가격 : %,d원\n\n",K7.getCompany(),K7.getModel(),K7.getColor(),K7.getMaxSpeed(),K7.getPrice());
        System.out.printf("제조사명 : %s\n모델명 : %s\n색상 : %s\n최대속도 %dkm\n가격 : %,d원\n\n",SM7.getCompany(),SM7.getModel(),SM7.getColor(),SM7.getMaxSpeed(),SM7.getPrice());

    }
}
