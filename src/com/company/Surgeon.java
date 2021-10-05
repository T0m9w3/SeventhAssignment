package com.company;

import java.util.Random;

public class Surgeon extends Doctor{
    private String Hospital;

    public Surgeon(String hospital){
       super(999.99, "Fancy Name Brand School");
       Hospital = hospital;
    }
    @Override
    public void treatPatient(Person Patient){
        var hoursPicker = new Random();
        System.out.println("After "+ hoursPicker.nextInt(8) + " hours of surgery at"+ Hospital + " our patient should be on the mend");
        //Patient.getTreated();
        super.treatPatient(Patient);
    }
}
