package es.ieslavereda.ejercicioactividad3;

import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView viewText;
    private Button sendButton;
    private RadioButton radioCiclismo;
    private RadioButton radioNa;
    private RadioButton radioNatacion;
    private RadioButton radioGames;
    private Spinner spinnerView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioCiclismo=findViewById(R.id.radioButtonCiclismo);
        radioNa=findViewById(R.id.radioButtonNa);
        radioNatacion=findViewById(R.id.radioButtonNatacion);
        radioGames=findViewById(R.id.radioButtonGames);
        sendButton=findViewById(R.id.enviarBoton);
        spinnerView=findViewById(R.id.spinner);

        ActivityResultLauncher<Intent> lanzadorActividadResultado=
                registerForActivityResult(
                        new ActivityResultContracts.StartActivityForResult(),
                        result -> {
                            if (result.getResultCode()==RESULT_CANCELED)
                                Toast.makeText(this, "Cancelado por el usuario",
                                        Toast.LENGTH_LONG).show();
                            if (result.getResultCode()==RESULT_OK){
                                Intent data = result.getData();
                                String resultado =data.getExtras().getString("resultado");
                                viewText.setText(resultado);
                            }
                        }
                );

        sendButton.setOnClickListener(view ->  {
                Intent intent = new Intent(this, SecondActivity.class);
                intent.putExtra("usuario", "Pepito Perez");
                intent.putExtra("edad", 27);
                lanzadorActividadResultado.launch(intent);
        });
        radioCiclismo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view) {
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