package pe.edu.cibertec.productflavors;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tvDepartment;
    private TextView tvUrlService;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvDepartment = findViewById(R.id.tvDepartment);
        tvDepartment.setText(Department.getDepartment());

        tvUrlService = findViewById(R.id.tvUrlService);
        tvUrlService.setText(BuildConfig.BASE_URL);

    }
}
