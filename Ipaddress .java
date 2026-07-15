public class Ipaddress {
    public String defangIPaddr(String address) {
        return address.replace(".","[.]");
        
    }
}