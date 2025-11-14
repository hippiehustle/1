package b0;

import C5.j;
import C5.k;
import J0.m;
import a.AbstractC0405a;
import android.os.Looper;
import android.util.AndroidRuntimeException;
import java.util.ArrayList;

/* renamed from: b0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0520e {

    /* renamed from: p, reason: collision with root package name */
    public static final C0518c f9021p = new C0518c(1);

    /* renamed from: q, reason: collision with root package name */
    public static final C0518c f9022q = new C0518c(2);

    /* renamed from: r, reason: collision with root package name */
    public static final C0518c f9023r = new C0518c(3);

    /* renamed from: s, reason: collision with root package name */
    public static final C0518c f9024s = new C0518c(4);

    /* renamed from: t, reason: collision with root package name */
    public static final C0518c f9025t = new C0518c(5);

    /* renamed from: u, reason: collision with root package name */
    public static final C0518c f9026u = new C0518c(0);

    /* renamed from: a, reason: collision with root package name */
    public float f9027a;

    /* renamed from: b, reason: collision with root package name */
    public float f9028b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f9029c;

    /* renamed from: d, reason: collision with root package name */
    public final k f9030d;

    /* renamed from: e, reason: collision with root package name */
    public final AbstractC0405a f9031e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f9032f;

    /* renamed from: g, reason: collision with root package name */
    public final float f9033g;

    /* renamed from: h, reason: collision with root package name */
    public final float f9034h;

    /* renamed from: i, reason: collision with root package name */
    public long f9035i;
    public final float j;
    public final ArrayList k;

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f9036l;

    /* renamed from: m, reason: collision with root package name */
    public C0521f f9037m;

    /* renamed from: n, reason: collision with root package name */
    public float f9038n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f9039o;

    public C0520e(k kVar) {
        j jVar = k.f685t;
        this.f9027a = 0.0f;
        this.f9028b = Float.MAX_VALUE;
        this.f9029c = false;
        this.f9032f = false;
        this.f9033g = Float.MAX_VALUE;
        this.f9034h = -3.4028235E38f;
        this.f9035i = 0L;
        this.k = new ArrayList();
        this.f9036l = new ArrayList();
        this.f9030d = kVar;
        this.f9031e = jVar;
        if (jVar != f9023r && jVar != f9024s && jVar != f9025t) {
            if (jVar == f9026u) {
                this.j = 0.00390625f;
            } else if (jVar != f9021p && jVar != f9022q) {
                this.j = 1.0f;
            } else {
                this.j = 0.00390625f;
            }
        } else {
            this.j = 0.1f;
        }
        this.f9037m = null;
        this.f9038n = Float.MAX_VALUE;
        this.f9039o = false;
    }

    public final void a(float f8) {
        this.f9031e.w0(this.f9030d, f8);
        int i4 = 0;
        while (true) {
            ArrayList arrayList = this.f9036l;
            if (i4 < arrayList.size()) {
                if (arrayList.get(i4) == null) {
                    i4++;
                } else {
                    ((m) arrayList.get(i4)).getClass();
                    throw null;
                }
            } else {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    if (arrayList.get(size) == null) {
                        arrayList.remove(size);
                    }
                }
                return;
            }
        }
    }

    public final void b() {
        if (this.f9037m.f9041b > 0.0d) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                if (this.f9032f) {
                    this.f9039o = true;
                    return;
                }
                return;
            }
            throw new AndroidRuntimeException("Animations may only be started on the main thread");
        }
        throw new UnsupportedOperationException("Spring animations can only come to an end when there is damping");
    }
}
