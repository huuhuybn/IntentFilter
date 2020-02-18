package vn.poly.intentfilter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class StudentAdapter extends BaseAdapter {


    public List<Student> students;

    public Context context;

    @Override
    public int getCount() {
        return students.size();
    }

    @Override
    public Student getItem(int i) {
        return students.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    public StudentAdapter(Context context,List<Student> students){
        this.students = students;
        this.context = context;
    }
    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = LayoutInflater.from(context).inflate
                (R.layout.item,viewGroup,false);

        TextView tvId = view.findViewById(R.id.tvId);
        TextView tvName = view.findViewById(R.id.tvName);
        Student student
                = getItem(i);
        tvId.setText(String.valueOf(student.getId()));
        tvName.setText(student.getName());

        return view;
    }
}
