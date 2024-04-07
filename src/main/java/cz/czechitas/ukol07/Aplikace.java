package cz.czechitas.ukol07;

/**
 * Spouštěcí třída aplikace
 */
public class Aplikace {
    public static void main(String[] args) {
        KnihaSluzba seznamKnih = new KnihaSluzba();
        System.out.println("Celkový počet knih je " + seznamKnih.ziskejSeznamVsechKnih().size() + ".");

        System.out.println("Od Karla Čapka máme v databázi tyto knihy:");
        seznamKnih.najdiKnihyPodleAutora("Karel Čapek").forEach(kniha -> System.out.println(kniha.getNazev()));

        System.out.println("V databázi evidujeme tyto knihy z roku 1845:");
        seznamKnih.najdiKnihyPodleRoku(1845).forEach(kniha -> System.out.println(kniha.getAutor() + ": " + kniha.getNazev()));
    }
}
