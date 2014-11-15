package com.gmv.cyclicstep;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by gumovvy on 15.11.14.
 */
public class GUIofApplication extends JFrame implements ActionListener {
    //panels
    JPanel firstPanel = new JPanel();
    JPanel secondPanel = new JPanel();
    //buttons
    JButton oblicz = new JButton("Oblicz");
    //text fields
    JTextField tflenghtOfStep = new JTextField("0");
    JTextField tfDistance = new JTextField("0");
    JTextField tfTimeToBeatinMinutes = new JTextField("0");
    JTextField tfTimeToBeatinSeconds = new JTextField("0");
    //labels
    JLabel lLenghtOfStep = new JLabel("Dlugosc Kroku: ");
    JLabel lDistance = new JLabel("Distance: ");
    JLabel lTimeToBeat = new JLabel("Czas do pokonania: ");
    JLabel lTimeToBeatinMinutes = new JLabel("min.");
    JLabel lTimeToBeatSeconds = new JLabel("sec.");
    JLabel lSummary = new JLabel("Podsumowanie:");
    JLabel lWarning = new JLabel("Invalid time");
    JLabel lSummaryBeatTime = new JLabel();
    JLabel lSummarySteps = new JLabel();
    //variables
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
        //First Panel

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
        firstPanel.add(lWarning);
        lWarning.setBounds(330, 15, 100, 25);
        lWarning.setVisible(false);
        //Second Panel

        lSummary.setBounds(5, 5, 150, 25);
        secondPanel.add(lSummary);
        lSummaryBeatTime.setBounds(5,25,250,25);
        secondPanel.add(lSummaryBeatTime);
        lSummarySteps.setBounds(5,40,250,25);
        secondPanel.add(lSummarySteps);

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
        allRequiredFunction aplication = new allRequiredFunction();
        float lengthOfStep = aplication.getLengthOfStep(Float.parseFloat(tflenghtOfStep.getText()));
        int distanceOfRun = aplication.getDistanceOfRunning(Integer.parseInt(tfDistance.getText()));
        int minutes = Integer.parseInt(tfTimeToBeatinMinutes.getText());
        int seconds = Integer.parseInt(tfTimeToBeatinSeconds.getText());
        aplication.finalTime(minutes, seconds);
        float steps = aplication.countOfStep(distanceOfRun,lengthOfStep);
        lSummaryBeatTime.setText("Chcesz pokonac czas: " + minutes + ":" + seconds);
        lSummarySteps.setText("Musisz zrobić " + steps + " krokow.");


        if (source == oblicz) {
            if (seconds < 60) {
                lWarning.setVisible(false);
                secondPanel.setVisible(true);
            } else {
                lWarning.setVisible(true);

            }

        }

    }
}
