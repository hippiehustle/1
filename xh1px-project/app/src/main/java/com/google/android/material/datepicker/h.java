package com.google.android.material.datepicker;

import android.graphics.Canvas;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import t0.AbstractC1533a0;
import t0.o0;

/* loaded from: classes.dex */
public final class h extends AbstractC1533a0 {
    @Override // t0.AbstractC1533a0
    public final void e(Canvas canvas, RecyclerView recyclerView, o0 o0Var) {
        if ((recyclerView.getAdapter() instanceof x) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
            throw null;
        }
    }
}
