package Q0;

import android.graphics.Color;
import android.graphics.Matrix;

/* loaded from: classes.dex */
public final class h implements a {

    /* renamed from: a, reason: collision with root package name */
    public final V0.b f4728a;

    /* renamed from: b, reason: collision with root package name */
    public final V0.b f4729b;

    /* renamed from: c, reason: collision with root package name */
    public final f f4730c;

    /* renamed from: d, reason: collision with root package name */
    public final i f4731d;

    /* renamed from: e, reason: collision with root package name */
    public final i f4732e;

    /* renamed from: f, reason: collision with root package name */
    public final i f4733f;

    /* renamed from: g, reason: collision with root package name */
    public final i f4734g;

    /* renamed from: h, reason: collision with root package name */
    public Matrix f4735h;

    public h(V0.b bVar, V0.b bVar2, A4.d dVar) {
        this.f4729b = bVar;
        this.f4728a = bVar2;
        e r02 = ((T0.a) dVar.f295e).r0();
        this.f4730c = (f) r02;
        r02.a(this);
        bVar2.d(r02);
        i r03 = ((T0.b) dVar.f296f).r0();
        this.f4731d = r03;
        r03.a(this);
        bVar2.d(r03);
        i r04 = ((T0.b) dVar.f297g).r0();
        this.f4732e = r04;
        r04.a(this);
        bVar2.d(r04);
        i r05 = ((T0.b) dVar.f298h).r0();
        this.f4733f = r05;
        r05.a(this);
        bVar2.d(r05);
        i r06 = ((T0.b) dVar.f299i).r0();
        this.f4734g = r06;
        r06.a(this);
        bVar2.d(r06);
    }

    /* JADX WARN: Type inference failed for: r3v5, types: [Z0.a, java.lang.Object] */
    public final Z0.a a(Matrix matrix, int i4) {
        float l6 = this.f4732e.l() * 0.017453292f;
        float floatValue = ((Float) this.f4733f.e()).floatValue();
        double d2 = l6;
        float sin = ((float) Math.sin(d2)) * floatValue;
        float cos = ((float) Math.cos(d2 + 3.141592653589793d)) * floatValue;
        float floatValue2 = ((Float) this.f4734g.e()).floatValue();
        int intValue = ((Integer) this.f4730c.e()).intValue();
        int argb = Color.argb(Math.round((((Float) this.f4731d.e()).floatValue() * i4) / 255.0f), Color.red(intValue), Color.green(intValue), Color.blue(intValue));
        ?? obj = new Object();
        obj.f7249a = floatValue2 * 0.33f;
        obj.f7250b = sin;
        obj.f7251c = cos;
        obj.f7252d = argb;
        obj.f7253e = null;
        obj.c(matrix);
        if (this.f4735h == null) {
            this.f4735h = new Matrix();
        }
        this.f4728a.f6234w.e().invert(this.f4735h);
        obj.c(this.f4735h);
        return obj;
    }

    @Override // Q0.a
    public final void b() {
        this.f4729b.b();
    }

    public final void c(R3.r rVar) {
        this.f4731d.j(new g(rVar));
    }
}
