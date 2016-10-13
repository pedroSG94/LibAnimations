package com.pedro.libanimations.basic;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import com.pedro.libanimations.base.BaseAnimation;

/**
 * Created by pedro on 7/10/16.
 */

public class TranslationXAnimation extends BaseAnimation {

  private AnimatorSet mAnimationSet;

  private float xDistance;
  private int duration = 0;
  private int delay = 0;

  public TranslationXAnimation(int duration, float xDistance, int delay){
    super();
    mAnimationSet = getmAnimationSet();
    this.duration = duration;
    this.xDistance = xDistance;
    this.delay = delay;
  }

  @Override
  public void startAnimation(View v) {
    ObjectAnimator animatorX = ObjectAnimator.ofFloat(v, "translationX", xDistance);
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

  @Override
  public void onFinish() {

  }

  public float getxDistance() {
    return xDistance;
  }

  public void setxDistance(float xDistance) {
    this.xDistance = xDistance;
  }

  public int getDuration() {
    return duration;
  }

  public void setDuration(int duration) {
    this.duration = duration;
  }

  public int getDelay() {
    return delay;
  }

  public void setDelay(int delay) {
    this.delay = delay;
  }
}
