package com.observer.www;

public interface Subject {
	public void registerObserver(Observer observer);

	public void notifyObserver();

	public Object getUpdate();
}
