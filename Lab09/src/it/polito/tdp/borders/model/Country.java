package it.polito.tdp.borders.model;

public class Country {
	private String stateAbb;
	private int CCode;
	private String stateName;
	public Country(String stateAbb, int cCode, String stateName) {
		this.stateAbb = stateAbb;
		this.CCode = cCode;
		this.stateName = stateName;
	}
	
	
	public Country(int cCode) {
		super();
		CCode = cCode;
	}


	public String getStateAbb() {
		return stateAbb;
	}
	public void setStateAbb(String stateAbb) {
		this.stateAbb = stateAbb;
	}
	public int getCCode() {
		return CCode;
	}
	public void setCCode(int cCode) {
		CCode = cCode;
	}
	public String getStateName() {
		return stateName;
	}
	public void setStateName(String stateName) {
		this.stateName = stateName;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + CCode;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Country other = (Country) obj;
		if (CCode != other.CCode)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Country [stateAbb=" + stateAbb + ", CCode=" + CCode + ", stateName=" + stateName + "]";
	}
	
	

}
