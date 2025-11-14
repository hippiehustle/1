package P0;

import N0.C0202j;
import N0.x;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class e implements f, n, Q0.a, S0.f {

    /* renamed from: a, reason: collision with root package name */
    public final M.i f4336a;

    /* renamed from: b, reason: collision with root package name */
    public final RectF f4337b;

    /* renamed from: c, reason: collision with root package name */
    public final Z0.i f4338c;

    /* renamed from: d, reason: collision with root package name */
    public final Matrix f4339d;

    /* renamed from: e, reason: collision with root package name */
    public final Path f4340e;

    /* renamed from: f, reason: collision with root package name */
    public final RectF f4341f;

    /* renamed from: g, reason: collision with root package name */
    public final String f4342g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f4343h;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f4344i;
    public final x j;
    public ArrayList k;

    /* renamed from: l, reason: collision with root package name */
    public final Q0.q f4345l;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public e(x xVar, V0.b bVar, U0.m mVar, C0202j c0202j) {
        this(xVar, bVar, r3, r4, r5, r11);
        T0.d dVar;
        String str = mVar.f5995a;
        boolean z8 = mVar.f5997c;
        List list = mVar.f5996b;
        ArrayList arrayList = new ArrayList(list.size());
        int i4 = 0;
        for (int i8 = 0; i8 < list.size(); i8++) {
            d a3 = ((U0.b) list.get(i8)).a(xVar, c0202j, bVar);
            if (a3 != null) {
                arrayList.add(a3);
            }
        }
        while (true) {
            if (i4 >= list.size()) {
                dVar = null;
                break;
            }
            U0.b bVar2 = (U0.b) list.get(i4);
            if (bVar2 instanceof T0.d) {
                dVar = (T0.d) bVar2;
                break;
            }
            i4++;
        }
    }

    @Override // P0.f
    public final void a(RectF rectF, Matrix matrix, boolean z8) {
        Matrix matrix2 = this.f4339d;
        matrix2.set(matrix);
        Q0.q qVar = this.f4345l;
        if (qVar != null) {
            matrix2.preConcat(qVar.e());
        }
        RectF rectF2 = this.f4341f;
        rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
        ArrayList arrayList = this.f4344i;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            d dVar = (d) arrayList.get(size);
            if (dVar instanceof f) {
                ((f) dVar).a(rectF2, matrix2, z8);
                rectF.union(rectF2);
            }
        }
    }

    @Override // Q0.a
    public final void b() {
        this.j.invalidateSelf();
    }

    @Override // P0.d
    public final void c(List list, List list2) {
        int size = list.size();
        ArrayList arrayList = this.f4344i;
        ArrayList arrayList2 = new ArrayList(arrayList.size() + size);
        arrayList2.addAll(list);
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            d dVar = (d) arrayList.get(size2);
            dVar.c(arrayList2, arrayList.subList(0, size2));
            arrayList2.add(dVar);
        }
    }

    public final List d() {
        if (this.k == null) {
            this.k = new ArrayList();
            int i4 = 0;
            while (true) {
                ArrayList arrayList = this.f4344i;
                if (i4 >= arrayList.size()) {
                    break;
                }
                d dVar = (d) arrayList.get(i4);
                if (dVar instanceof n) {
                    this.k.add((n) dVar);
                }
                i4++;
            }
        }
        return this.k;
    }

    @Override // S0.f
    public final void e(R3.r rVar, Object obj) {
        Q0.q qVar = this.f4345l;
        if (qVar != null) {
            qVar.c(rVar, obj);
        }
    }

    @Override // P0.n
    public final Path f() {
        Matrix matrix = this.f4339d;
        matrix.reset();
        Q0.q qVar = this.f4345l;
        if (qVar != null) {
            matrix.set(qVar.e());
        }
        Path path = this.f4340e;
        path.reset();
        if (!this.f4343h) {
            ArrayList arrayList = this.f4344i;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                d dVar = (d) arrayList.get(size);
                if (dVar instanceof n) {
                    path.addPath(((n) dVar).f(), matrix);
                }
            }
        }
        return path;
    }

    @Override // P0.f
    public final void g(Canvas canvas, Matrix matrix, int i4, Z0.a aVar) {
        boolean z8;
        int intValue;
        if (!this.f4343h) {
            Matrix matrix2 = this.f4339d;
            matrix2.set(matrix);
            Q0.q qVar = this.f4345l;
            if (qVar != null) {
                matrix2.preConcat(qVar.e());
                Q0.e eVar = qVar.j;
                if (eVar == null) {
                    intValue = 100;
                } else {
                    intValue = ((Integer) eVar.e()).intValue();
                }
                i4 = (int) ((((intValue / 100.0f) * i4) / 255.0f) * 255.0f);
            }
            x xVar = this.j;
            int i8 = 255;
            if ((xVar.f3690v && i() && i4 != 255) || (aVar != null && xVar.f3691w && i())) {
                z8 = true;
            } else {
                z8 = false;
            }
            if (!z8) {
                i8 = i4;
            }
            Z0.i iVar = this.f4338c;
            if (z8) {
                RectF rectF = this.f4337b;
                rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
                a(rectF, matrix, true);
                M.i iVar2 = this.f4336a;
                iVar2.f3287d = i4;
                if (aVar != null) {
                    if (Color.alpha(aVar.f7252d) > 0) {
                        iVar2.f3288e = aVar;
                    } else {
                        iVar2.f3288e = null;
                    }
                    aVar = null;
                } else {
                    iVar2.f3288e = null;
                }
                canvas = iVar.e(canvas, rectF, iVar2);
            } else if (aVar != null) {
                Z0.a aVar2 = new Z0.a(aVar);
                aVar2.b(i8);
                aVar = aVar2;
            }
            ArrayList arrayList = this.f4344i;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                Object obj = arrayList.get(size);
                if (obj instanceof f) {
                    ((f) obj).g(canvas, matrix2, i8, aVar);
                }
            }
            if (z8) {
                iVar.c();
            }
        }
    }

    @Override // P0.d
    public final String getName() {
        throw null;
    }

    @Override // S0.f
    public final void h(S0.e eVar, int i4, ArrayList arrayList, S0.e eVar2) {
        String str = this.f4342g;
        if (eVar.c(str, i4) || "__container".equals(str)) {
            if (!"__container".equals(str)) {
                S0.e eVar3 = new S0.e(eVar2);
                eVar3.f5199a.add(str);
                if (eVar.a(str, i4)) {
                    S0.e eVar4 = new S0.e(eVar3);
                    eVar4.f5200b = this;
                    arrayList.add(eVar4);
                }
                eVar2 = eVar3;
            }
            if (eVar.d(str, i4)) {
                int b4 = eVar.b(str, i4) + i4;
                int i8 = 0;
                while (true) {
                    ArrayList arrayList2 = this.f4344i;
                    if (i8 < arrayList2.size()) {
                        d dVar = (d) arrayList2.get(i8);
                        if (dVar instanceof S0.f) {
                            ((S0.f) dVar).h(eVar, b4, arrayList, eVar2);
                        }
                        i8++;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public final boolean i() {
        int i4 = 0;
        int i8 = 0;
        while (true) {
            ArrayList arrayList = this.f4344i;
            if (i4 >= arrayList.size()) {
                return false;
            }
            if ((arrayList.get(i4) instanceof f) && (i8 = i8 + 1) >= 2) {
                return true;
            }
            i4++;
        }
    }

    public e(x xVar, V0.b bVar, String str, boolean z8, ArrayList arrayList, T0.d dVar) {
        this.f4336a = new M.i(2, false);
        this.f4337b = new RectF();
        this.f4338c = new Z0.i();
        this.f4339d = new Matrix();
        this.f4340e = new Path();
        this.f4341f = new RectF();
        this.f4342g = str;
        this.j = xVar;
        this.f4343h = z8;
        this.f4344i = arrayList;
        if (dVar != null) {
            Q0.q qVar = new Q0.q(dVar);
            this.f4345l = qVar;
            qVar.a(bVar);
            qVar.b(this);
        }
        ArrayList arrayList2 = new ArrayList();
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            d dVar2 = (d) arrayList.get(size);
            if (dVar2 instanceof k) {
                arrayList2.add((k) dVar2);
            }
        }
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            ((k) arrayList2.get(size2)).d(arrayList.listIterator(arrayList.size()));
        }
    }
}
