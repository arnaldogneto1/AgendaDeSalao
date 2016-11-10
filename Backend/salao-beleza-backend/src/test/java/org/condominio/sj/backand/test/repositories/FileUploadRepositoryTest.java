package org.condominio.sj.backand.test.repositories;



import java.util.List;

import javax.transaction.Transactional;

import org.apache.log4j.Logger;
import org.condominio.sj.backand.test.utils.AbstractTest;
import org.junit.Test;
import org.salao.beleza.backand.funcionario.Funcionario;
import org.salao.beleza.backand.funcionario.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;


public class FileUploadRepositoryTest extends AbstractTest {
	
	private static final Logger LOGGER = Logger.getLogger(FileUploadRepositoryTest.class);
	@Autowired
	private FuncionarioRepository fileuploadRepository;
	/*
	@Test
	public <T> void findAllTest() {		
		
		List<FileUpload> fileuploads = this.fileuploadRepository.findAll();
		if (LOGGER.isInfoEnabled()) {
			LOGGER.info("Test FindAll(): " + fileuploads);
		}
	}
	/*
	@Transactional
	@Test
	public void findOne() {
		FileUpload file = this.fileuploadRepository.getOne(1L);

		if (LOGGER.isInfoEnabled()) {
			LOGGER.info("Test FindAll(): " + file);
		}
	}
	*/
	
	//@Transactional
	//@Test
	//public void bucaImagensUpload() {
	//	FileUpload img = this.fileuploadRepository.findByImage("Filhotes");

	//if (LOGGER.isInfoEnabled()) {
	//	LOGGER.info("Test FindAll(): " + img);
			//}
			//}
	/*@Transactional
	@Test
		public void bucaImagensUpload() {
			List img = this.fileuploadRepository.findByImageContaining("Eduardo");

		if (LOGGER.isInfoEnabled()) {
			LOGGER.info("Test FindAll(): " + img);
				}
				}
		
	
	@Transactional
	@Test
		public void bucaImagensUpload() {
			List<FileUpload> img = this.fileuploadRepository.findByImageContaining("Edu");

		if (LOGGER.isInfoEnabled()) {
			LOGGER.info("Test FindAll(): " + img);
				}
				}
		*/
	
	
}
