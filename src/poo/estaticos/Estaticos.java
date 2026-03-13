package poo.estaticos;

public class Estaticos {

    private static int nextID;

    public static int generateID(){
        nextID++;
        return nextID;
    }

}
