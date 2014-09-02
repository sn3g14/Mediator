package pe.sunghyun.application;

import java.awt.Font;

import javax.swing.JLabel;

import pe.sunghyun.mediator.IMediator;

public class LblDisplay extends JLabel {
	
	IMediator med;
	
	LblDisplay(IMediator m){
		super("Just Start....");
		this.med = m;
		med.registerDisplay(this);
		this.setFont(new Font("Arial", Font.BOLD, 24));
	}
}
