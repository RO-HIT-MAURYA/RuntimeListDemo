package apollo.hospitals.runtimelistdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<String> list;
    String string="";
    ListView listView;
    ArrayAdapter<String> arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list = new ArrayList<>();
        listView = findViewById(R.id.listView);
        arrayAdapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,list);
        listView.setAdapter(arrayAdapter);
    }

    public void onAdd(View view)
    {
        string = ((EditText) findViewById(R.id.editText)).getText().toString();
        list.add(string);
        arrayAdapter.notifyDataSetChanged();
    }
}
