package com.example.demo.domains;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;
import paiter.tech.system.domains.base.BaseEntity;

@Data
@Entity
public class Professor extends BaseEntity {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@Column(nullable=false)
	private String nome;

	private String materiaPreferida;

	@Temporal(TemporalType.DATE)
	private Date dataNascimento;

}
