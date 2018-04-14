package com.example.marci.aplikacja_kozienalia_2018;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by marci on 14.04.2018.
 */

public class ulubione_collection implements Serializable {
    private List<Wykonawca> ulubione;

    public List<Wykonawca> getUlubione(){
        return ulubione;
    }

    public void setUlubione(List<Wykonawca> ulubione){
        this.ulubione=ulubione;
    }
}
