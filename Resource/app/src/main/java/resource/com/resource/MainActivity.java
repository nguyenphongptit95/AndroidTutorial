package resource.com.resource;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loadIMG();
        loadTxt();
    }

    private void loadIMG(){
        ImageView img = (ImageView) findViewById(R.id.myImg);
        img.setImageResource(R.drawable.aoi_bl);
    }

    private void loadTxt(){
        TextView txt = (TextView) findViewById(R.id.txt_hello);
        txt.setText(R.string.hello);
    }
}
