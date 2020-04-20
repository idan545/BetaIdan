package com.example.betaidan;

import androidx.annotation.IntRange;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class EntranceActivity extends AppCompatActivity {
  Button teacher, student;
  Intent t;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_entrance);
    teacher = (Button) findViewById(R.id.teacher);
    student = (Button) findViewById(R.id.student);
    teacher.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        t = new Intent(EntranceActivity.this, LoginTeacher.class);
        startActivity(t);
      }
    });
    student.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        t = new Intent(EntranceActivity.this, LoginStudent.class);
        startActivity(t);
      }
    });
  }
}