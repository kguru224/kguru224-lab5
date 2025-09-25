public class Rotor {

    
    private String rotorValues;
    private char startChar;
        
    public Rotor(String v, char c){
        this.rotorValues = new String(v);
        this.startChar = c;
        
        while(!this.rotate());
            
    }
    
    public boolean rotate(){

        char lastChar = this.rotorValues.charAt(this.rotorValues.length() - 1);
        this.rotorValues = lastChar + this.rotorValues.substring(0, this.rotorValues.length() - 1);
        return rotorValues.charAt(0) == this.startChar;
               
    }
    

    public int indexOf(char c){
        return this.rotorValues.indexOf(c);
    }

    public char charAt(int idx){
        return this.rotorValues.charAt(idx);
    }
}
    
