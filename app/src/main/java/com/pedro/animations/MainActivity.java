package com.pedro.animations;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.pedro.libanimations.ScaleXYAnimation;

public class MainActivity extends AppCompatActivity {

  private TextView textView;
  private Button button;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    textView = (TextView) findViewById(R.id.text_view);
    button = (Button) findViewById(R.id.button);
    button.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        ScaleXYAnimation animation = new ScaleXYAnimation(1000, 105f, 105f, 200);
        animation.startAnimation(button);
      }
    });
  }
}
