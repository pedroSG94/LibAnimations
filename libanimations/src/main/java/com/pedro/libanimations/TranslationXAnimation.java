package com.pedro.libanimations;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;

/**
 * Created by pedro on 7/10/16.
 */

public class TranslationXAnimation extends BaseAnimation {

  private AnimatorSet mAnimationSet;

  private float xDisplacement;
  private float yDisplacement;
  private int duration = 0;
  private int delay = 0;

  public TranslationXAnimation(int duration, float xDisplacement, int delay){
    super();
    mAnimationSet = getmAnimationSet();
    this.duration = duration;
    this.xDisplacement = xDisplacement;
    this.delay = delay;
  }

  @Override
  public void startAnimation(View v) {
    ObjectAnimator animatorX = ObjectAnimator.ofFloat(v, "translationX", xDisplacement);
    animatorX.setDuration(duration);
    animatorX.setStartDelay(delay);
    mAnimationSet.play(animatorX);
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
