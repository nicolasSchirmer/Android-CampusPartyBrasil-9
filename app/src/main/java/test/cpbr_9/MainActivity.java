package test.cpbr_9;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Intent intent;
    public final static String EXTRA = "hololo0";
    Button now, qrt, qnt, sex, sab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setButtons();
    }

    final public void setButtons(){
        now = (Button) findViewById(R.id.button);
        now.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setList(1);
            }
        });

        qrt = (Button) findViewById(R.id.button2);
        qrt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setList(2);
            }
        });


        qnt = (Button) findViewById(R.id.button3);
        qnt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setList(3);
            }
        });


        sex = (Button) findViewById(R.id.button4);
        sex.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setList(4);
            }
        });


        sab = (Button) findViewById(R.id.button5);
        sab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setList(5);
            }
        });


    }

    public void setList(int i){
        intent = new Intent(this, List_c.class);
        intent.putExtra(EXTRA, i);
        startActivity(intent);
    }


}
