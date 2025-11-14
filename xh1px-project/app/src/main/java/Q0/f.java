package Q0;

import a1.C0414a;
import android.graphics.PointF;
import java.util.List;

/* loaded from: classes.dex */
public final class f extends k {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f4726i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(int i4, List list) {
        super(list);
        this.f4726i = i4;
    }

    @Override // Q0.e
    public final Object f(C0414a c0414a, float f8) {
        int i4;
        int i8;
        Integer num;
        Object obj;
        float floatValue;
        S0.b bVar;
        switch (this.f4726i) {
            case 0:
                return Integer.valueOf(l(c0414a, f8));
            case 1:
                Object obj2 = c0414a.f7671b;
                if (obj2 != null) {
                    Object obj3 = c0414a.f7672c;
                    if (obj3 == null) {
                        if (c0414a.k == 784923401) {
                            c0414a.k = ((Integer) obj2).intValue();
                        }
                        i4 = c0414a.k;
                    } else {
                        if (c0414a.f7679l == 784923401) {
                            c0414a.f7679l = ((Integer) obj3).intValue();
                        }
                        i4 = c0414a.f7679l;
                    }
                    int i9 = i4;
                    R3.r rVar = this.f4722e;
                    if (rVar != null && (num = (Integer) rVar.T(c0414a.f7676g, c0414a.f7677h.floatValue(), (Integer) obj2, Integer.valueOf(i9), f8, d(), this.f4721d)) != null) {
                        i8 = num.intValue();
                    } else {
                        if (c0414a.k == 784923401) {
                            c0414a.k = ((Integer) obj2).intValue();
                        }
                        int i10 = c0414a.k;
                        PointF pointF = Z0.g.f7273a;
                        i8 = (int) (((i9 - i10) * f8) + i10);
                    }
                    return Integer.valueOf(i8);
                }
                throw new IllegalStateException("Missing values for keyframe.");
            default:
                Object obj4 = c0414a.f7671b;
                R3.r rVar2 = this.f4722e;
                if (rVar2 != null) {
                    float f9 = c0414a.f7676g;
                    Float f10 = c0414a.f7677h;
                    if (f10 == null) {
                        floatValue = Float.MAX_VALUE;
                    } else {
                        floatValue = f10.floatValue();
                    }
                    S0.b bVar2 = (S0.b) obj4;
                    Object obj5 = c0414a.f7672c;
                    if (obj5 == null) {
                        bVar = bVar2;
                    } else {
                        bVar = (S0.b) obj5;
                    }
                    return (S0.b) rVar2.T(f9, floatValue, bVar2, bVar, f8, c(), this.f4721d);
                }
                if (f8 == 1.0f && (obj = c0414a.f7672c) != null) {
                    return (S0.b) obj;
                }
                return (S0.b) obj4;
        }
    }

    public int l(C0414a c0414a, float f8) {
        float f9;
        Float f10;
        Object obj = c0414a.f7671b;
        Object obj2 = c0414a.f7671b;
        if (obj != null && c0414a.f7672c != null) {
            R3.r rVar = this.f4722e;
            if (rVar != null && (f10 = c0414a.f7677h) != null) {
                f9 = f8;
                Integer num = (Integer) rVar.T(c0414a.f7676g, f10.floatValue(), (Integer) obj2, (Integer) c0414a.f7672c, f9, d(), this.f4721d);
                if (num != null) {
                    return num.intValue();
                }
            } else {
                f9 = f8;
            }
            return E2.d.m(Z0.g.b(f9, 0.0f, 1.0f), ((Integer) obj2).intValue(), ((Integer) c0414a.f7672c).intValue());
        }
        throw new IllegalStateException("Missing values for keyframe.");
    }
}
