package exercise05;

import java.time.Instant;

public class FakeClock implements Clock {

    private Instant now;

    @Override
    public Instant now() {
        return now;
    }

    public void adjustTo(Instant now) {
        this.now = now;
    }
}
