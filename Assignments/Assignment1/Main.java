package Assignment1;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.math.RoundingMode;
import java.text.DecimalFormat;



public class Main{

	JTextField input1 = new JTextField();
	JTextField input2 = new JTextField();
	JTextField input3 = new JTextField();
	JTextField output4 = new JTextField();
	JFrame mainframe = new JFrame("Gravitational Energy");
	
	JLabel r = new JLabel("Mass: ");
	JLabel h = new JLabel("Height: ");
	JLabel g = new JLabel("G Field: ");
	JButton button = new JButton("Find gravitational energy. ");
	
	void showField() {
		input1.setBounds(140, 130, 60, 40);
		input2.setBounds(250, 130, 60, 40);
		input3.setBounds(370, 130, 60, 40);
		output4.setBounds(220, 280, 100, 40);
		r.setBounds(100, 130, 60, 40);
		g.setBounds(205, 130, 60, 40);
		h.setBounds(320, 130, 60, 40);
		button.setBounds(150, 200, 300, 50);
	
	button.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			String r,h,g;
			String result;
			
			r=input1.getText();
			h=input2.getText();
			g=input3.getText();
			
			double answer;
			double rad,hei,grav;
			
			rad= Double.parseDouble(r);
			hei=Double.parseDouble(h);
			grav=Double.parseDouble(g);
			
			DecimalFormat df = new DecimalFormat("#.#######");
	        df.setRoundingMode(RoundingMode.CEILING);
			
			answer = (grav*rad*hei);
			result=String.valueOf(df.format(answer));
			output4.setText(result);
			
			}
		});
		mainframe.add(button);
		mainframe.add(input1);
		mainframe.add(input2);
		mainframe.add(input3);
		mainframe.add(output4);
		mainframe.add(r);
		mainframe.add(h);
		mainframe.add(g);
		mainframe.setLayout(new BorderLayout());
		mainframe.setSize(600,500);
		mainframe.setVisible(true);
	}
}
