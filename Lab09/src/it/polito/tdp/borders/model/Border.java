package it.polito.tdp.borders.model;

public class Border {

	private int cc1;
	private int cc2;
	private int contType;
	private int anno;
	public Border(int cc1, int cc2, int contType, int anno) {
		super();
		this.cc1 = cc1;
		this.cc2 = cc2;
		this.contType = contType;
		this.anno = anno;
	}
	
	
	
	public Border(int cc1, int cc2) {
	
		this.cc1 = cc1;
		this.cc2 = cc2;
	}



	public int getCc1() {
		return cc1;
	}
	public void setCc1(int cc1) {
		this.cc1 = cc1;
	}
	public int getCc2() {
		return cc2;
	}
	public void setCc2(int cc2) {
		this.cc2 = cc2;
	}
	public int getContType() {
		return contType;
	}
	public void setContType(int contType) {
		this.contType = contType;
	}
	public int getAnno() {
		return anno;
	}
	public void setAnno(int anno) {
		this.anno = anno;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + cc1;
		result = prime * result + cc2;
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
		Border other = (Border) obj;
		
		if ((cc1 == other.cc1 && cc2 == other.cc2) ||(cc1 == other.cc2 && cc2 == other.cc1))
			return true;
		else
		return false;
	}
	@Override
	public String toString() {
		return "Border [cc1=" + cc1 + ", cc2=" + cc2 + ", contType=" + contType + ", anno=" + anno + "]";
	}
	
	
	
}
