package observer;

import java.util.Observable;
import java.util.Observer;
import javax.swing.JFrame; 
import javax.swing.JTextField;

class Zuhoerer_1 extends JFrame implements Observer{ 
    
    private JTextField field1; 
     
    public Zuhoerer_1(){ 
        field1 = new JTextField("a"); 
        add(field1); 
         
        setTitle("Zuhoerer 1"); 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        setSize(300, 100); 
        setVisible(true);
    } 
     
    public void update(Observable o, Object arg) { 
        field1.setText((String) arg); 
    } 
} 