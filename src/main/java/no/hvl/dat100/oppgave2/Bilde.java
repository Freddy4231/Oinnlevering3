package no.hvl.dat100.oppgave2;

import no.hvl.dat100.common.TODO;

public class Bilde extends Tekst {
	
	// TODO - objekt variable
	private String url; 
	
	public Bilde(int id, String bruker, String dato, String tekst, String url) {
		super(id, bruker, dato, tekst); //kun for super klassen
		this.url = url;
		
	//	throw new UnsupportedOperationException(TODO.constructor("Bilde"));
	}

	public Bilde(int id, String bruker, String dato, int likes, String tekst, String url) {
		super(id, bruker, dato, likes, tekst);
		this.url = url;
	//	throw new UnsupportedOperationException(TODO.constructor("Bilde"));
	}
	
	public String getUrl() {
		return url; 
	//	throw new UnsupportedOperationException(TODO.method());

	}

	public void setUrl(String url) {
		this.url = url;
	//	throw new UnsupportedOperationException(TODO.method());
	}

	@Override
	public String toString() {
//		ur1 = "www.picture.com/oo.jpg";
//		
//		return bilde  + "\n" + ur1\n ;
		
		return "BILDE\n" + super.toString() + url + "\n";
	//	throw new UnsupportedOperationException(TODO.method ());

	}

	// Metoden nedenfor er kun for valgfri oppgave 6
	public String toHTML() {
		
		throw new UnsupportedOperationException(TODO.method());
				
	}
}
