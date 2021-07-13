package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число от 1 до 9999: ");
        int chislo = in.nextInt();
        String word1,word2,word3,word4;
        //word1
        switch (Math.round(chislo / 1000 % 10)) {
            case 1:
                word1 = "Одна тысяча ";
                break;
            case 2:
                word1 = "Две тысячи ";
                break;
            case 3:
                word1 = "Три тысячи ";
                break;
            case 4:
                word1 = "Четыре тысячи ";
                break;
            case 5:
                word1 = "Пять тысяч ";
                break;
            case 6:
                word1 = "Шесть тысяч ";
                break;
            case 7:
                word1 = "Семь тысяч ";
                break;
            case 8:
                word1 = "Восемь тысяч ";
                break;
            case 9:
                word1 = "Девять тысяч ";
                break;
            default:
                word1 = "";

        }
        //2 word
        switch (Math.round(chislo / 100 % 10)) {
            case 1:
                word2 = "сто ";
                break;
            case 2:
                word2 = "двесте ";
                break;
            case 3:
                word2 = "триста ";
                break;
            case 4:
                word2 = "четыреста ";
                break;
            case 5:
                word2 = "пятьсот";
                break;
            case 6:
                word2 = "шестьсот";
                break;
            case 7:
                word2 = "семьсот";
                break;
            case 8:
                word2 = "восемьсот";
                break;
            case 9:
                word2 = "девятьсот";
                break;
            default:
                word2 = "";

        }
        //3 word
        switch (Math.round(chislo / 10 % 10)) {
            case 1:
                word3 = "десять ";
                break;
            case 2:
                word3 = "двадцать ";
                break;
            case 3:
                word3 = "тридцать ";
                break;
            case 4:
                word3 = "сорок ";
                break;
            case 5:
                word3 = "пятьдесят";
                break;
            case 6:
                word3 = "шестьдесят ";
                break;
            case 7:
                word3 = "семьдесят ";
                break;
            case 8:
                word3 = "восемьдесят ";
                break;
            case 9:
                word3 = "девятьдесят ";
                break;
            default:
                word3 = "";

        }
        //4 word
        switch (Math.round(chislo / 1 % 10)) {
            case 1:
                word4 = "один";
                break;
            case 2:
                word4 = "два";
                break;
            case 3:
                word4 = "три";
                break;
            case 4:
                word4 = "четыре";
                break;
            case 5:
                word4 = "пять";
                break;
            case 6:
                word4 = "шесть";
                break;
            case 7:
                word4 = "семь";
                break;
            case 8:
                word4 = "восемь";
                break;
            case 9:
                word4 = "девять";
                break;
            default:
                word4 = "";

        }
        String dollar;// скланения валюты
        if(Math.round(chislo / 1 % 10)==1)
        {
            dollar=" доллар";
        }
        else if(Math.round(chislo / 1 % 10)>1 && Math.round(chislo / 1 % 10)<5 )
        {
            dollar=" долларa";
        }
        else dollar=" долларов";
        if (Math.round(chislo / 10 % 10)==1)////// исключение
        { switch (Math.round(chislo / 1 % 10)) {
            case 1:
            {
                word4="";
                dollar="";
                word3 = "одиннадцать долларов";
            }
            break;
            case 2:
            {
                word4=""; dollar="";
                word3 = "двенадцать долларов";}
            break;
            case 3:
            {
                word4=""; dollar="";
                word3 = "тринадцать долларов";}
            break;
            case 4:
            {
                word4=""; dollar="";
                word3 = "четырнадцать долларов";}
            break;
            case 5:
            {
                word4=""; dollar="";
                word3 = "пятнадцать долларов";}
            break;
            case 6:
            {
                word4=""; dollar="";
                word3 = "шестнадцать долларов";}
            break;
            case 7:
            {
                word4=""; dollar="";
                word3 = "семнадцать долларов";}
            break;
            case 8:
            {
                word4=""; dollar="";
                word3 = "восемнадцать долларов";}
            break;
            case 9: {
                word4 = ""; dollar="";
                word3 = "девятнадцать долларов";
                break;
            }
        }
        }
        System.out.println(word1+word2+word3+word4+dollar);
    }
}

