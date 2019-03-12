package com.sitech.demo.domain;

public class Fruit {

    private Integer id;

    private String apple;

    private String banana;

    private String pear;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getApple() {
        return apple;
    }

    public void setApple(String apple) {
        this.apple = apple == null ? null : apple.trim();
    }

    public String getBanana() {
        return banana;
    }

    public void setBanana(String banana) {
        this.banana = banana == null ? null : banana.trim();
    }

    public String getPear() {
        return pear;
    }

    public void setPear(String pear) {
        this.pear = pear == null ? null : pear.trim();
    }

    public Fruit(Integer id, String apple, String banana, String pear) {
        this.id = id;
        this.apple = apple;
        this.banana = banana;
        this.pear = pear;
    }

    public Fruit() {
    }

    @Override
    public String toString() {
        return "Fruit{" +
         "id=" + id +
         ", apple='" + apple + '\'' +
         ", banana='" + banana + '\'' +
         ", pear='" + pear + '\'' +
         '}';
    }
}