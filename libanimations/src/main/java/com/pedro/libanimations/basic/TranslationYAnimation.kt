package com.pedro.libanimations.basic

import android.animation.ObjectAnimator
import android.view.View
import com.pedro.libanimations.base.BaseAnimation

/**
 * Created by pedro on 7/10/16.
 */

class TranslationYAnimation(var yDistance: Float, var duration: Int = 0, var delay: Int = 0) : BaseAnimation() {

    override fun startAnimation(v: View) {
        val animatorY = ObjectAnimator.ofFloat(v, "translationY", yDistance)
        animatorY.duration = duration.toLong()
        animatorY.startDelay = delay.toLong()
        animationSet.play(animatorY)
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
