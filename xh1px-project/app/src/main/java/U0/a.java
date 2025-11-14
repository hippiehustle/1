package U0;

import N0.C0202j;
import N0.x;

/* loaded from: classes.dex */
public final class a implements b {

    /* renamed from: a, reason: collision with root package name */
    public final String f5938a;

    /* renamed from: b, reason: collision with root package name */
    public final T0.e f5939b;

    /* renamed from: c, reason: collision with root package name */
    public final T0.a f5940c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f5941d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f5942e;

    public a(String str, T0.e eVar, T0.a aVar, boolean z8, boolean z9) {
        this.f5938a = str;
        this.f5939b = eVar;
        this.f5940c = aVar;
        this.f5941d = z8;
        this.f5942e = z9;
    }

    @Override // U0.b
    public final P0.d a(x xVar, C0202j c0202j, V0.b bVar) {
        return new P0.g(xVar, bVar, this);
    }
}
