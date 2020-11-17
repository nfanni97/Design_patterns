package nullObject;

public class Demo {

	public static void main(String[] args) {
		//Let's create a new phone book and add some records
		PhoneBook book = new PhoneBook();
		book.add(new People("Jozsi","1083 Bp, Prater u 50/a","+361886400"));
		book.add(new People("Pisti","1083 Bp, Prater u 50/a","+361886402"));
		book.add(new People("Géza","1088 Bp, Szentkirályi u 28","+3618483200"));
		
		//Let's find some people
		Entry p = book.search("Jozsi");
		System.out.println(p);
		p = book.search("Geza");
		System.out.println(p);

	}

}
