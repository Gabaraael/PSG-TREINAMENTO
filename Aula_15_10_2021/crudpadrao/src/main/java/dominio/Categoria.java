package dominio;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class Categoria{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "CategoriaID")	
	private Integer categoriaID;
	
	@Column(name = "Descricao")	
	private String descricao;
	
	@Column(name = "DataInsert")
	private Date DataDeInserção;

	public Integer getCategoriaID() {
		return categoriaID;
	}

	public void setCategoriaID(Integer categoriaID) {
		this.categoriaID = categoriaID;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Date getDataInsert() {
		return DataDeInserção;
	}

	public void setDataInsert(Date DataDeInserção) {
		this.DataDeInserção = DataDeInserção;
	}

	public Categoria(){
		
	}

	public Categoria(Integer categoriaID, String descricao, Date DataDeInserção) {		
		this.categoriaID = categoriaID;
		this.descricao = descricao;
		this.DataDeInserção = DataDeInserção;
	}

	@Override
	public String toString() {
		return "Categoria [categoriaID=" + categoriaID + ", descricao=" + descricao + ", DataDeInserção="
				+ DataDeInserção + "]";
	}

}
