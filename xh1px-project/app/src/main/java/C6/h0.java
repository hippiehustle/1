package C6;

import android.view.MenuInflater;
import android.view.View;
import b6.C0538f;

/* loaded from: classes.dex */
public abstract class h0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f749d = 1;

    /* renamed from: e, reason: collision with root package name */
    public boolean f750e;

    /* renamed from: f, reason: collision with root package name */
    public Object f751f;

    public /* synthetic */ h0() {
    }

    public Integer a(h0 h0Var) {
        o6.j.e(h0Var, "visibility");
        C0538f c0538f = g0.f748a;
        if (this == h0Var) {
            return 0;
        }
        C0538f c0538f2 = g0.f748a;
        Integer num = (Integer) c0538f2.get(this);
        Integer num2 = (Integer) c0538f2.get(h0Var);
        if (num != null && num2 != null && !num.equals(num2)) {
            return Integer.valueOf(num.intValue() - num2.intValue());
        }
        return null;
    }

    public abstract void b();

    public abstract View c();

    public String d() {
        return (String) this.f751f;
    }

    public abstract n.m e();

    public abstract MenuInflater f();

    public abstract CharSequence g();

    public abstract CharSequence h();

    public abstract void i();

    public abstract boolean j();

    public abstract void l(View view);

    public abstract void m(int i4);

    public abstract void n(CharSequence charSequence);

    public abstract void o(int i4);

    public abstract void p(CharSequence charSequence);

    public abstract void q(boolean z8);

    public String toString() {
        switch (this.f749d) {
            case 0:
                return d();
            default:
                return super.toString();
        }
    }

    public h0(String str, boolean z8) {
        this.f751f = str;
        this.f750e = z8;
    }

    public h0 k() {
        return this;
    }
}
