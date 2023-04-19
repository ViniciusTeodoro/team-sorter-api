package br.com.team_sorter_api.dtos;

public class PlayerDto {
	String name;
	Float igl;
	Float gameNotion;
	Float aim;
	Float nadeKnowledge;
	Float adaptability;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Float getIgl() {
		return igl;
	}
	public void setIgl(Float igl) {
		this.igl = igl;
	}
	public Float getGameNotion() {
		return gameNotion;
	}
	public void setGameNotion(Float gameNotion) {
		this.gameNotion = gameNotion;
	}
	public Float getAim() {
		return aim;
	}
	public void setAim(Float aim) {
		this.aim = aim;
	}
	public Float getNadeKnowledge() {
		return nadeKnowledge;
	}
	public void setNadeKnowledge(Float nadeKnowledge) {
		this.nadeKnowledge = nadeKnowledge;
	}
	public Float getAdaptability() {
		return adaptability;
	}
	public void setAdaptability(Float adaptability) {
		this.adaptability = adaptability;
	}
}
