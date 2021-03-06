package com.carloscardona.projectbase.dao;

import java.math.BigDecimal;
import java.sql.SQLException;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;

import org.springframework.jdbc.core.SqlParameter;

import com.carloscardona.projectbase.dao.model.AdmonCentrosCostos;
import com.carloscardona.projectbase.dao.model.CargaSelects;
import com.carloscardona.projectbase.dao.model.Equipo;
import com.carloscardona.projectbase.dao.model.Informacion;
import com.carloscardona.projectbase.dao.model.LlamadoPYG;
import com.carloscardona.projectbase.dao.model.UltimoPYG;
import com.carloscardona.projectbase.dao.model.UsuarioSesion;

/**
 * 
 * 
 * @author carlos.cardona [19/12/2013]
 */
public interface ProjectBaseDAO {

	/**
	 * 
	 * @param login
	 * @return
	 */
	public UsuarioSesion consultarUsuario(String login);

	/**
	 * Ejecuta un query de tipo update con los parametros anyo y mes.
	 * 
	 * @param mes
	 * @param anyo
	 * @param query
	 * @throws SQLException
	 */
	public void exeQueryBorrado(String mes, String anyo, String query) throws SQLException;

	/**
	 * Retorna el nombre del equipo.
	 * 
	 * @param id
	 * @return
	 */
	public Equipo equipo(String id, String nombre);

	/**
	 * Inserta los registros del presupuesto.
	 * 
	 * @param fecha1
	 * @param fecha2
	 * @param tipoMovimiento
	 * @param valor
	 * @param id
	 * @param tipo
	 * @param tipoPresupuesto
	 * @author carlos.cardona [3/01/2014]
	 */
	public void insertarPresupuesto(Integer fecha1, Integer fecha2, Integer tipoMovimiento, Double valor, Integer id, Integer tipo,
			String tipoPresupuesto);

	/**
	 * Retorna una lista de un centro de costo.
	 * 
	 * @param query
	 * @return
	 * @author carlos.cardona [4/01/2014]
	 */
	public List<AdmonCentrosCostos> centroCostos(String query);

	/**
	 * crea o actualiza cualquier query.
	 * 
	 * @param query
	 * @param parametros
	 * @param objeto
	 */
	public void crearActualizar(String query, final LinkedList<SqlParameter> parametros, Object[] objeto);

	/**
	 * 
	 * @param query
	 * @return
	 */
	public List<CargaSelects> cargaSelect(String query, final LinkedList<SqlParameter> parametros,
			final LinkedHashMap<String, Object> valorParametros);

	/**
	 * Retorna lista del ultimo pyg
	 * 
	 * @param query
	 * @param parametros
	 * @param valorParametros
	 * @return
	 */
	public List<UltimoPYG> ultimoPYG(String query, final LinkedList<SqlParameter> parametros,
			final LinkedHashMap<String, Object> valorParametros);

	/**
	 * 
	 * @param query
	 * @param parametros
	 * @param valorParametros
	 * @return
	 */
	public List<LlamadoPYG> llamadoPYG(String query, final LinkedList<SqlParameter> parametros,
			final LinkedHashMap<String, Object> valorParametros);

	/**
	 * Retorna el valor del query.
	 * 
	 * @param query
	 * @param parametros
	 * @param valorParametros
	 * @return
	 */
	public List<BigDecimal> valor(String query, final LinkedList<SqlParameter> parametros,
			final LinkedHashMap<String, Object> valorParametros);

	/**
	 * Retorna la lista informacion.
	 * 
	 * @param query
	 * @param parametros
	 * @param valorParametros
	 * @return
	 */
	public List<Informacion> informacion(String query, final LinkedList<SqlParameter> parametros,
			final LinkedHashMap<String, Object> valorParametros);

	/**
	 * 
	 * @param year
	 * @param mes
	 * @return
	 */
	public BigDecimal getDivision(String year, String mes);

	/**
	 * 
	 * @param year
	 * @param mes
	 * @return
	 */
	public BigDecimal getDivisionD(String year, String mes);

	/**
	 * 
	 * @param mes
	 * @param year
	 * @return
	 */
	public BigDecimal getTotalHardware(String mes, String year);
}
