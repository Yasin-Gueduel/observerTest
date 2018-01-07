package observer;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Observable;

import javax.swing.JFrame; 
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;

class Erzaehler extends Observable implements ActionListener{ 
	
	JFrame f = new JFrame("Text Show");
	TextField tf = new TextField("", 30);
	Observable mclass = new Observable();
	JPanel mypanel = new JPanel();
	JLabel mylabel = new JLabel();
	JButton mybutton = new JButton("OK");
	
	
    public Erzaehler(){
        addObserver(new Zuhoerer_1());
        mylabel.setText("Gib etwas ein: ");
        mypanel.add(mylabel);
        mypanel.add(tf);
        mypanel.add(mybutton);
        f.add(mypanel);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setTitle("Eingabe");
        f.setSize(400, 250);
        f.setVisible(true);
        tf.addKeyListener(new KeyListener(){

			@Override
			public void keyPressed(KeyEvent arg0) {
				// TODO Auto-generated method stub
				tell(tf.getText());
			}

			@Override
			public void keyReleased(KeyEvent arg0) {
				// TODO Auto-generated method stub
				tell(tf.getText());
			}

			@Override
			public void keyTyped(KeyEvent arg0) {
				// TODO Auto-generated method stub
				
			}
        	
        });
    }
    
    public void tell(String info){ 
        if(countObservers()>0){ 
            setChanged(); 
            notifyObservers(info);
        } 
    }

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
} 