package com.pedro.libanimations;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;

/**
 * Created by pedro on 7/10/16.
 */

public class RotationAnimation extends BaseAnimation {

  private AnimatorSet mAnimationSet;

  private float xPivot = 0;
  private float yPivot = 0;
  private int duration;
  private int degrees ;
  private int delay ;

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

  public int getDegrees() {
    return degrees;
  }

  public void setDegrees(int degrees) {
    this.degrees = degrees;
  }

  public int getDelay() {
    return delay;
  }

  public void setDelay(int delay) {
    this.delay = delay;
  }
}
