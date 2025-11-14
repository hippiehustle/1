package com.google.android.material.datepicker;

import android.icu.text.DateFormat;
import android.icu.text.DisplayContext;
import android.icu.util.TimeZone;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;
import t0.AbstractC1537c0;
import t0.g0;

/* loaded from: classes.dex */
public final class j extends g0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r f10090a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MaterialButton f10091b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k f10092c;

    public j(k kVar, r rVar, MaterialButton materialButton) {
        this.f10092c = kVar;
        this.f10090a = rVar;
        this.f10091b = materialButton;
    }

    @Override // t0.g0
    public final void a(RecyclerView recyclerView, int i4) {
        if (i4 == 0) {
            recyclerView.announceForAccessibility(this.f10091b.getText());
        }
    }

    @Override // t0.g0
    public final void b(RecyclerView recyclerView, int i4, int i8) {
        int S02;
        b bVar = this.f10090a.f10144d;
        k kVar = this.f10092c;
        if (i4 < 0) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) kVar.j0.getLayoutManager();
            View U02 = linearLayoutManager.U0(0, linearLayoutManager.v(), false);
            if (U02 == null) {
                S02 = -1;
            } else {
                S02 = AbstractC1537c0.K(U02);
            }
        } else {
            S02 = ((LinearLayoutManager) kVar.j0.getLayoutManager()).S0();
        }
        Calendar a3 = v.a(bVar.f10070d.f10129d);
        a3.add(2, S02);
        kVar.f10095f0 = new n(a3);
        Calendar a4 = v.a(bVar.f10070d.f10129d);
        a4.add(2, S02);
        a4.set(5, 1);
        Calendar a9 = v.a(a4);
        a9.get(2);
        a9.get(1);
        a9.getMaximum(7);
        a9.getActualMaximum(5);
        a9.getTimeInMillis();
        long timeInMillis = a9.getTimeInMillis();
        Locale locale = Locale.getDefault();
        AtomicReference atomicReference = v.f10149a;
        DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton("yMMMM", locale);
        instanceForSkeleton.setTimeZone(TimeZone.getTimeZone("UTC"));
        instanceForSkeleton.setContext(DisplayContext.CAPITALIZATION_FOR_STANDALONE);
        this.f10091b.setText(instanceForSkeleton.format(new Date(timeInMillis)));
    }
}
