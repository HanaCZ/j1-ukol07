package cz.czechitas.ukol07;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class KnihaSluzba {
    private List<Kniha> seznamKnih;

    public KnihaSluzba() {
        try (InputStream inputStream = KnihaSluzba.class.getResourceAsStream("knihy.json")) {
            ObjectMapper objectMapper = new ObjectMapper();
            seznamKnih = objectMapper.readValue(inputStream, new TypeReference<List<Kniha>>() {
            });
        } catch (IOException e) {
            System.out.println("ERR: Soubor neexistuje!.");
            throw new RuntimeException(e);
        }
    }

    public List<Kniha> getSeznamKnih() {
        return seznamKnih;
    }

    public void setSeznamKnih(List<Kniha> seznamKnih) {
        this.seznamKnih = seznamKnih;
    }

    public List<Kniha> ziskejSeznamVsechKnih() {
        return seznamKnih;
    }

    public List<Kniha> najdiKnihyPodleAutora(String autor) {
        return seznamKnih.stream()
                .filter(kniha -> kniha.getAutor().equals(autor))
                .toList();
    }

    public List<Kniha> najdiKnihyPodleRoku(int rokVydani) {
        return seznamKnih.stream()
                .filter(kniha -> kniha.getRokVydani() == rokVydani)
                .toList();
    }

    @Override
    public String toString() {
        return "KnihaSluzba(" +
                "seznam všech knih = " + seznamKnih +
                ")";

    }
}
