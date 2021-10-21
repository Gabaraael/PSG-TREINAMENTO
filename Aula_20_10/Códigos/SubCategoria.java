package dominio;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class SubCategoria {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "SubCategoriaID")	
	private Integer subCategoriaID;
	
	@Column(name = "CategoriaID")	
	private Integer categoriaID;
	
	@Column(name = "Descricao")	
	private String descricao;
	
	@Column(name = "DataInsert")
	private Date DataDeInserção;

	

	public Integer getSubCategoriaID() {
		return this.subCategoriaID;
	}

	public void setSubCategoriaID(Integer subCategoriaID) {
		this.subCategoriaID = subCategoriaID;
	}

	public Integer getCategoriaID() {
		return this.categoriaID;
	}

	public void setCategoriaID(Integer categoriaID) {
		this.categoriaID = categoriaID;
	}
	
	public SubCategoria(){
		
	}
	
	public SubCategoria(Integer categoriaID, Integer subCategoriaID, String descricao, Date dataDeInserção) {
		super();		
		this.subCategoriaID = subCategoriaID;
		this.categoriaID = categoriaID;		
		this.descricao = descricao;
		this.DataDeInserção = dataDeInserção;
	}

	@Override
	public String toString() {
		return "SubCategoria [subCategoriaID=" + subCategoriaID + ", categoriaID=" + categoriaID + ", descricao="
				+ descricao + ", DataDeInserção=" + DataDeInserção + "]";
	}
}
