package com.pedro.libanimations;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;

/**
 * Created by pedro on 7/10/16.
 */

public class TranslationYAnimation extends BaseAnimation{

  private AnimatorSet mAnimationSet;

  private float xDisplacement;
  private float yDisplacement;
  private int duration = 0;
  private int delay = 0;

  public TranslationYAnimation(int duration, float yDisplacement, int delay){
    super();
    mAnimationSet = getmAnimationSet();
    this.duration = duration;
    this.yDisplacement = yDisplacement;
    this.delay = delay;
  }

  @Override
  public void startAnimation(View v) {
    ObjectAnimator animatorY = ObjectAnimator.ofFloat(v, "translationY", yDisplacement);
    animatorY.setDuration(duration);
    animatorY.setStartDelay(delay);
    mAnimationSet.play(animatorY);
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
