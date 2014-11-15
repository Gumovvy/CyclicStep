package com.gmv.cyclicstep;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by gumovvy on 15.11.14.
 */
public class GUIofApplication extends JFrame implements ActionListener {
    JPanel firstPanel = new JPanel();
    JPanel secondPanel = new JPanel();
    JButton oblicz = new JButton("Oblicz");
    boolean visible = true;


    public GUIofApplication() {
        defaultView();
        labelsView();
        textFieldsView();
        buttonsView();
        viewPanels();


    }

    private void viewPanels() {
        firstPanel.setLayout(null);
        firstPanel.setBounds(0, 0, 1000, 130);
        firstPanel.setBorder(BorderFactory.createBevelBorder(1));
        add(firstPanel);
        secondPanel.setLayout(null);
        secondPanel.setBounds(0, 131, 1000, 150);
        secondPanel.setBorder(BorderFactory.createBevelBorder(1));
        add(secondPanel);
    }

    private JButton buttonsView() {

        oblicz.setBounds(10, 100, 80, 25);
        oblicz.addActionListener(this);
        firstPanel.add(oblicz);
        return oblicz;
    }

    private void textFieldsView() {
        JTextField tflenghtOfStep = new JTextField("");
        JTextField tfDistance = new JTextField("");
        JTextField tfTimeToBeatinMinutes = new JTextField("");
        JTextField tfTimeToBeatinSeconds = new JTextField("");
        tflenghtOfStep.setBounds(160, 10, 165, 25);
        tfDistance.setBounds(160, 40, 165, 25);
        tfTimeToBeatinMinutes.setBounds(195, 70, 45, 25);
        tfTimeToBeatinSeconds.setBounds(280, 70, 45, 25);
        firstPanel.add(tflenghtOfStep);
        firstPanel.add(tfDistance);
        firstPanel.add(tfTimeToBeatinMinutes);
        firstPanel.add(tfTimeToBeatinSeconds);
    }

    private void labelsView() {
        JLabel lLenghtOfStep = new JLabel("Dlugosc Kroku: ");
        JLabel lDistance = new JLabel("Distance: ");
        JLabel lTimeToBeat = new JLabel("Czas do pokonania: ");
        JLabel lPodsumowanie = new JLabel("Podsumowanie");
        JLabel lTimeToBeatinMinutes = new JLabel("min.");
        JLabel lTimeToBeatSeconds = new JLabel("sec.");
        lLenghtOfStep.setBounds(5, 10, 150, 25);
        firstPanel.add(lLenghtOfStep);
        lDistance.setBounds(5, 40, 150, 25);
        firstPanel.add(lDistance);
        lTimeToBeat.setBounds(5, 70, 150, 25);
        firstPanel.add(lTimeToBeat);
        lTimeToBeatinMinutes.setBounds(160, 70, 40, 25);
        firstPanel.add(lTimeToBeatinMinutes);
        lTimeToBeatSeconds.setBounds(245, 70, 40, 25);
        firstPanel.add(lTimeToBeatSeconds);

    }


    private void defaultView() {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension resolution = toolkit.getScreenSize();
        int widthOfResolution = resolution.width;
        int heightOfResolution = resolution.height;
        setSize(widthOfResolution / 3, heightOfResolution / 3);
        setLocation(widthOfResolution / 3, heightOfResolution / 3);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Cyclic Step");
        setLayout(null);
        setResizable(false);
        secondPanel.setVisible(false);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();

        if (source == oblicz) {
            System.out.println(visible + " przed");
            if (visible == true) {
                secondPanel.setVisible(true);
                System.out.println("Siema");
                visible = false;
                System.out.println(visible + " wPO");
            } else if (visible == false) {

                secondPanel.setVisible(false);
                System.out.println("Siema1");
                visible = true;
            }

        }

    }
}
