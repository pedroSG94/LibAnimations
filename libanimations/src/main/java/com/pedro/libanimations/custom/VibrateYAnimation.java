package com.pedro.libanimations.custom;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import com.pedro.libanimations.base.BaseAnimation;

/**
 * Created by pedro on 13/10/16.
 */

public class VibrateYAnimation extends BaseAnimation{

  private AnimatorSet mAnimationSet;
  private int delay;
  private boolean state = false;
  private View v;

  public VibrateYAnimation(int delay){
    mAnimationSet = getmAnimationSet();
    this.delay = delay;
  }

  @Override
  public void startAnimation(View v) {
    this.v = v;
    ObjectAnimator animator = moveMore(v);
    animator.setStartDelay(delay);
    mAnimationSet.play(animator);
    mAnimationSet.start();
  }

  private ObjectAnimator moveMore(View v){
    ObjectAnimator animatorY = ObjectAnimator.ofFloat(v, "translationY", 3);
    animatorY.setDuration(20);
    state = true;
    return animatorY;
  }

  private ObjectAnimator moveLess(View v){
    ObjectAnimator animatorX = ObjectAnimator.ofFloat(v, "translationY", -3);
    animatorX.setDuration(20);
    state = false;
    return animatorX;
  }

  @Override
  public void cancelAnimation() {

  }

  @Override
  public void stopAnimation() {

  }

  @Override
  public void onFinish() {
    if(!state) mAnimationSet.play(moveMore(v));
    else  mAnimationSet.play(moveLess(v));
    mAnimationSet.start();
  }
}
