package com.prueba.DaoImp;


import org.springframework.jdbc.core.JdbcTemplate;
import javax.sql.DataSource;

import com.prueba.DAO.DaoEquipo;
import com.prueba.beans.Equipo;

public class DaoEquipoImp implements DaoEquipo {
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplateObject;
	   
   public void setDataSource(DataSource dataSource) {
	   this.dataSource = dataSource;
	   this.jdbcTemplateObject = new JdbcTemplate(dataSource);
   }
   
   public void registrar(Equipo equipo) {
	      String SQL = "insert into Equipo (id, nombre) values (?, ?)";
	      jdbcTemplateObject.update(SQL, equipo.getId(),equipo.getNombre());
	      System.out.println("Created Record Name = " + equipo.getId()+ " Age = " +equipo.getNombre());
	      return;
   }

}
