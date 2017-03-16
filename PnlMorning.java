import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JToggleButton;
import java.awt.GridLayout;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.CardLayout;
import javax.swing.JTextField;

public class PnlMorning extends JPanel {
	CardLayout card;
	JPanel pnlParent;

	JFrame frm;
	/**
	 * Create the panel.
	 */
	public PnlMorning() {

		setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		add(panel, BorderLayout.WEST);
		panel.setLayout(new GridLayout(0, 1, 0, 0));
		
		JButton tglbtnKahvalt = new JButton("Kahvalt\u0131");

		panel.add(tglbtnKahvalt);
		
		JButton tglbtnIecekler = new JButton("\u0130\u00E7ecekler");

		panel.add(tglbtnIecekler);
		
		JPanel panel_Breakfast = new JPanel();
		panel_Breakfast.setLayout(null);
		
		JCheckBox chckbxYumurta = new JCheckBox("Egg");
		chckbxYumurta.setBounds(6, 7, 97, 23);
		panel_Breakfast.add(chckbxYumurta);	
		
	
		
		JPanel panel_Card = new JPanel();
		add(panel_Card, BorderLayout.CENTER);
		
		
		CardLayout card = new CardLayout(0, 0);
		panel_Card.setLayout(card);
		
		
		
		panel_Card.add("Breakfast", panel_Breakfast);
		
		JCheckBox chckbxCheese = new JCheckBox("Cheese");
		chckbxCheese.setBounds(6, 61, 97, 23);
		panel_Breakfast.add(chckbxCheese);
		
		JCheckBox chckbxOlive = new JCheckBox("Olive");
		chckbxOlive.setBounds(6, 114, 97, 23);
		panel_Breakfast.add(chckbxOlive);
		
		JCheckBox chckbxHoney = new JCheckBox("Honey");
		chckbxHoney.setBounds(6, 35, 97, 23);
		panel_Breakfast.add(chckbxHoney);
		
		JCheckBox chckbxjam = new JCheckBox("Jam");
		chckbxjam.setBounds(6, 87, 97, 23);
		panel_Breakfast.add(chckbxjam);
		
		JPanel panel_Drinks = new JPanel();
		
		panel_Drinks.setLayout(null);
		
		JCheckBox chckbxMilk = new JCheckBox("Milk");
		chckbxMilk.setBounds(6, 7, 97, 23);
		panel_Drinks.add(chckbxMilk);	
		
		JCheckBox chckbxFjuice = new JCheckBox("Fruit Juice");
		chckbxFjuice.setBounds(6, 61, 97, 23);
		panel_Drinks.add(chckbxFjuice );
		
		JCheckBox chckbxTea = new JCheckBox("Tea");
		chckbxTea.setBounds(6, 33, 97, 23);
		panel_Drinks.add(chckbxTea);
		
		JCheckBox chckbxcoffee = new JCheckBox("Coffee");
		chckbxcoffee.setBounds(6, 87, 97, 23);
		panel_Drinks.add(chckbxcoffee);
		
		
		panel_Card.add("Drinks", panel_Drinks);
		
		tglbtnIecekler.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
	
				card.show(panel_Card, "Drinks");
				System.out.println("içecek");				
				
     
				
			}
		});		

		tglbtnKahvalt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
	
				card.show(panel_Card, "Breakfast");
				System.out.println("kahvalti");				


			}
		});
		
	}
}
