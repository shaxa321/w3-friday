package classi;
import java.util.Date;
import java.io.Serializable;
import javax.persistence.*;


@Entity
@Table(name="utenti")

public class Utente {
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long numero_tessera;
	@Column(nullable=false)
	private String nome;
	@Column(nullable=false)
	private String cognome;
	@Column(nullable=false)
	private Date data_nascita;
	
	public Utente() {};
	
	
	public Utente(String nome,String cognome,Date data_nascita){
		this.nome=nome;
		this.cognome=cognome;
		this.data_nascita=data_nascita;

	}
}
