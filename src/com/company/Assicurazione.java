package com.company;

import java.util.Objects;

public class Assicurazione {
    int id;

    public Assicurazione(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Assicurazione)) return false;
        Assicurazione that = (Assicurazione) o;
        return getId() == that.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    @Override
    public String toString() {
        return "Assicurazione{" +
                "id=" + id +
                '}';
    }
}
