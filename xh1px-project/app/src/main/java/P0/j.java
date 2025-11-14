package P0;

import N0.B;
import N0.x;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import x.AbstractC1769h;

/* loaded from: classes.dex */
public final class j extends b {

    /* renamed from: A, reason: collision with root package name */
    public Q0.r f4382A;

    /* renamed from: q, reason: collision with root package name */
    public final String f4383q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f4384r;

    /* renamed from: s, reason: collision with root package name */
    public final t.g f4385s;

    /* renamed from: t, reason: collision with root package name */
    public final t.g f4386t;

    /* renamed from: u, reason: collision with root package name */
    public final RectF f4387u;

    /* renamed from: v, reason: collision with root package name */
    public final int f4388v;

    /* renamed from: w, reason: collision with root package name */
    public final int f4389w;

    /* renamed from: x, reason: collision with root package name */
    public final Q0.j f4390x;

    /* renamed from: y, reason: collision with root package name */
    public final Q0.j f4391y;

    /* renamed from: z, reason: collision with root package name */
    public final Q0.j f4392z;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public j(x xVar, V0.b bVar, U0.e eVar) {
        super(xVar, bVar, r3, r4, eVar.j, eVar.f5956d, eVar.f5959g, eVar.k, eVar.f5962l);
        Paint.Cap cap;
        Paint.Join join;
        Paint.Join join2;
        int b4 = AbstractC1769h.b(eVar.f5960h);
        if (b4 != 0) {
            if (b4 != 1) {
                cap = Paint.Cap.SQUARE;
            } else {
                cap = Paint.Cap.ROUND;
            }
        } else {
            cap = Paint.Cap.BUTT;
        }
        Paint.Cap cap2 = cap;
        int b9 = AbstractC1769h.b(eVar.f5961i);
        if (b9 != 0) {
            if (b9 != 1) {
                if (b9 != 2) {
                    join2 = null;
                    this.f4385s = new t.g((Object) null);
                    this.f4386t = new t.g((Object) null);
                    this.f4387u = new RectF();
                    this.f4383q = eVar.f5953a;
                    this.f4388v = eVar.f5954b;
                    this.f4384r = eVar.f5963m;
                    this.f4389w = (int) (xVar.f3674d.b() / 32.0f);
                    Q0.e r02 = eVar.f5955c.r0();
                    this.f4390x = (Q0.j) r02;
                    r02.a(this);
                    bVar.d(r02);
                    Q0.e r03 = eVar.f5957e.r0();
                    this.f4391y = (Q0.j) r03;
                    r03.a(this);
                    bVar.d(r03);
                    Q0.e r04 = eVar.f5958f.r0();
                    this.f4392z = (Q0.j) r04;
                    r04.a(this);
                    bVar.d(r04);
                }
                join = Paint.Join.BEVEL;
            } else {
                join = Paint.Join.ROUND;
            }
        } else {
            join = Paint.Join.MITER;
        }
        join2 = join;
        this.f4385s = new t.g((Object) null);
        this.f4386t = new t.g((Object) null);
        this.f4387u = new RectF();
        this.f4383q = eVar.f5953a;
        this.f4388v = eVar.f5954b;
        this.f4384r = eVar.f5963m;
        this.f4389w = (int) (xVar.f3674d.b() / 32.0f);
        Q0.e r022 = eVar.f5955c.r0();
        this.f4390x = (Q0.j) r022;
        r022.a(this);
        bVar.d(r022);
        Q0.e r032 = eVar.f5957e.r0();
        this.f4391y = (Q0.j) r032;
        r032.a(this);
        bVar.d(r032);
        Q0.e r042 = eVar.f5958f.r0();
        this.f4392z = (Q0.j) r042;
        r042.a(this);
        bVar.d(r042);
    }

    public final int[] d(int[] iArr) {
        Q0.r rVar = this.f4382A;
        if (rVar != null) {
            Integer[] numArr = (Integer[]) rVar.e();
            int i4 = 0;
            if (iArr.length == numArr.length) {
                while (i4 < iArr.length) {
                    iArr[i4] = numArr[i4].intValue();
                    i4++;
                }
            } else {
                iArr = new int[numArr.length];
                while (i4 < numArr.length) {
                    iArr[i4] = numArr[i4].intValue();
                    i4++;
                }
            }
        }
        return iArr;
    }

    @Override // P0.b, S0.f
    public final void e(R3.r rVar, Object obj) {
        super.e(rVar, obj);
        if (obj == B.f3536G) {
            Q0.r rVar2 = this.f4382A;
            V0.b bVar = this.f4326f;
            if (rVar2 != null) {
                bVar.o(rVar2);
            }
            Q0.r rVar3 = new Q0.r(rVar, null);
            this.f4382A = rVar3;
            rVar3.a(this);
            bVar.d(this.f4382A);
        }
    }

    @Override // P0.b, P0.f
    public final void g(Canvas canvas, Matrix matrix, int i4, Z0.a aVar) {
        Shader shader;
        Shader radialGradient;
        if (this.f4384r) {
            return;
        }
        a(this.f4387u, matrix, false);
        int i8 = this.f4388v;
        Q0.j jVar = this.f4390x;
        Q0.j jVar2 = this.f4392z;
        Q0.j jVar3 = this.f4391y;
        if (i8 == 1) {
            long i9 = i();
            t.g gVar = this.f4385s;
            shader = (LinearGradient) gVar.c(i9);
            if (shader == null) {
                PointF pointF = (PointF) jVar3.e();
                PointF pointF2 = (PointF) jVar2.e();
                U0.c cVar = (U0.c) jVar.e();
                radialGradient = new LinearGradient(pointF.x, pointF.y, pointF2.x, pointF2.y, d(cVar.f5944b), cVar.f5943a, Shader.TileMode.CLAMP);
                gVar.g(i9, radialGradient);
                shader = radialGradient;
            }
            this.f4329i.setShader(shader);
            super.g(canvas, matrix, i4, aVar);
        }
        long i10 = i();
        t.g gVar2 = this.f4386t;
        shader = (RadialGradient) gVar2.c(i10);
        if (shader == null) {
            PointF pointF3 = (PointF) jVar3.e();
            PointF pointF4 = (PointF) jVar2.e();
            U0.c cVar2 = (U0.c) jVar.e();
            int[] d2 = d(cVar2.f5944b);
            float[] fArr = cVar2.f5943a;
            radialGradient = new RadialGradient(pointF3.x, pointF3.y, (float) Math.hypot(pointF4.x - r10, pointF4.y - r11), d2, fArr, Shader.TileMode.CLAMP);
            gVar2.g(i10, radialGradient);
            shader = radialGradient;
        }
        this.f4329i.setShader(shader);
        super.g(canvas, matrix, i4, aVar);
    }

    @Override // P0.d
    public final String getName() {
        return this.f4383q;
    }

    public final int i() {
        int i4;
        float f8 = this.f4391y.f4721d;
        float f9 = this.f4389w;
        int round = Math.round(f8 * f9);
        int round2 = Math.round(this.f4392z.f4721d * f9);
        int round3 = Math.round(this.f4390x.f4721d * f9);
        if (round != 0) {
            i4 = 527 * round;
        } else {
            i4 = 17;
        }
        if (round2 != 0) {
            i4 = i4 * 31 * round2;
        }
        if (round3 != 0) {
            return i4 * 31 * round3;
        }
        return i4;
    }
}
