package com.shimbhu;

public class BuilderMethod {

	public static void main(String[] args) {
		// Usage
		ComputerBuilder builder = new ComputerBuilder();
		Computer computer = builder.setCpu("Intel Core i7").setRam("16GB").setStorage("512GB SSD")
				.setGraphicsCardEnabled(true).setBluetoothEnabled(true).build();

		System.out.println(computer.toString());

		ComputerBuilder MacBookbuilder = new ComputerBuilder();
		Computer laptop = MacBookbuilder.setCpu("Macbook M4 Pro Max").setStorage("512GB SSD")
				.setBluetoothEnabled(true).build();

		System.out.println(laptop);
	}

}

//Product
class Computer {
	private String cpu;
	private String ram;
	private String storage;
	private Boolean isGraphicsCardEnabled;
	private Boolean isBluetoothEnabled;

	@Override
	public String toString() {
		return "Computer [cpu=" + cpu + ", ram=" + ram + ", storage=" + storage + ", isGraphicsCardEnabled="
				+ isGraphicsCardEnabled + ", isBluetoothEnabled=" + isBluetoothEnabled + "]";
	}

	public Computer(ComputerBuilder builder) {
		this.cpu = builder.getCpu();
		this.ram = builder.getRam();
		this.storage = builder.getStorage();
		this.isGraphicsCardEnabled = builder.isGraphicsCardEnabled();
		this.isBluetoothEnabled = builder.isBluetoothEnabled();
	}

	public String getCpu() {
		return cpu;
	}

	public void setCpu(String cpu) {
		this.cpu = cpu;
	}

	public String getRam() {
		return ram;
	}

	public void setRam(String ram) {
		this.ram = ram;
	}

	public String getStorage() {
		return storage;
	}

	public void setStorage(String storage) {
		this.storage = storage;
	}

	public Boolean isGraphicsCardEnabled() {
		return isGraphicsCardEnabled;
	}

	public void setGraphicsCardEnabled(Boolean isGraphicsCardEnabled) {
		this.isGraphicsCardEnabled = isGraphicsCardEnabled;
	}

	public Boolean isBluetoothEnabled() {
		return isBluetoothEnabled;
	}

	public void setBluetoothEnabled(Boolean isBluetoothEnabled) {
		this.isBluetoothEnabled = isBluetoothEnabled;
	}

}

//Builder
class ComputerBuilder {
	private String cpu;
	private String ram;
	private String storage;
	private Boolean isGraphicsCardEnabled;
	private Boolean isBluetoothEnabled;

	public String getCpu() {
		return cpu;
	}

	public String getRam() {
		return ram;
	}

	public String getStorage() {
		return storage;
	}

	public Boolean isGraphicsCardEnabled() {
		return isGraphicsCardEnabled;
	}

	public Boolean isBluetoothEnabled() {
		return isBluetoothEnabled;
	}

	public ComputerBuilder setCpu(String cpu) {
		this.cpu = cpu;
		return this;
	}

	public ComputerBuilder setRam(String ram) {
		this.ram = ram;
		return this;
	}

	public ComputerBuilder setStorage(String storage) {
		this.storage = storage;
		return this;
	}

	public ComputerBuilder setGraphicsCardEnabled(Boolean isGraphicsCardEnabled) {
		this.isGraphicsCardEnabled = isGraphicsCardEnabled;
		return this;
	}

	public ComputerBuilder setBluetoothEnabled(Boolean isBluetoothEnabled) {
		this.isBluetoothEnabled = isBluetoothEnabled;
		return this;
	}

	public Computer build() {
		return new Computer(this);
	}

}
