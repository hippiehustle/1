package O3;

import K3.C0091e;
import L7.AbstractC0166y;
import android.content.Context;
import android.content.SharedPreferences;
import android.view.ViewGroup;
import com.buzbuz.smartautoclicker.R;
import com.google.android.material.textview.MaterialTextView;
import l5.DialogC1035e;

/* loaded from: classes.dex */
public final class F extends B1.c {

    /* renamed from: A, reason: collision with root package name */
    public final A4.d f3868A;

    /* renamed from: z, reason: collision with root package name */
    public final C0091e f3869z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F(C0091e c0091e) {
        super(R.style.ScenarioConfigTheme);
        o6.j.e(c0091e, "listener");
        this.f3869z = c0091e;
        this.f3868A = new A4.d(o6.v.f13643a.b(a0.class), new E(this, 0), new E(this, 1), new D4.z(12, this));
    }

    public static void Q(F f8) {
        f8.f3869z.c();
        super.a();
    }

    @Override // B1.c, z1.b
    public final ViewGroup E() {
        ViewGroup E7 = super.E();
        A4.d I8 = I();
        ((MaterialTextView) I8.f298h).setText(R.string.dialog_title_intent);
        q4.X.Q(I8, C2.a.f583f, 0);
        q4.X.Q(I8, C2.a.f582e, 0);
        return E7;
    }

    @Override // B1.c, z1.b
    public final void F(DialogC1035e dialogC1035e) {
        boolean z8;
        int i4;
        Boolean bool;
        A5.q H2 = H();
        f2.f fVar = (f2.f) R().f3924b.f1950e.a();
        if (fVar != null && (bool = fVar.f10703e) != null) {
            z8 = bool.booleanValue();
        } else {
            z8 = false;
        }
        if (z8) {
            i4 = R.id.page_advanced;
        } else {
            i4 = R.id.page_simple;
        }
        H2.setSelectedItemId(i4);
        super.F(dialogC1035e);
        AbstractC0166y.q(androidx.lifecycle.U.e(this), null, null, new A(this, null), 3);
        AbstractC0166y.q(androidx.lifecycle.U.e(this), null, null, new D(this, null), 3);
    }

    @Override // B1.c
    public final void K(A5.q qVar) {
        qVar.b(R.menu.menu_intent_config);
    }

    @Override // B1.c
    public final void L(int i4) {
        if (i4 == R.id.page_simple) {
            R().g(false);
        } else if (i4 == R.id.page_advanced) {
            R().g(true);
        }
    }

    @Override // B1.c
    public final B1.h M(int i4) {
        if (i4 == R.id.page_simple) {
            Context applicationContext = k().getApplicationContext();
            o6.j.d(applicationContext, "getApplicationContext(...)");
            return new k0(applicationContext);
        }
        if (i4 == R.id.page_advanced) {
            Context applicationContext2 = k().getApplicationContext();
            o6.j.d(applicationContext2, "getApplicationContext(...)");
            return new C0219q(applicationContext2);
        }
        throw new IllegalArgumentException(A.j.l("Unknown menu id ", i4));
    }

    @Override // B1.c
    public final void N(C2.a aVar) {
        int ordinal = aVar.ordinal();
        if (ordinal != 0) {
            C0091e c0091e = this.f3869z;
            if (ordinal != 1) {
                if (ordinal != 2) {
                    return;
                }
                a0 R5 = R();
                f2.f fVar = (f2.f) R5.f3924b.f1950e.a();
                if (fVar != null) {
                    SharedPreferences.Editor edit = R5.f3926d.edit();
                    o6.j.d(edit, "edit(...)");
                    SharedPreferences.Editor putBoolean = edit.putBoolean("Last_Intent_IsAdvanced", o6.j.a(fVar.f10703e, Boolean.TRUE));
                    o6.j.d(putBoolean, "putBoolean(...)");
                    putBoolean.apply();
                }
                c0091e.a();
                super.a();
                return;
            }
            c0091e.b();
            super.a();
            return;
        }
        a();
    }

    public final a0 R() {
        return (a0) this.f3868A.getValue();
    }

    @Override // w1.e
    public final void a() {
        if (((Boolean) R().f3925c.f4088d.f()).booleanValue()) {
            q4.X.Y(k(), R.string.warning_dialog_message_close_without_saving, new B0.e(8, this));
        } else {
            this.f3869z.c();
            super.a();
        }
    }
}
