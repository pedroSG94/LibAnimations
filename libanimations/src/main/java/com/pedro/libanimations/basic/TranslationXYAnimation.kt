package com.pedro.libanimations.basic

import android.animation.ObjectAnimator
import android.view.View
import com.pedro.libanimations.base.BaseAnimation

/**
 * Created by pedro on 7/10/16.
 */

class TranslationXYAnimation(var xDistance: Float, var yDistance: Float, var duration: Int = 0, var delay: Int = 0) : BaseAnimation() {

    override fun startAnimation(v: View) {
        val animatorX = ObjectAnimator.ofFloat(v, "translationX", xDistance)
        val animatorY = ObjectAnimator.ofFloat(v, "translationY", yDistance)
        animatorX.duration = duration.toLong()
        animatorX.startDelay = delay.toLong()
        animatorY.duration = duration.toLong()
        animatorY.startDelay = delay.toLong()
        animationSet.playTogether(animatorX, animatorY)
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
