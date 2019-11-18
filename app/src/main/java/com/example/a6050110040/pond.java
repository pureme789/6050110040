package com.example.a6050110040;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class pond extends AppCompatActivity {

    public void convert(View view) {


        Button button= findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText money =(EditText) findViewById(R.id.money);
                Double dollarAmount = Double.parseDouble(money.getText().toString());

                Double poundAmount = dollarAmount/33.5;
                AlertDialog.Builder dig1 = new AlertDialog.Builder(pond.this);
                dig1.setTitle("THAI --> EUR");
                dig1.setMessage(" "+poundAmount+"ยูโร" );
                //dig1.setIcon(R.drawable.save);
                dig1.setPositiveButton("Yes", new DialogInterface.OnClickListener()
                {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(getApplicationContext(), "YEP IS MEAN V", Toast.LENGTH_SHORT).show();
                    }
                });

                dig1.setNegativeButton("No", new DialogInterface.OnClickListener()
                {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(getApplicationContext(), "YEP IS MEAN X", Toast.LENGTH_SHORT).show();

                    }
                });
                dig1.setNeutralButton("Cancel", new
                        DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(getApplicationContext(), "You clicked on Cancel", Toast.LENGTH_SHORT).show();
                                dialog.cancel();
                            }
                        });
                dig1.create();
                dig1.show();
            }
        });
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pond);


    }
}
