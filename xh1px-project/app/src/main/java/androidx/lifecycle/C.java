package androidx.lifecycle;

import android.os.Looper;
import java.util.Map;
import p.C1290b;
import q.C1342d;
import q.C1344f;

/* loaded from: classes.dex */
public class C {
    public static final Object j = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final Object f8767a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final C1344f f8768b = new C1344f();

    /* renamed from: c, reason: collision with root package name */
    public int f8769c = 0;

    /* renamed from: d, reason: collision with root package name */
    public boolean f8770d;

    /* renamed from: e, reason: collision with root package name */
    public volatile Object f8771e;

    /* renamed from: f, reason: collision with root package name */
    public volatile Object f8772f;

    /* renamed from: g, reason: collision with root package name */
    public int f8773g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f8774h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f8775i;

    public C() {
        Object obj = j;
        this.f8772f = obj;
        this.f8771e = obj;
        this.f8773g = -1;
    }

    public static void a(String str) {
        C1290b.u().f13647a.getClass();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
        } else {
            throw new IllegalStateException(A.j.p("Cannot invoke ", str, " on a background thread"));
        }
    }

    public final void b(B b4) {
        if (b4.f8764e) {
            if (!b4.e()) {
                b4.b(false);
                return;
            }
            int i4 = b4.f8765f;
            int i8 = this.f8773g;
            if (i4 >= i8) {
                return;
            }
            b4.f8765f = i8;
            b4.f8763d.b(this.f8771e);
        }
    }

    public final void c(B b4) {
        if (this.f8774h) {
            this.f8775i = true;
            return;
        }
        this.f8774h = true;
        do {
            this.f8775i = false;
            if (b4 != null) {
                b(b4);
                b4 = null;
            } else {
                C1344f c1344f = this.f8768b;
                c1344f.getClass();
                C1342d c1342d = new C1342d(c1344f);
                c1344f.f13868f.put(c1342d, Boolean.FALSE);
                while (c1342d.hasNext()) {
                    b((B) ((Map.Entry) c1342d.next()).getValue());
                    if (this.f8775i) {
                        break;
                    }
                }
            }
        } while (this.f8775i);
        this.f8774h = false;
    }
}
