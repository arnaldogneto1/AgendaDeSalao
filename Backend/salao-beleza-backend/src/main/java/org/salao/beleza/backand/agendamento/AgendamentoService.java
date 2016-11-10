package org.salao.beleza.backand.agendamento;

import java.util.List;

import org.salao.beleza.backand.user.UserEntity;
import org.salao.beleza.backand.user.UserRepository;
import org.salao.beleza.backand.z.security.CurrentUser;
import org.salao.beleza.backand.z.utils.GenericService;
import org.salao.beleza.backand.z.utils.ServicePath;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path=ServicePath.AGENDAMENTO_PATH)
public class AgendamentoService extends GenericService<Agendamento,Long>{
	
	


	@Autowired
	private CurrentUser currentUser;

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private AgendamentoRepository agendamentoRepository;

	
	@Override
	public List<Agendamento> findAll() {
		UserEntity idUser = this.userRepository.findByEmail(currentUser.getActiveUser().getEmail());

		return this.agendamentoRepository.findByIdUser(idUser);
	}

	@Override
	public ResponseEntity<?> insert(@RequestBody Agendamento agenda,Errors erros) {
		
	 agenda.setIdUser(this.userRepository.findByEmail(currentUser.getActiveUser().getEmail()));

		return super.insert(agenda,erros);
	}

	@Override
	public ResponseEntity<?> update(@RequestBody Agendamento  agenda,Errors erros) {
		validateUserRequest( agenda);

		

		return super.update( agenda,erros);
	}

	@Override
	public ResponseEntity<?> deletar(@RequestBody Agendamento agenda) {
		
		
		
		
		validateUserRequest( agenda);

		return super.deletar( agenda);
	}

	private UserEntity validateUserRequest(Agendamento  agenda) {
		UserEntity idUser = this.userRepository.findByEmail(currentUser.getActiveUser().getEmail());

		if ( agenda.getIdUser().getEmail().compareToIgnoreCase(idUser.getEmail()) != 0) {
			throw new SecurityException();
		}

		return idUser;
	}		
		
	



}
