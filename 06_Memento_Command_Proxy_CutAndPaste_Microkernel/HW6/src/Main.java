import java.util.ArrayList;
import java.util.Arrays;

import hw6.Employee;
import hw6.ProxyServer;
import hw6.Rules;

public class Main {
    public static void main(String[] args) {
        Rules rules = new Rules();
        ProxyServer server = new ProxyServer();

        Employee bob = new Employee("Bob", rules.getDefaultFilterList("boss"));
        Employee karen = new Employee("Karen", rules.getDefaultFilterList("manager"));
        karen.addRule("pinterest");
        Employee alice = new Employee("Alice", rules.getDefaultFilterList("employee"));
        Employee edward = new Employee("Edward", rules.getDefaultFilterList("employee"));
        edward.addRule("stackoverflow");
        rules.addDefaultFilterList("developer", edward.getRules());

        ArrayList<Employee> employees = new ArrayList<>(Arrays.asList(bob, karen, alice, edward));
        for(Employee e: employees) {
            server.request("facebook", e);
            server.request("www.stackoverflow.com", e);
            server.request("moly.hu", e);
            server.request("https://gmail.com", e);
        }
    }
}
