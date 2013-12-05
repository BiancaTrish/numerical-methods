package model;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class regulaFalsi {
//comment
	ArrayList<Float> x0 = new ArrayList<Float>();
	ArrayList<Float> x1 = new ArrayList<Float>();
	ArrayList<Float> x2 = new ArrayList<Float>();
	ArrayList<Float> y0 = new ArrayList<Float>();
	ArrayList<Float> y1 = new ArrayList<Float>();
	ArrayList<Float> y2 = new ArrayList<Float>();
	
	// Ivan's cOmMeNt
	public Float computeY(Float x, ArrayList<Float>given)
	{
		Float temp=(float)0;
		Float mult;
		
		for (int i=0; i<given.size(); i+=2)
		{
			mult=(float)1;
			for (int j=0; j<given.get(i+1); j++)
				mult*=x;
			temp+=given.get(i)*mult;
		}
		
		
		return temp;
	}
	
	public void byNumberOfIterations(int iterations, float lowerBracket, float upperBracket, ArrayList<Float> given)
	{
		if (given.size()%2!=0)
			{
			JOptionPane.showMessageDialog(null,
				    "Number of given should be even!",
				    "Error",
				    JOptionPane.ERROR_MESSAGE);
			}
		else
		{
			x0.add(lowerBracket);
			x1.add(upperBracket);
			y0.add(computeY(x0.get(0), given));
			y1.add(computeY(x1.get(0), given));
			
			System.out.println(y0);
			System.out.println(y1);
			
		}
		
		
	}//end method
	
	
	
	
	
	
	/*** Getters and Setters***/
	
	public ArrayList<Float> getX0() {
		return x0;
	}
	public ArrayList<Float> getX1() {
		return x1;
	}
	public ArrayList<Float> getX2() {
		return x2;
	}
	public ArrayList<Float> getY0() {
		return y0;
	}
	public ArrayList<Float> getY1() {
		return y1;
	}
	public ArrayList<Float> getY2() {
		return y2;
	}
	public void setX0(ArrayList<Float> x0) {
		this.x0 = x0;
	}
	public void setX1(ArrayList<Float> x1) {
		this.x1 = x1;
	}
	public void setX2(ArrayList<Float> x2) {
		this.x2 = x2;
	}
	public void setY0(ArrayList<Float> y0) {
		this.y0 = y0;
	}
	public void setY1(ArrayList<Float> y1) {
		this.y1 = y1;
	}
	public void setY2(ArrayList<Float> y2) {
		this.y2 = y2;
	}
	
	
	
	
}
