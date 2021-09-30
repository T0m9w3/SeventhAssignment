package com.company;

public class Doctor{
    private double Fee;
    protected String AlmaMater;

    public Doctor(double Cost, String MedSchool){
        Fee = Cost;
        AlmaMater = MedSchool;
    }
    public void treatPatient(Person Patient){
        System.out.println("Take two of these and call the office in the morning");
        Patient.getTreated();
    }
    public double billPatient(Person Patient){
        Patient.payBill(Fee);
        return Fee;
    }
    public double billPatient(boolean isMedicare, GovernmentProgram govProgram){
        var billedCost = 0.0;
        if(isMedicare)
            billedCost = Fee/2;
        else
            billedCost = Fee;
        return billedCost;
    }
}
