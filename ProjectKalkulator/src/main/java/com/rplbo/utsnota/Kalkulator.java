package com.rplbo.utsnota;

public class Kalkulator {
    private int bil2;
    private int bil1;
    private String op;

    public Kalkulator(BilanganString a, BilanganString n, Operator c){
        bil1 = a.getBilangan();
        bil2 = n.getBilangan();
        op = c.getOperatorSimbol();
    }

    public void hitung(){
        double hasil = 0;

        switch(op){
            case"+":
                hasil = bil1+bil2;
                break;
            case"-":
                hasil = bil1-bil2;
                break;
            case"*":
                hasil = bil1*bil2;
                break;
            case"/":
                hasil = bil1/bil2;
                break;
            case"^":
                hasil = Math.pow(bil1,bil2);
                break;
        }
        System.out.println("Hasil: " + hasil);
    }
}
