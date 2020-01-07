package exercise05;

import org.junit.Test;

import java.time.Instant;
import java.time.temporal.ChronoUnit;

import static org.junit.Assert.assertEquals;

/**
 * Obiettivo: l'ultimo test non funziona a causa di un baco, scommentarlo,
 * vedere che non passa, e aggiustare il codice di produzione in modo che il
 * test passi.
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
