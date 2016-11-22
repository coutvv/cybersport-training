package ru.coutvv.cybersport.training.view;

import java.util.List;

import ru.coutvv.cybersport.training.view.mouse.ClickHandler;

public interface Viewer {

	public void setViewObject(List<ViewObject> vo);
	
	public void redraw();
	
	public void setClickHandler(ClickHandler ch);
	
}
