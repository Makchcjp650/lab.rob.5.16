package com.company;

public class Main {

    public static void main(String[] args) {
        int randomNum;
        randomNum = (int)(Math.random()*102);
        System.out.println("Рандомне число : " + randomNum);
        System.out.print("Кількість цифр : " + Integer.toString(randomNum).length());
    }
}
