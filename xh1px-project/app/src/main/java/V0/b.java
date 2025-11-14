package V0;

import N0.F;
import N0.x;
import Q0.q;
import R3.r;
import Z0.k;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.os.Build;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import t.C1523a;
import x.AbstractC1769h;

/* loaded from: classes.dex */
public abstract class b implements P0.f, Q0.a, S0.f {

    /* renamed from: A, reason: collision with root package name */
    public float f6211A;

    /* renamed from: B, reason: collision with root package name */
    public BlurMaskFilter f6212B;

    /* renamed from: C, reason: collision with root package name */
    public O0.a f6213C;

    /* renamed from: a, reason: collision with root package name */
    public final Path f6214a = new Path();

    /* renamed from: b, reason: collision with root package name */
    public final Matrix f6215b = new Matrix();

    /* renamed from: c, reason: collision with root package name */
    public final Matrix f6216c = new Matrix();

    /* renamed from: d, reason: collision with root package name */
    public final O0.a f6217d = new O0.a(1, 0);

    /* renamed from: e, reason: collision with root package name */
    public final O0.a f6218e;

    /* renamed from: f, reason: collision with root package name */
    public final O0.a f6219f;

    /* renamed from: g, reason: collision with root package name */
    public final O0.a f6220g;

    /* renamed from: h, reason: collision with root package name */
    public final O0.a f6221h;

    /* renamed from: i, reason: collision with root package name */
    public final RectF f6222i;
    public final RectF j;
    public final RectF k;

    /* renamed from: l, reason: collision with root package name */
    public final RectF f6223l;

    /* renamed from: m, reason: collision with root package name */
    public final RectF f6224m;

    /* renamed from: n, reason: collision with root package name */
    public final Matrix f6225n;

    /* renamed from: o, reason: collision with root package name */
    public final x f6226o;

    /* renamed from: p, reason: collision with root package name */
    public final e f6227p;

    /* renamed from: q, reason: collision with root package name */
    public final A4.c f6228q;

    /* renamed from: r, reason: collision with root package name */
    public final Q0.i f6229r;

    /* renamed from: s, reason: collision with root package name */
    public b f6230s;

    /* renamed from: t, reason: collision with root package name */
    public b f6231t;

    /* renamed from: u, reason: collision with root package name */
    public List f6232u;

    /* renamed from: v, reason: collision with root package name */
    public final ArrayList f6233v;

    /* renamed from: w, reason: collision with root package name */
    public final q f6234w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f6235x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f6236y;

    /* renamed from: z, reason: collision with root package name */
    public O0.a f6237z;

    /* JADX WARN: Type inference failed for: r9v4, types: [Q0.e, Q0.i] */
    public b(x xVar, e eVar) {
        PorterDuff.Mode mode = PorterDuff.Mode.DST_IN;
        this.f6218e = new O0.a(mode);
        PorterDuff.Mode mode2 = PorterDuff.Mode.DST_OUT;
        this.f6219f = new O0.a(mode2);
        O0.a aVar = new O0.a(1, 0);
        this.f6220g = aVar;
        PorterDuff.Mode mode3 = PorterDuff.Mode.CLEAR;
        O0.a aVar2 = new O0.a();
        aVar2.setXfermode(new PorterDuffXfermode(mode3));
        this.f6221h = aVar2;
        this.f6222i = new RectF();
        this.j = new RectF();
        this.k = new RectF();
        this.f6223l = new RectF();
        this.f6224m = new RectF();
        this.f6225n = new Matrix();
        this.f6233v = new ArrayList();
        this.f6235x = true;
        this.f6211A = 0.0f;
        this.f6226o = xVar;
        this.f6227p = eVar;
        List list = eVar.f6263h;
        if (eVar.f6274u == 3) {
            aVar.setXfermode(new PorterDuffXfermode(mode2));
        } else {
            aVar.setXfermode(new PorterDuffXfermode(mode));
        }
        T0.d dVar = eVar.f6264i;
        dVar.getClass();
        q qVar = new q(dVar);
        this.f6234w = qVar;
        qVar.b(this);
        if (list != null && !list.isEmpty()) {
            A4.c cVar = new A4.c(list);
            this.f6228q = cVar;
            Iterator it = ((ArrayList) cVar.f291e).iterator();
            while (it.hasNext()) {
                ((Q0.e) it.next()).a(this);
            }
            Iterator it2 = ((ArrayList) this.f6228q.f292f).iterator();
            while (it2.hasNext()) {
                Q0.e eVar2 = (Q0.e) it2.next();
                d(eVar2);
                eVar2.a(this);
            }
        }
        e eVar3 = this.f6227p;
        if (!eVar3.f6273t.isEmpty()) {
            ?? eVar4 = new Q0.e(eVar3.f6273t);
            this.f6229r = eVar4;
            eVar4.f4719b = true;
            eVar4.a(new Q0.a() { // from class: V0.a
                @Override // Q0.a
                public final void b() {
                    boolean z8;
                    b bVar = b.this;
                    if (bVar.f6229r.l() == 1.0f) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    if (z8 != bVar.f6235x) {
                        bVar.f6235x = z8;
                        bVar.f6226o.invalidateSelf();
                    }
                }
            });
            boolean z8 = ((Float) this.f6229r.e()).floatValue() == 1.0f;
            if (z8 != this.f6235x) {
                this.f6235x = z8;
                this.f6226o.invalidateSelf();
            }
            d(this.f6229r);
            return;
        }
        if (true != this.f6235x) {
            this.f6235x = true;
            this.f6226o.invalidateSelf();
        }
    }

