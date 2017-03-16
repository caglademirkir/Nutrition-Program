import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;

public class PnlCalculate extends JPanel {


	CardLayout card;
	JPanel pnlParent;
	private Person person;
	
	/**
	 * Create the panel.
	 * @param person 
	 */
	public PnlCalculate(CardLayout crd, JPanel pnl, Person p) {
		this.card = crd;
		pnlParent =pnl;
		person = p;
		
		setLayout(new BorderLayout(0, 0));
		
		
		JPanel panel = new JPanel();
		add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblResultOfYour = new JLabel("Result of Your Body :");
		lblResultOfYour.setBounds(10, 84, 185, 14);
		panel.add(lblResultOfYour);
		
		JLabel lblInformation = new JLabel("Information :");
		lblInformation.setBounds(10, 129, 185, 14);
		panel.add(lblInformation);
		
		JLabel label_3 = new JLabel("Body Mass Index   :");
		label_3.setBounds(10, 31, 185, 14);
		panel.add(label_3);
		
		JLabel lblinfo = new JLabel("New label");
		lblinfo.setBounds(10, 154, 383, 47);
		panel.add(lblinfo);
		
		JLabel lblIdealWeight = new JLabel("New label");
		lblIdealWeight.setBounds(248, 73, 145, 23);
		panel.add(lblIdealWeight);
		
		JLabel lblMassIndex = new JLabel("New label");
		lblMassIndex.setBounds(248, 31, 120, 14);
		panel.add(lblMassIndex);
		
		JButton button = new JButton("Next >>");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				card.next(pnlParent);
			}
		});
		button.setBounds(293, 212, 89, 23);
		panel.add(button);
		addComponentListener(new ComponentAdapter() {
	         @Override
             public void componentHidden(ComponentEvent evt) {
                
             }
             @Override
             public void componentShown(ComponentEvent evt) {
                 
         		System.out.println(p.height);
        		System.out.println(p.weight);
        		Double massindex = p.weight/ (p.height*p.height);
        		Double d = new Double(Math.round(massindex*10000))/10000;
        		lblMassIndex.setText(d.toString());
            	 
            	p.setIdealWeight(massindex); 
            	
            	if( massindex < 18.5){
            		lblIdealWeight.setText("Weak");
            		lblinfo.setText("Weakness is a risk for some diseases and is undesirable.");
            		System.out.println("dsw");
            	}
            	else if( massindex == 18.5){
            		lblIdealWeight.setText("Normal");
            		lblinfo.setText("Indicates that you have the proper weight for your height.");
            		System.out.println("cagla");
            	}
            	else if (massindex > 18.5){
            		lblIdealWeight.setText("Obese");
            		lblinfo.setText("If it does not take the necessary precautions, it causes many diseases.");
            		System.out.println("dm");}
             }		
             
		});
		
	}
	}


