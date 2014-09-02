package pe.sunghyun.application;

import java.awt.event.ActionListener;

import javax.swing.JButton;

import pe.sunghyun.command.Command;
import pe.sunghyun.mediator.IMediator;

public class BtnSearch extends JButton implements Command {
	
	IMediator med;
	
	BtnSearch(ActionListener al, IMediator m){
		super("Search");
		this.addActionListener(al);
		med = m;
		med.registerSearch(this);
	}
	@Override
	public void execute() {
		med.search();
	}

}
