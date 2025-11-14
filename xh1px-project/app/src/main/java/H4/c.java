package H4;

import L7.k0;
import O7.InterfaceC0233f;
import O7.L;
import O7.V;
import O7.i0;
import a6.t;
import android.graphics.Rect;
import f6.AbstractC0720j;
import n6.InterfaceC1167f;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public final int f2007a;

    /* renamed from: b, reason: collision with root package name */
    public final i0 f2008b;

    /* renamed from: c, reason: collision with root package name */
    public final i0 f2009c;

    /* renamed from: d, reason: collision with root package name */
    public final i0 f2010d;

    /* renamed from: e, reason: collision with root package name */
    public final i0 f2011e;

    /* renamed from: f, reason: collision with root package name */
    public final L f2012f;

    /* renamed from: g, reason: collision with root package name */
    public final i0 f2013g;

    /* renamed from: h, reason: collision with root package name */
    public final i0 f2014h;

    /* renamed from: i, reason: collision with root package name */
    public k0 f2015i;

    /* JADX WARN: Type inference failed for: r5v0, types: [n6.f, f6.j] */
    public c(int i4) {
        this.f2007a = i4;
        i0 c6 = V.c(Boolean.FALSE);
        this.f2008b = c6;
        i0 c9 = V.c(null);
        this.f2009c = c9;
        i0 c10 = V.c(10);
        this.f2010d = c10;
        i0 c11 = V.c(0);
        this.f2011e = c11;
        this.f2012f = new L(new InterfaceC0233f[]{c6, c9, c10, c11}, (InterfaceC1167f) new AbstractC0720j(5, null));
        i0 c12 = V.c(t.f7767d);
        this.f2013g = c12;
        this.f2014h = c12;
    }

    public abstract void a(int i4, Rect rect);

    public abstract void c(N4.d dVar);

    public void b(int i4) {
    }
}
