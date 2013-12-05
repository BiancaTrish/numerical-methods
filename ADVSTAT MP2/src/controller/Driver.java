package controller;

import java.util.ArrayList;

import model.regulaFalsi;

public class Driver {
	// here's a change
	// more comments
	// changey change
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Bianca's comment
	    // oOoOh also a comment
		regulaFalsi r = new regulaFalsi();
		
		ArrayList<Float> x0 = new ArrayList<Float>();
		x0.add((float)2);
		x0.add((float)2);

		r.byNumberOfIterations(1, 1, 2, x0);
	}

}
