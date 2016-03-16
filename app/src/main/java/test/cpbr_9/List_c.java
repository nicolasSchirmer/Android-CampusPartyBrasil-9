package test.cpbr_9;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import test.cpbr_9.CustomAdapter;
import test.cpbr_9.R;
import test.cpbr_9.itemRow;
import test.cpbr_9.Library;

public class List_c extends AppCompatActivity {

    Intent intent;
    int value;
    ListView list;
    List<itemRow> rowItem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_c);

        // receiving from the other activity
        intent = getIntent();
        value = intent.getIntExtra(MainActivity.EXTRA, value);

        setListView();

        setViews();

        listClick();
    }


     // set itens to show in the list view
     public void setListView(){
         rowItem = new ArrayList<>();
         int aux = 0;

         if(value == 1) {
             value = Library.pickData();
             aux = funcaoPorca();
         }


         for (int i = aux; i < Library.getLength(value); i++) {
             itemRow item = new itemRow(
                     Library.getHora(value, i),
                     Library.getText(value, i),
                     Library.getPalco(value, i));
             rowItem.add(item);
         }
     }

    public int funcaoPorca(){
        for (int i = 0; i < Library.getLength(value); i++) {
            if(Library.checkHora(Library.getHora(value, i))){
                return i;
            }
        }

        for(int i = Library.getClockHora(); i < 24; i++){
            for(int j = 0; j < Library.getLength(value); j++){

            }
        }

        Log.d("num deu", "nem vai dar");
        return 0;
    }

     public void listClick(){
         list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
             @Override
             public void onItemClick(AdapterView<?> parent, View view, int pos, long id) {
             }
         });
     }

    public void setViews(){
        list = (ListView) findViewById(R.id.listView);
        CustomAdapter adapter = new CustomAdapter(this, R.layout.item, rowItem);
        list.setAdapter(adapter);
    }

    @Override
    public void onResume(){
        super.onResume();
    }

    @Override
    public void onPause(){ super.onPause(); }

    //@Override
    //public void onDestroy(){
    //    super.onDestroy();
//
    //    //save value
    //    // SharedPreferences sharedPref = getSharedPreferences("mySettings", MODE_PRIVATE);
    //    // SharedPreferences.Editor editor = sharedPref.edit();
    //    // editor.putString("mySetting", "Hello Android");
    //    // editor.apply();
    //}

}
