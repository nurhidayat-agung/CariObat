package selowdev.cariobat;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {



    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imgBtnClickListener();

    }

    public void imgBtnClickListener(){

        ImageButton search = (ImageButton)findViewById(R.id.imgbtn_cari);
        search.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent cariIntent = new Intent("selowdev.cariobat.CariObat");
                        startActivity(cariIntent);
                    }
                }
        );

        ImageButton abaut = (ImageButton)findViewById(R.id.imgbtn_tentang);
        abaut.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        startActivity(new Intent(MainActivity.this, Pop.class));
                    }
                }
        );

    }

}
