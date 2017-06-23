package com.example.demo.domains;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;

import lombok.Data;
import paiter.tech.system.domains.base.BaseEntity;

@Data
@Entity
public class Materia extends BaseEntity {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@Column(nullable=false)
	private String nome;
	
	@ManyToOne
	@JoinTable(name="materia_professor")
	private Professor professor;

}
