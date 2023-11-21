package exercise01;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class SomeAssertions {

    /**
     * Obiettivo 1: fai compilare questo test, aggiungi tutte le librerie
     * necessarie
     *
     * Obiettivo 2: esegui questo test: l'obiettivo è raggiunto solo se riesci
     * a vedere la barra verde di questo test
     */
    @Test
    public void example() {
        assertEquals(1,1);
    }


    /**
     * Obiettivo 1: vedere la prima barra rossa. Hai raggiunto l'obiettivo solo
     * dopo che hai lanciato tutti i test e vedi che solo questo non passa.
     * Devi trovare nel messaggio di errore il punto in cui dice che "1" è
     * diverso da "2".
     *
     * Obiettivo 2: fai passare questo test, cambia uno dei numeri e fallo
     * passare.
     *
     * Nota: su alcuni IDE per scommentare un blocco di codice si usa
     * CTRL+SHIFT+7 ( o CTRL+/ )
     */
//    @Test
//    public void redTest() {
//        assertEquals(1,2);
//    }


     /**
      * Obiettivo 1: vedere questo test rosso
      * Obiettivo 2: farlo passare scrivendo il risultato mancante
      */
//    @Test
//    public void somma() {
//        int result = 1+2;
//        assertEquals(-1,result);
//    }


    /**
     * Obiettivo 1: lanciare il test e vedere che indica che il metodo è
     * deprecato.
     * Obiettivo 2: correggere il test usando la versione di assertEquals
     * con la tolleranza
     * Obiettivo 3: spiegare perché il metodo è stato deprecato,
     * anche alla luce del risultato della chiamata ad assertTrue
     */
//    @Test
//    public void comparingFloatOrDoubles() {
//        double result = Math.sqrt(3*3 + 4*4);
//
//        assertEquals(5, result);
//        //assertEquals(5, result, 0.0001);
//        //assertTrue(12 * Math.sqrt(0.01) == 1.2);
//    }
}

