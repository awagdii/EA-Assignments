package com.ea.week02;

public class App {
    public static void main(String args []){
        Car myToyota = new Car("Toyota","Corola",2007,20000,Color.RED);
        Car myImpala = new Car("Chevy","Impala",2002,230000,Color.WHITE);
        MyPersister myPersister = new MyPersister();
        myPersister.save(myToyota );
        myPersister.save(myImpala );
        myPersister.end();
    }
}
