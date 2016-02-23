package br.com.softbit.couchmobile.service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.softbit.couchmobile.database.Database;
import br.com.softbit.couchmobile.model.Profissional;

public class ProfissionalService {
	
	private Database db = new Database();
	
	public ProfissionalService(){
	}
	
	public List<Profissional> getProfissionais(){
		List<Profissional> result = new ArrayList<Profissional>();
		boolean dbConectado = db.connect();
		if(dbConectado == true){
			ResultSet resultSet = db.makeQuery("SELECT * FROM Profissional ORDER BY ID_Profissional");
			try {
				while(resultSet.next()){
					Profissional p = new Profissional();
					p.setId(resultSet.getLong("ID_Profissional"));
					p.setFoto(resultSet.getString("Foto"));
					p.setNome(resultSet.getString("Nome"));
					p.setEmail(resultSet.getString("Email"));
					p.setSenha(resultSet.getString("Senha"));
					p.setTelefone(resultSet.getString("Telefone"));
					p.setFormacao(resultSet.getString("Formacao"));
					p.setEspecializacao(resultSet.getString("Especializacao"));
					p.setOndeAtua(resultSet.getString("OndeAtua"));
					p.setTempoNaArea(resultSet.getDate("TempoNaArea"));
					p.setFacebook(resultSet.getString("Facebook"));
					p.setgPlus(resultSet.getString("G_plus"));
					
					result.add(p);
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return result;
	}
	
	public List<Profissional> getAllProfissionaisForEspecializacao(){
		return null;
	}
	
	public Profissional getProfissional(long id){
		return null;
	}
	
	public Profissional addProfissional(Profissional profissional){
		return null;
	}
	
	public Profissional updateProfissional(Profissional profissional){
		return null;
	}
	
	public Profissional removeProfissional(long id){
		return null;
	}

}
