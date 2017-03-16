import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.border.EmptyBorder;

public class PnlWindowName extends JPanel {

	
	

	private final ButtonGroup buttonGroup = new ButtonGroup();


	CardLayout card;
	JPanel pnlParent;
	
	/**
	 * Create the panel.
	 */
	public PnlWindowName(CardLayout crd, JPanel pnl) {
		this.card = crd;
		pnlParent =pnl;
	
		setBounds(100, 100, 450, 300);
		
		setBorder(new EmptyBorder(5, 5, 5, 5));
		setLayout(new BorderLayout(0, 0));

		
		JPanel panel = new JPanel();
		add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JButton btnNext = new JButton("Next >>");
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				card.next(pnlParent);
				
			}
		});
		btnNext.setBounds(282, 217, 89, 23);
		panel.add(btnNext);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 11, 377, 180);
		panel.add(tabbedPane);
		tabbedPane.add("Morning", new PnlMorning());
		panel.add(tabbedPane);
		tabbedPane.add("Snacks", new PnlSnacks());		
		panel.add(tabbedPane);
		tabbedPane.add("Afternoon", new PnlAfternoon());
		panel.add(tabbedPane);
		tabbedPane.add("Evening", new PnlEvening());
		
		panel.add(tabbedPane);
		tabbedPane.add("Night", new PnlNight());
		
		JButton button = new JButton("<<Back");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
		        
			}
		});
		button.setBounds(23, 217, 89, 23);
		panel.add(button);

	}
}
