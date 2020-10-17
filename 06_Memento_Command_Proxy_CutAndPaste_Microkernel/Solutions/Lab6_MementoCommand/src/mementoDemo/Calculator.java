package mementoDemo;

public class Calculator {
	protected double current_value = 0.0;
	
	public Calculator(double val) {
		current_value = val;
	}
	
	public Memento createMemento() {
		Memento mem =  new Memento();
		mem.setState(current_value);
		return mem;
	}
	
	public void setMemento(Memento mem) {
		current_value = mem.getState();
	}
	
	public void doDouble() {
		current_value =current_value*2; 
	}
	public void doHalve() {
		current_value =current_value/2; 
	}
	public double getValue() {
		return current_value;
	}
}
