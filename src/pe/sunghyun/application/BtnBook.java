package pe.sunghyun.application;

import java.awt.event.ActionListener;

import javax.swing.JButton;

import pe.sunghyun.command.Command;
import pe.sunghyun.mediator.IMediator;

public class BtnBook extends JButton implements Command {
	
	IMediator med;
	
	BtnBook(ActionListener al, IMediator m) {
		super("Book");
		this.addActionListener(al);
		this.med = m;
		med.registerBook(this);
	}
	
	@Override
	public void execute() {
		med.book();
	}

}
