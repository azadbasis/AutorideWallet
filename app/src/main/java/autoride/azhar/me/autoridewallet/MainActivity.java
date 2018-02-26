package autoride.azhar.me.autoridewallet;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
      //  setContentView(R.layout.wallet_profile);
      // setContentView(R.layout.request_send);
       setContentView(R.layout.request01);
//       setContentView(R.layout.request02);
  //     setContentView(R.layout.profile);
      /*   TextView tvText = (TextView) findViewById(R.id.tvText);
        TextView tvAvailable = (TextView) findViewById(R.id.tvAvailable);
        TextView tvManage = (TextView) findViewById(R.id.tvManage);
        TextView tvSeeActivity = (TextView) findViewById(R.id.tvSeeActivity);
        TextView tvSendRequest = (TextView) findViewById(R.id.tvSendRequest);
        TextView tvSend = (TextView) findViewById(R.id.tvSend);
        TextView tvRequest = (TextView) findViewById(R.id.tvRequest);
        TextView tvPay = (TextView) findViewById(R.id.tvPay);

        Typeface mytTypeface = Typeface.createFromAsset(getAssets(), "Sansation-Light.ttf");
        tvText.setTypeface(mytTypeface);
        Typeface mytTypeface1 = Typeface.createFromAsset(getAssets(), "Sansation-Regular.ttf");
        tvAvailable.setTypeface(mytTypeface1);
        Typeface mytTypeface2 = Typeface.createFromAsset(getAssets(), "Sansation-Regular.ttf");
        tvManage.setTypeface(mytTypeface2);
        Typeface mytTypeface3 = Typeface.createFromAsset(getAssets(), "Sansation-Regular.ttf");
        tvSeeActivity.setTypeface(mytTypeface3);
        Typeface mytTypeface4 = Typeface.createFromAsset(getAssets(), "Sansation-Regular.ttf");
        tvSendRequest.setTypeface(mytTypeface4);
        Typeface mytTypeface5 = Typeface.createFromAsset(getAssets(), "Sansation-Regular.ttf");
        tvSend.setTypeface(mytTypeface5);
        Typeface mytTypeface6 = Typeface.createFromAsset(getAssets(), "Sansation-Regular.ttf");
        tvRequest.setTypeface(mytTypeface6);
        Typeface mytTypeface7 = Typeface.createFromAsset(getAssets(), "Sansation-Regular.ttf");
        tvPay.setTypeface(mytTypeface7);*/
    }

    public void sendReuest(View view) {
        startActivity(new Intent(this,ReviewSendActivity.class));

    }
}
