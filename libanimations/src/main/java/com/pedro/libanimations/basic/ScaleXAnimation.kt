package com.pedro.libanimations.basic

import android.animation.ObjectAnimator
import android.view.View
import com.pedro.libanimations.base.BaseAnimation

/**
 * Created by pedro on 10/10/16.
 */

class ScaleXAnimation(var duration: Int, var xScale: Float, var delay: Int, var xPivot: Float?, var yPivot: Float?) : BaseAnimation() {

    override fun startAnimation(v: View) {
        if (xPivot == null) xPivot = v.width.toFloat() / 2
        if (yPivot == null) yPivot = v.height.toFloat() / 2
        val animator = ObjectAnimator.ofFloat(v, "scaleX", xScale)
        animator.duration = duration.toLong()
        animator.startDelay = delay.toLong()
        animationSet.playTogether(animator, ObjectAnimator.ofFloat(v, "pivotX", xPivot!!),
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
