package org.dimigo.basic;

/**
 * <pre>
 * org.dimigo.basic
 *   |_Operator
 *
 * 1. 개요 : 디미베네
 * 2. 작성일 : 2017. 3. 14.
 * <pre>
 *
 * @author : Seung
 * @version : 1.0
 */
public class Operator {
    public static void main(String[] args) {

        int salary = 1700000;
        int employeePerStore = 3;
        int storeCount = 1500;
        long inGunBi = (long)salary * 12 * storeCount * employeePerStore;

        System.out.println("<< 디미베네 연간 인건비 >>");
        System.out.println("월 평균 급여 : " + String.format("%,d",salary) + "원");
        System.out.println("점포 내 직원 수 : " + employeePerStore +"명");
        System.out.println("점포 수 : "+String.format("%,d",storeCount)+"개");
        System.out.println();
        System.out.println("연간 인건비 : "+ String.format("%,d",inGunBi) +"원");
    }
}
