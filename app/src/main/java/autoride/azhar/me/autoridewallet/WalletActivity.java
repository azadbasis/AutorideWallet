package autoride.azhar.me.autoridewallet;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

public class WalletActivity extends AppCompatActivity {

    private TextView tvMangBalance,tvSeeActivity,tvSendMoney,tvRequestMoney,tvSendRequest,tvMoney,tvPay,tvAvailable;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wallet);
        init();
        customFont();
    }



    private void init() {
        tvMangBalance    =(TextView) findViewById(R.id.tvMangBalance);
        tvSeeActivity    =(TextView) findViewById(R.id.tvSeeActivity);
        tvRequestMoney   =(TextView) findViewById(R.id.tvRequestMoney);
        tvSendMoney      =(TextView) findViewById(R.id.tvSendMoney);
        tvSendRequest    =(TextView) findViewById(R.id.tvSendRequest);
        tvMoney          =(TextView) findViewById(R.id.tvMoney);
        tvPay            =(TextView) findViewById(R.id.tvPay);
        tvAvailable      =(TextView) findViewById(R.id.tvAvailable);
    }
    private void customFont() {
        Typeface mytTypeface01 = Typeface.createFromAsset(getAssets(), "CaviarDreams.ttf");
        Typeface mytTypeface02 = Typeface.createFromAsset(getAssets(), "CaviarDreams_Bold.ttf");
        tvPay.setTypeface(mytTypeface01);
        tvMangBalance.setTypeface(mytTypeface01);
        tvSeeActivity.setTypeface(mytTypeface01);
        tvRequestMoney.setTypeface(mytTypeface01);
        tvSendMoney.setTypeface(mytTypeface01);
        tvSendRequest.setTypeface(mytTypeface01);
        tvMoney.setTypeface(mytTypeface02);
        tvAvailable.setTypeface(mytTypeface01);
    }

    //1. ANDROID 4.4  KITKAT ONWORD USE THIS METHOD FOR FULL SCREEN;
// FINGER UP AND DOWN WE SEE THE SYSTEM UI SETTING
// BUT AFTER FEW SECOND THE APPLICATION BEING FULL SCREEN
    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);

        View decorView = getWindow().getDecorView();

        if (hasFocus) {
            decorView.setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                    | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY
                    | View.SYSTEM_UI_FLAG_FULLSCREEN
                    | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                    | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                    | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN);
        }

    }
}
