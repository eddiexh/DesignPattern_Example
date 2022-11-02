package Memento_Memento;

import java.util.*;

class Memento {
    private String state;
    public Memento(String stateToSave) {
        state = stateToSave;
    }
    public String getSavedState() {
        return state;
    }
}
