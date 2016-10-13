package com.pedro.libanimations.basic;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import com.pedro.libanimations.base.BaseAnimation;

/**
 * Created by pedro on 10/10/16.
 */

public class ScaleXAnimation extends BaseAnimation {

  private AnimatorSet mAnimationSet;

  private float xScale;
  private Float xPivot = null;
  private Float yPivot = null;
  private int duration;
  private int delay;

  public ScaleXAnimation(int duration, float xScale, int delay, Float xPivot, Float yPivot){
    super();
    mAnimationSet = getmAnimationSet();
    this.duration = duration;
    this.xScale = xScale;
    this.delay = delay;
    this.xPivot = xPivot;
    this.yPivot = yPivot;
  }

  @Override
  public void startAnimation(View v) {
    if(xPivot == null)  xPivot = (float)v.getWidth() / 2;
    if(yPivot == null)  yPivot = (float)v.getHeight() / 2;
    ObjectAnimator animator = ObjectAnimator.ofFloat(v, "scaleX", xScale);
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
