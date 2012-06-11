package br.scrumban;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Vendedor
{
    @Id
    private long id;

    private String nome;


    public long getId()
    {
        return id;
    }

    public void setId(long id)
    {
        this.id = id;
    }

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	

}
