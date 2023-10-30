package com.Classtest1;

public class Nib {
	public String materialtype;
	public int width;
	
	Nib(){
		
	}
	Nib(String materialtype,int width)
	{
		this.materialtype=materialtype;
		this.width=width;
	}
	public void SetData(String materialtype,int width) {
		this.materialtype=materialtype;
		this.width=width;
	}
	
	@Override
	public String toString() {
		return "Nib [materialtype=" + materialtype + ", width=" + width + "]";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
