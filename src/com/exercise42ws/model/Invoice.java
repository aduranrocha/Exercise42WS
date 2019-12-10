package com.exercise42ws.model;

public class Invoice {
	private int idInvoice;
	private String nameClient;
	private int numberArticles;
	private double priceArticle;
	private double totalInvoice;
	
	public Invoice() {
		
	}
	
	public Invoice(int idInvoice, String nameClient, double totalInvoice) {
		this.idInvoice = idInvoice;
		this.nameClient = nameClient;
		this.totalInvoice = totalInvoice;
	}
	
	public int getIdVoice() {
		return this.idInvoice;
	}
	
	public void setIdVoice(int idInvoice) {
		this.idInvoice = idInvoice;
	}
	
	public String getNameClient() {
		return this.nameClient;
	}
	
	public void setNameClient(String nameClient) {
		this.nameClient = nameClient;
	}
	
	public double getTotalInvoice() {
		return this.totalInvoice;
	}
	
	public void setTotalInvoice(double totalInvoice) {
		this.totalInvoice = totalInvoice;
	}
	
	public int getNumberArticles() {
		return numberArticles;
	}
	
	public void setNumberArticles(int numberArticles) {
		this.numberArticles = numberArticles;
	}
	
	public double getPriceArticles() {
		return this.priceArticle;
	}
	
	public void setPriceArticles(double priceArticle) {
		this.priceArticle = priceArticle;
	}
	
	public double CalculatTotal(int numberArticles, double priceArticles) {
		this.totalInvoice = this.numberArticles * this.priceArticle;
		return this.totalInvoice;
	}
}
