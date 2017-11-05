package com.pedro.libanimations.custom

import android.animation.ObjectAnimator
import android.view.View
import com.pedro.libanimations.base.BaseAnimation

/**
 * Created by pedro on 13/10/16.
 */

class VibrateXAnimation(val delay: Int = 0) : BaseAnimation() {

    private var state = false
    private var v: View? = null

    override fun startAnimation(v: View) {
        this.v = v
        val animator = moveMore(v)
        animator.startDelay = delay.toLong()
        animationSet.play(animator)
        animationSet.start()
    }

    private fun moveMore(v: View?): ObjectAnimator {
        val animatorX = ObjectAnimator.ofFloat(v, "translationX", 3f)
        animatorX.duration = 20
        state = true
        return animatorX
    }

    private fun moveLess(v: View?): ObjectAnimator {
        val animatorX = ObjectAnimator.ofFloat(v, "translationX", -3f)
        animatorX.duration = 20
        state = false
        return animatorX
    }

    override fun cancelAnimation() {

    }

    override fun stopAnimation() {

    }

    override fun onFinish() {
        if (!state) animationSet.play(moveMore(v))
        else animationSet.play(moveLess(v))
        animationSet.start()
    }
}
