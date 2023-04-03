package classi;


import java.util.Date;
import java.io.Serializable;
import javax.persistence.*;



@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@Table(name="pubblicazioni")

public abstract class pubblicazione {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long isbn;
	
	@Column(nullable=false)
	private String titolo;
	@Column(nullable=false)
	private Date anno_pubbicazione;
	@Column(nullable=false)
	private int numero_pagine;
	
	pubblicazione(){
		
	}
	protected pubblicazione(String titolo,Date anno_pubblicazione,int numero_pagine){
		this.titolo=titolo;
		this.anno_pubbicazione=anno_pubblicazione;
		this.numero_pagine=numero_pagine;
	}
	
}
