package com.example.superben9.funfacts;

import java.util.Random;

/**
 * Created by coder_ben on 7/11/15.
 */
public class FactBook {
    public String[] mfacts = {
            "Release Records within Sharepoint are no longer acceptable after 12/25.",
            "Change Records for all known base, lifecycle and discretionary projects have been created.",
            "A Release Calendar will be within your ServiceNow Reports by January 10th, 2016.",
            "Change Records have been assigned to the team leads who are impacted by the project.",
            "Project Managers are assigned to the watch list within ServiceNow.",
            "When a project moves from one release to another please change the planned start date and the related release record.",
            "Use tasks within Change Records.",
            "There may be multiple change records for a single project across multiple releases.",
            "Incidents caused by a change within a change record must be tied back to the Change Records.",
            "Within the Test Plan of the change record please use the In Dev, Ready For Test, Ready For PreProd."
    };

    public String getFact(){

        String fact = "";

        //randomly select a fact
        Random randomGenerator = new Random(); //construct a new random generator
        int randomNumber = randomGenerator.nextInt(mfacts.length);
        fact = mfacts[randomNumber];

        return fact;

    }

}
