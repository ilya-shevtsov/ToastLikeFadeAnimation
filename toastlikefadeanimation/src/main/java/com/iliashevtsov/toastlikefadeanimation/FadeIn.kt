package com.iliashevtsov.toastlikefadeanimation

import android.animation.Animator
import android.view.View
import androidx.core.view.isVisible

fun View.fadeInView(
    duration: Long = 300L,
    initViewAlpha: Float = 0f,
    animationAlpha: Float = 1f,
    animationListener: Animator.AnimatorListener? = null
) {
    this.apply {
        alpha = initViewAlpha
        isVisible = true
        animate()
            .alpha(animationAlpha)
            .setDuration(duration)
            .setListener(animationListener)
    }
}