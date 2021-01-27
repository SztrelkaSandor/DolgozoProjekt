package com.company;

import java.util.ArrayList;


public class Dolgozok {
        public ArrayList<String> vezetekNev;
        public ArrayList<String> keresztNev;
        public ArrayList<String> nem;
        public ArrayList<String> eletkor;
        public ArrayList<String> fizetes;
        public ArrayList<String> toltelek;


        public Dolgozok(String sor){
            String [] adatok= sor.split(" ");
            this.vezetekNev= dolgozoAdatok(adatok[0]);
            this.keresztNev= dolgozoAdatok(adatok[1]);
            this.nem= dolgozoAdatok(adatok[2]);
            this.eletkor= dolgozoAdatok(adatok[3]);
            this.fizetes= dolgozoAdatok(adatok[4]);
            this.toltelek= dolgozoAdatok(adatok[5]);

        }


        public ArrayList<String> dolgozoAdatok(String szoveg){
            ArrayList<String> s= new ArrayList<>();
            String [] adatok= szoveg.split(" ");
            for (int i = 0; i < adatok.length; i++) {
                s.add(adatok[i]);
            }
            return s;
        }





    }
