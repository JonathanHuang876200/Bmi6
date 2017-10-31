package tom.com.bmi6;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void bmi (View view){
        EditText weight = (EditText)findViewById(R.id.ed_weight);
        EditText height = (EditText)findViewById(R.id.ed_height);
        float w = Float.parseFloat(weight.getText().toString());
        float h = Float.parseFloat(height.getText().toString());
        float bmi = w/(h*h);
        new AlertDialog.Builder(this)
                .setMessage("Your bmi is" +bmi)
                .setPositiveButton("OK", null)
                .show();
    }
}


