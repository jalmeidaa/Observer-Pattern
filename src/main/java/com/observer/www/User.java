package com.observer.www;

public class User implements Observer {
	private String notification;
	private Subject message;

	public void setSubject(Subject message) {
		this.message = message;
		notification = "No new Update";
	}

	@Override
	public void update() {

		System.out.println("Notification : Change in state");
		notification = (String) message.getUpdate();
	}

	public String getNotification() {
		return notification;
	}
}
