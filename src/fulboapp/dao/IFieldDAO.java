package fulboapp.dao;

import java.util.ArrayList;

/**
 *
 * @author Franco Bascialla
 */
public interface IFieldDAO {

	/**
	 * Busca una cancha con el ID ingresado.
	 *
	 * @param fieldID ID de la cancha.
	 * @return objeto IFieldDAO o null si no hay coincidencias.
	 */
	public IFieldDAO findField(String fieldID);

	/**
	 * Busca todas las canchas de la base de datos.
	 * 
	 * @return ArrayList<IFieldDAO> con las canchas encontradas.
	 */
	public ArrayList<IFieldDAO> findAll();

	/**
	 * Busca todas las canchas que tengan el ingreso como parte de su ubicacion.
	 * 
	 * @param location ciudad o departamento.
	 * @return ArrayList<IFieldDAO> con las canchas que coincidan.
	 */
	public ArrayList<IFieldDAO> findByLocation(String location);

	/**
	 * Agrega una cancha a la base de datos.
	 *
	 * @param field Objeto a agregar.
	 */
	public void addField(IFieldDAO field);

	/**
	 * Elimina una cancha existente de la base de datos.
	 *
	 * @param field Objeto a actualizar.
	 */
	public void removeField(IFieldDAO field);

	/**
	 * Actualiza una cancha en la base de datos.
	 *
	 * @param field Objeto a eliminar.
	 */
	public void updateField(IFieldDAO field);
}
