package com.pedro.libanimations;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;

/**
 * Created by pedro on 7/10/16.
 */

public class TranslationXYAnimation extends  BaseAnimation{

  private AnimatorSet mAnimationSet;

  private float xDisplacement;
  private float yDisplacement;
  private int duration = 0;
  private int delay = 0;

  public TranslationXYAnimation(int duration, float xDisplacement, float yDisplacement, int delay){
    super();
    mAnimationSet = getmAnimationSet();
    this.duration = duration;
    this.xDisplacement = xDisplacement;
    this.yDisplacement = yDisplacement;
    this.delay = delay;
  }

  @Override
  public void startAnimation(View v) {
    ObjectAnimator animatorX = ObjectAnimator.ofFloat(v, "translationX", xDisplacement);
    ObjectAnimator animatorY = ObjectAnimator.ofFloat(v, "translationY", yDisplacement);
    animatorX.setDuration(duration);
    animatorX.setStartDelay(delay);
    animatorY.setDuration(duration);
    animatorY.setStartDelay(delay);
    mAnimationSet.play(animatorX).with(animatorY);
    mAnimationSet.start();
  }

  @Override
  public void cancelAnimation() {
    mAnimationSet.cancel();
  }

  @Override
  public void stopAnimation() {
    mAnimationSet.end();
  }
}
