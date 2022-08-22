package org.tech.town.hola

import android.view.View

interface OnDongScoreClickListener {
    fun onItemClick(holder: DongScoreAdapter.ViewHolder?, view: View?, position: Int)
}