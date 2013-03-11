package F_Verzweigungen;

import java.util.Scanner;

public class Abinoten {
	
	public static void main(String[] args) {
		//EINGABE
		int abiPunkte, punkteNS, pErr, pMax;
		Scanner sc = new Scanner(System.in);
		System.out.println("Maximale Punktzahl:");
		pMax=sc.nextInt();
		System.out.println("Erreichte Punktzahll:");
		pErr=sc.nextInt();
		
		//VERARBEITUNG
		//Umrechnung auf 60 Punkte Schl�ssel
		punkteNS = 60 * pErr / pMax;
		//Ermitteln der Abipunkte
		if(punkteNS<=60 && punkteNS>=57){abiPunkte=15;}
		else if(punkteNS>=54){abiPunkte=14;}
		else if(punkteNS>=51){abiPunkte=13;}
		else if(punkteNS>=48){abiPunkte=12;}
		else if(punkteNS>=45){abiPunkte=11;}
		else if(punkteNS>=42){abiPunkte=10;}
		else if(punkteNS>=39){abiPunkte=9;}
		else if(punkteNS>=36){abiPunkte=8;}
		else if(punkteNS>=33){abiPunkte=7;}
		else if(punkteNS>=30){abiPunkte=6;}
		else if(punkteNS>=27){abiPunkte=5;}
		else if(punkteNS>=22){abiPunkte=4;}
		else if(punkteNS>=17){abiPunkte=3;}
		else if(punkteNS>=12){abiPunkte=2;}
		else if(punkteNS>=7){abiPunkte=1;}
		else{abiPunkte=0;}
		
		//AUSGABE
		System.out.println("Abiturpunkte:"+abiPunkte);
		
		
	}
}
