package com.pedro.libanimations;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;

/**
 * Created by pedro on 10/10/16.
 */

public class ScaleXYAnimation extends BaseAnimation{

  private AnimatorSet mAnimationSet;

  private float xScale;
  private float yScale;
  private float xPivot = 0;
  private float yPivot = 0;
  private int duration;
  private int delay;

  public ScaleXYAnimation(int duration, float xScale, float yScale, int delay){
    super();
    mAnimationSet = getmAnimationSet();
    this.duration = duration;
    this.xScale = xScale;
    this.yScale = yScale;
    this.delay = delay;
  }

  @Override
  public void startAnimation(View v) {
    ObjectAnimator animatorX = ObjectAnimator.ofFloat(v, "scaleX", xScale);
    ObjectAnimator animatorY = ObjectAnimator.ofFloat(v, "scaleY", yScale);
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

  public float getxScale() {
    return xScale;
  }

  public void setxScale(float xScale) {
    this.xScale = xScale;
  }

  public float getyScale() {
    return yScale;
  }

  public void setyScale(float yScale) {
    this.yScale = yScale;
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
