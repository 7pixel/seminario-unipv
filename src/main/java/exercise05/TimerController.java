package exercise05;

import java.time.Instant;

public class TimerController {
    private final Clock clock;
    private final Instant startTime;
    private final long durationInSeconds;

    public TimerController(Clock clock, Instant startTime, long durationInMinutes) {
        this.startTime = startTime;
        this.durationInSeconds = durationInMinutes * 60;
        this.clock = clock;
    }

    public String display() {
        Instant now = clock.now();
        long timePassedMilli = now.toEpochMilli() - startTime.toEpochMilli();
        long timePassed = timePassedMilli / 1000;
        long remainingTime = durationInSeconds - timePassed;
        long minutes = remainingTime / 60;
        long seconds = remainingTime % 60;
        return String.format("%02d:%02d", minutes, seconds);
    }
}
