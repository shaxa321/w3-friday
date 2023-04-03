package classi;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;




@Entity
@DiscriminatorValue("rivista")

public class Rivista extends pubblicazione {
private Periodicita periodicita  ;

Rivista(){
	
}

public Rivista(Periodicita periodicita,String titolo,Date anno_pubblicazione,int numero_pagine){
	super(titolo,anno_pubblicazione,numero_pagine);
	this.periodicita=periodicita;
}
}
