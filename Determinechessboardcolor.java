public class Determinechessboardcolor {
    public boolean squareIsWhite(String coordinates) {
        char column=coordinates.charAt(0);
        char row=coordinates.charAt(1);
        int columnnumber=column-'a'+1;
        int rownumber=row-'0';
        return(columnnumber+rownumber)%2!=0;
        
        
        
    
    }
}