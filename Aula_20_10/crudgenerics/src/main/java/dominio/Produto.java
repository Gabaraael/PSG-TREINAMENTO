package dominio;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class Produto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ProdutoID")
	private Integer produtoID;

	@Column(name = "CategoriaID")
	private Integer categoriaID;

	@Column(name = "SubCategoriaID")
	private Integer subCategoriaID;

	@Column(name = "Descricao")
	private String descricao;

	@Column(name = "DataInsert")
	private Date DataDeInser��o;

	public Integer getProdutoID() {
		return produtoID;
	}

	public void setProdutoID(int produtoID) {
		this.produtoID = produtoID;
	}

	public Integer getCategoriaID() {
		return categoriaID;
	}

	public void setCategoriaID(Integer categoriaID) {
		this.categoriaID = categoriaID;
	}

	public Integer getSubCategoriaID() {
		return subCategoriaID;
	}

	public void setSubCategoriaID(Integer subCategoriaID) {
		this.subCategoriaID = subCategoriaID;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Date getDataDeInser��o() {
		return DataDeInser��o;
	}

	public void setDataDeInser��o(Date dataDeInser��o) {
		DataDeInser��o = dataDeInser��o;
	}
	
	
	
	@Override
	public String toString() {
		return "Produto [produtoID=" + produtoID + ", categoriaID=" + categoriaID + ", subCategoriaID=" + subCategoriaID
				+ ", descricao=" + descricao + ", DataDeInser��o=" + DataDeInser��o + "]";
	}
	public Produto(){
		
	}

	public Produto(Integer produtoID, Integer categoriaID, Integer subCategoriaID, String descricao, Date dataDeInser��o) {
		super();
		this.produtoID = produtoID;
		this.categoriaID = categoriaID;
		this.subCategoriaID = subCategoriaID;
		this.descricao = descricao;
		this.DataDeInser��o = dataDeInser��o;
	}
	
	

}
