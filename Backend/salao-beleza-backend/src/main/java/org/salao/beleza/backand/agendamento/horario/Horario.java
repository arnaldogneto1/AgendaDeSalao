package org.salao.beleza.backand.agendamento.horario;

import java.util.List;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.salao.beleza.backand.agendamento.Agendamento;
import org.salao.beleza.backand.z.utils.BaseEntity;


@Entity
@Table(name="tb_horario")
@AttributeOverride(name="id",column = @Column(name="pk_id"))
public class Horario extends BaseEntity<Long>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Column(name = "tb_horario", length = 120, nullable = false)
	private String horario;
	
	

	@OneToMany(fetch = FetchType.EAGER, mappedBy = "horaid")
	private List<Agendamento> agendamento;

	public Horario() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Horario(String horario) {
		super();
		this.horario = horario;
	}

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}
	
	}
