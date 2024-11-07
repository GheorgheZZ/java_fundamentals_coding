package org.example.ex3;

// apartament cu 3 camere
public class Apartament {
    // variabile GLOBALE
    private String internet;
    private String curentElectric;

    public void dormitor() {
        // variable LOCALE
        String pat ="pat";
        String noptiera = "noptiera";
        String dressing = "dressing";

        System.out.println(pat);
        System.out.println(noptiera);
        System.out.println(dressing);

        System.out.println(internet);
        System.out.println(curentElectric);
    }

    public void bucatarie() {
//        System.out.println(pat);

        boolean avemCamara = true;

        String cuptor = "Electrolux";

        // camara
        if(avemCamara == true) {
            int numarBorcareMuraturi = 100;

            System.out.println(cuptor);

        }

        // frigider
        while(" ".equals("frigider")) {
            int numarLegume = 10;

        }
        int i = 0;
        for(; i < 10; i++) {
            System.out.println(i);
        }
        // nu este vizibil in afara lui for
        System.out.println(i);

        System.out.println(internet);
        System.out.println(curentElectric);

    }

    public void living() {
        String canapea;
        String tv;

        System.out.println(internet);
        System.out.println(curentElectric);
    }

    // semnatura metodei (parametru)
    public void birou(String scaun) {
        String desktop;
        String masaDeLucru;

        System.out.println(internet);
        System.out.println(curentElectric);

        for(int i = 0; i < 4; i++) {
            int number = 19;

            System.out.println(scaun);
        }
//        nu este vizibil in afara blocului de cod al for-ului
//        System.out.println(number);
    }
}
