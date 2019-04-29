package com.cg.cms.bean;

public class Cricket {
	
	private String crickterName;
	private Integer matchesPlayed;
	private Integer highestScore;
	private Integer fifties;
	private Integer hundreds;
	public Cricket(String crickterName, Integer matchesPlayed, Integer highestScore, Integer fifties,
			Integer hundreds) {
		super();
		this.crickterName = crickterName;
		this.matchesPlayed = matchesPlayed;
		this.highestScore = highestScore;
		this.fifties = fifties;
		this.hundreds = hundreds;
	}
	public Cricket() {
		
	}
	public String getCrickterName() {
		return crickterName;
	}
	public void setCrickterName(String crickterName) {
		this.crickterName = crickterName;
	}
	public Integer getMatchesPlayed() {
		return matchesPlayed;
	}
	public void setMatchesPlayed(Integer matchesPlayed) {
		this.matchesPlayed = matchesPlayed;
	}
	public Integer getHighestScore() {
		return highestScore;
	}
	public void setHighestScore(Integer highestScore) {
		this.highestScore = highestScore;
	}
	public Integer getFifties() {
		return fifties;
	}
	public void setFifties(Integer fifties) {
		this.fifties = fifties;
	}
	public Integer getHundreds() {
		return hundreds;
	}
	public void setHundreds(Integer hundreds) {
		this.hundreds = hundreds;
	}
	@Override
	public String toString() {
		return "Cricket [crickterName=" + crickterName + ", matchesPlayed=" + matchesPlayed + ", highestScore="
				+ highestScore + ", fifties=" + fifties + ", hundreds=" + hundreds + "]";
	}
	
	
	}
