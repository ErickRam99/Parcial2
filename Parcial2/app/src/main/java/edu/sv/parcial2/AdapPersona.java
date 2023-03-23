package edu.sv.parcial2;
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

    public class AdapPersona extends ArrayAdapter<String> {
        Activity contex;

        String []persona;
        String []cargo;
        String []compania;
        Integer [] Imgpersona;
        ImageView imgfoto;
        TextView tvxNombre;
        TextView txvcargo;
        TextView txvcomapnia;
        public AdapPersona(Activity contex, String[]persona, String[]cargo,String[]compania, Integer[]Imgpersona) {
            super(contex, R.layout.personas,persona);
            this.contex = contex;
            this.persona = persona;
            this.cargo=cargo;
            this.compania= compania;
            this.Imgpersona = Imgpersona;

        }
        public View getView(int posicion, View v, ViewGroup parent) {
            LayoutInflater inflater = contex.getLayoutInflater();
            View rowView = inflater.inflate(R.layout.personas, null, true);
            tvxNombre = rowView.findViewById(R.id.txvNombre);
            txvcargo= rowView.findViewById(R.id.txvcargo);
            txvcomapnia= rowView.findViewById(R.id.txvcompa);
            imgfoto = rowView.findViewById(R.id.imgfotos);
            tvxNombre.setText(persona[posicion]);
            txvcargo.setText(cargo[posicion]);
            txvcomapnia.setText(compania[posicion]);
            imgfoto.setImageResource(Imgpersona[posicion]); return rowView;
        }
    }

