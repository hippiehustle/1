package s4;

import A5.q;
import J3.C0076a;
import J3.s;
import L7.AbstractC0166y;
import android.content.Context;
import android.view.ViewGroup;
import androidx.lifecycle.U;
import com.buzbuz.smartautoclicker.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.textview.MaterialTextView;
import j3.C0933s;
import kotlin.NoWhenBranchMatchedException;
import l5.DialogC1035e;
import o6.v;
import q4.X;
import t4.C1583k;
import v4.C1674i;
import w4.C1704i;

/* renamed from: s4.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1502j extends B1.c {

    /* renamed from: A, reason: collision with root package name */
    public final s f14542A;

    /* renamed from: B, reason: collision with root package name */
    public final A4.d f14543B;

    /* renamed from: z, reason: collision with root package name */
    public final C0076a f14544z;

    public C1502j(C0076a c0076a, s sVar) {
        super(R.style.ScenarioConfigTheme);
        this.f14544z = c0076a;
        this.f14542A = sVar;
        this.f14543B = new A4.d(v.f13643a.b(C1504l.class), new C1501i(this, 0), new C1501i(this, 1), new C0933s(19, this));
    }

    public static void Q(C1502j c1502j) {
        c1502j.f14542A.a();
        super.a();
    }

    @Override // B1.c, z1.b
    public final ViewGroup E() {
        ViewGroup E7 = super.E();
        X.Q(I(), C2.a.f583f, 0);
        ((MaterialTextView) I().f298h).setText(R.string.dialog_title_scenario_config);
        return E7;
    }

    @Override // B1.c, z1.b
    public final void F(DialogC1035e dialogC1035e) {
        super.F(dialogC1035e);
        AbstractC0166y.q(U.e(this), null, null, new C1496d(this, null), 3);
        AbstractC0166y.q(U.e(this), null, null, new C1500h(this, null), 3);
    }

    @Override // B1.c
    public final void K(q qVar) {
        qVar.b(R.menu.menu_scenario_config);
    }

    @Override // B1.c
    public final B1.h M(int i4) {
        if (i4 == R.id.page_image_events) {
            Context applicationContext = k().getApplicationContext();
            o6.j.d(applicationContext, "getApplicationContext(...)");
            return new u4.k(applicationContext);
        }
        if (i4 == R.id.page_trigger_events) {
            Context applicationContext2 = k().getApplicationContext();
            o6.j.d(applicationContext2, "getApplicationContext(...)");
            return new C1704i(applicationContext2);
        }
        if (i4 == R.id.page_config) {
            Context applicationContext3 = k().getApplicationContext();
            o6.j.d(applicationContext3, "getApplicationContext(...)");
            return new C1583k(applicationContext3);
        }
        if (i4 == R.id.page_more) {
            Context applicationContext4 = k().getApplicationContext();
            o6.j.d(applicationContext4, "getApplicationContext(...)");
            return new C1674i(applicationContext4);
        }
        throw new IllegalArgumentException(A.j.l("Unknown menu id ", i4));
    }

    @Override // B1.c
    public final void N(C2.a aVar) {
        int ordinal = aVar.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    this.f14544z.a();
                    super.a();
                    return;
                }
                throw new NoWhenBranchMatchedException();
            }
            return;
        }
        a();
    }

    public final C1504l R() {
        return (C1504l) this.f14543B.getValue();
    }

    @Override // w1.e
    public final void a() {
        if (((Boolean) R().f14549c.f4088d.f()).booleanValue()) {
            X.Y(k(), R.string.warning_dialog_message_close_without_saving, new B0.e(28, this));
        } else {
            this.f14542A.a();
            super.a();
        }
    }

    @Override // z1.b, w1.e
    public final void t() {
        D();
        J2.b bVar = R().f14548b;
        bVar.b(J2.a.f2382x);
        bVar.b(J2.a.f2383y);
    }

    @Override // w1.e
    public final void u() {
        C1504l R5 = R();
        FloatingActionButton floatingActionButton = (FloatingActionButton) G().f293g;
        MaterialButton materialButton = (MaterialButton) I().f299i;
        J2.b bVar = R5.f14548b;
        bVar.a(J2.a.f2382x, floatingActionButton);
        bVar.a(J2.a.f2383y, materialButton);
    }
}
