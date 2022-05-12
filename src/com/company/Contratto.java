package com.company;

import java.util.Objects;

public class Contratto {
    Assicurazione assicurazione;
    private int nContratto;
    private String dataInizio;
    private String dataFine;
    private double costo;

    public Contratto(Assicurazione assicurazione, int nContratto, String dataInizio, String dataFine, double costo) {
        this.assicurazione = assicurazione;
        this.nContratto = nContratto;
        this.dataInizio = dataInizio;
        this.dataFine = dataFine;
        this.costo = costo;
    }

    public Assicurazione getAssicurazione() {
        return assicurazione;
    }

    public void setAssicurazione(Assicurazione assicurazione) {
        this.assicurazione = assicurazione;
    }

    public int getnContratto() {
        return nContratto;
    }

    public void setnContratto(int nContratto) {
        this.nContratto = nContratto;
    }

    public String getDataInizio() {
        return dataInizio;
    }

    public void setDataInizio(String dataInizio) {
        this.dataInizio = dataInizio;
    }

    public String getDataFine() {
        return dataFine;
    }

    public void setDataFine(String dataFine) {
        this.dataFine = dataFine;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Contratto)) return false;
        Contratto contratto = (Contratto) o;
        return getnContratto() == contratto.getnContratto() && Double.compare(contratto.getCosto(), getCosto()) == 0 && getAssicurazione().equals(contratto.getAssicurazione()) && getDataInizio().equals(contratto.getDataInizio()) && getDataFine().equals(contratto.getDataFine());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getAssicurazione(), getnContratto(), getDataInizio(), getDataFine(), getCosto());
    }

    @Override
    public String toString() {
        return "Contratto{" +
                "assicurazione=" + assicurazione +
                ", nContratto=" + nContratto +
                ", dataInizio='" + dataInizio + '\'' +
                ", dataFine='" + dataFine + '\'' +
                ", costo=" + costo +
                '}';
    }
}
