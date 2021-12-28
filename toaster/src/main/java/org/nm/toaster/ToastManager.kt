package org.nm.toaster

import android.content.Context
import android.widget.Toast

object ToastManager {
    fun toastItMessage(context: Context) {
        Toast.makeText(context, "Toast message", Toast.LENGTH_LONG).show()
    }
}