package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    private int totalprice;

    private boolean toppings;
    private boolean ExtraCheese;

    private boolean takeAway;

    private boolean Bill;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg)
        {
            this.price = 300;
        }
        else this.price = 400;

        totalprice = price;
        Bill = false;
        toppings = false;
        ExtraCheese= false;
        takeAway = false;
        this.bill = "";
    }

    public int getPrice(){
        return this.totalprice;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!ExtraCheese)
        {
            ExtraCheese = true;
            totalprice += 80;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(!toppings)
        {
            if(isVeg)
            {
                totalprice += 70;
            }
            else {
                totalprice += 120;
            }
            toppings = true;
        }
    }

    public void addTakeaway(){
        // your code goes here  add
        if(!takeAway)
        {
            takeAway = true;
           totalprice += 20;
        }
    }

    public String getBill(){
        // your code goes here

        if(!Bill)
        {
            bill += "Base Price Of The Pizza: "+ price+ "\n";

            if(ExtraCheese)
            {
                bill += "Extra Cheese Added: "+80+ " \n";
            }

            if(toppings)
            {
                if(isVeg)
                {
                    bill += "Extra Toppings Added: "+70+ "\n";
                }
                else bill += "Extra Toppings Added: "+120+"\n";
            }

            if(takeAway)
            {
                bill += "Paperbag Added: " +20+ "\n";
            }


            bill += "Total Price: "+totalprice + "\n";
            Bill = true;


        }
        return this.bill;
    }
}
