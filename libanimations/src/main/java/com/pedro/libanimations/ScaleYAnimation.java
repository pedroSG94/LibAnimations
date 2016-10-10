package com.pedro.libanimations;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;

/**
 * Created by pedro on 10/10/16.
 */

public class ScaleYAnimation extends BaseAnimation {

  private AnimatorSet mAnimationSet;

  private float yScale;
  private float xPivot;
  private float yPivot;
  private int duration;
  private int delay;

  public ScaleYAnimation(int duration, float yScale, int delay){
    super();
    mAnimationSet = getmAnimationSet();
    this.duration = duration;
    this.yScale = yScale;
    this.delay = delay;
  }

  @Override
  public void startAnimation(View v) {
    ObjectAnimator animator = ObjectAnimator.ofFloat(v, "scaleY", yScale);
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

  public float getyScale() {
    return yScale;
  }

  public void setyScale(float yScale) {
    this.yScale = yScale;
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
