package U0;

import N0.C0202j;
import N0.x;
import P0.q;

/* loaded from: classes.dex */
public final class i implements b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5979a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final String f5980b;

    /* renamed from: c, reason: collision with root package name */
    public final T0.b f5981c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f5982d;

    /* renamed from: e, reason: collision with root package name */
    public final T0.e f5983e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f5984f;

    public i(String str, T0.b bVar, T0.b bVar2, T0.d dVar, boolean z8) {
        this.f5980b = str;
        this.f5981c = bVar;
        this.f5983e = bVar2;
        this.f5984f = dVar;
        this.f5982d = z8;
    }

    @Override // U0.b
    public final P0.d a(x xVar, C0202j c0202j, V0.b bVar) {
        switch (this.f5979a) {
            case 0:
                return new P0.p(xVar, bVar, this);
            default:
                return new q(xVar, bVar, this);
        }
    }

    public String toString() {
        switch (this.f5979a) {
            case 0:
                return "RectangleShape{position=" + this.f5983e + ", size=" + ((T0.e) this.f5984f) + '}';
            default:
                return super.toString();
        }
    }

    public i(String str, T0.e eVar, T0.a aVar, T0.b bVar, boolean z8) {
        this.f5980b = str;
        this.f5983e = eVar;
        this.f5984f = aVar;
        this.f5981c = bVar;
        this.f5982d = z8;
    }
}
