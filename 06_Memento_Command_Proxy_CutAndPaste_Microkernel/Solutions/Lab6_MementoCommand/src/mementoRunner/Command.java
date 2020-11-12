package mementoRunner;

import java.util.ArrayList;

import mementoDemo.Calculator;
import mementoDemo.Memento;

public class Command {
	static ArrayList<Command> clist = new ArrayList<Command>();
	static ArrayList<Memento> mlist = new ArrayList<Memento>();
	
	static int current_pos = 0;
	
	private int op = 0;
	Calculator receiver;
	
	public Command(Calculator recv, int operation) {
		receiver = recv;
		op = operation;
	}
	public void execute() {
		Memento mem = receiver.createMemento();
		if (op == 1)
			receiver.doDouble();
		else if (op == 2)
			receiver.doHalve();
		for (int i = mlist.size()-1; i >= current_pos; i--) {
			mlist.remove(i);
			clist.remove(i);
		}
		mlist.add(mem);
		clist.add(this);
		current_pos++;
	}
	
	public static void undo() {
		clist.get(current_pos-1).receiver.setMemento(mlist.get(current_pos-1));
		current_pos--;
	}
	
	public static void redo() {
		if (clist.get(current_pos).op ==1)
			clist.get(current_pos).receiver.doDouble();
		else if (clist.get(current_pos).op ==2)
			clist.get(current_pos).receiver.doHalve();
		
		current_pos++;
	}
}
