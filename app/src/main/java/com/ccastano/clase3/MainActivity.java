package com.ccastano.clase3;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.Calendar;
import java.util.Date;


public class MainActivity extends Activity {

    private TextView dia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dia=(TextView)findViewById(R.id.getdia);

        final Calendar cal = Calendar.getInstance();
        Date date = cal.getTime();
        dia.setText(date.toString());

        if (savedInstanceState==null){
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.container, new PlaceholderFragment())
                    .commit();
        }


    }

    public static class PlaceholderFragment extends Fragment {
        public PlaceholderFragment(){
        }

        public View onCreateView(layoutInflater inflater, ViewGroup container, Bundle saveInstanceState){

            View rootView = inflater.inflate(R.layout.fragment_blank, container, false);
            return rootView;
        }
    }


}
