package autoride.azhar.me.autoridewallet;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class ReviewSendActivity extends AppCompatActivity {
    private Toolbar user_appbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.send_review);
        user_appbar=(Toolbar) findViewById(R.id.reviewAppbar);
        setSupportActionBar(user_appbar);
        getSupportActionBar().setTitle("Review and Send");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    public void sendNow(View view) {
        setContentView(R.layout.success);
    }
}
