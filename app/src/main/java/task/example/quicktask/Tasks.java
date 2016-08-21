package task.example.quicktask;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Tasks extends AppCompatActivity {
    EditText taskname,dtaskname,listname;
    Button insert,delete,clear;
    String tname,dtask,ctask;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tasks);
        taskname=(EditText)findViewById(R.id.taskname);
        dtaskname=(EditText)findViewById(R.id.dtask);
        listname=(EditText)findViewById(R.id.tasklistname);
        insert= (Button) findViewById(R.id.insert);
        delete= (Button) findViewById(R.id.deletetask);
        clear= (Button) findViewById(R.id.clear);
        tname=taskname.getText().toString();
        dtask=dtaskname.getText().toString();
        ctask=listname.getText().toString();
        insert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent go=new Intent(getApplicationContext(),MainActivity.class);
                go.putExtra("task",tname);

                startActivity(go);

            }
        });
        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent go=new Intent(getApplicationContext(),MainActivity.class);
                go.putExtra("task",dtask);

                startActivity(go);

            }
        });
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent go=new Intent(getApplicationContext(),MainActivity.class);
                go.putExtra("task",ctask);

                startActivity(go);
            }
        });
    }

}
