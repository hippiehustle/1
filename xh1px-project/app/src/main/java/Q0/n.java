package Q0;

import a1.C0414a;
import android.graphics.Path;
import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;
import n1.AbstractC1149a;

/* loaded from: classes.dex */
public final class n extends e {

    /* renamed from: i, reason: collision with root package name */
    public final U0.k f4742i;
    public final Path j;
    public Path k;

    /* renamed from: l, reason: collision with root package name */
    public Path f4743l;

    /* renamed from: m, reason: collision with root package name */
    public ArrayList f4744m;

    public n(List list) {
        super(list);
        this.f4742i = new U0.k();
        this.j = new Path();
    }

    @Override // Q0.e
    public final Object f(C0414a c0414a, float f8) {
        U0.k kVar;
        boolean z8;
        U0.k kVar2;
        U0.k kVar3;
        Path path;
        int i4;
        int i8;
        PointF pointF;
        ArrayList arrayList;
        PointF pointF2;
        boolean z9;
        U0.k kVar4;
        U0.k kVar5;
        U0.k kVar6;
        U0.k kVar7;
        PointF pointF3;
        PointF pointF4;
        boolean z10;
        U0.k kVar8 = (U0.k) c0414a.f7671b;
        U0.k kVar9 = (U0.k) c0414a.f7672c;
        if (kVar9 == null) {
            kVar = kVar8;
        } else {
            kVar = kVar9;
        }
        U0.k kVar10 = this.f4742i;
        ArrayList arrayList2 = kVar10.f5986a;
        if (kVar10.f5987b == null) {
            kVar10.f5987b = new PointF();
        }
        boolean z11 = kVar8.f5988c;
        ArrayList arrayList3 = kVar8.f5986a;
        boolean z12 = true;
        if (!z11 && !kVar.f5988c) {
            z8 = false;
        } else {
            z8 = true;
        }
        kVar10.f5988c = z8;
        int size = arrayList3.size();
        ArrayList arrayList4 = kVar.f5986a;
        if (size != arrayList4.size()) {
            Z0.c.b("Curves must have the same number of control points. Shape 1: " + arrayList3.size() + "\tShape 2: " + arrayList4.size());
        }
        int min = Math.min(arrayList3.size(), arrayList4.size());
        if (arrayList2.size() < min) {
            for (int size2 = arrayList2.size(); size2 < min; size2++) {
                arrayList2.add(new S0.a());
            }
        } else if (arrayList2.size() > min) {
            for (int size3 = arrayList2.size() - 1; size3 >= min; size3--) {
                arrayList2.remove(arrayList2.size() - 1);
            }
        }
        PointF pointF5 = kVar8.f5987b;
        PointF pointF6 = kVar.f5987b;
        kVar10.a(Z0.g.f(pointF5.x, pointF6.x, f8), Z0.g.f(pointF5.y, pointF6.y, f8));
        int size4 = arrayList2.size() - 1;
        while (size4 >= 0) {
            S0.a aVar = (S0.a) arrayList3.get(size4);
            S0.a aVar2 = (S0.a) arrayList4.get(size4);
            PointF pointF7 = aVar.f5175a;
            PointF pointF8 = aVar.f5176b;
            PointF pointF9 = aVar.f5177c;
            boolean z13 = z12;
            PointF pointF10 = aVar2.f5175a;
            PointF pointF11 = aVar2.f5176b;
            PointF pointF12 = aVar2.f5177c;
            U0.k kVar11 = kVar10;
            ((S0.a) arrayList2.get(size4)).f5175a.set(Z0.g.f(pointF7.x, pointF10.x, f8), Z0.g.f(pointF7.y, pointF10.y, f8));
            ((S0.a) arrayList2.get(size4)).f5176b.set(Z0.g.f(pointF8.x, pointF11.x, f8), Z0.g.f(pointF8.y, pointF11.y, f8));
            ((S0.a) arrayList2.get(size4)).f5177c.set(Z0.g.f(pointF9.x, pointF12.x, f8), Z0.g.f(pointF9.y, pointF12.y, f8));
            size4--;
            z12 = z13;
            arrayList3 = arrayList3;
            kVar10 = kVar11;
            arrayList4 = arrayList4;
        }
        U0.k kVar12 = kVar10;
        boolean z14 = z12;
        ArrayList arrayList5 = this.f4744m;
        if (arrayList5 != null) {
            int size5 = arrayList5.size() - 1;
            kVar2 = kVar12;
            while (true) {
                ArrayList arrayList6 = kVar2.f5986a;
                if (size5 < 0) {
                    break;
                }
                P0.r rVar = (P0.r) this.f4744m.get(size5);
                rVar.getClass();
                if (arrayList6.size() > 2) {
                    float floatValue = ((Float) rVar.f4433b.e()).floatValue();
                    if (floatValue != 0.0f) {
                        boolean z15 = kVar2.f5988c;
                        int size6 = arrayList6.size() - 1;
                        int i9 = 0;
                        while (size6 >= 0) {
                            S0.a aVar3 = (S0.a) arrayList6.get(size6);
                            S0.a aVar4 = (S0.a) arrayList6.get(P0.r.d(size6 - 1, arrayList6.size()));
                            if (size6 == 0 && !z15) {
                                pointF3 = kVar2.f5987b;
                            } else {
                                pointF3 = aVar4.f5177c;
                            }
                            if (size6 == 0 && !z15) {
                                pointF4 = pointF3;
                            } else {
                                pointF4 = aVar4.f5176b;
                            }
                            PointF pointF13 = aVar3.f5175a;
                            int i10 = size5;
                            if (!kVar2.f5988c && (size6 == 0 || size6 == arrayList6.size() - 1)) {
                                z10 = z14;
                            } else {
                                z10 = false;
                            }
                            if (pointF4.equals(pointF3) && pointF13.equals(pointF3) && !z10) {
                                i9 += 2;
                            } else {
                                i9++;
                            }
                            size6--;
                            size5 = i10;
                        }
                        i4 = size5;
                        U0.k kVar13 = rVar.f4434c;
                        if (kVar13 != null && kVar13.f5986a.size() == i9) {
                            i8 = 0;
                        } else {
                            ArrayList arrayList7 = new ArrayList(i9);
                            for (int i11 = 0; i11 < i9; i11++) {
                                arrayList7.add(new S0.a());
                            }
                            i8 = 0;
                            rVar.f4434c = new U0.k(new PointF(0.0f, 0.0f), false, arrayList7);
                        }
                        U0.k kVar14 = rVar.f4434c;
                        kVar14.f5988c = z15;
                        PointF pointF14 = kVar2.f5987b;
                        kVar14.a(pointF14.x, pointF14.y);
                        ArrayList arrayList8 = kVar14.f5986a;
                        boolean z16 = kVar2.f5988c;
                        int i12 = i8;
                        int i13 = i12;
                        while (i12 < arrayList6.size()) {
                            S0.a aVar5 = (S0.a) arrayList6.get(i12);
                            S0.a aVar6 = (S0.a) arrayList6.get(P0.r.d(i12 - 1, arrayList6.size()));
                            S0.a aVar7 = (S0.a) arrayList6.get(P0.r.d(i12 - 2, arrayList6.size()));
                            if (i12 == 0 && !z16) {
                                pointF = kVar2.f5987b;
                            } else {
                                pointF = aVar6.f5177c;
                            }
                            if (i12 == 0 && !z16) {
                                arrayList = arrayList6;
                                pointF2 = pointF;
                            } else {
                                arrayList = arrayList6;
                                pointF2 = aVar6.f5176b;
                            }
                            float f9 = floatValue;
                            PointF pointF15 = aVar5.f5175a;
                            PointF pointF16 = aVar7.f5177c;
                            boolean z17 = z16;
                            PointF pointF17 = aVar5.f5177c;
                            if (!kVar2.f5988c && (i12 == 0 || i12 == arrayList.size() - 1)) {
                                z9 = z14;
                            } else {
                                z9 = false;
                            }
                            if (pointF2.equals(pointF) && pointF15.equals(pointF) && !z9) {
                                float f10 = pointF.x;
                                float f11 = f10 - pointF16.x;
                                float f12 = pointF.y;
                                float f13 = f12 - pointF16.y;
                                float f14 = pointF17.x - f10;
                                float f15 = pointF17.y - f12;
                                kVar4 = kVar8;
                                kVar5 = kVar9;
                                double d2 = f11;
                                U0.k kVar15 = kVar14;
                                U0.k kVar16 = kVar2;
                                float hypot = (float) Math.hypot(d2, f13);
                                float hypot2 = (float) Math.hypot(f14, f15);
                                float min2 = Math.min(f9 / hypot, 0.5f);
                                float min3 = Math.min(f9 / hypot2, 0.5f);
                                float f16 = pointF.x;
                                float a3 = AbstractC1149a.a(pointF16.x, f16, min2, f16);
                                float f17 = pointF.y;
                                float a4 = AbstractC1149a.a(pointF16.y, f17, min2, f17);
                                float a9 = AbstractC1149a.a(pointF17.x, f16, min3, f16);
                                float a10 = AbstractC1149a.a(pointF17.y, f17, min3, f17);
                                float f18 = a3 - ((a3 - f16) * 0.5519f);
                                float f19 = a4 - ((a4 - f17) * 0.5519f);
                                float f20 = a9 - ((a9 - f16) * 0.5519f);
                                float f21 = a10 - ((a10 - f17) * 0.5519f);
                                S0.a aVar8 = (S0.a) arrayList8.get(P0.r.d(i13 - 1, arrayList8.size()));
                                S0.a aVar9 = (S0.a) arrayList8.get(i13);
                                kVar7 = kVar16;
                                aVar8.f5176b.set(a3, a4);
                                aVar8.f5177c.set(a3, a4);
                                kVar6 = kVar15;
                                if (i12 == 0) {
                                    kVar6.a(a3, a4);
                                }
                                aVar9.f5175a.set(f18, f19);
                                S0.a aVar10 = (S0.a) arrayList8.get(i13 + 1);
                                aVar9.f5176b.set(f20, f21);
                                aVar9.f5177c.set(a9, a10);
                                aVar10.f5175a.set(a9, a10);
                                i13 += 2;
                            } else {
                                kVar4 = kVar8;
                                kVar5 = kVar9;
                                kVar6 = kVar14;
                                kVar7 = kVar2;
                                S0.a aVar11 = (S0.a) arrayList8.get(P0.r.d(i13 - 1, arrayList8.size()));
                                S0.a aVar12 = (S0.a) arrayList8.get(i13);
                                PointF pointF18 = aVar6.f5176b;
                                aVar11.f5176b.set(pointF18.x, pointF18.y);
                                PointF pointF19 = aVar6.f5177c;
                                aVar11.f5177c.set(pointF19.x, pointF19.y);
                                PointF pointF20 = aVar5.f5175a;
                                aVar12.f5175a.set(pointF20.x, pointF20.y);
                                i13++;
                            }
                            i12++;
                            kVar14 = kVar6;
                            kVar8 = kVar4;
                            arrayList6 = arrayList;
                            floatValue = f9;
                            z16 = z17;
                            kVar9 = kVar5;
                            kVar2 = kVar7;
                        }
                        kVar2 = kVar14;
                        size5 = i4 - 1;
                        kVar8 = kVar8;
                        kVar9 = kVar9;
                    }
                }
                i4 = size5;
                size5 = i4 - 1;
                kVar8 = kVar8;
                kVar9 = kVar9;
            }
        } else {
            kVar2 = kVar12;
        }
        U0.k kVar17 = kVar8;
        U0.k kVar18 = kVar9;
        Path path2 = this.j;
        Z0.g.e(kVar2, path2);
        if (this.f4722e != null) {
            if (this.k == null) {
                this.k = new Path();
                this.f4743l = new Path();
            }
            Z0.g.e(kVar17, this.k);
            if (kVar18 != null) {
                kVar3 = kVar18;
                Z0.g.e(kVar3, this.f4743l);
            } else {
                kVar3 = kVar18;
            }
            R3.r rVar2 = this.f4722e;
            float f22 = c0414a.f7676g;
            float floatValue2 = c0414a.f7677h.floatValue();
            U0.k kVar19 = kVar3;
            Path path3 = this.k;
            if (kVar19 == null) {
                path = path3;
            } else {
                path = this.f4743l;
            }
            return (Path) rVar2.T(f22, floatValue2, path3, path, f8, d(), this.f4721d);
        }
        return path2;
    }

    @Override // Q0.e
    public final boolean k() {
        ArrayList arrayList = this.f4744m;
        if (arrayList != null && !arrayList.isEmpty()) {
            return true;
        }
        return false;
    }
}
