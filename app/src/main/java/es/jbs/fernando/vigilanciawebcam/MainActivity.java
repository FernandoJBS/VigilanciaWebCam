package es.jbs.fernando.vigilanciawebcam;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WebView wView1 = (WebView) findViewById(R.id.camara1);
        WebView wView2 = (WebView) findViewById(R.id.camara2);
        wView1.loadUrl("http://192.168.1.23:8082");
        wView2.loadUrl("http://192.168.1.23:8083");
    }
}
