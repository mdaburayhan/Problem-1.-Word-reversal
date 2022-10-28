package com.arsoftltd.problemsolving;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    TextView textView;
    Button button;
    String getSentence[], output;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText= findViewById(R.id.editText);
        textView= findViewById(R.id.textView);
        button= findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getSentence= editText.getText().toString().split(" ");
                output=" ";
                for (int i = getSentence.length - 1; i >= 0; i--) {
                    output += getSentence[i] + " ";
                }
                textView.setText(output);

            }
        });

    }
}
