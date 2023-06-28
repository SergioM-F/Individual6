package cl.samf.individual6;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import cl.samf.individual6.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());



        /*EditText nombre;
        EditText apellido;
        EditText correo;
        EditText clave;

        nombre = findViewById(R.id.textNombre);
        apellido = findViewById(R.id.textApellido);
        correo = findViewById(R.id.textMail);
        clave = findViewById(R.id.editTextTextPassword);
        Button crearCuenta = findViewById(R.id.buttonCrearCuenta);*/

        binding.buttonCrearCuenta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nom = binding.textNombre.getText().toString();
                String apell = binding.textApellido.getText().toString();
                String mail = binding.textMail.getText().toString();
                String pass = binding.editTextTextPassword.getText().toString();


                if (nom.isEmpty() || apell.isEmpty() || mail.isEmpty()
                        || pass.isEmpty()) {
                    Toast.makeText(getBaseContext(), "faltan campos por completar ", Toast.LENGTH_SHORT).show();
                    return;
                }
                if (!mail.contains("@")) {
                    Toast.makeText(getBaseContext(), "campo correo invalido ", Toast.LENGTH_SHORT).show();

                }
                String texto = "Nombre " + nom + " Apellido " + apell + " E-Mail " + mail + " Password " + pass;
                Toast.makeText(getBaseContext(), texto, Toast.LENGTH_SHORT).show();
            }

        });




    }
}