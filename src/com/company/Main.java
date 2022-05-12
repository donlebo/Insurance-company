package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        RC_auto macchina = new RC_auto(1, "BMW", "Serie 1", 1800, 155, "DF364C");
        Vita vita = new Vita(2, "Frolletta", "Frollina", "f", "2-04-2001");
        Casa casa = new Casa(3, "Via nicolò da mineo", 120, "A2", 5, 3);

        Contratto veicolo = new Contratto(macchina, 1, "12-02-2019", "12-02-2020", 750);
        Contratto persona = new Contratto(vita, 2, "12-05-2019", "12-02-2028", 1000);
        Contratto abitazione = new Contratto(casa, 3, "12-08-2019", "12-02-2032", 10000);

        List<Contratto> contratti = new ArrayList<Contratto>();
        contratti.add(veicolo);
        contratti.add(persona);
        contratti.add(abitazione);

        Cliente Frollo = new Cliente("Frolletto", "Frollett", "27-04-1999", "M", "FRLLTTFRLT99F27F44670", contratti);

        int nContrattiRcAuto = 0;
        int nContrattiVita = 0;
        int nContrattiCasa = 0;

        for (Contratto contratto: contratti) {
            if (contratto.getAssicurazione() instanceof RC_auto){
                nContrattiRcAuto++;
            } else if (contratto.getAssicurazione() instanceof Vita){
                nContrattiVita++;
            } else if (contratto.getAssicurazione() instanceof Casa){
                nContrattiCasa++;
            }
        }

        System.out.println("Il cliente " + Frollo.getNome() + " " + Frollo.getCognome() + " ha " + Frollo.getContratti().size() + " contratti, di cui: " + nContrattiRcAuto + " RC AUTO, " + nContrattiVita + "VITA, " + nContrattiCasa + " CASA");
        for (Contratto contratto: contratti) {
            System.out.println("Contratto numero " + contratto.getnContratto() + " , assicurazione: " + contratto.getAssicurazione().toString());
        }
    }
}
