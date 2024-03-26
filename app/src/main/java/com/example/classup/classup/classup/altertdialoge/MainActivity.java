package com.example.classup.classup.classup.altertdialoge;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Toast;

import com.example.classup.classup.classup.altertdialoge.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder a1 = new AlertDialog.Builder(MainActivity.this);
                a1.setMessage("Are You Sure?");
                a1.setTitle("Do you want to close the app?");
                a1.setIcon(R.drawable.baseline_warning_24);

                a1.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                  // Toast.makeText(MainActivity.this,"Pass",Toast.LENGTH_SHORT).show();
                   finish();
                    }
                });

                a1.setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        //Toast.makeText(MainActivity.this,"Failed",Toast.LENGTH_SHORT).show();
                        dialog.dismiss();
                    }
                });
                a1.show();
            }
        });

        binding.bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String [] options = {"Apple","Mango","Cherry","Grapes"};
                AlertDialog.Builder a2 = new AlertDialog.Builder(MainActivity.this);
                a2.setTitle("Select your favourite food..");
                a2.setSingleChoiceItems(options, 0, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(MainActivity.this,"you clicked on "+options[which],Toast.LENGTH_SHORT).show();
                    }
                });

                a2.setPositiveButton("Submit", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });

                a2.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                });
                a2.show();

            }
        });

        binding.bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String[] options = {"Iphone", "Motorola", "Nokia", "Micromax"};
                boolean[] checkedItems = {false, false, false, false}; // Initialize with all unchecked

                AlertDialog.Builder a3 = new AlertDialog.Builder(MainActivity.this);
                a3.setTitle("Select your Favourite Phone");
                a3.setMultiChoiceItems(options, checkedItems, new DialogInterface.OnMultiChoiceClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which, boolean isChecked) {
                        // Handle the click event for each item if needed
                    }
                });

                a3.setPositiveButton("Submit", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        // Perform action when "Submit" button is clicked
                        // For example, you can get the checked items and do something with them
                    }
                });

                a3.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                });
                a3.show();
            }
        });



    }
}