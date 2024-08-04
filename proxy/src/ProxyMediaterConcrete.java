public class ProxyMediaterConcrete implements ProxyEmployeeInterface{

    ProxyEmployeeInterface EmployeeObject;
    ProxyMediaterConcrete(){
        EmployeeObject = new ProxyEmployeeConcrete();
    }

    @Override
    public void create(String name, ProxyEmployeeInterface obj) throws Exception {
        if(name.equals("ADMIN")){
            EmployeeObject.create(name, obj);
            return;
        }
        throw new Exception("Acess Denied");
    }

    @Override
    public void remove(String name, ProxyEmployeeInterface obj) throws Exception {
        if(name == "ADMIN"){
            EmployeeObject.remove(name, obj);
            return;
        }
        throw new Exception("Acess Denied");
    }

    @Override
    public ProxyEmployeeInterface get(String name) throws Exception {
        return EmployeeObject.get(name);
    }
    
}
