package br.com.softbit.couchmobile.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Profissional {
	
	private long id;
	private String foto;
	private String nome;
	private String email;
	private String senha;
	private String telefone;
	private String formacao;
	private String especializacao;
	private Date tempoNaArea;
	private String ondeAtua;
	private String facebook;
	private String gPlus;
	private String twitter;
	
	public Profissional(){
		
	}
	
	public Profissional(long id, String nome, String email){
		setId(id);
		setNome(nome);
		setEmail(email);
	}
	
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public String getFoto() {
		return foto;
	}
	
	public void setFoto(String foto) {
		this.foto = foto;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getSenha() {
		return senha;
	}
	
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public String getTelefone() {
		return telefone;
	}
	
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public String getFormacao() {
		return formacao;
	}
	
	public void setFormacao(String formacao) {
		this.formacao = formacao;
	}
	
	public String getEspecializacao() {
		return especializacao;
	}
	
	public void setEspecializacao(String especializacao) {
		this.especializacao = especializacao;
	}
	
	public Date getTempoNaArea() {
		return tempoNaArea;
	}
	
	public void setTempoNaArea(Date tempoNaArea) {
		this.tempoNaArea = tempoNaArea;
	}
	
	public String getOndeAtua() {
		return ondeAtua;
	}
	
	public void setOndeAtua(String ondeAtua) {
		this.ondeAtua = ondeAtua;
	}
	
	public String getFacebook() {
		return facebook;
	}
	
	public void setFacebook(String facebook) {
		this.facebook = facebook;
	}
	
	public String getgPlus() {
		return gPlus;
	}
	
	public void setgPlus(String gPlus) {
		this.gPlus = gPlus;
	}
	
	public String getTwitter() {
		return twitter;
	}
	
	public void setTwitter(String twitter) {
		this.twitter = twitter;
	}

}
