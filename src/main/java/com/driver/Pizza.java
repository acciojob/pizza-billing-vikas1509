package com.driver;

import com.sun.source.tree.ReturnTree;

public class Pizza {

    private int price;
    private int cheesprice;
    private int takeAway;
    private int topingPrice;
    private Boolean isVeg;
    private String bill;
     private boolean exctraChees;

    private boolean addTakeAway ;
    private boolean addexctraToping ;
    private boolean addExctraChees;
    private boolean isBillGeneration;
  //  public  int price1 =0;
    public boolean added = false;

    public Pizza(Boolean isVeg){

        // your code goes here
        this.isVeg=isVeg;
        this.cheesprice=80;
        this.takeAway=20;
        if(this.isVeg=true){
            this.price=300;
            this.topingPrice=20;
        }
        if(isVeg==true){
            this.price=300;
            this.topingPrice=70;
        }
        else{
            this.price=400;
            this.topingPrice=120;
        }
        this.addExctraChees=false;
        this.addTakeAway=false;
        this.addexctraToping=false;
        this.isBillGeneration=false;
        this.bill="Base price of the pizza: "+ this.price+"\n";


    }

    public int getPrice(){

       // return this.price;
     return this.price;

    }

    public void addExtraCheese(){
        // your code goes here

        if(addExctraChees==false){
           this.price+=this.cheesprice;

      addExctraChees=true;

        }


    }

    public void addExtraToppings(){
        // your code goes here
        if(addexctraToping==false){
           this.price+=this.topingPrice;
           addexctraToping=true;



        }

    }

    public void addTakeaway() {
        // your code goes here
        if (addTakeAway == false) {

            this.price +=this.takeAway;
            addTakeAway =true;

        }
    }

    public String getBill(){
        // your code goes here
if(isBillGeneration==false){
    if(addExctraChees==true){
        this.bill+="Exctra Chees Added: "+this.cheesprice+"\n";

    }
    if(addexctraToping==true){
        this.bill+="Exctra Toping Added: "+this.topingPrice+ "\n";
    }
    if(addTakeAway==true) {
        this.bill += "Paperbag Added: " + this.takeAway + "\n";
    }
    this.bill+="Total price: "+this.price+"\n";
    isBillGeneration=true;

}
return this.bill;
    }
}
