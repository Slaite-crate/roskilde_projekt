package com.roskildebørnehave;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class ListeManager {
    private ArrayList<Barn> barnListe;
    private ArrayList<Forælder> forælderListe;
    private ArrayList<Forbindelse> forbindelseListe;

    public ListeManager(){
        barnListe = new ArrayList<>();
        forælderListe = new ArrayList<>();
        forbindelseListe = new ArrayList<>();

        læsBarnListeFil();
        læsForælderListeFil();
        læsForbindelseListeFil();
    }

    public void opretBarn(String navn, String cpr, boolean venteliste){
        barnListe.add(new Barn(navn, cpr, venteliste));
    }

    public void seBarnListe(){
        System.out.println(barnListe.toString());
    }

    public void søgBarn(String navn){
        for (Barn a : barnListe) {
            if (a.getNavn().toLowerCase().contains(navn.toLowerCase())) {
                System.out.println(a.toString());
            }
        }
    }

    public void tilføjBarn(Barn barn){
        barnListe.add(barn);
    }

    public void tilføjForælder(Forælder forælder){
        forælderListe.add(forælder);
    }

    public void tilføjForbindelse(Barn barn, Forælder forælder){
        forbindelseListe.add(new Forbindelse(barn, forælder));
    }

    public void gemBarnListe(){
        //opretter tekst documentet
        try {
            File myObj = new File("BarnListe.txt");
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        //gemmer tekst documentet
        try {
            FileWriter skrivBarnListe = new FileWriter("BarnListe.txt");
            String gemTilFil = "";
            for (int i = 0; i < barnListe.size(); i++){
                if (i == 0){
                    gemTilFil += barnListe.get(i).gemTilFil();
                } else {
                    gemTilFil += "\n" + barnListe.get(i).gemTilFil();
                }
            }
            skrivBarnListe.write(gemTilFil);
            skrivBarnListe.close();
        } catch (IOException e){
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public void gemForælderListe(){
        //opretter tekst documentet
        try {
            File myObj = new File("ForælderListe.txt");
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        //gemmer tekst documentet
        try {
            FileWriter skrivForælderListe = new FileWriter("ForælderListe.txt");
            String gemTilFil = "";
            for (int i = 0; i < forælderListe.size(); i++){
                if (i == 0){
                    gemTilFil += forælderListe.get(i).gemTilFil();
                } else {
                    gemTilFil += "\n" + forælderListe.get(i).gemTilFil();
                }
            }
            skrivForælderListe.write(gemTilFil);
            skrivForælderListe.close();
        } catch (IOException e){
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public void gemForbindelseListe(){
        //opretter tekst documentet
        try {
            File myObj = new File("ForbindelseListe.txt");
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        //gemmer tekst documentet
        try {
            FileWriter skrivForbindelseListe = new FileWriter("ForælderListe.txt");
            String gemTilFil = "";
            for (int i = 0; i < forbindelseListe.size(); i++){
                if (i == 0){
                    gemTilFil += forbindelseListe.get(i).gemTilFil();
                } else {
                    gemTilFil += "\n" + forbindelseListe.get(i).gemTilFil();
                }
            }
            skrivForbindelseListe.write(gemTilFil);
            skrivForbindelseListe.close();
        } catch (IOException e){
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public void læsBarnListeFil(){
        try {
            File barnFil = new File("BarnListe.txt");
            Scanner reader = new Scanner(barnFil);
            String check;
            while (reader.hasNextLine()) {
                String navn = "";
                while (!reader.hasNext("%")) {
                    navn += reader.next() + " ";
                }
                navn = navn.substring(0, navn.length() - 1);
                check = reader.next();
                String cprNummer = reader.next();
                check = reader.next();
                int alder = reader.nextInt();
                check = reader.next();
                boolean venteliste = reader.nextBoolean();
                check = reader.next();
                String tilføjelsesDato = reader.next();
                barnListe.add(new Barn(navn, cprNummer, alder, venteliste, tilføjelsesDato));
            }
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public void læsForælderListeFil(){
        try {
            File forælderFil = new File("ForælderListe.txt");
            Scanner reader = new Scanner(forælderFil);
            String check;
            while (reader.hasNextLine()){
                String navn = "";
                while (!reader.hasNext("%")) {
                    navn += reader.next() + " ";
                }
                navn = navn.substring(0, navn.length() - 1);
                check = reader.next();
                String cprNummer = reader.next();
                check = reader.next();
                String adresse = "";
                while (!reader.hasNext("%")) {
                    adresse += reader.next() + " ";
                }
                adresse = adresse.substring(0, adresse.length() - 1);
                check = reader.next();
                int telfonnummer = reader.nextInt();
                forælderListe.add(new Forælder(navn, cprNummer, adresse, telfonnummer));
            }
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public void læsForbindelseListeFil(){
        try {
            File FB = new File("ForbindelseListe.txt");
            Scanner reader = new Scanner(FB);
            String check;
            while (reader.hasNextLine()) {
                Barn barn = null;
                Forælder forælder = null;
                String barnID = reader.next();
                check = reader.next();
                String forælderID = reader.next();
                for (Barn a : barnListe){
                    if (a.getCprNummer() == barnID){
                        barn = a;
                        break;
                    }
                }
                for (Forælder a : forælderListe){
                    if (a.getCprNummer() == forælderID){
                        forælder = a;
                        break;
                    }
                }
                if (barn != null && forælder != null) {
                    forbindelseListe.add(new Forbindelse(barn, forælder));
                }
            }
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
