package mg.studio.android.survey;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Report extends AppCompatActivity {

    TextView t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_report);
        t=findViewById(R.id.text);
        Bundle bundle=this.getIntent().getExtras();
        String result=bundle.getString("");
        t.setText(result);
    }
}
