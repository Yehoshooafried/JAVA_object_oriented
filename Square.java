package object_oriented;

import java.util.Scanner;

public class Square {

	private Nekuda uPleft;
	private Nekuda buttomRight;

//	public Square() {
//		
//this.uPleft = new Nekuda(0, 0);
//this.buttomRight = new Nekuda(3, 4);
//
//	}

	// constructor
	public Square(int upX, int upY, int bX, int bY) {
		this.uPleft = new Nekuda(upX, upY);
		this.buttomRight = new Nekuda(bX, bY);
	}

//getters

	public void getQurner() {
		System.out.println(" up x:" + this.uPleft.getX() + " up y:" + this.uPleft.getY() + " buttom x: "
				+ this.buttomRight.getX() + " buttom y: " + this.buttomRight.getY());

	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		Square a = new Square(0, 0, 3, 4);
		Square b = new Square(in.nextInt(), in.nextInt(), in.nextInt(), in.nextInt());
		a.getQurner();
		b.getQurner();
	}

}
