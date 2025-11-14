package X0;

import N0.C0202j;
import a1.C0414a;
import java.util.ArrayList;

/* renamed from: X0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0358a {

    /* renamed from: a, reason: collision with root package name */
    public static final R3.r f6802a = R3.r.V("k", "x", "y");

    public static P0.c a(Y0.d dVar, C0202j c0202j) {
        boolean z8;
        ArrayList arrayList = new ArrayList();
        if (dVar.D() == 1) {
            dVar.a();
            while (dVar.p()) {
                if (dVar.D() == 3) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                Y0.d dVar2 = dVar;
                C0202j c0202j2 = c0202j;
                arrayList.add(new Q0.l(c0202j2, o.b(dVar2, c0202j2, Z0.k.c(), f.f6814e, z8, false)));
                dVar = dVar2;
                c0202j = c0202j2;
            }
            dVar.e();
            p.b(arrayList);
        } else {
            arrayList.add(new C0414a(n.b(dVar, Z0.k.c())));
        }
        return new P0.c(arrayList);
    }

    public static T0.e b(Y0.d dVar, C0202j c0202j) {
        dVar.d();
        P0.c cVar = null;
        T0.b bVar = null;
        boolean z8 = false;
        T0.b bVar2 = null;
        while (dVar.D() != 4) {
            int M8 = dVar.M(f6802a);
            if (M8 != 0) {
                if (M8 != 1) {
                    if (M8 != 2) {
                        dVar.N();
                        dVar.O();
                    } else if (dVar.D() == 6) {
                        dVar.O();
                        z8 = true;
                    } else {
                        bVar = D2.f.y(dVar, c0202j, true);
                    }
                } else if (dVar.D() == 6) {
                    dVar.O();
                    z8 = true;
                } else {
                    bVar2 = D2.f.y(dVar, c0202j, true);
                }
            } else {
                cVar = a(dVar, c0202j);
            }
        }
        dVar.j();
        if (z8) {
            c0202j.a("Lottie doesn't support expressions.");
        }
        if (cVar != null) {
            return cVar;
        }
        return new T0.c(bVar2, bVar);
    }
}