    @Override // P0.f
    public void a(RectF rectF, Matrix matrix, boolean z8) {
        this.f6222i.set(0.0f, 0.0f, 0.0f, 0.0f);
        i();
        Matrix matrix2 = this.f6225n;
        matrix2.set(matrix);
        if (z8) {
            List list = this.f6232u;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    matrix2.preConcat(((b) this.f6232u.get(size)).f6234w.e());
                }
            } else {
                b bVar = this.f6231t;
                if (bVar != null) {
                    matrix2.preConcat(bVar.f6234w.e());
                }
            }
        }
        matrix2.preConcat(this.f6234w.e());
    }

    @Override // Q0.a
    public final void b() {
        this.f6226o.invalidateSelf();
    }

    public final void d(Q0.e eVar) {
        if (eVar == null) {
            return;
        }
        this.f6233v.add(eVar);
    }

    @Override // S0.f
    public void e(r rVar, Object obj) {
        this.f6234w.c(rVar, obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x0397  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x03af  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0202  */
    @Override // P0.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(Canvas canvas, Matrix matrix, int i4, Z0.a aVar) {
        int i8;
        A4.c cVar;
        Path path;
        float f8;
        int i9;
        A4.c cVar2;
        Path path2;
        RectF rectF;
        Matrix matrix2;
        O0.a aVar2;
        int b4;
        int i10;
        A4.c cVar3;
        Path path3;
        Path path4;
        Path path5;
        Integer num;
        if (this.f6235x) {
            e eVar = this.f6227p;
            boolean z8 = eVar.f6275v;
            int i11 = eVar.f6278y;
            if (!z8) {
                i();
                Matrix matrix3 = this.f6215b;
                matrix3.reset();
                matrix3.set(matrix);
                for (int size = this.f6232u.size() - 1; size >= 0; size--) {
                    matrix3.preConcat(((b) this.f6232u.get(size)).f6234w.e());
                }
                q qVar = this.f6234w;
                Q0.e eVar2 = qVar.j;
                if (eVar2 != null && (num = (Integer) eVar2.e()) != null) {
                    i8 = num.intValue();
                } else {
                    i8 = 100;
                }
                int i12 = (int) ((((i4 / 255.0f) * i8) / 100.0f) * 255.0f);
                if (this.f6230s == null && !m() && i11 == 1) {
                    matrix3.preConcat(qVar.e());
                    k(canvas, matrix3, i12, aVar);
                    n();
                    return;
                }
                RectF rectF2 = this.f6222i;
                a(rectF2, matrix3, false);
                if (this.f6230s != null && eVar.f6274u != 3) {
                    RectF rectF3 = this.f6223l;
                    rectF3.set(0.0f, 0.0f, 0.0f, 0.0f);
                    this.f6230s.a(rectF3, matrix, true);
                    if (!rectF2.intersect(rectF3)) {
                        rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
                    }
                }
                matrix3.preConcat(qVar.e());
                RectF rectF4 = this.k;
                rectF4.set(0.0f, 0.0f, 0.0f, 0.0f);
                boolean m6 = m();
                A4.c cVar4 = this.f6228q;
                Path path6 = this.f6214a;
                if (m6) {
                    int size2 = ((List) cVar4.f293g).size();
                    int i13 = 0;
                    while (i13 < size2) {
                        U0.f fVar = (U0.f) ((List) cVar4.f293g).get(i13);
                        Path path7 = (Path) ((Q0.e) ((ArrayList) cVar4.f291e).get(i13)).e();
                        if (path7 == null) {
                            i9 = size2;
                        } else {
                            path6.set(path7);
                            path6.transform(matrix3);
                            int b9 = AbstractC1769h.b(fVar.f5964a);
                            i9 = size2;
                            if (b9 != 0) {
                                if (b9 != 1) {
                                    if (b9 != 2) {
                                        if (b9 == 3) {
                                        }
                                        RectF rectF5 = this.f6224m;
                                        path6.computeBounds(rectF5, false);
                                        if (i13 != 0) {
                                            rectF4.set(rectF5);
                                        } else {
                                            cVar2 = cVar4;
                                            path2 = path6;
                                            rectF4.set(Math.min(rectF4.left, rectF5.left), Math.min(rectF4.top, rectF5.top), Math.max(rectF4.right, rectF5.right), Math.max(rectF4.bottom, rectF5.bottom));
                                            i13++;
                                            size2 = i9;
                                            cVar4 = cVar2;
                                            path6 = path2;
                                        }
                                    }
                                }
                            }
                            if (fVar.f5967d) {
                            }
                            RectF rectF52 = this.f6224m;
                            path6.computeBounds(rectF52, false);
                            if (i13 != 0) {
                            }
                        }
                        cVar2 = cVar4;
                        path2 = path6;
                        i13++;
                        size2 = i9;
                        cVar4 = cVar2;
                        path6 = path2;
                    }
                    cVar = cVar4;
                    path = path6;
                    if (!rectF2.intersect(rectF4)) {
                        f8 = 0.0f;
                        rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
                        float width = canvas.getWidth();
                        float height = canvas.getHeight();
                        rectF = this.j;
                        rectF.set(f8, f8, width, height);
                        matrix2 = this.f6216c;
                        canvas.getMatrix(matrix2);
                        if (!matrix2.isIdentity()) {
                            matrix2.invert(matrix2);
                            matrix2.mapRect(rectF);
                        }
                        if (!rectF2.intersect(rectF)) {
                            rectF2.set(f8, f8, f8, f8);
                        }
                        if (rectF2.width() >= 1.0f && rectF2.height() >= 1.0f) {
                            O0.a aVar3 = this.f6217d;
                            aVar3.setAlpha(255);
                            b4 = AbstractC1769h.b(i11);
                            if (b4 == 1) {
                                if (b4 != 2) {
                                    i10 = 16;
                                    if (b4 != 3) {
                                        if (b4 != 4) {
                                            if (b4 != 5) {
                                                if (b4 != 16) {
                                                    i10 = 0;
                                                } else {
                                                    i10 = 13;
                                                }
                                            } else {
                                                i10 = 18;
                                            }
                                        } else {
                                            i10 = 17;
                                        }
                                    }
                                } else {
                                    i10 = 15;
                                }
                            } else {
                                i10 = 14;
                            }
                            H.d.a(i10, aVar3);
                            Matrix matrix4 = k.f7301a;
                            canvas.saveLayer(rectF2, aVar3);
                            if (i11 == 2) {
                                j(canvas);
                                cVar3 = cVar;
                                path3 = path;
                            } else {
                                if (this.f6213C == null) {
                                    O0.a aVar4 = new O0.a();
                                    this.f6213C = aVar4;
                                    aVar4.setColor(-1);
                                }
                                cVar3 = cVar;
                                path3 = path;
                                canvas.drawRect(rectF2.left - 1.0f, rectF2.top - 1.0f, rectF2.right + 1.0f, rectF2.bottom + 1.0f, this.f6213C);
                            }
                            k(canvas, matrix3, i12, aVar);
                            if (m()) {
                                Paint paint = this.f6218e;
                                canvas.saveLayer(rectF2, paint);
                                if (Build.VERSION.SDK_INT < 28) {
                                    j(canvas);
                                }
                                int i14 = 0;
                                while (true) {
                                    List list = (List) cVar3.f293g;
                                    ArrayList arrayList = (ArrayList) cVar3.f291e;
                                    if (i14 >= list.size()) {
                                        break;
                                    }
                                    U0.f fVar2 = (U0.f) list.get(i14);
                                    Q0.e eVar3 = (Q0.e) arrayList.get(i14);
                                    Q0.e eVar4 = (Q0.e) ((ArrayList) cVar3.f292f).get(i14);
                                    int i15 = fVar2.f5964a;
                                    boolean z9 = fVar2.f5967d;
                                    int b10 = AbstractC1769h.b(i15);
                                    int i16 = i14;
                                    Paint paint2 = this.f6219f;
                                    if (b10 != 0) {
                                        if (b10 != 1) {
                                            if (b10 != 2) {
                                                if (b10 != 3) {
                                                    path4 = path3;
                                                } else {
                                                    if (!arrayList.isEmpty()) {
                                                        int i17 = 0;
                                                        while (true) {
                                                            if (i17 < list.size()) {
                                                                if (((U0.f) list.get(i17)).f5964a != 4) {
                                                                    break;
                                                                } else {
                                                                    i17++;
                                                                }
                                                            } else {
                                                                aVar3.setAlpha(255);
                                                                canvas.drawRect(rectF2, aVar3);
                                                                break;
                                                            }
                                                        }
                                                    }
                                                    path4 = path3;
                                                }
                                            } else {
                                                if (z9) {
                                                    Matrix matrix5 = k.f7301a;
                                                    canvas.saveLayer(rectF2, paint);
                                                    canvas.drawRect(rectF2, aVar3);
                                                    paint2.setAlpha((int) (((Integer) eVar4.e()).intValue() * 2.55f));
                                                    path5 = path3;
                                                    path5.set((Path) eVar3.e());
                                                    path5.transform(matrix3);
                                                    canvas.drawPath(path5, paint2);
                                                    canvas.restore();
                                                } else {
                                                    path5 = path3;
                                                    Matrix matrix6 = k.f7301a;
                                                    canvas.saveLayer(rectF2, paint);
                                                    path5.set((Path) eVar3.e());
                                                    path5.transform(matrix3);
                                                    aVar3.setAlpha((int) (((Integer) eVar4.e()).intValue() * 2.55f));
                                                    canvas.drawPath(path5, aVar3);
                                                    canvas.restore();
                                                }
                                                path4 = path5;
                                            }
                                        } else {
                                            path4 = path3;
                                            if (i16 == 0) {
                                                aVar3.setColor(-16777216);
                                                aVar3.setAlpha(255);
                                                canvas.drawRect(rectF2, aVar3);
                                            }
                                            if (z9) {
                                                Matrix matrix7 = k.f7301a;
                                                canvas.saveLayer(rectF2, paint2);
                                                canvas.drawRect(rectF2, aVar3);
                                                paint2.setAlpha((int) (((Integer) eVar4.e()).intValue() * 2.55f));
                                                path4.set((Path) eVar3.e());
                                                path4.transform(matrix3);
                                                canvas.drawPath(path4, paint2);
                                                canvas.restore();
                                            } else {
                                                path4.set((Path) eVar3.e());
                                                path4.transform(matrix3);
                                                canvas.drawPath(path4, paint2);
                                            }
                                        }
                                    } else {
                                        path4 = path3;
                                        if (z9) {
                                            Matrix matrix8 = k.f7301a;
                                            canvas.saveLayer(rectF2, aVar3);
                                            canvas.drawRect(rectF2, aVar3);
                                            path4.set((Path) eVar3.e());
                                            path4.transform(matrix3);
                                            aVar3.setAlpha((int) (((Integer) eVar4.e()).intValue() * 2.55f));
                                            canvas.drawPath(path4, paint2);
                                            canvas.restore();
                                        } else {
                                            path4.set((Path) eVar3.e());
                                            path4.transform(matrix3);
                                            aVar3.setAlpha((int) (((Integer) eVar4.e()).intValue() * 2.55f));
                                            canvas.drawPath(path4, aVar3);
                                        }
                                    }
                                    i14 = i16 + 1;
                                    path3 = path4;
                                }
                                canvas.restore();
                            }
                            if (this.f6230s != null) {
                                canvas.saveLayer(rectF2, this.f6220g);
                                j(canvas);
                                this.f6230s.g(canvas, matrix, i4, null);
                                canvas.restore();
                            }
                            canvas.restore();
                        }
                        if (this.f6236y && (aVar2 = this.f6237z) != null) {
                            aVar2.setStyle(Paint.Style.STROKE);
                            this.f6237z.setColor(-251901);
                            this.f6237z.setStrokeWidth(4.0f);
                            canvas.drawRect(rectF2, this.f6237z);
                            this.f6237z.setStyle(Paint.Style.FILL);
                            this.f6237z.setColor(1357638635);
                            canvas.drawRect(rectF2, this.f6237z);
                        }
                        n();
                    }
                    f8 = 0.0f;
                    float width2 = canvas.getWidth();
                    float height2 = canvas.getHeight();
                    rectF = this.j;
                    rectF.set(f8, f8, width2, height2);
                    matrix2 = this.f6216c;
                    canvas.getMatrix(matrix2);
                    if (!matrix2.isIdentity()) {
                    }
                    if (!rectF2.intersect(rectF)) {
                    }
                    if (rectF2.width() >= 1.0f) {
                        O0.a aVar32 = this.f6217d;
                        aVar32.setAlpha(255);
                        b4 = AbstractC1769h.b(i11);
                        if (b4 == 1) {
                        }
                        H.d.a(i10, aVar32);
                        Matrix matrix42 = k.f7301a;
                        canvas.saveLayer(rectF2, aVar32);
                        if (i11 == 2) {
                        }
                        k(canvas, matrix3, i12, aVar);
                        if (m()) {
                        }
                        if (this.f6230s != null) {
                        }
                        canvas.restore();
                    }
                    if (this.f6236y) {
                        aVar2.setStyle(Paint.Style.STROKE);
                        this.f6237z.setColor(-251901);
                        this.f6237z.setStrokeWidth(4.0f);
                        canvas.drawRect(rectF2, this.f6237z);
                        this.f6237z.setStyle(Paint.Style.FILL);
                        this.f6237z.setColor(1357638635);
                        canvas.drawRect(rectF2, this.f6237z);
                    }
                    n();
                }
                cVar = cVar4;
                path = path6;
                f8 = 0.0f;
                float width22 = canvas.getWidth();
                float height22 = canvas.getHeight();
                rectF = this.j;
                rectF.set(f8, f8, width22, height22);
                matrix2 = this.f6216c;
                canvas.getMatrix(matrix2);
                if (!matrix2.isIdentity()) {
                }
                if (!rectF2.intersect(rectF)) {
                }
                if (rectF2.width() >= 1.0f) {
                }
                if (this.f6236y) {
                }
                n();
            }
        }
    }

    @Override // S0.f
    public final void h(S0.e eVar, int i4, ArrayList arrayList, S0.e eVar2) {
        b bVar = this.f6230s;
        e eVar3 = this.f6227p;
        if (bVar != null) {
            String str = bVar.f6227p.f6258c;
            S0.e eVar4 = new S0.e(eVar2);
            eVar4.f5199a.add(str);
            if (eVar.a(this.f6230s.f6227p.f6258c, i4)) {
                b bVar2 = this.f6230s;
                S0.e eVar5 = new S0.e(eVar4);
                eVar5.f5200b = bVar2;
                arrayList.add(eVar5);
            }
            if (eVar.c(this.f6230s.f6227p.f6258c, i4) && eVar.d(eVar3.f6258c, i4)) {
                this.f6230s.p(eVar, eVar.b(this.f6230s.f6227p.f6258c, i4) + i4, arrayList, eVar4);
            }
        }
        String str2 = eVar3.f6258c;
        String str3 = eVar3.f6258c;
        if (eVar.c(str2, i4)) {
            if (!"__container".equals(str3)) {
                S0.e eVar6 = new S0.e(eVar2);
                eVar6.f5199a.add(str3);
                if (eVar.a(str3, i4)) {
                    S0.e eVar7 = new S0.e(eVar6);
                    eVar7.f5200b = this;
                    arrayList.add(eVar7);
                }
                eVar2 = eVar6;
            }
            if (eVar.d(str3, i4)) {
                p(eVar, eVar.b(str3, i4) + i4, arrayList, eVar2);
            }
        }
    }

    public final void i() {
        if (this.f6232u == null) {
            if (this.f6231t == null) {
                this.f6232u = Collections.EMPTY_LIST;
                return;
            }
            this.f6232u = new ArrayList();
            for (b bVar = this.f6231t; bVar != null; bVar = bVar.f6231t) {
                this.f6232u.add(bVar);
            }
        }
    }

    public final void j(Canvas canvas) {
        RectF rectF = this.f6222i;
        canvas.drawRect(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f, this.f6221h);
    }

    public abstract void k(Canvas canvas, Matrix matrix, int i4, Z0.a aVar);

    public W0.d l() {
        return this.f6227p.f6276w;
    }

    public final boolean m() {
        A4.c cVar = this.f6228q;
        if (cVar != null && !((ArrayList) cVar.f291e).isEmpty()) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void n() {
        F f8 = this.f6226o.f3674d.f3601a;
        String str = this.f6227p.f6258c;
        HashMap hashMap = f8.f3574c;
        if (f8.f3572a) {
            Z0.f fVar = (Z0.f) hashMap.get(str);
            Z0.f fVar2 = fVar;
            if (fVar == null) {
                Object obj = new Object();
                hashMap.put(str, obj);
                fVar2 = obj;
            }
            int i4 = fVar2.f7272a + 1;
            fVar2.f7272a = i4;
            if (i4 == Integer.MAX_VALUE) {
                fVar2.f7272a = i4 / 2;
            }
            if (str.equals("__container")) {
                t.f fVar3 = f8.f3573b;
                fVar3.getClass();
                C1523a c1523a = new C1523a(fVar3);
                if (c1523a.hasNext()) {
                    c1523a.next().getClass();
                    throw new ClassCastException();
                }
            }
        }
    }

    public final void o(Q0.e eVar) {
        this.f6233v.remove(eVar);
    }

    public void q(boolean z8) {
        if (z8 && this.f6237z == null) {
            this.f6237z = new O0.a();
        }
        this.f6236y = z8;
    }

    public void r(float f8) {
        q qVar = this.f6234w;
        Q0.e eVar = qVar.j;
        if (eVar != null) {
            eVar.i(f8);
        }
        Q0.e eVar2 = qVar.f4762m;
        if (eVar2 != null) {
            eVar2.i(f8);
        }
        Q0.e eVar3 = qVar.f4763n;
        if (eVar3 != null) {
            eVar3.i(f8);
        }
        Q0.e eVar4 = qVar.f4757f;
        if (eVar4 != null) {
            eVar4.i(f8);
        }
        Q0.e eVar5 = qVar.f4758g;
        if (eVar5 != null) {
            eVar5.i(f8);
        }
        Q0.e eVar6 = qVar.f4759h;
        if (eVar6 != null) {
            eVar6.i(f8);
        }
        Q0.e eVar7 = qVar.f4760i;
        if (eVar7 != null) {
            eVar7.i(f8);
        }
        Q0.i iVar = qVar.k;
        if (iVar != null) {
            iVar.i(f8);
        }
        Q0.i iVar2 = qVar.f4761l;
        if (iVar2 != null) {
            iVar2.i(f8);
        }
        int i4 = 0;
        A4.c cVar = this.f6228q;
        if (cVar != null) {
            ArrayList arrayList = (ArrayList) cVar.f291e;
            for (int i8 = 0; i8 < arrayList.size(); i8++) {
                ((Q0.e) arrayList.get(i8)).i(f8);
            }
        }
        Q0.i iVar3 = this.f6229r;
        if (iVar3 != null) {
            iVar3.i(f8);
        }
        b bVar = this.f6230s;
        if (bVar != null) {
            bVar.r(f8);
        }
        while (true) {
            ArrayList arrayList2 = this.f6233v;
            if (i4 < arrayList2.size()) {
                ((Q0.e) arrayList2.get(i4)).i(f8);
                i4++;
            } else {
                return;
            }
        }
    }

    @Override // P0.d
    public final void c(List list, List list2) {
    }

    public void p(S0.e eVar, int i4, ArrayList arrayList, S0.e eVar2) {
    }
}
