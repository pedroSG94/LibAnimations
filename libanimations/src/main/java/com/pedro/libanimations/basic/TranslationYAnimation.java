package com.pedro.libanimations.basic;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import com.pedro.libanimations.base.BaseAnimation;

/**
 * Created by pedro on 7/10/16.
 */

public class TranslationYAnimation extends BaseAnimation {

  private AnimatorSet mAnimationSet;

  private float yDistance;
  private int duration = 0;
  private int delay = 0;

  public TranslationYAnimation(int duration, float yDistance, int delay){
    super();
    mAnimationSet = getmAnimationSet();
    this.duration = duration;
    this.yDistance = yDistance;
    this.delay = delay;
  }

  @Override
  public void startAnimation(View v) {
    ObjectAnimator animatorY = ObjectAnimator.ofFloat(v, "translationY", yDistance);
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

  @Override
  public void onFinish() {

  }

  public float getyDistance() {
    return yDistance;
  }

  public void setyDistance(float yDistance) {
    this.yDistance = yDistance;
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
