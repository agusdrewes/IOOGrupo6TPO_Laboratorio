package tablemodel;
import java.sql.Date;
import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;

import collections.PacienteCollection;
import collections.SucursalCollection;
import dto.PacienteDTO;
import dto.SucursalDTO;;

public class SucursalTableModel extends AbstractTableModel{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private ArrayList<SucursalDTO> lista;
	
	protected String[] columnNames = new String[] { "Sucursal ID", "Direccion", "Responsable Tecnico (Usuario)"}; 
	protected Class[] columnClasses = new Class[] { int.class, String.class, String.class}; 


	public String getColumnName(int col) { return columnNames[col]; } 
	public Class getColumnClass(int col) { return columnClasses[col]; } 
	
	public SucursalTableModel(SucursalCollection coleccionSucursal)
	{
		lista = coleccionSucursal.getSucursalList();
	}
	
	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return columnNames.length;
	}

	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return lista.size();
	}
	
    @Override
    public boolean isCellEditable(int row, int column)
    {
    	return false;
    }
    
	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		switch(columnIndex) 
		{
			case 0: return lista.get(rowIndex).getNumero(); 
			case 1: return lista.get(rowIndex).getDireccion();
			case 2: return lista.get(rowIndex).getResponsableTecnico();
			default: return null; 
		}
	}
	
	public void agregar(SucursalDTO sucursal)
	{
		lista.add(sucursal);
		fireTableDataChanged();
	}
	
	public void refresh() {
		fireTableDataChanged();
	}
	
	public void eliminar(int fila)
	{
		lista.remove(fila);
		fireTableDataChanged();
	}
	
	public void eliminar(SucursalDTO sucursal)
	{
		eliminar(lista.indexOf(sucursal));
	}	

}
