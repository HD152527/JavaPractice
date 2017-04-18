package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *   |_PiggyBank
 *
 * 1. 개요 :
 * 2. 작성일 : 2017. 4. 12.
 * <pre>
 *
 * @author : Seung
 * @version : 1.0
 */
public class PiggyBank extends FamilyMember{
    private static int balance;

    public void putMoney(FamilyMember member, int amount){
        System.out.println(member.getMemberName() + " : " + amount + "원 넣음");
        balance += amount;
    }

    public static void printBalance(){
        System.out.println("돼지저금통 총 금액 : " + balance + "원");
    }

}
