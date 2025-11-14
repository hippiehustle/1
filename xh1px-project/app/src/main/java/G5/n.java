package G5;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.Bundle;
import androidx.lifecycle.C0512x;
import androidx.lifecycle.EnumC0504o;
import androidx.lifecycle.U;
import androidx.lifecycle.X;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import n0.AbstractC1143u;
import n0.C1131i;
import n0.C1135m;
import o3.C1235f;
import s3.AbstractC1492c;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1805a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1806b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f1807c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f1808d;

    /* renamed from: e, reason: collision with root package name */
    public final Cloneable f1809e;

    /* renamed from: f, reason: collision with root package name */
    public Object f1810f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f1811g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f1812h;

    /* renamed from: i, reason: collision with root package name */
    public final Object f1813i;
    public final Object j;
    public final Object k;

    /* renamed from: l, reason: collision with root package name */
    public Serializable f1814l;

    /* renamed from: m, reason: collision with root package name */
    public final Object f1815m;

    public n(C1131i c1131i) {
        this.f1805a = 1;
        this.f1807c = c1131i;
        this.f1808d = c1131i.f12759e;
        this.f1809e = c1131i.f12760f;
        this.f1810f = c1131i.f12761g;
        this.f1811g = c1131i.f12762h;
        this.f1812h = c1131i.f12763i;
        this.f1813i = c1131i.j;
        this.j = new A.i(new C0.b(c1131i, new B0.e(0, c1131i)));
        Z5.n nVar = new Z5.n(new C1235f(1));
        this.k = new C0512x(c1131i);
        this.f1814l = EnumC0504o.f8847e;
        this.f1815m = (X) nVar.getValue();
        new Z5.n(new C1235f(2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v5 */
    public void a(l lVar, float f8, RectF rectF, W0.d dVar, Path path) {
        boolean z8;
        int i4;
        float abs;
        e eVar;
        Path path2;
        W0.d dVar2;
        boolean z9;
        c cVar;
        AbstractC1492c abstractC1492c;
        int i8;
        W0.d dVar3 = dVar;
        Path path3 = path;
        Matrix[] matrixArr = (Matrix[]) this.f1809e;
        float[] fArr = (float[]) this.f1814l;
        v[] vVarArr = (v[]) this.f1807c;
        Matrix[] matrixArr2 = (Matrix[]) this.f1808d;
        path3.rewind();
        Path path4 = (Path) this.f1811g;
        path4.rewind();
        Path path5 = (Path) this.f1812h;
        path5.rewind();
        path5.addRect(rectF, Path.Direction.CW);
        int i9 = 0;
        while (true) {
            z8 = 0;
            if (i9 >= 4) {
                break;
            }
            PointF pointF = (PointF) this.f1810f;
            if (i9 != 1) {
                if (i9 != 2) {
                    if (i9 != 3) {
                        cVar = lVar.f1799f;
                    } else {
                        cVar = lVar.f1798e;
                    }
                } else {
                    cVar = lVar.f1801h;
                }
            } else {
                cVar = lVar.f1800g;
            }
            if (i9 != 1) {
                if (i9 != 2) {
                    if (i9 != 3) {
                        abstractC1492c = lVar.f1795b;
                    } else {
                        abstractC1492c = lVar.f1794a;
                    }
                } else {
                    abstractC1492c = lVar.f1797d;
                }
            } else {
                abstractC1492c = lVar.f1796c;
            }
            Matrix[] matrixArr3 = matrixArr;
            v vVar = vVarArr[i9];
            abstractC1492c.getClass();
            abstractC1492c.q(vVar, f8, cVar.a(rectF));
            int i10 = i9 + 1;
            float f9 = (i10 % 4) * 90;
            matrixArr2[i9].reset();
            if (i9 != 1) {
                if (i9 != 2) {
                    if (i9 != 3) {
                        i8 = i10;
                        pointF.set(rectF.right, rectF.top);
                    } else {
                        i8 = i10;
                        pointF.set(rectF.left, rectF.top);
                    }
                } else {
                    i8 = i10;
                    pointF.set(rectF.left, rectF.bottom);
                }
            } else {
                i8 = i10;
                pointF.set(rectF.right, rectF.bottom);
            }
            matrixArr2[i9].setTranslate(pointF.x, pointF.y);
            matrixArr2[i9].preRotate(f9);
            v vVar2 = vVarArr[i9];
            fArr[0] = vVar2.f1836c;
            fArr[1] = vVar2.f1837d;
            matrixArr2[i9].mapPoints(fArr);
            matrixArr3[i9].reset();
            matrixArr3[i9].setTranslate(fArr[0], fArr[1]);
            matrixArr3[i9].preRotate(f9);
            i9 = i8;
            matrixArr = matrixArr3;
        }
        Matrix[] matrixArr4 = matrixArr;
        char c6 = 1;
        int i11 = 0;
        for (i4 = 4; i11 < i4; i4 = 4) {
            v vVar3 = vVarArr[i11];
            fArr[z8] = vVar3.f1834a;
            fArr[c6] = vVar3.f1835b;
            matrixArr2[i11].mapPoints(fArr);
            if (i11 == 0) {
                path3.moveTo(fArr[z8], fArr[c6]);
            } else {
                path3.lineTo(fArr[z8], fArr[c6]);
            }
            vVarArr[i11].b(matrixArr2[i11], path3);
            if (dVar3 != null) {
                v vVar4 = vVarArr[i11];
                Matrix matrix = matrixArr2[i11];
                h hVar = (h) dVar3.f6489e;
                BitSet bitSet = hVar.f1772g;
                vVar4.getClass();
                bitSet.set(i11, z8);
                u[] uVarArr = hVar.f1770e;
                vVar4.a(vVar4.f1839f);
                uVarArr[i11] = new o(new ArrayList(vVar4.f1841h), new Matrix(matrix));
            }
            Path path6 = (Path) this.f1813i;
            v vVar5 = (v) this.k;
            int i12 = i11 + 1;
            int i13 = i12 % 4;
            v vVar6 = vVarArr[i11];
            v[] vVarArr2 = vVarArr;
            fArr[0] = vVar6.f1836c;
            fArr[1] = vVar6.f1837d;
            matrixArr2[i11].mapPoints(fArr);
            float[] fArr2 = (float[]) this.f1815m;
            v vVar7 = vVarArr2[i13];
            Matrix[] matrixArr5 = matrixArr2;
            fArr2[0] = vVar7.f1834a;
            fArr2[1] = vVar7.f1835b;
            matrixArr5[i13].mapPoints(fArr2);
            float max = Math.max(((float) Math.hypot(fArr[0] - fArr2[0], fArr[1] - fArr2[1])) - 0.001f, 0.0f);
            v vVar8 = vVarArr2[i11];
            fArr[0] = vVar8.f1836c;
            fArr[1] = vVar8.f1837d;
            matrixArr5[i11].mapPoints(fArr);
            if (i11 != 1 && i11 != 3) {
                abs = Math.abs(rectF.centerY() - fArr[1]);
            } else {
                abs = Math.abs(rectF.centerX() - fArr[0]);
            }
            vVar5.d(0.0f, 0.0f, 270.0f, 0.0f);
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        eVar = lVar.j;
                    } else {
                        eVar = lVar.f1802i;
                    }
                } else {
                    eVar = lVar.f1803l;
                }
            } else {
                eVar = lVar.k;
            }
            eVar.r(max, abs, f8, vVar5);
            path6.reset();
            vVar5.b(matrixArr4[i11], path6);
            if (!this.f1806b || (!eVar.q() && !c(path6, i11) && !c(path6, i13))) {
                c6 = 1;
                path2 = path;
                vVar5.b(matrixArr4[i11], path2);
            } else {
                path6.op(path6, path5, Path.Op.DIFFERENCE);
                fArr[0] = vVar5.f1834a;
                c6 = 1;
                fArr[1] = vVar5.f1835b;
                matrixArr4[i11].mapPoints(fArr);
                path4.moveTo(fArr[0], fArr[1]);
                vVar5.b(matrixArr4[i11], path4);
                path2 = path;
            }
            if (dVar != null) {
                Matrix matrix2 = matrixArr4[i11];
                dVar2 = dVar;
                h hVar2 = (h) dVar2.f6489e;
                z9 = false;
                hVar2.f1772g.set(i11 + 4, false);
                u[] uVarArr2 = hVar2.f1771f;
                vVar5.a(vVar5.f1839f);
                uVarArr2[i11] = new o(new ArrayList(vVar5.f1841h), new Matrix(matrix2));
            } else {
                dVar2 = dVar;
                z9 = false;
            }
            path3 = path2;
            dVar3 = dVar2;
            i11 = i12;
            z8 = z9;
            vVarArr = vVarArr2;
            matrixArr2 = matrixArr5;
        }
        Path path7 = path3;
        path7.close();
        path4.close();
        if (!path4.isEmpty()) {
            path7.op(path4, Path.Op.UNION);
        }
    }

    public Bundle b() {
        Bundle bundle = (Bundle) this.f1809e;
        if (bundle == null) {
            return null;
        }
        Bundle k = q4.X.k((Z5.j[]) Arrays.copyOf(new Z5.j[0], 0));
        k.putAll(bundle);
        return k;
    }

    public boolean c(Path path, int i4) {
        Path path2 = (Path) this.j;
        path2.reset();
        ((v[]) this.f1807c)[i4].b(((Matrix[]) this.f1808d)[i4], path2);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        path2.computeBounds(rectF, true);
        path.op(path2, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        if (!rectF.isEmpty() || (rectF.width() > 1.0f && rectF.height() > 1.0f)) {
            return true;
        }
        return false;
    }

    public void d() {
        C0512x c0512x = (C0512x) this.k;
        A.i iVar = (A.i) this.j;
        if (!this.f1806b) {
            iVar.h();
            this.f1806b = true;
            if (((C1135m) this.f1811g) != null) {
                U.d((C1131i) this.f1807c);
            }
            iVar.i((Bundle) this.f1813i);
        }
        if (((EnumC0504o) this.f1810f).ordinal() < ((EnumC0504o) this.f1814l).ordinal()) {
            c0512x.g((EnumC0504o) this.f1810f);
        } else {
            c0512x.g((EnumC0504o) this.f1814l);
        }
    }

    public String toString() {
        switch (this.f1805a) {
            case 1:
                StringBuilder sb = new StringBuilder();
                sb.append(o6.v.f13643a.b(C1131i.class).c());
                sb.append("(" + ((String) this.f1812h) + ')');
                sb.append(" destination=");
                sb.append((AbstractC1143u) this.f1808d);
                String sb2 = sb.toString();
                o6.j.d(sb2, "toString(...)");
                return sb2;
            default:
                return super.toString();
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Cloneable, android.graphics.Matrix[]] */
    /* JADX WARN: Type inference failed for: r2v0, types: [float[], java.io.Serializable] */
    public n() {
        this.f1805a = 0;
        this.f1807c = new v[4];
        this.f1808d = new Matrix[4];
        this.f1809e = new Matrix[4];
        this.f1810f = new PointF();
        this.f1811g = new Path();
        this.f1812h = new Path();
        this.k = new v();
        this.f1814l = new float[2];
        this.f1815m = new float[2];
        this.f1813i = new Path();
        this.j = new Path();
        this.f1806b = true;
        for (int i4 = 0; i4 < 4; i4++) {
            ((v[]) this.f1807c)[i4] = new v();
            ((Matrix[]) this.f1808d)[i4] = new Matrix();
            ((Matrix[]) this.f1809e)[i4] = new Matrix();
        }
    }
}
