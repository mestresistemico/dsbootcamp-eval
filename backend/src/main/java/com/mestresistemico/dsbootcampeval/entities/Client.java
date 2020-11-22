package com.mestresistemico.dsbootcampeval.entities;

import java.io.Serializable;
import java.time.Instant;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;

@Entity
@Table(name = "tb_client")
public class Client implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String cpf;
	private Double income;
	private Integer children;
	@Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
	private Instant birthDate;
	@Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
	private Instant createdAt;
	@Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
	private Instant updatedAt;

	public Client() {
	}

	public Long getId() {
		return id;
	}

	public Client(Long id, String name, String cpf, Double income, Integer children, Instant birthDate) {
		super();
		this.id = id;
		this.name = name;
		this.cpf = cpf;
		this.income = income;
		this.children = children;
		this.birthDate = birthDate;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

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

	/**
	 * @return the createdAt
	 */
	public Instant getCreatedAt() {
		return createdAt;
	}

	/**
	 * @return the updatedAt
	 */
	public Instant getUpdatedAt() {
		return updatedAt;
	}

	@PrePersist
	public void prePersist() {
		createdAt = Instant.now();
	}

	@PreUpdate
	public void preUpdate() {
		updatedAt = Instant.now();
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
		Client other = (Client) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
}
