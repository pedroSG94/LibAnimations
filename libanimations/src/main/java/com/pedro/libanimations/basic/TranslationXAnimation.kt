package com.pedro.libanimations.basic

import android.animation.ObjectAnimator
import android.view.View
import com.pedro.libanimations.base.BaseAnimation

/**
 * Created by pedro on 7/10/16.
 */

class TranslationXAnimation(var xDistance: Float, var duration: Int = 0, var delay: Int = 0) : BaseAnimation() {

    override fun startAnimation(v: View) {
        val animatorX = ObjectAnimator.ofFloat(v, "translationX", xDistance)
        animatorX.duration = duration.toLong()
        animatorX.startDelay = delay.toLong()
        animationSet.play(animatorX)
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
