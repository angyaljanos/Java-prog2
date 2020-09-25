import Kasszino.*;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        Jatekos[] jatekosok = {new Kezdo("Elso"), new Kezdo("Masodik"), new Robot()};
        for (int i = 0; i < 3; i++) {
            for (Jatekos j : jatekosok)
                j.lep();

        }

    }
}
