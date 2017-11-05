package com.pedro.libanimations.basic

import android.animation.ObjectAnimator
import android.view.View
import com.pedro.libanimations.base.BaseAnimation

/**
 * Created by pedro on 7/10/16.
 */

class VisibilityAnimation(var alphaStart: Float, var alphaEnd: Float, var duration: Int = 0, var delay: Int = 0) : BaseAnimation() {

    override fun startAnimation(v: View) {
        val animator = ObjectAnimator.ofFloat(v, "alpha", alphaStart, alphaEnd)
        animator.duration = duration.toLong()
        animator.startDelay = delay.toLong()
        animationSet.play(animator)
        animationSet.start()
    }

    override fun cancelAnimation() {
        animationSet.cancel()
    }

    override fun stopAnimation() {
        animationSet.end()
    }

    override fun onFinish() {

    }
}
