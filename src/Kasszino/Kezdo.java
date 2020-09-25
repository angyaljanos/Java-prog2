package Kasszino;

public class Kezdo extends Jatekos{
    private String nev;

    public Kezdo(String nev){
        this.nev = nev;
    }
    public Kezdo(){
        nev = "randomstring\\0";
    }
    public void lep(){
        if(asztal.getKor()%2 == 0)
            asztal.emel(1);
    }

    @Override
    public String toString() {
        return nev + " " + asztal.getKor();
    }
}
