package com.driver;

import com.sun.source.tree.ReturnTree;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private boolean took =false;
  //  public  int price1 =0;
    public boolean added = false;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(this.isVeg){
            this.price=300;
        }
        else{
            this.price=400;
        }

    }

    public int getPrice(){

       // return this.price;
        if(isVeg==true){

            this.price=300;
            return this.price;
        }
        else{

            this.price=400;
            return this.price;
        }

    }

    public void addExtraCheese(){
        // your code goes here

        if(added==false){
            System.out.println("Extra Cheese Added: "+80);
          this.price+=80;
            added=true;
        }
        else{
          this.price=this.price;
        }

    }

    public void addExtraToppings(){
        // your code goes here
        if(isVeg){
            System.out.println("Extra Toppings Added: "+70);

            this.price+=70;
        }
        else{
            System.out.println("Extra Toppings Added: " +120);

            this.price+=120;
        }
    }

    public void addTakeaway() {
        // your code goes here
        if (took == false) {
            System.out.println("Paperbag Added: "+20);
            this.price += 20;
            took = true;
        }
    }

    public String getBill(){
        // your code goes here
this.bill = Integer.toString(this.price);
        return bill;
    }
}
