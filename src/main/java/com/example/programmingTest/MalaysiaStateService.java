package com.example.programmingTest;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Objects;

@Service
public class MalaysiaStateService {

    public String getState(String postcode) {

        return findState(postcode).toString();

    }

    private MalaysiaState findState(String postcode){
        ArrayList<MalaysiaState> arrState= new ArrayList<>();

        arrState.add(new MalaysiaState("Perak","Tapah","35000"));
        arrState.add(new MalaysiaState("Wp Kuala Lumpur","Kuala Lumpur","50000"));
        arrState.add(new MalaysiaState("Johor","Johor Bahru","80000"));
        arrState.add(new MalaysiaState("Wp Kuala Lumpur","Kuala Lumpur","56000"));

        for (MalaysiaState state: arrState) {
            if(Objects.equals(state.getPostcode(), postcode)){
                return state;
            }
        }

        return new MalaysiaState();
    }




}
