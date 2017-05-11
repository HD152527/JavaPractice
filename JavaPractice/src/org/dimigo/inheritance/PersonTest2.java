package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 *   |_PersonTest
 *
 * 1. 개요 :
 * 2. 작성일 : 2017. 5. 8.
 * <pre>
 *
 * @author : Seung
 * @version : 1.0
 */
public class PersonTest2 {

    public static void main(String[] args){


        Person[] people = {
                new Person("Tom"),
                new Japanese("다나카"),
                new Chinese("왕밍"),
                new Korean("홍길동")

        };

        for (Person p:people) {
            greeting(p);
        }


    }
    private static void greeting(Person p){
        System.out.println(p);
        p.sayHello();
        p.sayBye();
        System.out.println();
    }
}
