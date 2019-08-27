package com.galvanize;

public class application {
    public static void main(String[] args) {
        int total = 0;

        for(int i = 0; i < args.length; i++) {
            int x = Integer.parseInt(args[i]);
            total += x;
        }
        System.out.println(total);

        Table roundTable = new Table();
        roundTable.setShape("round");

        System.out.println(roundTable);

        Marker markerOne = new Marker();
        markerOne.unCap();
        markerOne.write("Hello");
        markerOne.write("World");

        Marker markerTwo = new Marker();

        System.out.println(markerOne);
        System.out.println(markerTwo);

        BankAccount accountA = new BankAccount();
        accountA.deposit(5);
        accountA.withdraw(4);
        accountA.isOverDrawn();
        accountA.balance();
        System.out.println(accountA.balance());

    }


}

