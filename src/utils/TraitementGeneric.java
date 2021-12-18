package utils;

import beans.Enseignant;

public class TraitementGeneric <T> {

    public TraitementGeneric() {
        super();
    }

    public boolean compareTo(T op1, T op2) {
        return op1.equals(op2);
    }
}
