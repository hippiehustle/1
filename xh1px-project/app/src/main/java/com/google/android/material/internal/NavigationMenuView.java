package com.google.android.material.internal;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import n.InterfaceC1099A;
import n.m;

/* loaded from: classes.dex */
public class NavigationMenuView extends RecyclerView implements InterfaceC1099A {
    public NavigationMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setLayoutManager(new LinearLayoutManager(1));
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // n.InterfaceC1099A
    public final void b(m mVar) {
    }
}
