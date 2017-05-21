package com.example.android.reportcard;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

import static com.example.android.reportcard.R.id.grade;

/**
 * Created by Bogdan on 5/21/2017.
 */

public class GradeAdapter extends ArrayAdapter<ReportCard> {

    public GradeAdapter(Activity context, ArrayList<ReportCard> reportCards) {
        super(context, 0, reportCards);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate( R.layout.components_layout, parent, false);
        }

        ReportCard currentgrade = getItem(position);

        TextView subjectTextView = (TextView) listItemView.findViewById(R.id.subject);
        subjectTextView.setText(currentgrade.getSubject());

        TextView professorTextView = (TextView) listItemView.findViewById(R.id.professor);
        professorTextView.setText(currentgrade.getProfessor());

        TextView gradeTextView = (TextView) listItemView.findViewById(grade);
        gradeTextView.setText(currentgrade.getGrade());

        TextView statusTextView = (TextView) listItemView.findViewById(R.id.status);
        statusTextView.setText(currentgrade.getStatus());


        return listItemView;
    }


}
