public class Enigma{

    private String rotorInit[] = {"#GNUAHOVBIPWCJQXDKRYELSZFMT",
        "#EJOTYCHMRWAFKPUZDINSXBGLQV",
        "#BDFHJLNPRTVXZACEGIKMOQSUWY",
        "#NWDKHGXZVRIFJBLMAOPSCYUTQE",
        "#TGOWHLIFMCSZYRVXQABUPEJKND"};


    private Rotor rotors[];
        
    public Enigma(int id1, int id2, int id3, String start){

        rotors = new Rotor[3];
        rotors[0] = new Rotor(rotorInit[id1-1], start.charAt(0));
        rotors[1] = new Rotor(rotorInit[id2-1], start.charAt(1));
        rotors[2] = new Rotor(rotorInit[id3-1], start.charAt(2));
        
    }


    public String decrypt(String message){        
        //TODO
        return "abc";
    }


    
    public String encrypt(String message){
        //TODO
        String result = ""; //build encrypted string
        for (int i = 0; i < message.length(); i++) {
            char c = message.charAt(i);
            
            //Find index of c in inner rotor
            int idx = rotors[0].indexOf(c);
            //Map through the middle rotor
            char map = rotors[1].charAt(idx);
            //Find the index of map in the middle rotor
            idx = rotors[1].indexOf(map);
            //Map through the inner rotor
            map = rotors[0].charAt(idx);
            //append the result
            result += map;

            rotate();

        }

        return result;
    }

    
    private void rotate(){
        if(rotors[0].rotate()){
            if(rotors[1].rotate()){
                rotors[2].rotate();
            }
        }
    }
    
}
