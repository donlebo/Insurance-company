package com.company;

import java.util.Objects;

public class Casa extends Assicurazione {
    private String indirizzo;
    private int mq;
    private String casta;
    private int vani;
    private int id;

    public Casa(int id, String indirizzo, int mq, String casta, int vani, int id1) {
        super(id);
        this.indirizzo = indirizzo;
        this.mq = mq;
        this.casta = casta;
        this.vani = vani;
        this.id = id1;
    }

    public String getIndirizzo() {
        return indirizzo;
    }

    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }

    public int getMq() {
        return mq;
    }

    public void setMq(int mq) {
        this.mq = mq;
    }

    public String getCasta() {
        return casta;
    }

    public void setCasta(String casta) {
        this.casta = casta;
    }

    public int getVani() {
        return vani;
    }

    public void setVani(int vani) {
        this.vani = vani;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Casa)) return false;
        if (!super.equals(o)) return false;
        Casa casa = (Casa) o;
        return getMq() == casa.getMq() && getVani() == casa.getVani() && getId() == casa.getId() && getIndirizzo().equals(casa.getIndirizzo()) && getCasta().equals(casa.getCasta());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getIndirizzo(), getMq(), getCasta(), getVani(), getId());
    }

    @Override
    public String toString() {
        return "Casa{" +
                "id=" + id +
                ", indirizzo='" + indirizzo + '\'' +
                ", mq=" + mq +
                ", casta='" + casta + '\'' +
                ", vani=" + vani +
                ", id=" + id +
                '}';
    }
}
