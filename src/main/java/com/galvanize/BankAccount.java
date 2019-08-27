package com.galvanize;

public class BankAccount {

    public long getAccount() {
        return account;
    }

    public void setAccount(long account) {
        this.account = 0;
    }

    private long account = 0;
    private boolean overDrawn = false;


    void deposit(long cents){
        this.account += cents;
    }
    void withdraw(long cents){
        this.account -= cents;
    }
    public long balance(){
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
