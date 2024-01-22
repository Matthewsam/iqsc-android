package com.example.iqsc;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.iqsc.databinding.ActivityPersonalInformationBinding;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class PersonalInformation extends AppCompatActivity {

    ActivityPersonalInformationBinding binding;
    String ID,Aided_SFS,Department,Salutation,Name,Designation,Gender,PAN,AADHAR,Contact_email_id,Contact_Phone_number,Date_of_Birth,Age_as_of_July_2023;
    FirebaseDatabase db;
    DatabaseReference reference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityPersonalInformationBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ID = binding.ID.getText().toString();
                Aided_SFS = binding.AidedSFS.getText().toString();
                Department = binding.Department.getText().toString();
                Salutation = binding.Salutation.getText().toString();
                Name = binding.Name.getText().toString();
                Designation = binding.Designation.getText().toString();
                Gender = binding.Gender.getText().toString();
                PAN = binding.PAN.getText().toString();
                AADHAR = binding.AADHAR.getText().toString();
                Contact_email_id = binding.Contactemailid.getText().toString();
                Contact_Phone_number = binding.ContactPhonenumber.getText().toString();
                Date_of_Birth = binding.DateofBirth.getText().toString();
                Age_as_of_July_2023 = binding.AgeasofJuly2023.getText().toString();


                if (!ID.isEmpty() && !Aided_SFS.isEmpty() && !Department.isEmpty() && !Salutation.isEmpty() && !Name.isEmpty() && !Designation.isEmpty() && !Gender.isEmpty() && !PAN.isEmpty() && !AADHAR.isEmpty() && !Contact_email_id.isEmpty() && !Contact_Phone_number.isEmpty() && !Date_of_Birth.isEmpty() && !Age_as_of_July_2023.isEmpty()){

                    Users users = new Users(ID,Aided_SFS,Department,Salutation,Name,Designation,Gender,PAN,AADHAR,Contact_email_id,Contact_Phone_number,Date_of_Birth,Age_as_of_July_2023);
                    db = FirebaseDatabase.getInstance();
                    reference = db.getReference("Users");
                    reference.child(ID).setValue(users).addOnCompleteListener(new OnCompleteListener<Void>() {
                        @Override
                        public void onComplete(@NonNull Task<Void> task) {

                            binding.ID.setText("");
                            binding.AidedSFS.setText("");
                            binding.Department.setText("");
                            binding.Salutation.setText("");
                            binding.Name.setText("");
                            binding.Designation.setText("");
                            binding.Gender.setText("");
                            binding.PAN.setText("");
                            binding.AADHAR.setText("");
                            binding.Contactemailid.setText("");
                            binding.ContactPhonenumber.setText("");
                            binding.DateofBirth.setText("");
                            binding.AgeasofJuly2023.setText("");
                            Toast.makeText(PersonalInformation.this,"Successfuly Updated",Toast.LENGTH_SHORT).show();

                        }
                    });

                }

            }
        });
    }
}