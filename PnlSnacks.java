import javax.swing.JPanel;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JToggleButton;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;
import java.awt.CardLayout;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JComboBox;

public class PnlSnacks extends JPanel {
	

	
	Integer[][] calories = new Integer[5][3];
	/**
	 * Create the panel.
	 */
	public PnlSnacks() {


	/**
	 * Create the panel.
	 */

		setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		add(panel, BorderLayout.WEST);
		panel.setLayout(new GridLayout(3, 1, 0, 0));
		
		JButton tglbtnNuts = new JButton("Nuts");
		panel.add(tglbtnNuts);
		
		JButton tglbtnJunkFood = new JButton("Junk Food");
		panel.add(tglbtnJunkFood);
		
		JButton tglbtnDrinks = new JButton("Drinks");
		panel.add(tglbtnDrinks);
		

		JPanel panel_Nuts = new JPanel();
		panel_Nuts.setLayout(null);
		
		JCheckBox chckbxPeanut = new JCheckBox("Peanut");
		chckbxPeanut.setBounds(6, 7, 97, 23);
		panel_Nuts.add(chckbxPeanut);
		
		JPanel panel_Card = new JPanel();
		add(panel_Card, BorderLayout.CENTER);
		
		
		CardLayout card = new CardLayout(0, 0);
		panel_Card.setLayout(card);
		panel_Card.add("Nuts", panel_Nuts);
		
		JCheckBox chckbxCorn = new JCheckBox("Corn");
		chckbxCorn.setBounds(6, 33, 97, 23);
		panel_Nuts.add(chckbxCorn);
		
		JCheckBox chckbxKaju = new JCheckBox("Kaju");
		chckbxKaju.setBounds(6, 57, 97, 23);
		panel_Nuts.add(chckbxKaju);
		
		JCheckBox chckbxRoasted = new JCheckBox("Roasted chickpea");
		chckbxRoasted.setBounds(6, 84, 131, 23);
		panel_Nuts.add(chckbxRoasted);
		
		JPanel panel_JunkFood = new JPanel();
		panel_JunkFood.setLayout(null);
		
		JCheckBox chckbxChocolate = new JCheckBox("Chocolate");
		chckbxChocolate.setBounds(6, 7, 97, 23);
		panel_JunkFood.add(chckbxChocolate);
		
		JCheckBox chckbxJelibon = new JCheckBox("Jelibon");
		chckbxJelibon.setBounds(6, 33, 97, 23);
		panel_JunkFood.add(chckbxJelibon);
		
		JCheckBox chckbxCips = new JCheckBox("Cips");
		chckbxCips.setBounds(6, 57, 97, 23);
		panel_JunkFood.add(chckbxCips);
		
		JCheckBox chckbxCandy = new JCheckBox("Candy");
		chckbxCandy.setBounds(6, 84, 131, 23);
		panel_Nuts.add(chckbxCandy);
		
		panel_Card.add("Junk Food", panel_JunkFood);
		
		JPanel panel_Drinks = new JPanel();
		panel_Drinks.setLayout(null);
		
		JCheckBox chckbxCola = new JCheckBox("Cola");
		chckbxCola.setBounds(6, 7, 97, 23);
		panel_Drinks.add(chckbxCola);
		
		JCheckBox chckbxMilk = new JCheckBox("Süt");
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
		
		
		tglbtnJunkFood.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
	
				card.show(panel_Card, "Junk Food");
				System.out.println("Chocolate");	
			}
		});	
		
		tglbtnNuts.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
	
				card.show(panel_Card, "Nuts");
				System.out.println("Peanut");				


			}
		});
		
		
		
		tglbtnDrinks.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
	
				card.show(panel_Card, "Drinks");
				System.out.println("Cola");				


			}
		});
	}
}
