package U0;

import N0.C0202j;
import N0.x;
import android.graphics.Path;

/* loaded from: classes.dex */
public final class l implements b {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f5989a;

    /* renamed from: b, reason: collision with root package name */
    public final Path.FillType f5990b;

    /* renamed from: c, reason: collision with root package name */
    public final String f5991c;

    /* renamed from: d, reason: collision with root package name */
    public final T0.a f5992d;

    /* renamed from: e, reason: collision with root package name */
    public final T0.a f5993e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f5994f;

    public l(String str, boolean z8, Path.FillType fillType, T0.a aVar, T0.a aVar2, boolean z9) {
        this.f5991c = str;
        this.f5989a = z8;
        this.f5990b = fillType;
        this.f5992d = aVar;
        this.f5993e = aVar2;
        this.f5994f = z9;
    }

    @Override // U0.b
    public final P0.d a(x xVar, C0202j c0202j, V0.b bVar) {
        return new P0.h(xVar, bVar, this);
    }

    public final String toString() {
        return "ShapeFill{color=, fillEnabled=" + this.f5989a + '}';
    }
}
