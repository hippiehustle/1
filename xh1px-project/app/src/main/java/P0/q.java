package P0;

import N0.B;
import N0.x;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

/* loaded from: classes.dex */
public final class q implements f, n, k, Q0.a, l {

    /* renamed from: a, reason: collision with root package name */
    public final Matrix f4423a = new Matrix();

    /* renamed from: b, reason: collision with root package name */
    public final Path f4424b = new Path();

    /* renamed from: c, reason: collision with root package name */
    public final x f4425c;

    /* renamed from: d, reason: collision with root package name */
    public final V0.b f4426d;

    /* renamed from: e, reason: collision with root package name */
    public final String f4427e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f4428f;

    /* renamed from: g, reason: collision with root package name */
    public final Q0.i f4429g;

    /* renamed from: h, reason: collision with root package name */
    public final Q0.i f4430h;

    /* renamed from: i, reason: collision with root package name */
    public final Q0.q f4431i;
    public e j;

    public q(x xVar, V0.b bVar, U0.i iVar) {
        this.f4425c = xVar;
        this.f4426d = bVar;
        this.f4427e = iVar.f5980b;
        this.f4428f = iVar.f5982d;
        Q0.i r02 = iVar.f5981c.r0();
        this.f4429g = r02;
        bVar.d(r02);
        r02.a(this);
        Q0.i r03 = ((T0.b) iVar.f5983e).r0();
        this.f4430h = r03;
        bVar.d(r03);
        r03.a(this);
        T0.d dVar = (T0.d) iVar.f5984f;
        dVar.getClass();
        Q0.q qVar = new Q0.q(dVar);
        this.f4431i = qVar;
        qVar.a(bVar);
        qVar.b(this);
    }

    @Override // P0.f
    public final void a(RectF rectF, Matrix matrix, boolean z8) {
        this.j.a(rectF, matrix, z8);
    }

    @Override // Q0.a
    public final void b() {
        this.f4425c.invalidateSelf();
    }

    @Override // P0.d
    public final void c(List list, List list2) {
        this.j.c(list, list2);
    }

    @Override // P0.k
    public final void d(ListIterator listIterator) {
        if (this.j != null) {
            return;
        }
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        ArrayList arrayList = new ArrayList();
        while (listIterator.hasPrevious()) {
            arrayList.add((d) listIterator.previous());
            listIterator.remove();
        }
        Collections.reverse(arrayList);
        this.j = new e(this.f4425c, this.f4426d, "Repeater", this.f4428f, arrayList, null);
    }

    @Override // S0.f
    public final void e(R3.r rVar, Object obj) {
        if (!this.f4431i.c(rVar, obj)) {
            if (obj == B.f3553p) {
                this.f4429g.j(rVar);
            } else if (obj == B.f3554q) {
                this.f4430h.j(rVar);
            }
        }
    }

    @Override // P0.n
    public final Path f() {
        Path f8 = this.j.f();
        Path path = this.f4424b;
        path.reset();
        float floatValue = ((Float) this.f4429g.e()).floatValue();
        float floatValue2 = ((Float) this.f4430h.e()).floatValue();
        for (int i4 = ((int) floatValue) - 1; i4 >= 0; i4--) {
            Matrix f9 = this.f4431i.f(i4 + floatValue2);
            Matrix matrix = this.f4423a;
            matrix.set(f9);
            path.addPath(f8, matrix);
        }
        return path;
    }

    @Override // P0.f
    public final void g(Canvas canvas, Matrix matrix, int i4, Z0.a aVar) {
        float floatValue = ((Float) this.f4429g.e()).floatValue();
        float floatValue2 = ((Float) this.f4430h.e()).floatValue();
        Q0.q qVar = this.f4431i;
        float floatValue3 = ((Float) qVar.f4762m.e()).floatValue() / 100.0f;
        float floatValue4 = ((Float) qVar.f4763n.e()).floatValue() / 100.0f;
        for (int i8 = ((int) floatValue) - 1; i8 >= 0; i8--) {
            Matrix matrix2 = this.f4423a;
            matrix2.set(matrix);
            float f8 = i8;
            matrix2.preConcat(qVar.f(f8 + floatValue2));
            this.j.g(canvas, matrix2, (int) (Z0.g.f(floatValue3, floatValue4, f8 / floatValue) * i4), aVar);
        }
    }

    @Override // P0.d
    public final String getName() {
        return this.f4427e;
    }

    @Override // S0.f
    public final void h(S0.e eVar, int i4, ArrayList arrayList, S0.e eVar2) {
        Z0.g.g(eVar, i4, arrayList, eVar2, this);
        for (int i8 = 0; i8 < this.j.f4344i.size(); i8++) {
            d dVar = (d) this.j.f4344i.get(i8);
            if (dVar instanceof l) {
                Z0.g.g(eVar, i4, arrayList, eVar2, (l) dVar);
            }
        }
    }
}
