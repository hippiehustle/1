package X0;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes.dex */
public final class x implements D {

    /* renamed from: a, reason: collision with root package name */
    public static final x f6853a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final R3.r f6854b = R3.r.V("c", "v", "i", "o");

    @Override // X0.D
    public final Object a(Y0.c cVar, float f8) {
        if (cVar.D() == 1) {
            cVar.a();
        }
        cVar.d();
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        ArrayList arrayList3 = null;
        boolean z8 = false;
        while (cVar.p()) {
            int M8 = cVar.M(f6854b);
            if (M8 != 0) {
                if (M8 != 1) {
                    if (M8 != 2) {
                        if (M8 != 3) {
                            cVar.N();
                            cVar.O();
                        } else {
                            arrayList3 = n.c(cVar, f8);
                        }
                    } else {
                        arrayList2 = n.c(cVar, f8);
                    }
                } else {
                    arrayList = n.c(cVar, f8);
                }
            } else {
                z8 = cVar.v();
            }
        }
        cVar.j();
        if (cVar.D() == 2) {
            cVar.e();
        }
        if (arrayList != null && arrayList2 != null && arrayList3 != null) {
            if (arrayList.isEmpty()) {
                return new U0.k(new PointF(), false, Collections.EMPTY_LIST);
            }
            int size = arrayList.size();
            PointF pointF = (PointF) arrayList.get(0);
            ArrayList arrayList4 = new ArrayList(size);
            for (int i4 = 1; i4 < size; i4++) {
                PointF pointF2 = (PointF) arrayList.get(i4);
                int i8 = i4 - 1;
                arrayList4.add(new S0.a(Z0.g.a((PointF) arrayList.get(i8), (PointF) arrayList3.get(i8)), Z0.g.a(pointF2, (PointF) arrayList2.get(i4)), pointF2));
            }
            if (z8) {
                PointF pointF3 = (PointF) arrayList.get(0);
                int i9 = size - 1;
                arrayList4.add(new S0.a(Z0.g.a((PointF) arrayList.get(i9), (PointF) arrayList3.get(i9)), Z0.g.a(pointF3, (PointF) arrayList2.get(0)), pointF3));
            }
            return new U0.k(pointF, z8, arrayList4);
        }
        throw new IllegalArgumentException("Shape data was missing information.");
    }
}
