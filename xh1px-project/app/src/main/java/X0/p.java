package X0;

import N0.C0202j;
import a1.C0414a;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class p {

    /* renamed from: a, reason: collision with root package name */
    public static final R3.r f6840a = R3.r.V("k");

    public static ArrayList a(Y0.c cVar, C0202j c0202j, float f8, D d2, boolean z8) {
        Y0.c cVar2;
        C0202j c0202j2;
        float f9;
        D d3;
        boolean z9;
        ArrayList arrayList = new ArrayList();
        if (cVar.D() == 6) {
            c0202j.a("Lottie doesn't support expressions.");
            return arrayList;
        }
        cVar.d();
        while (cVar.p()) {
            if (cVar.M(f6840a) != 0) {
                cVar.O();
            } else if (cVar.D() == 1) {
                cVar.a();
                if (cVar.D() == 7) {
                    Y0.c cVar3 = cVar;
                    C0202j c0202j3 = c0202j;
                    float f10 = f8;
                    D d9 = d2;
                    boolean z10 = z8;
                    C0414a b4 = o.b(cVar3, c0202j3, f10, d9, false, z10);
                    cVar2 = cVar3;
                    c0202j2 = c0202j3;
                    f9 = f10;
                    d3 = d9;
                    z9 = z10;
                    arrayList.add(b4);
                } else {
                    cVar2 = cVar;
                    c0202j2 = c0202j;
                    f9 = f8;
                    d3 = d2;
                    z9 = z8;
                    while (cVar2.p()) {
                        arrayList.add(o.b(cVar2, c0202j2, f9, d3, true, z9));
                    }
                }
                cVar2.e();
                cVar = cVar2;
                c0202j = c0202j2;
                f8 = f9;
                d2 = d3;
                z8 = z9;
            } else {
                Y0.c cVar4 = cVar;
                arrayList.add(o.b(cVar4, c0202j, f8, d2, false, z8));
                cVar = cVar4;
            }
        }
        cVar.j();
        b(arrayList);
        return arrayList;
    }

    public static void b(ArrayList arrayList) {
        int i4;
        Object obj;
        int size = arrayList.size();
        int i8 = 0;
        while (true) {
            i4 = size - 1;
            if (i8 >= i4) {
                break;
            }
            C0414a c0414a = (C0414a) arrayList.get(i8);
            i8++;
            C0414a c0414a2 = (C0414a) arrayList.get(i8);
            c0414a.f7677h = Float.valueOf(c0414a2.f7676g);
            if (c0414a.f7672c == null && (obj = c0414a2.f7671b) != null) {
                c0414a.f7672c = obj;
                if (c0414a instanceof Q0.l) {
                    ((Q0.l) c0414a).d();
                }
            }
        }
        C0414a c0414a3 = (C0414a) arrayList.get(i4);
        if ((c0414a3.f7671b == null || c0414a3.f7672c == null) && arrayList.size() > 1) {
            arrayList.remove(c0414a3);
        }
    }
}
