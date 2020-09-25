package Kasszino;

public abstract class Jatekos {
    protected Asztal asztal;
    public void lep(){
        System.out.println("kör"+asztal.getKor() +" Tét:" + asztal.getTet());
    }
    public void setAsztal(Asztal asztal) {
        this.asztal = asztal;
    }
}
