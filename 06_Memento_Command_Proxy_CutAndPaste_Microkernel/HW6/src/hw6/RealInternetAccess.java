package hw6;

class RealInternetAccess implements Subject {

    @Override
    public void request(String page, Employee accessor) {
        System.out.println(page+" accessed by "+accessor.getName());
    }
    
}
