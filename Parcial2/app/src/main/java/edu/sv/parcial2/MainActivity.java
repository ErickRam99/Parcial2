package edu.sv.parcial2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    String [] empleado={"Alexander Pierrot",
            "Carlos Lopez", "Sara Bonz",
            "Liliana Clarence", "Benito Peralta",
            "Juan Jaramillo", "Christian Steps","Alexa Giraldo",
            "Linda Murillo","Lizeth Astrada"};

    String [] cargo={"CEO",
            "Asistente",
            "Director de Marketing",
            "Diseñadora de Producto",
            "Supevisor de Ventas","CEO","CTO","Lead Porgrammer",
            "Directora de Marketing","CEO"

    };
    String [] compania={"Insures S.O"," Hospital Blue","Electrical Parts itd",
            "Neumaticos press"," Banco Nacional","Cooperativa Verde",
            "Frutisoft","Seguros Boliver","Concesionario Motolox"

    };
    ListView lvstEmpleado;

            Integer[]Imgempleado={ R.drawable.lead_photo_1,
                    R.drawable.lead_photo_2,
                    R.drawable.lead_photo_3,
                    R.drawable.lead_photo_4,
                    R.drawable.lead_photo_5,
                    R.drawable.lead_photo_6,
                    R.drawable.lead_photo_7,
                    R.drawable.lead_photo_8,
                    R.drawable.lead_photo_9,
                    R.drawable.lead_photo_10, };
            @Override protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_main);
                AdapPersona adaptador = new AdapPersona(this, empleado,cargo,compania, Imgempleado);
                lvstEmpleado = findViewById(R.id.lvpersonas);
                lvstEmpleado.setAdapter (adaptador);


            }
}


