package jp.co.concores.dialogtest01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button openDialogBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        openDialogBtn = findViewById(R.id.open_dialog);
        openDialogBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.open_dialog:
                customDialog customDialog = new customDialog();
                customDialog.show(getSupportFragmentManager(), "");
                Log.d("MainActivity : ","onClick_open_dialog");
                break;
        }
    }
}
