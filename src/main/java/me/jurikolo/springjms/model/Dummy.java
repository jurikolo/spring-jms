package me.jurikolo.springjms.model;

import java.util.Objects;

public class Dummy {
    private String whatever;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dummy dummy = (Dummy) o;
        return Objects.equals(whatever, dummy.whatever);
    }

    @Override
    public int hashCode() {
        return Objects.hash(whatever);
    }

    public String getWhatever() {
        return whatever;
    }

    public void setWhatever(String whatever) {
        this.whatever = whatever;
    }
}
