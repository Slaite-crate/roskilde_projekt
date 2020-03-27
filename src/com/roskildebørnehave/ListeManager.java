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
        int ID = barnListe.size() + 1;
        barnListe.add(new Barn(ID, navn, cpr, venteliste));
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
            System.out.println("børneliste gemt");
        } catch (IOException e){

        }
    }



    public void læsBarnListeFil(){
        try {
            File barnFil = new File("BarnListe.txt");
            Scanner reader = new Scanner(barnFil);
            int ID;
            String navn;
            String cprNummer;
            int alder;
            boolean venteliste;
            String tilføjelsesDato;
            while (reader.hasNextLine()) {
                navn = "";
                ID = reader.nextInt();
                while (reader.hasNext() && !reader.hasNextInt()) {
                    navn += reader.next() + " ";
                }
                navn = navn.substring(0, navn.length() - 1);
                cprNummer = reader.next();
                alder = reader.nextInt();
                venteliste = reader.nextBoolean();
                tilføjelsesDato = reader.next();
                barnListe.add(new Barn(ID, navn, cprNummer, alder, venteliste, tilføjelsesDato));
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
            int ID;
            String navn;
            while (reader.hasNextLine()){
                ID = reader.nextInt();
                navn = reader.next();
                forælderListe.add(new Forælder(ID, navn));
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
            int barnID;
            int forælderID;
            Barn barn = null;
            Forælder forælder = null;
            while (reader.hasNextLine()) {
                barnID = reader.nextInt();
                forælderID = reader.nextInt();
                for (Barn a : barnListe){
                    if (a.getID() == barnID){
                        barn = a;
                    }
                }
                for (Forælder a : forælderListe){
                    if (a.getID() == forælderID){
                        forælder = a;
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
