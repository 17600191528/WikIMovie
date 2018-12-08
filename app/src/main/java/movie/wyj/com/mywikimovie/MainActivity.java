package movie.wyj.com.mywikimovie;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    private int time = 3;
    private Handler handler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            if (time != 0) {
                handler.sendEmptyMessageDelayed(time, 1000);
                time--;
            } else {
//                if (!SharedUtils.getInstance().getisLogin()) {
                    startActivity(new Intent(MainActivity.this, LeadActivity.class));
//                } else {
//                    startActivity(new Intent(MainActivity.this, HomeActivity.class));
//                }
            }
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        handler.sendEmptyMessage(time);
    }
}
