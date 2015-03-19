package br.edu.ifms.tads.dbf2.controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.hibernate.Session;

import br.edu.ifms.tads.dbf2.model.Pessoa;
import br.edu.ifms.tads.dbf2.util.HibernateUtil;


@ManagedBean
@SessionScoped
		
public class TesteMB {
	
	private Pessoa pessoa = new Pessoa();

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	
	public void salvar(){
		/*System.out.println(this.pessoa.getId());
		System.out.println(this.pessoa.getNome());
		System.out.println(this.pessoa.getRg());*/
		
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		
		session.beginTransaction();
	 	session.save(this.pessoa);
		session.getTransaction().commit();
	}

	
	
}
