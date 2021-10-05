package com.company;

public class Doctor{
    private double Fee;
    protected String AlmaMater;

    public Doctor(double Cost, String MedSchool){
        Fee = Cost;
        AlmaMater = MedSchool;
    }
    @Override
    public String toString(){
        return "doctor from " + AlmaMater + " who charges " + Fee;
    }
    @Override
    public boolean equals(Object Other){
        if (! (Other instanceof Doctor))
            return false;
        Doctor OtherDoctor = (Doctor) Other;
        var isSame = this.Fee == OtherDoctor.Fee && this.AlmaMater == OtherDoctor.AlmaMater;
        return isSame;
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
