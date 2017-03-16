import java.awt.BorderLayout;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;
import javax.swing.JButton;


public class PnlTotal extends JPanel {
	
	CardLayout card;
	JPanel pnlParent;
	
	/**
	 * Create the panel.
	 */
	public PnlTotal(CardLayout crd, JPanel pnl) {
		this.card = crd;
		pnlParent =pnl;
		initialize();
		}
		
	private JTable table;


	private void initialize() {
		

		setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPane = new JScrollPane();
		add(scrollPane, BorderLayout.CENTER);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		//test verisi
		Integer[][] values = {{300,500,200},{300,500,200},{300,500,200},{300,500,200},{300,500,200}};
			
		table.setModel(new TotalCalorieTableModel(values));
	}
	
	private class TotalCalorieTableModel extends AbstractTableModel{

		String[] columns = {"Öðün","Fat","Carbonhydrate", "Calorie"};
		String[] firstColumnValues = {"Morning","Snacks","Afternon", "Evening", "Total"};
		Integer[][] values;
		
		public TotalCalorieTableModel(Integer[][] values) {
			this.values = values;
		}

		@Override
		public int getColumnCount() {
			
			return columns.length;
		}

		@Override
		public int getRowCount() {
			// TODO Auto-generated method stub
			return firstColumnValues.length;
		}

		@Override
		public Object getValueAt(int rowIndex, int colIndex) {
			if (colIndex==0){
				return firstColumnValues[rowIndex];
			}else{
				return values[rowIndex][colIndex-1];
			}
			
		}
		@Override
		public String getColumnName(int col){
			return columns[col];
		}
		
		
	}
	
}
