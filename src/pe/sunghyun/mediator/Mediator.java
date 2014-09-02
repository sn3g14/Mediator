package pe.sunghyun.mediator;

import pe.sunghyun.application.BtnBook;
import pe.sunghyun.application.BtnSearch;
import pe.sunghyun.application.BtnView;
import pe.sunghyun.application.LblDisplay;

public class Mediator implements IMediator {
	
	BtnView btnView;
	BtnSearch btnSearch;
	BtnBook btnBook;
	LblDisplay show;
	
	@Override
	public void book() {
		btnBook.setEnabled(false);
		btnView.setEnabled(true);
		btnSearch.setEnabled(true);
		show.setText("booking...");
	}

	@Override
	public void view() {
		btnBook.setEnabled(true);
		btnView.setEnabled(false);
		btnSearch.setEnabled(true);
		show.setText("viewing...");
	}

	@Override
	public void search() {
		btnBook.setEnabled(true);
		btnView.setEnabled(true);
		btnSearch.setEnabled(false);
		show.setText("searching...");
	}

	@Override
	public void registerView(BtnView v) {
		this.btnView = v;
	}

	@Override
	public void registerSearch(BtnSearch s) {
		this.btnSearch = s;
	}

	@Override
	public void registerBook(BtnBook b) {
		this.btnBook = b;
	}

	@Override
	public void registerDisplay(LblDisplay d) {
		this.show = d;
	}

}
