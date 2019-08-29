package com.galvanize;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankAccountTest {
    @Test
    public void BankAccountBalance(){
        BankAccount account = new BankAccount();
        float result = account.balance();
        assertEquals(0f, result);
    }
    @Test
    public void BankAccountDeposit(){
        BankAccount accountA = new BankAccount();
        accountA.deposit(.30f);
        float result = accountA.balance();
        assertEquals(.30f, result);
    }
    @Test
    public void BankAccountWithdraw(){
        BankAccount accountB = new BankAccount();
        accountB.deposit(.50f);
        accountB.withdraw(.20f);
        float result = accountB.balance();
        assertEquals(.30f, result);
    }
    @Test
    public void BankAccountOverDrawn(){
        BankAccount accountC = new BankAccount();
        accountC.deposit(.50f);
        accountC.withdraw(.60f);
        boolean result = accountC.isOverDrawn();
        assertEquals(true, result);
    }
}
