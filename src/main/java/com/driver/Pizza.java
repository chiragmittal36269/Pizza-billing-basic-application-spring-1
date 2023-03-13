package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    boolean isExtraCheese;
    boolean isExtraTopping;
    boolean isTakeAway;
    boolean isBillCreated;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        if(this.isVeg) {
            this.price = 300;
        } else {
            this.price = 400;
        }
        this.bill = "Base Price Of The Pizza: " + this.price + "\n";
    }

    public int getPrice() {
        return this.price;
    }

    public void addExtraCheese() {
        if(!isExtraCheese) {
            this.price += 80;
            isExtraCheese = true;
        }
    }

    public void addExtraToppings() {
        if(!isExtraTopping) {
            if (this.isVeg) {
                this.price += 70;
            } else {
                this.price += 120;
            }
            isExtraTopping = true;
        }
    }

    public void addTakeaway() {
        if(!isTakeAway) {
            this.price += 20;
            isTakeAway = true;
        }
    }

    public String getBill() {
        if(!isBillCreated)
        {
            if(isExtraCheese) {
                this.bill += "Extra Cheese Added: 80" + "\n";
            }

            if(isExtraTopping) {
                if (this.isVeg) {
                    this.bill += "Extra Toppings Added: " + 70 + "\n";
                } else {
                    this.bill += "Extra Toppings Added: " + 120 + "\n";
                }
            }

            if(isTakeAway) {
                this.bill += "Paperbag Added: 20" + "\n";
            }

            this.bill += "Total Price: " + this.price + "\n";

            isBillCreated = true;
        }
        return this.bill;
    }
}
