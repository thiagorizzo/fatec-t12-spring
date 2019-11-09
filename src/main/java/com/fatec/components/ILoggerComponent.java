package com.fatec.components;

import java.io.IOException;

import com.fatec.controllers.Controller;

public interface ILoggerComponent {
	public void setController(Controller controller);
	public Controller getController();
	public void log(String mensagem) throws IOException;
	public void warn(String mensagem) throws IOException;
	public void error(String mensagem) throws IOException;
}
