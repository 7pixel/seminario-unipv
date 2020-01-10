package exercise05;

import org.junit.Test;

import java.time.Instant;
import java.time.temporal.ChronoUnit;

import static org.junit.Assert.assertEquals;

/**
 * Premessa: l'ultimo test non funziona perché lo sviluppatore si è dimenticato
 * di implementare l'ultima feature.
 * 
 * Dopo che il tempo è scaduto il timer dovrebbe continuare a segnare 00:00.
 * 
 * Obiettivo: Scommentare l'ultimo test e vedere che non passa e aggiustare 
 * il codice di produzione in modo che lo faccia.
 *
 * Attenzione: bisogna modificare il codice di produzione, non il test.
 */
public class TimerControllerTest {

    private final FakeClock clock = new FakeClock();
    private final Instant startTime = Instant.parse("2020-01-14T00:00:00Z");
    private final TimerController controller = new TimerController(
            clock,
            startTime,
            25);

    @Test
    public void atStart() {
        clock.adjustTo(startTime);

        assertEquals("25:00", controller.display());
    }

    @Test
    public void afterTenMinutes() {
        clock.adjustTo(startTime.plus(10, ChronoUnit.MINUTES));

        assertEquals("15:00", controller.display());
    }

    @Test
    public void atTheDuration() {
        clock.adjustTo(startTime.plus(25, ChronoUnit.MINUTES));

        assertEquals("00:00", controller.display());
    }

//    @Test
//    public void atTheDurationShouldStopCountingDown() {
//        clock.adjustTo(startTime.plus(26, ChronoUnit.MINUTES));
//
//        assertEquals("00:00", controller.display());
//    }
//
}
