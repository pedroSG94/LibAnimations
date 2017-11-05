package com.pedro.libanimations.basic

import android.animation.ObjectAnimator
import android.view.View
import com.pedro.libanimations.base.BaseAnimation

/**
 * Created by pedro on 10/10/16.
 */

class ScaleXYAnimation(var duration: Int, var xScale: Float, var yScale: Float, var delay: Int, var xPivot: Float?, var yPivot: Float?) : BaseAnimation() {

    override fun startAnimation(v: View) {
        if (xPivot == null) xPivot = v.width.toFloat() / 2
        if (yPivot == null) yPivot = v.height.toFloat() / 2
        val animatorX = ObjectAnimator.ofFloat(v, "scaleX", xScale)
        val animatorY = ObjectAnimator.ofFloat(v, "scaleY", yScale)
        animatorX.duration = duration.toLong()
        animatorX.startDelay = delay.toLong()
        animatorY.duration = duration.toLong()
        animatorY.startDelay = delay.toLong()
        animationSet.playTogether(animatorX, animatorY, ObjectAnimator.ofFloat(v, "pivotX", xPivot!!),
                ObjectAnimator.ofFloat(v, "pivotY", yPivot!!))
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
