package com.example.android.reportcard;

/**
 * Created by Bogdan on 5/20/2017.
 */

public class ReportCard {

    //Subject (class)
    private String subject;

    //Professor's name
    private String professor;

    //ReportCard - from 1 to 10, 10 meaning 100%
    private String grade;

    //Status passed or failed and the threshold, which is 50%
    private String status;
    private static final int THRESHOLD = 5;

    public ReportCard(String inputSubject, String inputProfessor, String inputGrade) {
        subject = inputSubject;
        professor = inputProfessor;
        grade = inputGrade;
    }

    public String getSubject () {return subject;}

    public String getProfessor() {return professor;}

    public String getGrade() {return grade;}

    public String getStatus() {
        int gradetoint = Integer.parseInt(grade);
        if (gradetoint >= THRESHOLD) {status = "Status: Passed";}
        else {status = "Status: Failed";}
        return status;
    }

    //Generate the string representation of the ReportCard object
    @Override
    public String toString() {
        return "ReportCard{" + "\nsubject = \"" + subject + "\"" + "\nprofessor = \""
                + professor + "\"" + "\ngrade = " + grade + "\nstatus = \"" + getStatus() + "\"\n}\n";
    }
}
