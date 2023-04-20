package es.ieslavereda.ejercicioactividad3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView viewText;
    private Button sendButton;
    private RadioButton radioCiclismo;
    private RadioButton radioNa;
    private RadioButton radioNatacion;
    private RadioButton radioGames;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioCiclismo=findViewById(R.id.radioButtonCiclismo);
        radioNa=findViewById(R.id.radioButtonNa);
        radioNatacion=findViewById(R.id.radioButtonNatacion);
        radioGames=findViewById(R.id.radioButtonGames);
        sendButton=findViewById(R.id.enviarBoton);

        sendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        radioCiclismo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // whatever
            }
        });
        radioNa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //whatever
            }
        });
        radioNatacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //whatever
            }
        });
        radioGames.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //whatever
            }
        });


    }
}