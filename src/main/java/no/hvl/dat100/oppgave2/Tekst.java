package no.hvl.dat100.oppgave2;

import no.hvl.dat100.common.TODO;
import no.hvl.dat100.oppgave1.*;

public class Tekst extends Innlegg {  //subklasse for Tekst //henter ut relevant variabler/metoder 	
	private String tekst; 
	
	public Tekst (int id, String bruker, String dato, int likes) {
		super(id, bruker, dato,0); 
		this.tekst = tekst; 
}
	
	public Tekst (int id, String bruker, String dato) {
		super(id, bruker, dato);
		this.tekst = tekst; 		
}
	
	
	// TODO: objektvariable 
	
public class Bilde extends Tekst {
	private String ur1;
	
	public Bilde(int id, String bruker, String dato, int likes, String tekst, String ur1) {
		super(id, bruker, dato, likes, tekst);
		this.ur1 = ur1;
	}
	public Bilde(int id, String bruker, String dato, String tekst, String ur1) {
		super(id, bruker, dato, tekst);
		this.ur1 = ur1; 
	}
}
	
//	public Tekst () {
//		
//	}
//	
//	public Tekst(String tekst) {
//			this.tekst = tekst;
//	}
	
	
		
	
	
	
//	public class bilde extends Tekst {
//		String ur1 = new ur1;
//	}
//	
	public Tekst(int id, String bruker, String dato, String tekst) {
		throw new UnsupportedOperationException(TODO.constructor("Tekst"));
	}
	
	public Tekst(int id, String bruker, String dato, int likes, String tekst) {
		throw new UnsupportedOperationException(TODO.constructor("Tekst"));
	}
	
	public String getTekst() {
		return tekst; 
	//	throw new UnsupportedOperationException(TODO.method());

	}

	public void setTekst(String tekst) {
		this.tekst = tekst; 
	//	throw new UnsupportedOperationException(TODO.method());
	}

//	public String getUrl() {
		
//	}
	@Override
	public String toString() {
		throw new UnsupportedOperationException(TODO.method());

	}
	
	// Metoden nedenfor er kun for valgfri oppgave 6
	public String toHTML() {
			
		throw new UnsupportedOperationException(TODO.method());
				
	}
}
