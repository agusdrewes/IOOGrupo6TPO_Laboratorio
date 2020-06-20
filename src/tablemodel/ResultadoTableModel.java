package tablemodel;

import java.sql.Date;
import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;

import collections.PacienteCollection;
import collections.PracticaCollection;
import collections.ResultadoCollection;
import dto.ResultadoDTO;

public class ResultadoTableModel extends AbstractTableModel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private ArrayList<ResultadoDTO> lista;

	protected String[] columnNames = new String[] { "Resultado ID", "Practica ID", "Valor", "Descripcion", "Estado" };
	protected Class[] columnClasses = new Class[] { String.class, String.class, String.class, String.class,
			String.class };

	public String getColumnName(int col) {
		return columnNames[col];
	}

	public Class getColumnClass(int col) {
		return columnClasses[col];
	}

	public ResultadoTableModel(ResultadoCollection coleccionResultado) {
		lista = coleccionResultado.getResultadoList();
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
	public boolean isCellEditable(int row, int column) {
		return false;
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		switch (columnIndex) {
		case 0:
			return lista.get(rowIndex).getResultadoID();
		case 1:
			return lista.get(rowIndex).getPracticaID();
		case 2:
			return lista.get(rowIndex).getValor();
		case 3:
			return lista.get(rowIndex).getDescripcion();
		case 4:
			return lista.get(rowIndex).getEstado();
		default:
			return null;
		}
	}

	public void agregar(ResultadoDTO resultado) {
		lista.add(resultado);
		fireTableDataChanged();
	}

	public void modificar(ResultadoDTO resultado) {
		eliminar(lista.indexOf(resultado));
		agregar(resultado);
		fireTableDataChanged();
	}

	public void eliminar(int fila) {
		lista.remove(fila);
		fireTableDataChanged();
	}

	public void eliminar(ResultadoDTO resultado) {
		eliminar(lista.indexOf(resultado));
	}

}
