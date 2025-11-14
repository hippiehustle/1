package g0;

import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public final class H {

    /* renamed from: a, reason: collision with root package name */
    public boolean f10861a = false;

    /* renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList f10862b = new CopyOnWriteArrayList();

    /* renamed from: c, reason: collision with root package name */
    public o6.i f10863c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f10864d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f10865e;

    public H(int i4, Object obj) {
        this.f10864d = i4;
        this.f10865e = obj;
    }

    public void a() {
        switch (this.f10864d) {
            case 0:
                T t8 = (T) this.f10865e;
                if (T.K(3)) {
                    Objects.toString(t8);
                }
                if (T.K(3)) {
                    Objects.toString(t8.f10907h);
                }
                C0732a c0732a = t8.f10907h;
                if (c0732a != null) {
                    c0732a.f10967s = false;
                    c0732a.d();
                    C0732a c0732a2 = t8.f10907h;
                    E.a aVar = new E.a(14, t8);
                    if (c0732a2.f10965q == null) {
                        c0732a2.f10965q = new ArrayList();
                    }
                    c0732a2.f10965q.add(aVar);
                    t8.f10907h.e();
                    t8.f10908i = true;
                    t8.A(true);
                    t8.F();
                    t8.f10908i = false;
                    t8.f10907h = null;
                    return;
                }
                return;
            default:
                return;
        }
    }

    public final void b() {
    }
}
