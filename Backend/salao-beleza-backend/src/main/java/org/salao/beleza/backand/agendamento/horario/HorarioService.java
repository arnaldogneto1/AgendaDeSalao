package org.salao.beleza.backand.agendamento.horario;

import org.salao.beleza.backand.z.utils.GenericService;
import org.salao.beleza.backand.z.utils.ServicePath;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = ServicePath.HORARIO_PATH )
public class HorarioService extends GenericService<Horario,Long>{

}
