package controller;

import java.util.ArrayList;

import model.regulaFalsi;

public class Driver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		regulaFalsi r = new regulaFalsi();
		
		ArrayList<Float> x0 = new ArrayList<Float>();
		x0.add((float)2);
		x0.add((float)2);

		r.byNumberOfIterations(1, 1, 2, x0);
	}

}
