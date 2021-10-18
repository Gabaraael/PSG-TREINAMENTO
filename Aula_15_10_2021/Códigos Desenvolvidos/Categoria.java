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
	private Date DataDeInser��o;

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
		return DataDeInser��o;
	}

	public void setDataInsert(Date DataDeInser��o) {
		this.DataDeInser��o = DataDeInser��o;
	}

	public Categoria(){
		
	}

	public Categoria(Integer categoriaID, String descricao, Date DataDeInser��o) {		
		this.categoriaID = categoriaID;
		this.descricao = descricao;
		this.DataDeInser��o = DataDeInser��o;
	}

	@Override
	public String toString() {
		return "Categoria [categoriaID=" + categoriaID + ", descricao=" + descricao + ", DataDeInser��o="
				+ DataDeInser��o + "]";
	}

}
