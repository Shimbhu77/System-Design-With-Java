package com.shimbhu;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ObserverMethod {

	public static void main(String[] args) {
		StockMarket stockMarket = new StockMarket();

		Investor investor1 = new Investor("Shimbhu");
		Investor investor2 = new Investor("Vijendra");

		stockMarket.registerObserver(investor1);
		stockMarket.registerObserver(investor2);

		// Simulate changes in stock prices
		stockMarket.updateStockPrice("GOOGL", 2500);
		// Output:
		// Shimbhu received update for GOOGL : $2500.0
		// Vijendra received update for GOOGL : $2500.0

		stockMarket.updateStockPrice("AAPL", 150);
		// Output:
		// Shimbhu received update for AAPL : $150.0
		// Vijendra received update for AAPL : $150.0
	}
}

//Observer.java
interface Observer {
	void update(String stockName, double price);
}

//Subject.java
interface Subject {
	void registerObserver(Observer observer);

	void removeObserver(Observer observer);

	void notifyObservers();
}

//Investor.java
class Investor implements Observer {
	private String name;

	public Investor(String name) {
		this.name = name;
	}

	public void update(String stockName, double price) {
		System.out.println(name + " received update for " + stockName + " : $" + price);
	}
}

//StockMarket.java
class StockMarket implements Subject {
	private Map<String, Double> stocks;
	private List<Observer> observers;

	public StockMarket() {
		stocks = new HashMap<>();
		observers = new ArrayList<>();
	}

	public void registerObserver(Observer observer) {
		observers.add(observer);
	}

	public void removeObserver(Observer observer) {
		observers.remove(observer);
	}

	public void notifyObservers() {
		for (String key : stocks.keySet()) {
			for (Observer observer : observers) {
				observer.update(key, stocks.get(key));
			}
		}
	}

	// Simulate changes in stock prices
	public void updateStockPrice(String stockName, double price) {
		stocks.put(stockName, price);
		notifyObservers();
		stocks.clear();
	}
}
