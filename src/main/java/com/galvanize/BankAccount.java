package com.galvanize;

public class BankAccount {

    public float getAccount() {
        return account;
    }

    public void setAccount(long account) {
        this.account = 0;
    }

    private float account = 0f;
    private boolean overDrawn = false;


    void deposit(float cents){
        this.account += cents;
    }
    void withdraw(float cents){
        this.account -= cents;
    }
    public float balance(){
        return account;
    }
    public boolean isOverDrawn(){
        if (account < 0){
            overDrawn = true;
            return overDrawn;
        } else {
            return overDrawn;
        }
    }
}
