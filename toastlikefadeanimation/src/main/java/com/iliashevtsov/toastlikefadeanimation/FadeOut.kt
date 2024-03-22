package com.iliashevtsov.toastlikefadeanimation

import android.animation.Animator
import android.animation.AnimatorListenerAdapter
import android.view.View
import androidx.core.view.isVisible

fun View.fadeOutView(
    duration: Long = 300L,
    animationAlpha: Float = 0f
) {
    this.animate()
        .alpha(animationAlpha)
        .setDuration(duration)
        .setListener(object : AnimatorListenerAdapter() {
            override fun onAnimationEnd(animation: Animator) {
                this@fadeOutView.isVisible = false
            }
        })
}