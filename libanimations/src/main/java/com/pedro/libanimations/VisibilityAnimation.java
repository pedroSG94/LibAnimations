package com.pedro.libanimations;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;

/**
 * Created by pedro on 7/10/16.
 */

public class VisibilityAnimation extends BaseAnimation {

  private AnimatorSet mAnimationSet;

  private float alphaStart;
  private float alphaEnd;
  private int duration = 0;
  private int delay = 0;

  public VisibilityAnimation(int duration, float alphaStart, float alphaEnd, int delay){
    super();
    mAnimationSet = getmAnimationSet();
    this.duration = duration;
    this.alphaStart = alphaStart;
    this.alphaEnd = alphaEnd;
    this.delay = delay;
  }

  @Override
  public void startAnimation(View v){
    ObjectAnimator animator = ObjectAnimator.ofFloat(v, "alpha", alphaStart, alphaEnd);
    animator.setDuration(duration);
    animator.setStartDelay(delay);
    mAnimationSet.play(animator);
    mAnimationSet.start();
  }

  @Override
  public void cancelAnimation(){
    mAnimationSet.cancel();
  }

  @Override
  public void stopAnimation() {
    mAnimationSet.end();
  }
}
