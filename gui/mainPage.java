package gui;
import javax.swing.*;
import java.awt.event.*;

public class mainPage extends JFrame implements ActionListener{
    JFrame frame = new JFrame();
    JButton WorkButton = new JButton("Work");
    JButton SmallTasksButton = new JButton("Small tasks");
    JButton ExitButton = new JButton("Exit");

    mainPage(){
        init();
    }

    void init(){

        WorkButton.setBounds(50,170,100,60);
        WorkButton.setFocusable(false);
        WorkButton.addActionListener(this);

        SmallTasksButton.setBounds(250,170,100,60);
        SmallTasksButton.setFocusable(false);
        SmallTasksButton.addActionListener(this);

        frame.add(WorkButton);
        frame.add(SmallTasksButton);
        

        frame.setTitle("Task List");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(690,1080);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        mainPage page = new mainPage();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        if(e.getSource() == WorkButton) {
            WorkWindow WorkFrame = new WorkWindow();
        }
    }
}
