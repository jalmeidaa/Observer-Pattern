package com.observer.www;

public class ObserverTest {

	public static void main(String[] args) {
		Message notifi = new Message();
		User user = new User();
		User user1 = new User();
		notifi.registerObserver(user);
		notifi.registerObserver(user1);
		user.setSubject(notifi);
		user1.setSubject(notifi);
		
		System.out.println(user.getNotification());
		notifi.showNewMessage();;
		System.out.println(user.getNotification());
	}

}
