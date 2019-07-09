package sg.edu.rp.c346.employeeinfo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lvList;
    ArrayList<Employee> alEmployee;
    CustomAdapter aaList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvList = findViewById(R.id.listViewEmployee);

        alEmployee = new ArrayList<>();

        alEmployee.add(new Employee("John", "Soft Technical Leader", 3400.00));
        alEmployee.add(new Employee("May", "Programmer", 2200.00));

        aaList = new CustomAdapter(this, R.layout.employee_item, alEmployee);
        lvList.setAdapter(aaList);
    }
    }

