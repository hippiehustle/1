package U0;

import N0.C0202j;
import N0.x;
import P0.s;

/* loaded from: classes.dex */
public final class n implements b {

    /* renamed from: a, reason: collision with root package name */
    public final String f5998a;

    /* renamed from: b, reason: collision with root package name */
    public final int f5999b;

    /* renamed from: c, reason: collision with root package name */
    public final T0.a f6000c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f6001d;

    public n(String str, int i4, T0.a aVar, boolean z8) {
        this.f5998a = str;
        this.f5999b = i4;
        this.f6000c = aVar;
        this.f6001d = z8;
    }

    @Override // U0.b
    public final P0.d a(x xVar, C0202j c0202j, V0.b bVar) {
        return new s(xVar, bVar, this);
    }

    public final String toString() {
        return "ShapePath{name=" + this.f5998a + ", index=" + this.f5999b + '}';
    }
}
