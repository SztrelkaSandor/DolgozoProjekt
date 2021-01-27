package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

public class Feladatok {
    private ArrayList<Dolgozok> dolgozok = new ArrayList<>();
    public Feladatok(){
    Beolvas();
    Harmas();
    Negyes();
    Ot();
    Hat();
    }
    private void Harmas(){
    int dolgozokSzama= dolgozok.size();
        System.out.printf("3. Feladat: Dolgozok száma: %d ",dolgozokSzama);
    }
    private void Negyes(){
    int osszfizetes=0;

        for (int i = 0; i <dolgozok.size() ; i++) {

            if (dolgozok.get(i).eletkor<25 ) {
            osszfizetes+=dolgozok.get(i).fizetes;
            }
        }
        System.out.printf("4. feladat: 25 év alattiak összfizetése: %d",osszfizetes);
    }
    private void Ot(){
    int max=0;
    int aktualis=0;
        for (int i = 0; i < dolgozok.size(); i++) {
            aktualis=dolgozok.get(i).fizetes;
            if (max<aktualis) {
            max=aktualis;
            }
        System.out.printf();
        }
        if (dolgozok.get().fizetes==max){

        }
    }
    private void Hat() {

        Scanner sc = new Scanner(System.in);
        System.out.print("6. Feladat: Kérek egy karaktert: ");
        String bekertAdat = sc.nextLine();
        for (int i = 0; i < dolgozok.size(); i++) {
            if (dolgozok.get(i).fizetes > bekertAdat) {


                System.out.printf("Van olyan dolgozó, akinek a fizetése %s Ft felett van", bekertAdat);
                break;
            } else {
                System.out.println("Nem található a nagyobb fizetés!");
            }


        }
    }
    private void Beolvas(){
        try {
            BufferedReader r = new BufferedReader(new FileReader("adatok.txt"));
            String sor = r.readLine();
            while (sor != null) {
                dolgozok.add(new Dolgozok(sor));
                sor= r.readLine();
            }
            r.close();
        }catch (IOException e){
            e.getMessage();
        }


    }
}
