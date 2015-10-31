package com.company;
public class Main {

    public static void main(String[] args) {
//ex1a
        int n, suma;
        suma = 0;
        n=6438;
        while (n != 0) {
            suma = suma + n % 10;
            n = n / 10;
        }
        System.out.println("Suma cifrelor este:" + suma);

    }
}
