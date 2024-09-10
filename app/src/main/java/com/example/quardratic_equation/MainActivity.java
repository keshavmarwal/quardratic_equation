package com.example.quardratic_equation;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText xxt,xt,t;
    Button btn;
    TextView solve;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        xxt=findViewById(R.id.xxtext);
        xt=findViewById(R.id.xtxt);
        t=findViewById(R.id.txt);
        btn=findViewById(R.id.btn);
        solve=findViewById(R.id.solve);



        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    double a = Double.parseDouble(xxt.getText().toString());
                    double b = Double.parseDouble(xt.getText().toString());
                    double c = Double.parseDouble(t.getText().toString());
                    solution(a, b, c);
                } catch (NumberFormatException e) {
                    // Handle case when user enters non-numeric values
                    solve.setText("Invalid Input: Please enter numbers only.");
                }
            }
        });




    }

    void solution(double a, double b, double c) {
        if (a == 0) {
            double X = -(c / b);
            solve.setText("X = " + X);
            return;
        }

        double D = (b * b) - (4 * (a * c));
        if (D < 0) {
            solve.setText("Imaginary Roots");
        } else if (D == 0) {
            double X = -(b / (2 * a));
            solve.setText("Real and Equal Roots are X = " + X);
        } else {
            double X1 = -(b + Math.sqrt(D)) / (2 * a);
            double X2 = -(b - Math.sqrt(D)) / (2 * a);
            solve.setText("Real and Distinct Roots are X1 = " + X1 + " and X2 = " + X2);
        }
    }
}
