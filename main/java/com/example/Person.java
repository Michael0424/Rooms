package main.java.com.example;

public class Person {
    private int age;
    private String sex;
    private double height;
    private String name;
    private double weight;
    
    public Person(int age, String sex, double height, String name, double weight){
        this.age = age;
        this.sex = sex;
        this.height = height;
        this.name=name;
        this.weight=weight;
    }

    public int getage(){
        return this.age;
    }
    public String getsex(){
        return this.sex;
    }
    public Double getheight(){
        return this.height;
    }
    public String getname(){
        return this.name;
    }
    public Double getwight(){
        return this.weight;
    }
    public void setage(int newage){
        this.age = newage;
    }
    public void setsex(String newsex){
        this.sex = newsex;
    }
    public void setheight(Double newheight){
        this.height = newheight;
    }
    public void setname(String newname){
        this.name = newname;
    }
    public void setweight(Double newweight){
        this.weight=newweight;
    }



    //super key word





    
}
