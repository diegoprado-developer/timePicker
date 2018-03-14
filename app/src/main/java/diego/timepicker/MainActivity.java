package diego.timepicker;

import android.app.Activity;
import android.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.*;

import java.sql.Time;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnMostrar = (Button) findViewById(R.id.btnMostrarHora);
        final TimePicker tp = (TimePicker) findViewById(R.id.timePicker);

        btnMostrar.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                AlertDialog.Builder dialogo = new
                        AlertDialog.Builder(MainActivity.this);
                dialogo.setMessage("Hora Selecionada: "+String.valueOf(tp.getCurrentHour()+1)+":"+String.valueOf(tp.getCurrentMinute()));
                dialogo.setNeutralButton("OK", null);
                dialogo.setTitle("HORA");
                dialogo.show();
            }
        });
    }
}
