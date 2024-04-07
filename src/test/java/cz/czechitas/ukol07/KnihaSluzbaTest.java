package cz.czechitas.ukol07;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class KnihaSluzbaTest {

    @Test
    void ziskejSeznamVsechKnih() {
        KnihaSluzba knihaSluzba = new KnihaSluzba();
        assertEquals(14, knihaSluzba.getSeznamKnih().size());
    }

    @Test
    void najdiKnihyPodleAutora() {
        KnihaSluzba knihaSluzba = new KnihaSluzba();
        List<Kniha> knihyOdZadanehoAutora = knihaSluzba.najdiKnihyPodleAutora("Karel Čapek");
        assertEquals(5, knihyOdZadanehoAutora.size());

        knihyOdZadanehoAutora = knihaSluzba.najdiKnihyPodleAutora("Božena Němcová");
        assertEquals(4, knihyOdZadanehoAutora.size());

        knihyOdZadanehoAutora = knihaSluzba.najdiKnihyPodleAutora("Neznámý autor");
        assertEquals(0, knihyOdZadanehoAutora.size());
    }

    @Test
    void najdiKnihyPodleRoku() {
        KnihaSluzba knihaSluzba = new KnihaSluzba();
        int resultpocetKnih1845 = knihaSluzba.najdiKnihyPodleRoku(1845).size();
        assertEquals(2, resultpocetKnih1845);
        assertEquals(0, knihaSluzba.najdiKnihyPodleRoku(1250).size());
    }
}