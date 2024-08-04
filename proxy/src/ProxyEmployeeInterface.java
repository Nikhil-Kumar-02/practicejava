public interface ProxyEmployeeInterface {
    public void create(String name , ProxyEmployeeInterface obj) throws Exception;
    public void remove(String name , ProxyEmployeeInterface obj) throws Exception;
    public ProxyEmployeeInterface get(String name) throws Exception;
}
