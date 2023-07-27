package org.example;

public class Main {
    public static void main(String[] args) {
        Fighter ali = new Fighter("Ali" , 15 , 100, 90, 20);
        Fighter tyson = new Fighter("Tyson" , 10 , 95, 100, 20);
        Ring r = new Ring(ali,tyson , 90 , 100);
        r.run();
    }
}