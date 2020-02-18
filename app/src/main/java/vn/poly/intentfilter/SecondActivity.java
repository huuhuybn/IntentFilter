package vn.poly.intentfilter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class SecondActivity extends AppCompatActivity {

    
    private List<Student> mangStudents;

    ListView listView;
    StudentAdapter studentAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        mangStudents = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            Student student = new Student();
            student.setId(i);
            student.setName("Huy Nguyen " + i);
            mangStudents.add(student);

        }

        listView = findViewById(R.id.lvList);

        studentAdapter = new StudentAdapter(SecondActivity.this,mangStudents);

        listView.setAdapter(studentAdapter);



        
        
        
        
        
        
        
        
        
        
        
        
        
        Intent intent = getIntent();

        int soNguyen =
                intent.getIntExtra("soNguyen",-1);
        if (soNguyen > 0){
            Log.e("soNguyen",soNguyen +"");
        }

        String chuoi = intent.getStringExtra("chuoi");
        Log.e("CHUOI",chuoi);


        Bundle bundle = intent.getBundleExtra("data");

        String name = bundle.getString("NAME");

        Log.e("Name",name);



    }
}
