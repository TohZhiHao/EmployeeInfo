package sg.edu.rp.c346.employeeinfo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomAdapter extends ArrayAdapter {


    Context parent_context;
    int layout_id;
    ArrayList<Employee> toDoList;

    public CustomAdapter(Context context, int resource, ArrayList<Employee> objects){
        super(context, resource, objects);

        parent_context = context;
        layout_id = resource;
        toDoList = objects;

    }
    public View getView(int position, View convertView, ViewGroup parent){

        LayoutInflater inflater = (LayoutInflater)parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View rowView = inflater.inflate(layout_id, parent, false);

        TextView tvName = rowView.findViewById(R.id.textViewName);
        TextView tvTitle = rowView.findViewById(R.id.textViewTitle);
        TextView tvSalary = rowView.findViewById(R.id.textViewSalary);

        Employee currentVersion = toDoList.get(position);

        tvName.setText(((Employee) currentVersion).getName());
        tvTitle.setText(((Employee) currentVersion).getTitle());
        tvSalary.setText(((Employee) currentVersion).getSalary().toString());
        return rowView;

    }
}
