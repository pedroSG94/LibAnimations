package com.pedro.libanimations;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;

/**
 * Created by pedro on 7/10/16.
 */

public class RotationAnimation extends BaseAnimation {

  private AnimatorSet mAnimationSet;

  private int duration = 0;
  private int degrees = 0;
  private int delay = 0;

  public RotationAnimation(int duration, int degrees, int delay){
    super();
    mAnimationSet = getmAnimationSet();
    this.duration = duration;
    this.degrees = degrees;
    this.delay = delay;
  }

  @Override
  public void startAnimation(View v) {
    ObjectAnimator animator = ObjectAnimator.ofFloat(v, "rotation", v.getRotation() + degrees);
    animator.setDuration(duration);
    animator.setStartDelay(delay);
    mAnimationSet.play(animator);
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
