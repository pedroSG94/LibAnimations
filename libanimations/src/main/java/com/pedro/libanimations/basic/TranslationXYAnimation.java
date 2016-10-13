package com.pedro.libanimations.basic;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import com.pedro.libanimations.base.BaseAnimation;

/**
 * Created by pedro on 7/10/16.
 */

public class TranslationXYAnimation extends BaseAnimation {

  private AnimatorSet mAnimationSet;

  private float xDistance;
  private float yDistance;
  private int duration = 0;
  private int delay = 0;

  public TranslationXYAnimation(int duration, float xDistance, float yDistance, int delay){
    super();
    mAnimationSet = getmAnimationSet();
    this.duration = duration;
    this.xDistance = xDistance;
    this.yDistance = yDistance;
    this.delay = delay;
  }

  @Override
  public void startAnimation(View v) {
    ObjectAnimator animatorX = ObjectAnimator.ofFloat(v, "translationX", xDistance);
    ObjectAnimator animatorY = ObjectAnimator.ofFloat(v, "translationY", yDistance);
    animatorX.setDuration(duration);
    animatorX.setStartDelay(delay);
    animatorY.setDuration(duration);
    animatorY.setStartDelay(delay);
    mAnimationSet.playTogether(animatorX, animatorY);
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
