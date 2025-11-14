package X0;

import N0.C0202j;
import a1.C0414a;
import a1.C0416c;
import android.graphics.PointF;
import android.view.animation.BaseInterpolator;
import java.util.List;

/* renamed from: X0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0360c {

    /* renamed from: a, reason: collision with root package name */
    public static final R3.r f6806a = R3.r.V("a", "p", "s", "rz", "r", "o", "so", "eo", "sk", "sa");

    /* renamed from: b, reason: collision with root package name */
    public static final R3.r f6807b = R3.r.V("k");

    /* JADX WARN: Code restructure failed: missing block: B:91:0x0172, code lost:
    
        if (r0.f7692b == 1.0f) goto L75;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:10:0x0034. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static T0.d a(Y0.d dVar, C0202j c0202j) {
        boolean z8;
        P0.c cVar;
        T0.b bVar;
        T0.a aVar;
        T0.b bVar2;
        T0.b bVar3;
        T0.b bVar4;
        List list;
        T0.b bVar5;
        T0.b bVar6;
        Float valueOf = Float.valueOf(0.0f);
        if (dVar.D() == 3) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (z8) {
            dVar.d();
        }
        T0.b bVar7 = null;
        T0.b bVar8 = null;
        P0.c cVar2 = null;
        T0.e eVar = null;
        T0.a aVar2 = null;
        T0.b bVar9 = null;
        T0.a aVar3 = null;
        T0.b bVar10 = null;
        T0.b bVar11 = null;
        while (dVar.p()) {
            switch (dVar.M(f6806a)) {
                case 0:
                    bVar4 = bVar8;
                    dVar.d();
                    while (dVar.p()) {
                        if (dVar.M(f6807b) != 0) {
                            dVar.N();
                            dVar.O();
                        } else {
                            cVar2 = AbstractC0358a.a(dVar, c0202j);
                        }
                    }
                    dVar.j();
                    bVar8 = bVar4;
                    break;
                case 1:
                    eVar = AbstractC0358a.b(dVar, c0202j);
                    break;
                case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                    bVar4 = bVar8;
                    aVar2 = new T0.a(4, p.a(dVar, c0202j, 1.0f, f.f6816g, false));
                    bVar8 = bVar4;
                    break;
                case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                    c0202j.a("Lottie doesn't support 3D layers.");
                    T0.b y4 = D2.f.y(dVar, c0202j, false);
                    list = (List) y4.f1023e;
                    if (!list.isEmpty()) {
                        bVar5 = y4;
                        bVar6 = bVar8;
                        list.add(new C0414a(c0202j, valueOf, valueOf, (BaseInterpolator) null, 0.0f, Float.valueOf(c0202j.f3611m)));
                    } else {
                        bVar5 = y4;
                        bVar6 = bVar8;
                        if (((C0414a) list.get(0)).f7671b == null) {
                            list.set(0, new C0414a(c0202j, valueOf, valueOf, (BaseInterpolator) null, 0.0f, Float.valueOf(c0202j.f3611m)));
                        }
                    }
                    bVar8 = bVar6;
                    bVar7 = bVar5;
                    break;
                case Z.g.LONG_FIELD_NUMBER /* 4 */:
                    T0.b y42 = D2.f.y(dVar, c0202j, false);
                    list = (List) y42.f1023e;
                    if (!list.isEmpty()) {
                    }
                    bVar8 = bVar6;
                    bVar7 = bVar5;
                    break;
                case Z.g.STRING_FIELD_NUMBER /* 5 */:
                    aVar3 = D2.f.A(dVar, c0202j);
                    break;
                case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
                    bVar10 = D2.f.y(dVar, c0202j, false);
                    break;
                case Z.g.DOUBLE_FIELD_NUMBER /* 7 */:
                    bVar11 = D2.f.y(dVar, c0202j, false);
                    break;
                case Z.g.BYTES_FIELD_NUMBER /* 8 */:
                    bVar9 = D2.f.y(dVar, c0202j, false);
                    break;
                case 9:
                    bVar8 = D2.f.y(dVar, c0202j, false);
                    break;
                default:
                    dVar.N();
                    dVar.O();
                    break;
            }
        }
        T0.b bVar12 = bVar8;
        if (z8) {
            dVar.j();
        }
        if (cVar2 != null && (!cVar2.E0() || !((PointF) ((C0414a) cVar2.f4335d.get(0)).f7671b).equals(0.0f, 0.0f))) {
            cVar = cVar2;
        } else {
            cVar = null;
        }
        if (eVar == null || (!(eVar instanceof T0.c) && eVar.E0() && ((PointF) ((C0414a) eVar.B0().get(0)).f7671b).equals(0.0f, 0.0f))) {
            eVar = null;
        }
        if (bVar7 != null && (!bVar7.E0() || ((Float) ((C0414a) ((List) bVar7.f1023e).get(0)).f7671b).floatValue() != 0.0f)) {
            bVar = bVar7;
        } else {
            bVar = null;
        }
        if (aVar2 != null) {
            if (aVar2.E0()) {
                C0416c c0416c = (C0416c) ((C0414a) ((List) aVar2.f1023e).get(0)).f7671b;
                if (c0416c.f7691a == 1.0f) {
                }
            }
            aVar = aVar2;
            if (bVar9 == null && (!bVar9.E0() || ((Float) ((C0414a) ((List) bVar9.f1023e).get(0)).f7671b).floatValue() != 0.0f)) {
                bVar2 = bVar9;
            } else {
                bVar2 = null;
            }
            if (bVar12 == null && (!bVar12.E0() || ((Float) ((C0414a) ((List) bVar12.f1023e).get(0)).f7671b).floatValue() != 0.0f)) {
                bVar3 = bVar12;
            } else {
                bVar3 = null;
            }
            return new T0.d(cVar, eVar, aVar, bVar, aVar3, bVar10, bVar11, bVar2, bVar3);
        }
        aVar = null;
        if (bVar9 == null) {
        }
        bVar2 = null;
        if (bVar12 == null) {
        }
        bVar3 = null;
        return new T0.d(cVar, eVar, aVar, bVar, aVar3, bVar10, bVar11, bVar2, bVar3);
    }
}
