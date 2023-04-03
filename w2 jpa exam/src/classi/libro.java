package classi;

import java.util.Date;


import javax.persistence.*;

@Entity

@DiscriminatorValue("libro")
public class libro extends pubblicazione  {
	
	private String autore;
	private String genere;
	
	libro(){
		
	}
	public libro(String autore,String genere,String titolo,Date anno_pubblicazione,int numero_pagine){
		super(titolo,anno_pubblicazione,numero_pagine);
		this.autore=autore;
		this.genere=genere;
	}
}
