package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *   |_Snack
 *
 * 1. 개요 :
 * 2. 작성일 : 2017. 4. 6.
 * <pre>
 *
 * @author : Seung
 * @version : 1.0
 */
public class Snack {
    private String name;
    private String company;
    private int price;
    private int number;

    public Snack() {
    }

    public Snack(String name, String company, int price, int number) {
        this.name = name;
        this.company = company;
        this.price = price;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void printSnack(){
        System.out.println("이름 : "+ this.getName());
        System.out.println("제조사 : "+this.getCompany());
        System.out.println("가격 : "+String.format("%,d",this.getPrice())+"원");
        System.out.println("개수 : "+this.getNumber()+"개");
        System.out.println();
    }

}
