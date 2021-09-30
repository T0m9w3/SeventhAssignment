package com.company;

public class Main {

    public static void main(String[] args){
	Person sickPerson1 = new Person("Stu Dent");
	Person sickPerson2 = new Person("Any Body");
	var govProg = new GovernmentProgram();
	Doctor dr = new Doctor(300, "Expensive U");
	var secondDR = new Surgeon("Children's Hospital");
	dr.treatPatient(sickPerson1);
	dr.treatPatient(sickPerson2);
	dr.billPatient(sickPerson1);
	dr.billPatient(sickPerson2);
	dr.billPatient( false, govProg);
	secondDR.treatPatient(sickPerson1);
	secondDR.billPatient(sickPerson1);
    }
}
