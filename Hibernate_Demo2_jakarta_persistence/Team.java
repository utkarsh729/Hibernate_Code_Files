package io.valorant;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="ValoTeam")
public class Team {
	
	@Id
	@Column(name="TeamName")
	private String name;
	@Column(nullable = false)
	private String leader;
	@Column
	private int rank;
	
	@Enumerated(EnumType.STRING)
	private Agent agent;
	
	public Agent getAgent() {
		return agent;
	}
	public void setAgent(Agent agent) {
		this.agent = agent;
	}

	private String country;
	
	
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLeader() {
		return leader;
	}
	public void setLeader(String leader) {
		this.leader = leader;
	}
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	
	public String toString() {
		return this.getLeader()+" "+this.getName()+" "+this.getRank()+" "+this.getCountry()+" "+this.getAgent();
	}
	
	
	
}
