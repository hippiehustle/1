package n0;

import android.os.Bundle;

/* renamed from: n0.G, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1117G {

    /* renamed from: b, reason: collision with root package name */
    public static final C1126d f12723b;

    /* renamed from: c, reason: collision with root package name */
    public static final C1126d f12724c;

    /* renamed from: d, reason: collision with root package name */
    public static final C1125c f12725d;

    /* renamed from: e, reason: collision with root package name */
    public static final C1125c f12726e;

    /* renamed from: f, reason: collision with root package name */
    public static final C1126d f12727f;

    /* renamed from: g, reason: collision with root package name */
    public static final C1125c f12728g;

    /* renamed from: h, reason: collision with root package name */
    public static final C1125c f12729h;

    /* renamed from: i, reason: collision with root package name */
    public static final C1126d f12730i;
    public static final C1125c j;
    public static final C1125c k;

    /* renamed from: l, reason: collision with root package name */
    public static final C1126d f12731l;

    /* renamed from: m, reason: collision with root package name */
    public static final C1125c f12732m;

    /* renamed from: n, reason: collision with root package name */
    public static final C1125c f12733n;

    /* renamed from: o, reason: collision with root package name */
    public static final C1126d f12734o;

    /* renamed from: p, reason: collision with root package name */
    public static final C1125c f12735p;

    /* renamed from: q, reason: collision with root package name */
    public static final C1125c f12736q;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f12737a;

    static {
        boolean z8 = false;
        f12723b = new C1126d(2, z8);
        int i4 = 4;
        f12724c = new C1126d(i4, z8);
        boolean z9 = true;
        f12725d = new C1125c(i4, z9);
        f12726e = new C1125c(5, z9);
        f12727f = new C1126d(3, z8);
        f12728g = new C1125c(6, z9);
        f12729h = new C1125c(7, z9);
        f12730i = new C1126d(1, z8);
        j = new C1125c(2, z9);
        k = new C1125c(3, z9);
        int i8 = 0;
        f12731l = new C1126d(i8, z8);
        f12732m = new C1125c(i8, z9);
        f12733n = new C1125c(1, z9);
        f12734o = new C1126d(5, z9);
        f12735p = new C1125c(8, z9);
        f12736q = new C1125c(9, z9);
    }

    public AbstractC1117G(boolean z8) {
        this.f12737a = z8;
    }

    public abstract Object a(String str, Bundle bundle);

    public abstract String b();

    public Object c(Object obj, String str) {
        return d(str);
    }

    public abstract Object d(String str);

    public abstract void e(Bundle bundle, String str, Object obj);

    public String f(Object obj) {
        return String.valueOf(obj);
    }

    public final String toString() {
        return b();
    }
}
