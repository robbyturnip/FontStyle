package robbyturnip333.gmail.com.latihan_2;

import android.graphics.Color;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
  // TODO 1: deklarasi variabel di java
    CheckBox cbBold,cbItalic;
    TextView nama;
    RadioButton red,green,blue,yellow;
    LinearLayout ln;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    // TODO 2: registrasi layout view dengan java
        cbBold=findViewById(R.id.cbbold);
        nama=findViewById(R.id.nama);
        red=findViewById(R.id.rbred);
        green=findViewById(R.id.rbgreen);
        blue=findViewById(R.id.rbblue);
        yellow=findViewById(R.id.rbyellow);
        cbItalic=findViewById(R.id.cbitalic);

    }
    // TODO 3: membuat method untuk fungsi checkbox di klik
    public void cbBoldKLik(View view){
        boolean centang=cbBold.isChecked();
        if(centang){
            nama.setTypeface(Typeface.DEFAULT_BOLD);
        }
        else
            nama.setTypeface(Typeface.DEFAULT);
    }

    public  void warnaKlik(View view) {
        boolean warna = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            case R.id.rbred:
                if (warna) nama.setBackgroundColor(Color.RED);
                break;
            case R.id.rbgreen:
                if (warna) nama.setBackgroundColor(Color.GREEN);
                break;
            case R.id.rbblue:
                if (warna) nama.setBackgroundColor(Color.BLUE);
                break;
            case R.id.rbyellow:
                if (warna) nama.setBackgroundColor(Color.YELLOW);
                break;
            default:
                nama.setBackgroundColor(Color.GRAY);

        }
    }
        public void cbItalic(View view){
            boolean italic=cbItalic.isChecked();
            if(italic){
                nama.setTypeface(Typeface.defaultFromStyle(Typeface.ITALIC));
            }
            else
                nama.setTypeface(Typeface.DEFAULT);
        }
    }

