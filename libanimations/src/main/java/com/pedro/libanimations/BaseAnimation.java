package com.pedro.libanimations;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.util.Log;
import android.view.View;

/**
 * Created by pedro on 7/10/16.
 */

public abstract class BaseAnimation {

  private AnimatorSet mAnimationSet;
  private String TAG = "BaseAnimation";

  public BaseAnimation(){
    generateAnimation();
  }

  public AnimatorSet getmAnimationSet() {
    return mAnimationSet;
  }

  private void generateAnimation(){
    mAnimationSet = new AnimatorSet();
    mAnimationSet.addListener(new AnimatorListenerAdapter() {
      @Override
      public void onAnimationEnd(Animator animation) {
        super.onAnimationEnd(animation);
        Log.i(TAG, "End");
      }
    });
  }

  public abstract void startAnimation(View v);
  public abstract void cancelAnimation();
  public abstract void stopAnimation();
}
