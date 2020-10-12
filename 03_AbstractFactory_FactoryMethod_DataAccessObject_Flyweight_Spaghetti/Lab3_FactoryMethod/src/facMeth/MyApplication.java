package facMeth;

import framework.Application;
import framework.Document;

public class MyApplication extends Application {
	public MyApplication() {
		System.out.println("MyApplication Constructor");
	}
	
	@Override
	public Document CreateDocument(String name) {
		System.out.println("MyApplication::CreateDocument");
		Document s = new MyDocument(name);
		return s;
	}
	
	public static void main(String[] args) {
		MyApplication myapp = new MyApplication();
		
		myapp.NewDocument("foo");
		myapp.NewDocument("bar");
		myapp.ReportDocs();
	}

}
