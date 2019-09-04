package com.galvanize;

public class Application {
    public static void main(String[] args) {
        System.out.println("hello world");
        int total = 0;

        for(int i = 0; i < args.length; i++) {
            int x = Integer.parseInt(args[i]);
            total += x;
        }
        System.out.println(total);

        Table roundTable = new Table();
        roundTable.setShape("round");

        System.out.println(roundTable);

        Marker markerOne = new Marker(true, 1.0f, "blue");
        markerOne.unCap();
        markerOne.write("Hello");
        markerOne.write("World");
        markerOne.changeColor("Green");

        Marker markerTwo = new Marker(false, 1.0f, "red");

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

