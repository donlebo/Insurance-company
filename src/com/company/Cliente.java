package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Cliente {
    private String nome;
    private String cognome;
    private String dataDinascita;
    private String sesso;
    private String cf;
    private List<Contratto> contratti;

    public Cliente(String nome, String cognome, String dataDinascita, String sesso, String cf, List<Contratto> contratti) {
        this.nome = nome;
        this.cognome = cognome;
        this.dataDinascita = dataDinascita;
        this.sesso = sesso;
        this.cf = cf;
        this.contratti = contratti;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getDataDinascita() {
        return dataDinascita;
    }

    public void setDataDinascita(String dataDinascita) {
        this.dataDinascita = dataDinascita;
    }

    public String getSesso() {
        return sesso;
    }

    public void setSesso(String sesso) {
        this.sesso = sesso;
    }

    public String getCf() {
        return cf;
    }

    public void setCf(String cf) {
        this.cf = cf;
    }

    public List<Contratto> getContratti() {
        return contratti;
    }

    public void setContratti(List<Contratto> contratti) {
        this.contratti = contratti;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cliente)) return false;
        Cliente cliente = (Cliente) o;
        return getNome().equals(cliente.getNome()) && getCognome().equals(cliente.getCognome()) && getDataDinascita().equals(cliente.getDataDinascita()) && getSesso().equals(cliente.getSesso()) && getCf().equals(cliente.getCf()) && getContratti().equals(cliente.getContratti());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNome(), getCognome(), getDataDinascita(), getSesso(), getCf(), getContratti());
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", dataDinascita='" + dataDinascita + '\'' +
                ", sesso='" + sesso + '\'' +
                ", cf='" + cf + '\'' +
                ", contratti=" + contratti +
                '}';
    }
}
