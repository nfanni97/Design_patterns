package hw6;

public class ProxyServer implements Subject {
    private RealInternetAccess realInternetAccess = new RealInternetAccess();

    @Override
    public void request(String page, Employee accessor) {
        for(String filter: accessor.getRules()) {
            if(page.toLowerCase().contains(filter.toLowerCase())) {
                System.out.println("Access of "+page+" denied for "+accessor.getName());
                return;
            }
        }
        realInternetAccess.request(page, accessor);
    }
    
}
