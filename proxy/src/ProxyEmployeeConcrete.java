public class ProxyEmployeeConcrete implements ProxyEmployeeInterface {

    @Override
    public void create(String name , ProxyEmployeeInterface obj) throws Exception {
        System.out.println("Created a new Employee");
    }

    @Override
    public void remove(String name , ProxyEmployeeInterface obj) throws Exception {
        System.out.println("Removed a existing Employee");
    }

    @Override
    public ProxyEmployeeInterface get(String name) throws Exception {
        return new ProxyEmployeeConcrete();
    }
    
}
