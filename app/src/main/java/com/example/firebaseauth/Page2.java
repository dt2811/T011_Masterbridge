package com.example.firebaseauth;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QueryDocumentSnapshot;
import com.google.firebase.firestore.QuerySnapshot;

import java.util.ArrayList;

public class Page2 extends AppCompatActivity {
    ArrayList<String> a;
    ListView l;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);
        BottomNavigationView bt = findViewById(R.id.bottomNavigationView);
        bt.setOnNavigationItemSelectedListener(np);

    }

    BottomNavigationView.OnNavigationItemSelectedListener np = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            Fragment current = null;
            switch (item.getItemId()) {
                case R.id.homebutton:
                    current = new homefrag();
                    break;
                case R.id.search:
                    current = new searchfrag();
                    break;
                case R.id.add:
                    current = new addfrag();
                    break;
            }
            getSupportFragmentManager().beginTransaction().replace(R.id.fragholder, current).commit();
            return true;
        }
    };
}