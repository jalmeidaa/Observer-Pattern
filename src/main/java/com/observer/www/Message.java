package com.observer.www;

import java.util.ArrayList;
import java.util.List;

public class Message implements Subject {

	List<Observer> observersMsg;
	private boolean stateChange;

	public Message() {
		this.observersMsg = new ArrayList<Observer>();
		stateChange = false;
	}

	public void registerObserver(Observer observer) {
		observersMsg.add(observer);
	}

	public void notifyObserver() {
		if (stateChange) {
			for (Observer observer : observersMsg) {
				observer.update();
			}
		}
	}

	public Object getUpdate() {
		Object changedState = null;
		if (stateChange) {
			changedState = "Observer Pattern";
		}
		return changedState;
	}

	public void showNewMessage() {
		stateChange = true;
		notifyObserver();
	}

}