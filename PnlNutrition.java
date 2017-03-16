import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.CardLayout;

import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class PnlNutrition extends JPanel {
	private JTextField txtHeight;
	private JTextField txtWeight;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	CardLayout card;
	JPanel pnlParent;
	private Person person;
	
	/**
	 * Create the panel.
	 * @param p 
	 */
	public PnlNutrition(CardLayout crd, JPanel pnl, Person p) {
		this.card = crd;
		pnlParent =pnl;
		person = p;
		setBackground(Color.WHITE);
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Basic Information");
		lblNewLabel.setBounds(10, 11, 110, 14);
		lblNewLabel.setAlignmentX(0.1f);
		lblNewLabel.setAlignmentY(0.1f);
	    add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Gender :");
		lblNewLabel_1.setBounds(30, 36, 46, 14);
		add(lblNewLabel_1);
		
		JRadioButton radio1 = new JRadioButton("Woman");
		buttonGroup.add(radio1);
		radio1.setBounds(111, 32, 92, 14);
		add(radio1);
		
		JRadioButton radio2 = new JRadioButton("Man");
		buttonGroup.add(radio2);
		radio2.setBounds(111, 49, 92, 14);
		add(radio2);
		
		JLabel lblNewLabel_2 = new JLabel("* Height :");
		lblNewLabel_2.setBounds(30, 89, 63, 14);
		add(lblNewLabel_2);
		
		txtHeight = new JTextField();
		txtHeight.setBounds(111, 86, 86, 20);
		add(txtHeight);
		txtHeight.setColumns(10);
		
		JLabel lblCm = new JLabel("m");
		lblCm.setBounds(207, 89, 46, 14);
		add(lblCm);
		
		JLabel lblNewLabel_3 = new JLabel("* Weight :");
		lblNewLabel_3.setBounds(30, 120, 63, 14);
		add(lblNewLabel_3);
		
		txtWeight = new JTextField();
		txtWeight.setBounds(111, 117, 86, 20);
		add(txtWeight);
		txtWeight.setColumns(10);
		
		JLabel lblKg = new JLabel("kg");
		lblKg.setBounds(207, 120, 46, 14);
		add(lblKg);
		
		JLabel lblMandotoryField = new JLabel("* Mandatory Field");
		lblMandotoryField.setBounds(57, 162, 128, 14);
		add(lblMandotoryField);
		
		JButton btnNewButton = new JButton("Calculate");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println(Double.parseDouble(txtHeight.getText()));
				System.out.println(Double.parseDouble(txtWeight.getText()));
				person.setHeight(Double.parseDouble(txtHeight.getText()));
				person.setWeight(Double.parseDouble(txtWeight.getText()));
				card.next(pnlParent);
			}
		});
		btnNewButton.setBounds(57, 203, 89, 23);
		add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Clear");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			  txtHeight.setText("");
			  txtWeight.setText("");
			  buttonGroup.clearSelection();
			 
			}
		});
		btnNewButton_1.setBounds(228, 203, 89, 23);
		add(btnNewButton_1);
		

	}

}
