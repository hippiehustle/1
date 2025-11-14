package n0;

import a6.AbstractC0437l;
import a6.C0433h;
import android.app.Activity;
import android.content.Context;
import java.util.Iterator;
import q0.C1350f;

/* renamed from: n0.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1146x {

    /* renamed from: a, reason: collision with root package name */
    public final Context f12818a;

    /* renamed from: b, reason: collision with root package name */
    public final C1350f f12819b = new C1350f(this, new C1133k(this, 0));

    /* renamed from: c, reason: collision with root package name */
    public final c0.o f12820c;

    /* renamed from: d, reason: collision with root package name */
    public final Activity f12821d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f12822e;

    /* renamed from: f, reason: collision with root package name */
    public final g0.H f12823f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f12824g;

    /* renamed from: h, reason: collision with root package name */
    public final Z5.n f12825h;

    public C1146x(Context context) {
        Object obj;
        this.f12818a = context;
        this.f12820c = new c0.o(context, 1);
        Iterator it = H7.m.T(context, new H7.o(22)).iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((Context) obj) instanceof Activity) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        this.f12821d = (Activity) obj;
        this.f12823f = new g0.H(1, this);
        this.f12824g = true;
        C1121K c1121k = this.f12819b.f13898r;
        c1121k.a(new C1145w(c1121k));
        this.f12819b.f13898r.a(new C1124b(this.f12818a));
        this.f12825h = new Z5.n(new C1133k(this, 1));
    }

    public final int a() {
        C0433h c0433h = this.f12819b.f13888f;
        int i4 = 0;
        if (c0433h != null && c0433h.isEmpty()) {
            return 0;
        }
        Iterator<E> it = c0433h.iterator();
        while (it.hasNext()) {
            if (!(((C1131i) it.next()).f12759e instanceof C1144v) && (i4 = i4 + 1) < 0) {
                AbstractC0437l.b0();
                throw null;
            }
        }
        return i4;
    }
}
