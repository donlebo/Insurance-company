package com.company;

import java.util.Objects;

public class RC_auto extends Assicurazione{
    private String marca;
    private String modello;
    private int cilidrata;
    private int potenza;
    private String targa;

    public RC_auto(int id, String marca, String modello, int cilidrata, int potenza, String targa) {
        super(id);
        this.marca = marca;
        this.modello = modello;
        this.cilidrata = cilidrata;
        this.potenza = potenza;
        this.targa = targa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModello() {
        return modello;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }

    public int getCilidrata() {
        return cilidrata;
    }

    public void setCilidrata(int cilidrata) {
        this.cilidrata = cilidrata;
    }

    public int getPotenza() {
        return potenza;
    }

    public void setPotenza(int potenza) {
        this.potenza = potenza;
    }

    public String getTarga() {
        return targa;
    }

    public void setTarga(String targa) {
        this.targa = targa;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof RC_auto)) return false;
        if (!super.equals(o)) return false;
        RC_auto rc_auto = (RC_auto) o;
        return getCilidrata() == rc_auto.getCilidrata() && getPotenza() == rc_auto.getPotenza() && getMarca().equals(rc_auto.getMarca()) && getModello().equals(rc_auto.getModello()) && getTarga().equals(rc_auto.getTarga());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getMarca(), getModello(), getCilidrata(), getPotenza(), getTarga());
    }

    @Override
    public String toString() {
        return "RC_auto{" +
                "id=" + id +
                ", marca='" + marca + '\'' +
                ", modello='" + modello + '\'' +
                ", cilidrata=" + cilidrata +
                ", potenza=" + potenza +
                ", targa='" + targa + '\'' +
                '}';
    }
}
