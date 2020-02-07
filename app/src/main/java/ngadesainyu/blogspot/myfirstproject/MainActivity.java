package ngadesainyu.blogspot.myfirstproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_buat_kedua);
        TextView txt = findViewById(R.id.text);
        txt.setText(R.string.iseng);
    }
}
