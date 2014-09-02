package pe.sunghyun.application;

import java.awt.event.ActionListener;

import javax.swing.JButton;

import pe.sunghyun.command.Command;
import pe.sunghyun.mediator.IMediator;

public class BtnView extends JButton implements Command {
	IMediator med;
	
	BtnView(ActionListener al, IMediator m) {
		super("View");
		this.addActionListener(al);
		med = m;
		med.registerView(this);
	}

	@Override
	public void execute() {
		med.view();
	}
}
