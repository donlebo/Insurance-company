package com.company;

import java.util.Objects;

public class Vita extends Assicurazione{
    private String nomeAss;
    private String cognomeAss;
    private String sessoAss;
    private String dataAss;

    public Vita(int id, String nomeAss, String cognomeAss, String sessoAss, String dataAss) {
        super(id);
        this.nomeAss = nomeAss;
        this.cognomeAss = cognomeAss;
        this.sessoAss = sessoAss;
        this.dataAss = dataAss;
    }

    public String getNomeAss() {
        return nomeAss;
    }

    public void setNomeAss(String nomeAss) {
        this.nomeAss = nomeAss;
    }

    public String getCognomeAss() {
        return cognomeAss;
    }

    public void setCognomeAss(String cognomeAss) {
        this.cognomeAss = cognomeAss;
    }

    public String getSessoAss() {
        return sessoAss;
    }

    public void setSessoAss(String sessoAss) {
        this.sessoAss = sessoAss;
    }

    public String getDataAss() {
        return dataAss;
    }

    public void setDataAss(String dataAss) {
        this.dataAss = dataAss;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Vita)) return false;
        if (!super.equals(o)) return false;
        Vita vita = (Vita) o;
        return getNomeAss().equals(vita.getNomeAss()) && getCognomeAss().equals(vita.getCognomeAss()) && getSessoAss().equals(vita.getSessoAss()) && getDataAss().equals(vita.getDataAss());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getNomeAss(), getCognomeAss(), getSessoAss(), getDataAss());
    }

    @Override
    public String toString() {
        return "Vita{" +
                "id=" + id +
                ", nomeAss='" + nomeAss + '\'' +
                ", cognomeAss='" + cognomeAss + '\'' +
                ", sessoAss='" + sessoAss + '\'' +
                ", dataAss='" + dataAss + '\'' +
                '}';
    }
}
