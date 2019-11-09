package com.fatec.components;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.fatec.controllers.ControllerBase;

@Component
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class LoggerComponent implements ILoggerComponent {

	private ControllerBase controller;

	public void setController(ControllerBase controller) {
		this.controller = controller;
	}

	public ControllerBase getController() {
		return controller;
	}
	
	@Override
	public void log(String mensagem) throws IOException {
		File file = new File("log.txt");
		FileWriter fw = new FileWriter(file);
		fw.write("Controller: " + controller.getNome() + " - Log: " + mensagem);
		fw.close();
	}

	@Override
	public void warn(String mensagem) throws IOException {
		File file = new File("log.txt");
		FileWriter fw = new FileWriter(file);
		fw.write("Controller: " + controller.getNome() + " Warning: " + mensagem);
		fw.close();		
	}

	@Override
	public void error(String mensagem) throws IOException {
		File file = new File("log.txt");
		FileWriter fw = new FileWriter(file);
		fw.write("Controller: " + controller.getNome() + "Error: " + mensagem);
		fw.close();		
	}
}
