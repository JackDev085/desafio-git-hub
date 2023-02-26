package app;

import java.util.Scanner;

public class Usuario {

	public static void main(String[] args) {
		SmartTv smartTv = new SmartTv();
		Scanner sc = new Scanner(System.in);
		smartTv.escolherCanal(15);
		smartTv.ligarTv();
		smartTv.aumentarVolume();
		System.out.println("o volume é" + smartTv.volume );
		System.out.println("o canal é" + smartTv.canal);
	}
	
}
