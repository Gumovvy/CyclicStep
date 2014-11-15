package com.gmv.cyclicstep;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by gumovvy on 15.11.14.
 */
public class GUIofApplication extends JFrame implements ActionListener {
    JPanel panel1 = new JPanel();
    JButton oblicz = new JButton("Oblicz");


    public GUIofApplication() {
        defaultView();
        labelsView();
        textFieldsView();
        buttonsView();

        panel1.setLayout(null);
        panel1.setBounds(0, 0, 1000, 150);
        panel1.setBorder(BorderFactory.createBevelBorder(1));
        add(panel1);

    }

    private JButton buttonsView() {

        oblicz.setBounds(10, 100, 80, 25);
        oblicz.addActionListener(this);
        panel1.add(oblicz);
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
        panel1.add(tflenghtOfStep);
        panel1.add(tfDistance);
        panel1.add(tfTimeToBeatinMinutes);
        panel1.add(tfTimeToBeatinSeconds);
    }

    private void labelsView() {
        JLabel lLenghtOfStep = new JLabel("Dlugosc Kroku: ");
        JLabel lDistance = new JLabel("Distance: ");
        JLabel lTimeToBeat = new JLabel("Czas do pokonania: ");
        JLabel lPodsumowanie = new JLabel("Podsumowanie");
        JLabel lTimeToBeatinMinutes = new JLabel("min.");
        JLabel lTimeToBeatSeconds = new JLabel("sec.");
        lLenghtOfStep.setBounds(5, 10, 150, 25);
        panel1.add(lLenghtOfStep);
        lDistance.setBounds(5, 40, 150, 25);
        panel1.add(lDistance);
        lTimeToBeat.setBounds(5, 70, 150, 25);
        panel1.add(lTimeToBeat);
        lTimeToBeatinMinutes.setBounds(160, 70, 40, 25);
        panel1.add(lTimeToBeatinMinutes);
        lTimeToBeatSeconds.setBounds(245, 70, 40, 25);
        panel1.add(lTimeToBeatSeconds);
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
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source == oblicz) {
            panel1.setVisible(false);
            System.out.println("Siema");

        }

    }
}
