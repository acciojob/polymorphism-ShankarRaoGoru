package com.driver;

public class Main {

    public static void main(String[] args) {
        Product p=new Product();
        p.Product(5,6);
        p.Product(5,6,7);
        p.Product(5.5,7.8);

    }

}
class Product{
    public int Product(int x,int y){
        return x*y;
    }
    public int Product(int x,int y,int z){
        return x*y*z;
    }
    public double Product(double x,double y){
        return x*y;
    }
}
