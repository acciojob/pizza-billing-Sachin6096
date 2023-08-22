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
        if(!ExtraCheese && !Bill)
        {
            ExtraCheese = true;
            totalprice += 80;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(!toppings && !Bill)
        {
            if(isVeg)
            {
                totalprice += 70;
            }
            else totalprice += 120;
            toppings = true;
        }
    }

    public void addTakeaway(){
        // your code goes here  add
        if(!takeAway && !Bill)
        {
            takeAway = true;
           totalprice += 20;
        }
    }

    public String getBill(){
        // your code goes here

        if(!Bill)
        {
            if(isVeg)
            {

                this.bill += "Base Price Of The Pizza: 300 \n";

            }
            else this.bill += "Base Price Of The Pizza: 400 \n";


            if(ExtraCheese)
            {
                this.bill += "Extra Cheese Added: 80 \n";
            }

            if(toppings)
            {
                if(isVeg)
                {
                    this.bill += "Extra Toppings Added: 70 \n";
                }
                else this.bill += "Extra Toppings Added: 120";
            }

            if(takeAway)
            {
                this.bill += "Paperbag Added: 20 \n";
            }

            Bill = true;
            this.bill += "Total Price:"+totalprice;
            this.bill += "\n";

        }
        return this.bill;
    }
}
