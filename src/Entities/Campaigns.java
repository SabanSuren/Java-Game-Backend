package Entities;


import Abstract.ICampaignSercice;

public class Campaigns implements ICampaignSercice{
	private int  id;
	private String camName;
	private int camDate;
	
	public Campaigns() {
		
	}
	public Campaigns(int id, String camName, int camDate) {
		super();
		this.id = id;
		this.camName = camName;
		this.camDate = camDate;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCamName() {
		return camName;
	}
	public void setCamName(String camName) {
		this.camName = camName;
	}
	public int getCamDate() {
		return camDate;
	}
	public void setCamDate(int camDate) {
		this.camDate = camDate;
	}
	
	
	
	

}
