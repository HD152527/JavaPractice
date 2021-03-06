package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *   |_Car
 *
 * 1. 개요 :
 * 2. 작성일 : 2017. 3. 23.
 * <pre>
 *
 * @author : Seung
 * @version  : 1.0
 */
public class Car3 {
    private String company;
    private String model;
    private String color;
    private int maxSpeed;
    private int price;

    public Car3(){
    }

    public Car3(String company, String model, String color, int maxSpeed, int price) {
        this.company = company;
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.price = price;
    }

    public Car3(String company, String model, String color, int maxSpeed){
        this(company,model,color,maxSpeed,0);
    }

    public Car3(String company, String model, String color) {
        this(company,model,color,0);
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void printCar(){
        System.out.printf("제조사명 : %s\n모델명 : %s\n색상 : %s\n최대속도 %dkm\n가격 : %,d원\n\n",this.getCompany(),this.getModel(),this.getColor(),this.getMaxSpeed(),this.getPrice());
    }
}
