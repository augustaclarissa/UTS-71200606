package com.rplbo.utsnota;

import java.util.Locale;

public class Operator {
    public String operatorString;
    public String operatorSimbol;

    public Operator(String str){
        str=str.toLowerCase(Locale.ROOT);

        switch(str){
            case "tambah":
                operatorString = "tambah";
                operatorString = "+";
                break;
            case "kurang":
                operatorString = "kurang";
                operatorString = "-";
                break;
            case "kali":
                operatorString = "kali";
                operatorString = "*";
                break;
            case "bagi":
                operatorString = "bagi";
                operatorString = "/";
                break;
            case "pangkat":
                operatorString = "pangkat";
                operatorString = "^";
                break;
        }

    }

    public String getOperatorSimbol(){
        return operatorSimbol;
    }
}
