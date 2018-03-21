package com.prueba.DaoImp;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import com.prueba.DAO.DaoJugador;
import com.prueba.beans.Jugador;

public class DaoJugadorImp implements DaoJugador{

	private DataSource dataSource;
	private JdbcTemplate jdbcTemplateObject;
	   
   public void setDataSource(DataSource dataSource) {
	   this.dataSource = dataSource;
	   this.jdbcTemplateObject = new JdbcTemplate(dataSource);
   }
   
   public void registrar(Jugador jugador) {
	   String SQL = "insert into jugador (id, equipo_id ,nombre) values (?, ?, ?)";
	   jdbcTemplateObject.update(SQL, jugador.getId(), jugador.getEquipo().getId(),jugador.getNombre());
	   System.out.println("Created Record into jugador ID = " + jugador.getId()+ " NAME = " +jugador.getNombre()+ " TEAM = "+jugador.getEquipo().getNombre());
	   return;
   }

}
