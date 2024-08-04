public class Proxy {
    public static void main(String[] args) throws Exception {
        
        ProxyEmployeeInterface obj = new ProxyMediaterConcrete();

        System.out.println(obj.get("ADMIN"));
    }
}
