package com.company;

import java.util.Random;

public class GovernmentProgram{
    private String programName;

    public GovernmentProgram(){
        String[] programList = {"Medicare", "Medicade", "VA", "ObamaCare", "CongressCare"};
        var Picker = new Random();
        var Number = Picker.nextInt(programList.length);
        programName = programList[Number];
    }
    public void payBill(double Cost){
        if(programName.equals("CongressCare"))
            System.out.println("CongressCare is paying a bill of "+ Cost + " and giving a kickback ... sum tip of " + Cost*2);
        else if(programName.equals("Medicare"))
            System.out.println("Medicare is paying "+ Cost + "welcome senior citizen");
        else
            System.out.println(programName+ " is paying "+ Cost);
    }
}
