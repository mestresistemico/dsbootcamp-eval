package com.mestresistemico.dsbootcampeval.dto;

import java.io.Serializable;
import java.time.Instant;

import javax.persistence.Column;

import com.mestresistemico.dsbootcampeval.entities.Client;

public class ClientDTO implements Serializable{
	private static final long serialVersionUID = 1L;

	private Long id;
	private String name;
	private String cpf;
	private Double income;
	private Integer children;
	@Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
	private Instant birthDate;
	
	public ClientDTO() {}

	public ClientDTO(Long id, String name, String cpf, Double income, Integer children, Instant birthDate) {
		super();
		this.id = id;
		this.name = name;
		this.cpf = cpf;
		this.income = income;
		this.children = children;
		this.birthDate = birthDate;
	}
	
	public ClientDTO(Client entity) {
		super();
		this.id = entity.getId();
		this.name = entity.getName();
		this.cpf = entity.getCpf();
		this.income = entity.getIncome();
		this.children = entity.getChildren();
		this.birthDate = entity.getBirthDate();
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the cpf
	 */
	public String getCpf() {
		return cpf;
	}

	/**
	 * @param cpf the cpf to set
	 */
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	/**
	 * @return the income
	 */
	public Double getIncome() {
		return income;
	}

	/**
	 * @param income the income to set
	 */
	public void setIncome(Double income) {
		this.income = income;
	}

	/**
	 * @return the children
	 */
	public Integer getChildren() {
		return children;
	}

	/**
	 * @param children the children to set
	 */
	public void setChildren(Integer children) {
		this.children = children;
	}

	/**
	 * @return the birthDate
	 */
	public Instant getBirthDate() {
		return birthDate;
	}

	/**
	 * @param birthDate the birthDate to set
	 */
	public void setBirthDate(Instant birthDate) {
		this.birthDate = birthDate;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ClientDTO other = (ClientDTO) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
}
