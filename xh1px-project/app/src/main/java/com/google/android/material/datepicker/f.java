package com.google.android.material.datepicker;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.Calendar;
import t0.AbstractC1537c0;

/* loaded from: classes.dex */
public final class f implements View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f10083d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r f10084e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ k f10085f;

    public /* synthetic */ f(k kVar, r rVar, int i4) {
        this.f10083d = i4;
        this.f10085f = kVar;
        this.f10084e = rVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int K;
        switch (this.f10083d) {
            case 0:
                k kVar = this.f10085f;
                int S02 = ((LinearLayoutManager) kVar.j0.getLayoutManager()).S0() - 1;
                if (S02 >= 0) {
                    Calendar a3 = v.a(this.f10084e.f10144d.f10070d.f10129d);
                    a3.add(2, S02);
                    kVar.S(new n(a3));
                    return;
                }
                return;
            default:
                k kVar2 = this.f10085f;
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) kVar2.j0.getLayoutManager();
                View U02 = linearLayoutManager.U0(0, linearLayoutManager.v(), false);
                if (U02 == null) {
                    K = -1;
                } else {
                    K = AbstractC1537c0.K(U02);
                }
                int i4 = K + 1;
                if (i4 < kVar2.j0.getAdapter().a()) {
                    Calendar a4 = v.a(this.f10084e.f10144d.f10070d.f10129d);
                    a4.add(2, i4);
                    kVar2.S(new n(a4));
                    return;
                }
                return;
        }
    }
}
