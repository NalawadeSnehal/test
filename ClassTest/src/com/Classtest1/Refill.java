package com.Classtest1;

	public class Refill {
	public String inkcolor;
	public int length;
	Nib nib;
   Refill(){
	 inkcolor="";
	 length=0;
   }
   
   

	public String getInkcolor() {
	return inkcolor;
}



public void setInkcolor(String inkcolor) {
	this.inkcolor = inkcolor;
}



public int getLength() {
	return length;
}



public void setLength(int length) {
	this.length = length;
}



public Nib getNib() {
	return nib;
}



public void setNib(Nib nib) {
	this.nib = nib;
}
Refill(int length,String inkcolor,Nib nib){
	this.length=length;
	this.inkcolor=inkcolor;
	this.nib=nib;
}
@Override
public String toString() {
	return "Refill [inkcolor=" + inkcolor + ", length=" + length + "]";
}



	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
