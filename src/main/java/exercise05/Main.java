package exercise05;

import javax.swing.*;
import java.awt.*;
import java.time.Instant;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(new Dimension(100, 50));
        JLabel label = new JLabel("00:00");
        frame.add(label);
        frame.setVisible(true);
        TimerController controller = new TimerController(new RealClock(), Instant.now(), 25);
        ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();
        service.scheduleAtFixedRate(new Runnable() {
                                        @Override
                                        public void run() {
                                            SwingUtilities.invokeLater(new Runnable() {
                                                @Override
                                                public void run() {
                                                    label.setText(controller.display());
                                                }
                                            });
                                        }
                                    },
                0,
                500,
                TimeUnit.MILLISECONDS
        );
    }

}
