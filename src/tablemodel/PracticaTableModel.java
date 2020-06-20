package tablemodel;
import java.sql.Date;
import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;

import collections.PacienteCollection;
import collections.PracticaCollection;
import dto.EstadoHabilitacionEnumDTO;
import dto.PracticaDTO;

public class PracticaTableModel extends AbstractTableModel{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private ArrayList<PracticaDTO> lista;
	
	protected String[] columnNames = new String[] { "Practica ID", "Nombre", "Grupo", "Valores Criticos", "Valores Reservados", "Tiempo Entrega", "Estado Habilitacion"}; 
	protected Class[] columnClasses = new Class[] { String.class, String.class, String.class, String.class, String.class, String.class, String.class}; 
	
	
	public String getColumnName(int col) { return columnNames[col]; } 
	public Class getColumnClass(int col) { return columnClasses[col]; } 
	
	public PracticaTableModel(PracticaCollection coleccionPractica)
	{
		lista = coleccionPractica.getPracticaList();
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
			case 0: return lista.get(rowIndex).getPracticaID(); 
			case 1: return lista.get(rowIndex).getNombre();
			case 2: return lista.get(rowIndex).getGrupo();
			case 3: return lista.get(rowIndex).getValoresCriticos();
			case 4: return lista.get(rowIndex).getValoresReservados();
			case 5: return lista.get(rowIndex).getTiempoEntrega();
			case 6: return lista.get(rowIndex).getEstadoHabilitacion();
			default: return null; 
		}
	}
	
	public void agregar(PracticaDTO practica)
	{
		lista.add(practica);
		fireTableDataChanged();
	}
	
	public void modificar(PracticaDTO practica) {
		eliminar(lista.indexOf(practica));
		agregar(practica);
		fireTableDataChanged();
	}
	
	public void eliminar(int fila)
	{
		lista.remove(fila);
		fireTableDataChanged();
	}
	
	public void eliminar(PracticaDTO paciente)
	{
		eliminar(lista.indexOf(paciente));
	}	

}
