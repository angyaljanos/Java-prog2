package Kasszino;

import java.util.ArrayList;
import java.util.Random;

public class Asztal {
    private double tet;
    private int kor;
    private double goal;
    ArrayList<Jatekos> jatekosok;

    public Asztal(){
        Random r = new Random();
        goal = r.nextDouble()*100;
        kor = 0;
        tet = 0;
    }
    public void addJatekos(Jatekos j){
        if(jatekosok.size() < 10)
            jatekosok.add(j);
    }

    public void ujJatek(){
        tet = 0;
        goal = new Random().nextDouble() * 100;
    }

    public void kor(){
        if(tet < goal) {
            int i;
            for(i = 0; i < jatekosok.size(); i++){
                jatekosok.get(i).lep();
            }
            System.out.println("Currently in : " + kor + " and " + tet + "currency");
            //if((double))

        }
        else
            System.out.println("Vége a játéknak");
    }

    public void emel(double osszeg){
        tet += osszeg;
    }

    public double getTet() {
        return tet;
    }

    public int getKor() {
        return kor;
    }
}
