package com.pedro.libanimations;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;

/**
 * Created by pedro on 10/10/16.
 */

public class ScaleXAnimation extends BaseAnimation {

  private AnimatorSet mAnimationSet;

  private float xScale;
  private float xPivot = 0;
  private float yPivot = 0;
  private int duration;
  private int delay;

  public ScaleXAnimation(int duration, float xScale, int delay){
    super();
    mAnimationSet = getmAnimationSet();
    this.duration = duration;
    this.xScale = xScale;
    this.delay = delay;
  }

  @Override
  public void startAnimation(View v) {
    ObjectAnimator animator = ObjectAnimator.ofFloat(v, "scaleX", xScale);
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

  public float getxScale() {
    return xScale;
  }

  public void setxScale(float xScale) {
    this.xScale = xScale;
  }

  public float getxPivot() {
    return xPivot;
  }

  public void setxPivot(float xPivot) {
    this.xPivot = xPivot;
  }

  public float getyPivot() {
    return yPivot;
  }

  public void setyPivot(float yPivot) {
    this.yPivot = yPivot;
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
