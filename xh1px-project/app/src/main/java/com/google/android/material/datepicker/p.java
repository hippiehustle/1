package com.google.android.material.datepicker;

import android.view.View;
import android.widget.AdapterView;

/* loaded from: classes.dex */
public final class p implements AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ MaterialCalendarGridView f10140d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r f10141e;

    public p(r rVar, MaterialCalendarGridView materialCalendarGridView) {
        this.f10141e = rVar;
        this.f10140d = materialCalendarGridView;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i4, long j) {
        MaterialCalendarGridView materialCalendarGridView = this.f10140d;
        o a3 = materialCalendarGridView.a();
        if (i4 >= a3.a() && i4 <= a3.c()) {
            if (materialCalendarGridView.a().getItem(i4).longValue() < ((k) this.f10141e.f10145e.f6486e).f10094e0.f10072f.f10078d) {
            } else {
                throw null;
            }
        }
    }
}
