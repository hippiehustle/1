package U0;

import N0.C0202j;
import N0.x;
import android.graphics.Path;

/* loaded from: classes.dex */
public final class d implements b {

    /* renamed from: a, reason: collision with root package name */
    public final int f5945a;

    /* renamed from: b, reason: collision with root package name */
    public final Path.FillType f5946b;

    /* renamed from: c, reason: collision with root package name */
    public final T0.a f5947c;

    /* renamed from: d, reason: collision with root package name */
    public final T0.a f5948d;

    /* renamed from: e, reason: collision with root package name */
    public final T0.a f5949e;

    /* renamed from: f, reason: collision with root package name */
    public final T0.a f5950f;

    /* renamed from: g, reason: collision with root package name */
    public final String f5951g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f5952h;

    public d(String str, int i4, Path.FillType fillType, T0.a aVar, T0.a aVar2, T0.a aVar3, T0.a aVar4, boolean z8) {
        this.f5945a = i4;
        this.f5946b = fillType;
        this.f5947c = aVar;
        this.f5948d = aVar2;
        this.f5949e = aVar3;
        this.f5950f = aVar4;
        this.f5951g = str;
        this.f5952h = z8;
    }

    @Override // U0.b
    public final P0.d a(x xVar, C0202j c0202j, V0.b bVar) {
        return new P0.i(xVar, c0202j, bVar, this);
    }
}
