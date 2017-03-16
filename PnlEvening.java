import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PnlEvening extends JPanel {

	/**
	 * Create the panel.
	 */
	public PnlEvening() {
		setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		add(panel, BorderLayout.WEST);
		panel.setLayout(new GridLayout(5, 1, 0, 0));
		
		JButton btnNewVegatable = new JButton("Vegatable");
		panel.add(btnNewVegatable);
		
		JButton btnNewMeat = new JButton("Meat and Pulses");
		panel.add(btnNewMeat);
		
		JButton btnNewFruit = new JButton("Fruit");
		panel.add(btnNewFruit);
		
		JButton btnNewDessert = new JButton("Dessert");
		panel.add(btnNewDessert);
		
		JButton btnNewDrink = new JButton("Drink");
		panel.add(btnNewDrink);
		
		JPanel panel_Vegatable = new JPanel();
		panel_Vegatable.setLayout(null);
		
		JCheckBox chckbxBroccoli = new JCheckBox("Broccoli");
		chckbxBroccoli.setBounds(6, 7, 97, 23);
		panel_Vegatable.add(chckbxBroccoli);
		
		JCheckBox chckbxTomato = new JCheckBox("Tomato");
		chckbxTomato.setBounds(6, 33, 97, 23);
		panel_Vegatable.add(chckbxTomato);
		
		JCheckBox chckbxCucumber = new JCheckBox("Cucumber");
		chckbxCucumber.setBounds(6, 59, 97, 23);
		panel_Vegatable.add(chckbxCucumber);
		
		JCheckBox chckbxLettuce = new JCheckBox("Lettuce");
		chckbxLettuce.setBounds(6, 85, 97, 23);
		panel_Vegatable.add(chckbxLettuce);
		
		JPanel panel_Card = new JPanel();
		add(panel_Card, BorderLayout.CENTER);
		
		CardLayout card = new CardLayout(0, 0);
		panel_Card.setLayout(card);
		panel_Card.add("Vegatable", panel_Vegatable);
		
		JPanel panel_Meat = new JPanel();
		panel_Meat.setLayout(null);
		
		JCheckBox chckbxSteak = new JCheckBox("Steak");
		chckbxSteak.setBounds(6, 7, 97, 23);
		panel_Meat.add(chckbxSteak);	
		
			
		panel_Card.add("Meat and Pulses", panel_Meat);
		
		JCheckBox chckbxChicken = new JCheckBox("Chicken");
		chckbxChicken.setBounds(6, 33, 97, 23);
		panel_Meat.add(chckbxChicken);
		
		JCheckBox chckbxFish = new JCheckBox("Fish");
		chckbxFish.setBounds(6, 59, 97, 23);
		panel_Meat.add(chckbxFish);
		
		JCheckBox chckbxChickpea = new JCheckBox("Chickpea");
		chckbxChickpea.setBounds(6, 85, 97, 23);
		panel_Meat.add(chckbxChickpea);
		
		JCheckBox chckbxBean = new JCheckBox("Bean");
		chckbxBean.setBounds(6, 111, 97, 23);
		panel_Meat.add(chckbxBean);
		
		panel_Card.add("Meat and Pulses", panel_Meat);
		
		JPanel panel_Fruit = new JPanel();
		panel_Fruit.setLayout(null);
		
		JCheckBox chckbxOrange = new JCheckBox("Orange");
		chckbxOrange.setBounds(6, 7, 97, 23);
		panel_Fruit.add(chckbxOrange);
		
	
		panel_Card.add("Fruit", panel_Fruit);
		
		JCheckBox chckbxApple = new JCheckBox("Apple");
		chckbxApple.setBounds(6, 33, 97, 23);
		panel_Fruit.add(chckbxApple);
		
		JCheckBox chckbxStrawberry = new JCheckBox("Strawberry");
		chckbxStrawberry.setBounds(6, 59, 97, 23);
		panel_Fruit.add(chckbxStrawberry);
		
		JCheckBox chckbxCherry = new JCheckBox("Cherry");
		chckbxCherry.setBounds(6, 86, 97, 23);
		panel_Fruit.add(chckbxCherry);
		
		panel_Card.add("Fruit", panel_Fruit);
		
		
		JPanel panel_Dessert = new JPanel();
		panel_Dessert.setLayout(null);
		
		JCheckBox chckbxPudding = new JCheckBox("Pudding");
		chckbxPudding.setBounds(6, 7, 97, 23);
		panel_Dessert.add(chckbxPudding);
		
		
		panel_Card.add("Dessert", panel_Dessert);
		
		JCheckBox chckbxRice = new JCheckBox("Rice Pudding");
		chckbxRice.setBounds(6, 33, 125, 23);
		panel_Dessert.add(chckbxRice);
		
		JCheckBox chckbxDonut = new JCheckBox("Donut");
		chckbxDonut.setBounds(6, 59, 97, 23);
		panel_Dessert.add(chckbxDonut);
		
		JCheckBox chckbxIcecream = new JCheckBox("Ice Cream");
		chckbxIcecream.setBounds(6, 85, 97, 23);
		panel_Dessert.add(chckbxIcecream);
		
		
		panel_Card.add("Dessert", panel_Dessert);
		
		
		JPanel panel_Drink = new JPanel();
		panel_Drink.setLayout(null);
		
		JCheckBox chckbxCola = new JCheckBox("Cola");
		chckbxCola.setBounds(6, 7, 97, 23);
		panel_Drink.add(chckbxCola);
		
		
		JCheckBox chckbxMilk = new JCheckBox("Süt");
		chckbxMilk.setBounds(6, 7, 97, 23);
		panel_Drink.add(chckbxMilk);	
		
		JCheckBox chckbxFjuice = new JCheckBox("Fruit Juice");
		chckbxFjuice.setBounds(6, 61, 97, 23);
		panel_Drink.add(chckbxFjuice );
		
		JCheckBox chckbxTea = new JCheckBox("Tea");
		chckbxTea.setBounds(6, 33, 97, 23);
		panel_Drink.add(chckbxTea);
		
		JCheckBox chckbxcoffee = new JCheckBox("Coffee");
		chckbxcoffee.setBounds(6, 87, 97, 23);
		panel_Drink.add(chckbxcoffee);
		
		panel_Card.add("Drink", panel_Drink);
	
		btnNewVegatable.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
	
				card.show(panel_Card, "Vegatable");
				System.out.println("Chocolate");	
			}
		});	
		
		
		btnNewMeat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
	
				card.show(panel_Card, "Meat and Pulses");
				System.out.println("Chocolate");	
			}
		});	
		
		btnNewFruit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
	
				card.show(panel_Card, "Fruit");
				System.out.println("Chocolate");	
			}
		});	
		
		
		btnNewDessert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
	
				card.show(panel_Card, "Dessert");
				System.out.println("Chocolate");	
			}
		});	
		
		btnNewDrink.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
	
				card.show(panel_Card, "Drink");
				System.out.println("Cola");				


			}
		});
	}
}
		
		
		
		
		
	
	