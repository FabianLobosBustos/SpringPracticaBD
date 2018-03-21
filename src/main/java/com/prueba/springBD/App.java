package com.prueba.springBD;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.prueba.DAO.DaoEquipo;
import com.prueba.DaoImp.DaoEquipoImp;
import com.prueba.DaoImp.DaoJugadorImp;
import com.prueba.beans.Equipo;
import com.prueba.beans.Jugador;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
		ApplicationContext appContext = new ClassPathXmlApplicationContext("com/prueba/xml/beans.xml");
		Jugador messi = (Jugador) appContext.getBean("messi");
		Equipo barcelona = (Equipo) appContext.getBean("barcelona");
		
		Equipo realMadrid = new Equipo();
		realMadrid.setNombre("realMadrid");
		realMadrid.setId(2);
		
		Equipo juventus = new Equipo();
		juventus.setNombre("juventus");
		juventus.setId(3);
		
		DaoEquipoImp daoEquipo = (DaoEquipoImp) appContext.getBean("daoEquipoImp");
		DaoJugadorImp daoJugador = (DaoJugadorImp) appContext.getBean("daoJugadorImp");
		
		//daoJugador.registrar(messi);
		daoEquipo.registrar(juventus);
		
    }
}
