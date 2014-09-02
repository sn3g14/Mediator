package pe.sunghyun.mediator;

import pe.sunghyun.application.BtnBook;
import pe.sunghyun.application.BtnSearch;
import pe.sunghyun.application.BtnView;
import pe.sunghyun.application.LblDisplay;

public interface IMediator {
	public void book();
	public void view();
	public void search();
	public void registerView(BtnView v);
	public void registerSearch(BtnSearch s);
	public void registerBook(BtnBook b);
	public void registerDisplay(LblDisplay d);
}
