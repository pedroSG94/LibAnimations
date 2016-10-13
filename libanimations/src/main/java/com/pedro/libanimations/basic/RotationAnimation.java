package com.pedro.libanimations.basic;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import com.pedro.libanimations.base.BaseAnimation;

/**
 * Created by pedro on 7/10/16.
 */

public class RotationAnimation extends BaseAnimation {

  private AnimatorSet mAnimationSet;

  private Float xPivot = null;
  private Float yPivot = null;
  private int duration;
  private int degrees ;
  private int delay ;

  public RotationAnimation(int duration, int degrees, int delay, Float xPivot, Float yPivot){
    super();
    mAnimationSet = getmAnimationSet();
    this.duration = duration;
    this.degrees = degrees;
    this.delay = delay;
    this.xPivot = xPivot;
    this.yPivot = yPivot;
  }

  @Override
  public void startAnimation(View v) {
    if(xPivot == null)  xPivot = (float)v.getWidth() / 2;
    if(yPivot == null)  yPivot = (float)v.getHeight() / 2;
    ObjectAnimator animator = ObjectAnimator.ofFloat(v, "rotation", degrees);
    animator.setDuration(duration);
    animator.setStartDelay(delay);
    mAnimationSet.playTogether(animator, ObjectAnimator.ofFloat(v, "pivotX", xPivot),
        ObjectAnimator.ofFloat(v, "pivotY", yPivot));
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
