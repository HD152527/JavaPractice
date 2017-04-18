package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *   |_PiggyBankTest
 *
 * 1. 개요 :
 * 2. 작성일 : 2017. 4. 12.
 * <pre>
 *
 * @author : Seung
 * @version : 1.0
 */
public class PiggyBankTest extends PiggyBank{

    public static void main(String[] args) {
        FamilyMember[] familyMembers = {
                new FamilyMember("아빠"),
                new FamilyMember("엄마"),
                new FamilyMember("나"),
                new FamilyMember("남동생")
        };

        familyMembers[0].printMemberCnt();

        PiggyBank pg = new PiggyBank();
        pg.putMoney(familyMembers[0], 10000);
        pg.putMoney(familyMembers[1], 5000);
        pg.putMoney(familyMembers[2], 2000);
        pg.putMoney(familyMembers[3], 1000);

        pg.printBalance();

        pg.putMoney(familyMembers[2], 1000);

        pg.printBalance();
    }
}
