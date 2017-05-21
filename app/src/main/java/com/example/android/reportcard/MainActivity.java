package com.example.android.reportcard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //array for storing the report card elements
        //Course (Subject)
        //Professor's name
        //ReportCard
        ArrayList<ReportCard> reportCards = new ArrayList<ReportCard>();
        reportCards.add(new ReportCard("Algebra", "Dr. Houssein","8"));
        reportCards.add(new ReportCard("Analysis", "Prof. Gaillot","10"));
        reportCards.add(new ReportCard("Probability and statistics", "Dr. Xiu","6"));
        reportCards.add(new ReportCard("Geometry and dynamics", "Dr. Stanley","5"));
        reportCards.add(new ReportCard("Multivariate calculus", "Dr. Schürtz","3"));
        reportCards.add(new ReportCard("Mathematical models", "Prof. Markstein","3"));
        reportCards.add(new ReportCard("Complex analysis", "Prof. Hobbes","9"));
        reportCards.add(new ReportCard("Metric spaces", "Dr. Marin","6"));
        reportCards.add(new ReportCard("Differential equations", "Prof. Al-Maron","4"));
        reportCards.add(new ReportCard("Number theory", "Dr. Daniel","2"));


        GradeAdapter adapter = new GradeAdapter (this, reportCards);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);

        Log.v("Log entry for ", "Report card current item: " + reportCards);




    }
}
