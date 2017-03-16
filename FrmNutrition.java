import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import java.awt.Component;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.CardLayout;

public class FrmNutrition {
	private JFrame frame;
	private Person person;

	private JFrame frmNutritionalValueAccount;
	CardLayout card;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmNutrition window = new FrmNutrition();
					window.frmNutritionalValueAccount.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public FrmNutrition() {
		person = new Person();
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmNutritionalValueAccount = new JFrame();
		frmNutritionalValueAccount.setTitle("Nutritional Value Account");
		frmNutritionalValueAccount.setBounds(100, 100, 450, 300);
		frmNutritionalValueAccount.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		JPanel panel = new JPanel();
		
		
		frmNutritionalValueAccount.getContentPane().add(panel, BorderLayout.CENTER);
		card=new CardLayout(0,0);
		panel.setLayout(card);
		PnlNutrition pnlNutrition = new PnlNutrition(card,panel,person);
		panel.add(pnlNutrition, "PnlNutrition");
		panel.add(new PnlCalculate(card,panel,person),"PnlCalculate");
		panel.add(new PnlWindowName(card,panel), "PnlWindowName");	
		panel.add(new PnlTotal(card,panel),"PnlTotal");		


		

	}
}
