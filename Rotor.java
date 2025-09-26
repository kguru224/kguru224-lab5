public class Rotor {

    private String rotorValues; 
    private char startChar;     

    public Rotor(String v, char c) {
        this.rotorValues = v;
        this.startChar = c;

        // rotate until the top equals startChar
        while (this.rotorValues.charAt(0) != this.startChar) {
            this.rotate();
        }
    }


    //Rotate clock wise; the last character moves to the front
    // returns true if after this rotation the top equals the starting character. 
    public boolean rotate() {
        // get last char
        char last = this.rotorValues.charAt(this.rotorValues.length() - 1);

        // new string: last char + everything else except last
        this.rotorValues = last + this.rotorValues.substring(0, this.rotorValues.length() - 1);

        // true if back to starting top character
        return this.rotorValues.charAt(0) == this.startChar;
    }


    // Manual indexOf using only charAt
    public int indexOf(char c) {
        for (int i = 0; i < this.rotorValues.length(); i++) {
            if (this.rotorValues.charAt(i) == c) {
                return i;
            }
        }
        return -1; // should not happen for valid input
    }

    // Expose character at index
    public char charAt(int idx) {
        return this.rotorValues.charAt(idx);
    }
}
