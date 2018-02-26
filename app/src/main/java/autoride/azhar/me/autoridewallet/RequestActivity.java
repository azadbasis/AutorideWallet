package autoride.azhar.me.autoridewallet;

import android.app.Dialog;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


public class RequestActivity extends AppCompatActivity {

    Dialog myDialog;
    private Button btnAcNo, btnAutoLoad, btnIdentifier, btnSendRequest;
    private TextView tvRequestWith;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_request);
        init();
        customFont();
    }


    private void init() {
        btnAcNo = (Button) findViewById(R.id.btnAcNo);
        btnAutoLoad = (Button) findViewById(R.id.btnAutoLoad);
        btnIdentifier = (Button) findViewById(R.id.btnAcIdentifier);
        btnSendRequest = (Button) findViewById(R.id.btnsendRequest);
        tvRequestWith = (TextView) findViewById(R.id.tvRequestWith);
        myDialog = new Dialog(this);
        btnIdentifier.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                String myIdentityNo = "6506-0075-8127-1062";
                int imageId=R.drawable.qrcode;
                showQrCodeWindow(myIdentityNo,imageId);
            }
        });
        btnAcNo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String myAccountNo = "7607-0075-8127-1062";
                int imageId=R.drawable.ic_qrcode;
                showQrCodeWindow(myAccountNo,imageId);
            }
        });
        btnSendRequest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }

        });
    }

    //WINDOW
   private TextView tvQrCodeId, tvQrCodeDesc, tvQrcodeTitle;
    private ImageView timgclose,imgQrCode;

    private void showQrCodeWindow(String no,int imageId) {
        //    myDialog.setContentView(R.layout.scan_qrcode);
        myDialog.setContentView(R.layout.qr_window);
        timgclose = (ImageView) myDialog.findViewById(R.id.imgClose);
        tvQrCodeId = (TextView)myDialog. findViewById(R.id.tvQrCodeId);
        tvQrCodeDesc = (TextView) myDialog.findViewById(R.id.tvQrCodeDesc);
        imgQrCode = (ImageView) myDialog.findViewById(R.id.imgQrCode);
        tvQrCodeId.setText(no);
        imgQrCode.setImageDrawable(ContextCompat.getDrawable(RequestActivity.this, imageId));
        timgclose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myDialog.dismiss();
            }
        });
        myDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        myDialog.show();
    }

    private void customFont() {
        Typeface mytTypeface = Typeface.createFromAsset(getAssets(), "CaviarDreams_Bold.ttf");
        tvRequestWith.setTypeface(mytTypeface);
        btnAcNo.setTypeface(mytTypeface);
        btnAutoLoad.setTypeface(mytTypeface);
        btnIdentifier.setTypeface(mytTypeface);
        btnSendRequest.setTypeface(mytTypeface);
    }


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
