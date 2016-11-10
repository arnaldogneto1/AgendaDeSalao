package org.salao.beleza.backand.agendamento;

import java.util.Date;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.salao.beleza.backand.agendamento.horario.Horario;
import org.salao.beleza.backand.funcionario.Funcionario;
import org.salao.beleza.backand.user.UserEntity;
import org.salao.beleza.backand.z.utils.BaseEntity;

@Entity
@Table(name="tb_agendamento")
@AttributeOverride(name="id",column = @Column(name="pk_id"))
public class Agendamento extends BaseEntity<Long>{
	
	
	private static final long serialVersionUID = 1L;
	
	@Column(name="agenda_data", length=20 , nullable=false)
	private Date data;
	
		
	@ManyToOne
	@JoinColumn(name = "id_user")
	private UserEntity idUser;
	
	@ManyToOne
	@JoinColumn(name = "funcid")
	private Funcionario funcid;
	
	@ManyToOne
	@JoinColumn(name = "horaid")
	private Horario horaid;

	public Agendamento() {
		
	}

	public Agendamento(Date data, UserEntity idUser, Funcionario funcid, Horario horaid) {
		super();
		this.data = data;
		this.idUser = idUser;
		this.funcid = funcid;
		this.horaid = horaid;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public UserEntity getIdUser() {
		return idUser;
	}

	public void setIdUser(UserEntity idUser) {
		this.idUser = idUser;
	}

	public Funcionario getFuncid() {
		return funcid;
	}

	public void setFuncid(Funcionario funcid) {
		this.funcid = funcid;
	}

	public Horario getHoraid() {
		return horaid;
	}

	public void setHoraid(Horario horaid) {
		this.horaid = horaid;
	}

	}
