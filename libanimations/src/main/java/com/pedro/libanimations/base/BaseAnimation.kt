package com.pedro.libanimations.base

import android.animation.Animator
import android.animation.AnimatorListenerAdapter
import android.animation.AnimatorSet
import android.util.Log
import android.view.View

/**
 * Created by pedro on 7/10/16.
 */

abstract class BaseAnimation {

    private val TAG = "BaseAnimation"
    protected var animationSet: AnimatorSet

    init {
        animationSet = generateAnimation()
    }

    private fun generateAnimation(): AnimatorSet {
        val animationSet = AnimatorSet()
        animationSet.addListener(object : AnimatorListenerAdapter() {
            override fun onAnimationEnd(animation: Animator) {
                super.onAnimationEnd(animation)
                Log.i(TAG, "End")
                onFinish()
            }
        })
        return animationSet
    }

    abstract fun startAnimation(v: View)
    abstract fun cancelAnimation()
    abstract fun stopAnimation()
    abstract fun onFinish()
}
