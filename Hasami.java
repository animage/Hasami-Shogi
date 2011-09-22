
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;

class Hasami extends JFrame{

    DrawPanel dp;

    public Hasami(){
		makeGUI();
	}

    void makeGUI(){
		setTitle("Hasami-Shogi");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setFocusable(true);
		dp = new DrawPanel();
	    
		add(dp,BorderLayout.CENTER);
		pack();
		setSize(1000,1000);
	}

    public static void main(String[] args){
        Hasami h = new Hasami();
    }
}


class DrawPanel extends JPanel{


	public DrawPanel(){
            
	}

	public void paintComponent(Graphics g){
		g.setColor(Color.white);
		g.fillRect(0,0,1000,1000);
		g.setColor(Color.black);
	}
}



