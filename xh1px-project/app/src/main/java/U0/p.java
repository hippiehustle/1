package U0;

import N0.C0202j;
import N0.x;
import P0.u;

/* loaded from: classes.dex */
public final class p implements b {

    /* renamed from: a, reason: collision with root package name */
    public final int f6011a;

    /* renamed from: b, reason: collision with root package name */
    public final T0.b f6012b;

    /* renamed from: c, reason: collision with root package name */
    public final T0.b f6013c;

    /* renamed from: d, reason: collision with root package name */
    public final T0.b f6014d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f6015e;

    public p(String str, int i4, T0.b bVar, T0.b bVar2, T0.b bVar3, boolean z8) {
        this.f6011a = i4;
        this.f6012b = bVar;
        this.f6013c = bVar2;
        this.f6014d = bVar3;
        this.f6015e = z8;
    }

    @Override // U0.b
    public final P0.d a(x xVar, C0202j c0202j, V0.b bVar) {
        return new u(bVar, this);
    }

    public final String toString() {
        return "Trim Path: {start: " + this.f6012b + ", end: " + this.f6013c + ", offset: " + this.f6014d + "}";
    }
}
