package p3;

import A5.q;
import J3.s;
import L7.AbstractC0166y;
import android.content.Context;
import android.view.ViewGroup;
import androidx.lifecycle.U;
import com.buzbuz.smartautoclicker.R;
import com.google.android.material.textview.MaterialTextView;
import j3.C0933s;
import l5.DialogC1035e;
import o6.j;
import o6.v;
import q4.X;
import r3.C1450n;

/* renamed from: p3.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1309e extends B1.c {

    /* renamed from: A, reason: collision with root package name */
    public final s f13716A;

    /* renamed from: B, reason: collision with root package name */
    public final A4.d f13717B;

    /* renamed from: z, reason: collision with root package name */
    public final s f13718z;

    public C1309e(s sVar, s sVar2) {
        super(R.style.AppTheme);
        this.f13718z = sVar;
        this.f13716A = sVar2;
        this.f13717B = new A4.d(v.f13643a.b(C1312h.class), new C1308d(this, 0), new C1308d(this, 1), new C0933s(13, this));
    }

    @Override // B1.c, z1.b
    public final ViewGroup E() {
        ViewGroup E7 = super.E();
        X.Q(I(), C2.a.f583f, 0);
        ((MaterialTextView) I().f298h).setText(R.string.dialog_overlay_title_dumb_scenario_config);
        return E7;
    }

    @Override // B1.c, z1.b
    public final void F(DialogC1035e dialogC1035e) {
        super.F(dialogC1035e);
        AbstractC0166y.q(U.e(this), null, null, new C1307c(this, null), 3);
    }

    @Override // B1.c
    public final void K(q qVar) {
        qVar.b(R.menu.menu_dumb_scenario_config);
    }

    @Override // B1.c
    public final B1.h M(int i4) {
        if (i4 == R.id.page_actions) {
            Context applicationContext = k().getApplicationContext();
            j.d(applicationContext, "getApplicationContext(...)");
            return new q3.j(applicationContext);
        }
        if (i4 == R.id.page_config) {
            Context applicationContext2 = k().getApplicationContext();
            j.d(applicationContext2, "getApplicationContext(...)");
            return new C1450n(applicationContext2);
        }
        throw new IllegalArgumentException(A.j.l("Unknown menu id ", i4));
    }

    @Override // B1.c
    public final void N(C2.a aVar) {
        if (aVar == C2.a.f583f) {
            this.f13718z.a();
            super.a();
        } else {
            a();
        }
    }

    @Override // w1.e
    public final void a() {
        this.f13716A.a();
        super.a();
    }
}
