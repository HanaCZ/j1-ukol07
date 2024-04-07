package cz.czechitas.ukol07;

import java.util.Objects;

public class Kniha {
    private String autor;
    private String nazev;
    private int rokVydani;

    public Kniha(String autor, String nazev, int rokVydani) { // Konstruktor
        this.autor = autor;
        this.nazev = nazev;
        this.rokVydani = rokVydani;
    }

    public Kniha() {
    }

    public String getNazev() {
        return nazev;
    }

    public void setNazev(String nazev) {
        Objects.requireNonNull(nazev);
        if (nazev.isBlank()) {
            System.err.println("Název nemůže být prázdný.");
        }
        this.nazev = nazev;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        Objects.requireNonNull(autor);
        if (autor.isBlank()) {
            System.err.println("Autor nemůže být prázdný.");
        }
        this.autor = autor;
    }

    public int getRokVydani() {
        return rokVydani;
    }

    public void setRokVydani(int rokVydani) {
        if (rokVydani <= 0) {
            System.out.println("ERR: Rok vydání musí být kladné celé číslo.");
        }
        this.rokVydani = rokVydani;
    }
    @Override
    public String toString() {
        return "Kniha (autor: " + autor +
                ", nazev: " + nazev +
                ", rok vydání: " + rokVydani +
                ")";
    }
}
