package com.fatec.components;

import java.io.IOException;

import com.fatec.controllers.ControllerBase;


public interface ILoggerComponent {
	public void setController(ControllerBase controller);
	public ControllerBase getController();
	public void log(String mensagem) throws IOException;
	public void warn(String mensagem) throws IOException;
	public void error(String mensagem) throws IOException;
}
