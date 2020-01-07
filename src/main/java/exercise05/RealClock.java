package exercise05;

import java.time.Instant;

public class RealClock implements Clock
{
    @Override
    public Instant now() {
        return Instant.now();
    }
}
