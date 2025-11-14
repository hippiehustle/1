package com.google.android.material.datepicker;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import t0.o0;

/* loaded from: classes.dex */
public final class g extends LinearLayoutManager {

    /* renamed from: E, reason: collision with root package name */
    public final /* synthetic */ int f10086E;

    /* renamed from: F, reason: collision with root package name */
    public final /* synthetic */ k f10087F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(k kVar, int i4, int i8) {
        super(i4);
        this.f10087F = kVar;
        this.f10086E = i8;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, t0.AbstractC1537c0
    public final void F0(RecyclerView recyclerView, int i4) {
        t tVar = new t(recyclerView.getContext());
        tVar.f14762a = i4;
        G0(tVar);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void I0(o0 o0Var, int[] iArr) {
        int i4 = this.f10086E;
        k kVar = this.f10087F;
        if (i4 == 0) {
            iArr[0] = kVar.j0.getWidth();
            iArr[1] = kVar.j0.getWidth();
        } else {
            iArr[0] = kVar.j0.getHeight();
            iArr[1] = kVar.j0.getHeight();
        }
    }
}
