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
public class CarTest extends Car {
    public static void main(String[] args) {
        //Car genesis = new Car("현대자동차", "제네시스", "검정색", 255, 50000000);
        //Car K7 = new Car("기아자동차", "K7", "흰색", 246, 40000000);
        //Car SM7 = new Car("삼성자동차", "SM7", "회색", 200, 38000000);

        System.out.println("<< 자동차 목록 >>");
        Car genesis = new Car();
        Car K7 = new Car();
        Car SM7 = new Car();

        genesis.setCompany("현대자동차");
        genesis.setModel("제네시스");
        genesis.setColor("검정색");
        genesis.setMaxSpeed(255);
        genesis.setPrice(50000000);

        K7.setCompany("기아자동차");
        K7.setModel("K7");
        K7.setColor("검정색");
        K7.setMaxSpeed(246);
        K7.setPrice(40000000);

        SM7.setCompany("삼성자동차");
        SM7.setModel("SM7");
        SM7.setColor("회색");
        SM7.setMaxSpeed(200);
        SM7.setPrice(38000000);

        System.out.printf("제조사명 : %s\n모델명 : %s\n색상 : %s\n최대속도 %dkm\n가격 : %,d원\n\n",genesis.getCompany(),genesis.getModel(),genesis.getColor(),genesis.getMaxSpeed(),genesis.getPrice());
        System.out.printf("제조사명 : %s\n모델명 : %s\n색상 : %s\n최대속도 %dkm\n가격 : %,d원\n\n",K7.getCompany(),K7.getModel(),K7.getColor(),K7.getMaxSpeed(),K7.getPrice());
        System.out.printf("제조사명 : %s\n모델명 : %s\n색상 : %s\n최대속도 %dkm\n가격 : %,d원\n\n",SM7.getCompany(),SM7.getModel(),SM7.getColor(),SM7.getMaxSpeed(),SM7.getPrice());
    }
}
