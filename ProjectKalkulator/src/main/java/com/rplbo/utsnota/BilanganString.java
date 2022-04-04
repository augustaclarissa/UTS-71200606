package com.rplbo.utsnota;

import java.util.Locale

public class BilanganString {
    private String bilanganstring = "";
    private int bilangan = 0;

    public BilanganString(String){
        str = toString().toLowerCase(Locale.ROOT);
        String[] strNumbers = {"nol", "satu", "dua", "tiga", "empat", "lima", "enam", "tujuh", "delapan", "sembilan"};
        if(str.contains("puluh")){
            String[] strs = str.split("puluh");
            if (strs[0].equals("se")){
                bilangan = 10;
                bilanganstring = "sepuluh";
            } else {
                for (int i = 2; i < strNumbers.length; i++) {
                    if (strs[0].trim().equals(strNumbers[i])){
                        bilangan = i*10;
                        bilanganstring = strNumbers[i] + " puluh";
                        break;
                    }
                }
            }
        }
        else if (str.contains("belas")) {
            String[] strs = str.split("belas");
            if (strs[0].trim().equals("se")){
                bilangan = 11;
                bilanganstring = "sebelas";
            } else {
                for (int i = 2; i < strNumbers.length; i++) {
                    if (strs[0].trim().equals(strNumbers[i])){
                        bilangan = 10+i;
                        bilanganstring = strNumbers[i] + " belas";
                        break;
                    }
                }
            }
        }
        String strs[] = str.split(" ");
        for (int i = 0; i < strNumbers.length; i++) {
            if (strs[strs.length-1].trim().equals(strNumbers[i])){
                bilangan += i;
                bilanganstring += " " + strNumbers[i];
                bilanganstring = bilanganstring.trim();
                break;
            }
        }
    }

    public int getBilangan(){
        return bilangan;
    }

    public boolean apakahDuaDigit(){
        return Math.abs(this.getBilangan()) > 9;
    }

    public boolean apakahLebihDari10(){
        return this.getBilangan() > 9;
    }
}
