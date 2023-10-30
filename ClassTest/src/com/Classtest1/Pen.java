package com.Classtest1;

public class Pen {

	public int caplength;
	public String brand;
	Refill refill;
	 
	Pen()
	{
		
	}
	Pen(int caplength,String brand,Refill refill){
		this.caplength=caplength;
		this.brand=brand;
		this.refill=refill;
	}
	public void SetData(int caplength,String brand,Refill refill) {
	this.caplength=caplength;
	this.brand=brand;
	this.refill=refill;
}

	
	@Override
	public String toString() {
		return "Pen [caplength=" + caplength + ", brand=" + brand + "]";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pen p1=new Pen();
		p1.SetData(4,"champ",new Refill(12,"blue",new Nib("plastic",6)));
		System.out.println(p1);
	}

}
