package alexandria.chan.com.chanalexandriape2;


import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText FName,Age,Gender;
    Button btnSearch,btnSave;

    TextView textsearch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setTitle("PRACTICAL EXAM NO. 2");

        FName = findViewById(R.id.txtName);
        Age = findViewById(R.id.txtAge);
        Gender = findViewById(R.id.txtGender);

        btnSave = findViewById(R.id.btnSave);
        btnSearch = findViewById(R.id.btnSearch);

        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String fullName = FName.getText().toString();
                int age = Integer.parseInt(Age.getText().toString());
                }
        });


    }

     }
