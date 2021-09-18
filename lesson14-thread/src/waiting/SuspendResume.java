package waiting;

import utils.ImageUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Objects;
import java.util.Random;

public class SuspendResume extends JFrame implements Runnable {

    private static final long serialVersionUID = 6902019894061644082L;
    private static final String TITLE = "Ex04 - Image Random";
    private static Thread thread;
    private final String path = "/images/";
    public Random rd = new Random();
    String[] imagesName = {"1.jpg", "2.jpg", "3.jpg", "4.jpg", "5.jpg", "6.jpg", "7.jpg", "8.jpg", "9.jpg", "10.jpg", "11.jpg", "12.jpg", "13.jpg", "14.jpg"};
    int W = 500;
    int H = 500;
    private int counter = 0;
    private final Container conn = this.getContentPane();
    private JLabel picLabel;
    private JButton btStop;
    private JButton btResume;
    private final Color highlightButton = Color.ORANGE;

    public SuspendResume() {
        this.setTitle(TITLE);
        this.setSize(W, H);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setIconImage(ImageUtils.createImage(ImageUtils.FLOWER_64PX, SuspendResume.class));
        conn.setLayout(null);
        initComponents();
        initEvent();
    }

    public static void main(String[] args) {
        // Runnable
        SuspendResume ex04 = new SuspendResume();
        ex04.setVisible(true);

        // Thread
        thread = new Thread(ex04);
        thread.start();
    }

    private void initEvent() {
        btStopEvent();
        btResumeEvent();
    }

    private void btStopEvent() {
        Color defaultColor = btStop.getBackground();
        btStop.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                thread.suspend();
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                btStop.setBackground(highlightButton);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                btStop.setBackground(defaultColor);
            }
        });
    }

    private void btResumeEvent() {
        btResume.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                thread.resume();
            }
        });
    }

    private void initComponents() {
        picLabel = new JLabel();
        int preferredWidth = 150;
        int preferredHeigth = 250;
        picLabel.setBounds((W - preferredWidth) / 2, 0, preferredWidth, preferredHeigth);
        Image image = new ImageIcon(getClass().getResource(ImageUtils.DEF_GHOST)).getImage();
        image = image.getScaledInstance(preferredWidth, preferredHeigth, Image.SCALE_SMOOTH);
        picLabel.setIcon(new ImageIcon(image));
        conn.add(picLabel);

        Font font = new Font("Arial", Font.BOLD, 20);
        btStop = new JButton("STOP");
        btStop.setFont(font);
        btStop.setFocusPainted(false);
        btStop.setCursor(new Cursor(Cursor.HAND_CURSOR));
        Dimension p2 = btStop.getPreferredSize();
        btStop.setBounds(120, 350, (int) p2.getWidth(), (int) p2.getHeight());
        conn.add(btStop);

        btResume = new JButton("Resume");
        btResume.setFont(font);
        btResume.setFocusPainted(false);
        btResume.setCursor(new Cursor(Cursor.HAND_CURSOR));
        Dimension p3 = btResume.getPreferredSize();
        btResume.setBounds(250, 350, (int) p3.getWidth(), (int) p3.getHeight());
        conn.add(btResume);

    }

    @Override
    public void run() {
        while (true) {
            System.out.println("Start " + counter++);
            int numRandom = rd.nextInt(imagesName.length);
            Image image = new ImageIcon(Objects.requireNonNull(getClass().getResource(path + imagesName[numRandom]))).getImage();
            image = image.getScaledInstance(190, 200, Image.SCALE_SMOOTH);
            picLabel.setIcon(new ImageIcon(image));
            try {
                Thread.sleep(300);
            } catch (InterruptedException ex) {
            }
            System.out.println("End " + counter++);
        }
    }
}
