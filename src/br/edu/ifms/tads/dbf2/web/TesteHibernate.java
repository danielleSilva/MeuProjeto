package br.edu.ifms.tads.dbf2.web;

import org.hibernate.Session;

import br.edu.ifms.tads.dbf2.model.Pessoa;
import br.edu.ifms.tads.dbf2.util.HibernateUtil;


public class TesteHibernate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Pessoa p1= new Pessoa();
 p1.setId(1);
 p1.setNome("JOAO");
 p1.setRg(555);
 
 Session session = HibernateUtil.getSessionFactory().getCurrentSession();
	session.beginTransaction();
 	session.save(p1);
	session.getTransaction().commit();
	}

}
