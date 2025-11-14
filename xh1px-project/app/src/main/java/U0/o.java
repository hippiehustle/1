package U0;

import N0.C0202j;
import N0.x;
import P0.t;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class o implements b {

    /* renamed from: a, reason: collision with root package name */
    public final String f6002a;

    /* renamed from: b, reason: collision with root package name */
    public final T0.b f6003b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f6004c;

    /* renamed from: d, reason: collision with root package name */
    public final T0.a f6005d;

    /* renamed from: e, reason: collision with root package name */
    public final T0.a f6006e;

    /* renamed from: f, reason: collision with root package name */
    public final T0.b f6007f;

    /* renamed from: g, reason: collision with root package name */
    public final int f6008g;

    /* renamed from: h, reason: collision with root package name */
    public final int f6009h;

    /* renamed from: i, reason: collision with root package name */
    public final float f6010i;
    public final boolean j;

    public o(String str, T0.b bVar, ArrayList arrayList, T0.a aVar, T0.a aVar2, T0.b bVar2, int i4, int i8, float f8, boolean z8) {
        this.f6002a = str;
        this.f6003b = bVar;
        this.f6004c = arrayList;
        this.f6005d = aVar;
        this.f6006e = aVar2;
        this.f6007f = bVar2;
        this.f6008g = i4;
        this.f6009h = i8;
        this.f6010i = f8;
        this.j = z8;
    }

    @Override // U0.b
    public final P0.d a(x xVar, C0202j c0202j, V0.b bVar) {
        return new t(xVar, bVar, this);
    }
}
