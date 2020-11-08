package prototype;

import java.util.ArrayList;

public class Color {
	protected ArrayList<Integer> components = new ArrayList<>(3);
	public Color(int _r, int _g, int _b) {
		components.add(_r);
		components.add(_g);
		components.add(_b);
	}
	public Color(ArrayList<Integer> components2) {
		components = (ArrayList<Integer>) components2.clone();
/*
		components.add(components2.get(0).intValue());
		components.add(components2.get(1).intValue());
		components.add(components2.get(2).intValue());*/
	}
	
	public int getR() {
		return components.get(0);
	}
	public int getG() {
		return components.get(1);
	}
	public int getB() {
		return components.get(2);
	}
	
	public void setR(int _r) {
		components.set(0,_r);
	}
	public void setG(int _g) {
		components.set(1,_g);
	}
	public void setB(int _b) { components.set(2,_b); }
	public Color clone() {
		return new Color(components);
	}

	@Override
	public String toString() {
		return "Color{" + getR()+" "+getG()+" "+getB()+'}';
	}
}
