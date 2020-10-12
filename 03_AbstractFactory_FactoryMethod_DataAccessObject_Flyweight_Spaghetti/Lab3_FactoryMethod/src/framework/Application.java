package framework;

import java.util.ArrayList;

public abstract class Application {
	public Application() {
		System.out.println("Application constructor");
		docs = new ArrayList<Document>();
	}
	
	public void NewDocument(String name) {
		System.out.println("Application::NewDocument");
		docs.add(CreateDocument(name));
		docs.get(docs.size()-1).openDocument();
	}
	
	public void OpenDocument() {}
	public void ReportDocs() {
		System.out.println("Reporting documents:");
		for (Document d : docs) {
			System.out.println(d.getName());
		}
	}
	
	public abstract Document CreateDocument(String name); 
	
	private ArrayList<Document> docs;
}
