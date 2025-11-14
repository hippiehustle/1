package Q0;

import a1.C0414a;
import a1.C0416c;
import android.graphics.PointF;
import java.util.List;
import n1.AbstractC1149a;

/* loaded from: classes.dex */
public final class j extends k {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f4736i;
    public final Object j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(int i4, List list) {
        super(list);
        this.f4736i = i4;
        switch (i4) {
            case 1:
                super(list);
                this.j = new PointF();
                return;
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                super(list);
                this.j = new C0416c();
                return;
            default:
                int i8 = 0;
                for (int i9 = 0; i9 < list.size(); i9++) {
                    U0.c cVar = (U0.c) ((C0414a) list.get(i9)).f7671b;
                    if (cVar != null) {
                        i8 = Math.max(i8, cVar.f5944b.length);
                    }
                }
                this.j = new U0.c(new float[i8], new int[i8]);
                return;
        }
    }

    @Override // Q0.e
    public final Object f(C0414a c0414a, float f8) {
        Object obj;
        float f9;
        switch (this.f4736i) {
            case 0:
                U0.c cVar = (U0.c) this.j;
                U0.c cVar2 = (U0.c) c0414a.f7671b;
                U0.c cVar3 = (U0.c) c0414a.f7672c;
                int[] iArr = cVar.f5944b;
                float[] fArr = cVar.f5943a;
                boolean equals = cVar2.equals(cVar3);
                int[] iArr2 = cVar2.f5944b;
                if (equals) {
                    cVar.a(cVar2);
                } else if (f8 <= 0.0f) {
                    cVar.a(cVar2);
                } else if (f8 >= 1.0f) {
                    cVar.a(cVar3);
                } else {
                    int length = iArr2.length;
                    int[] iArr3 = cVar3.f5944b;
                    if (length == iArr3.length) {
                        for (int i4 = 0; i4 < iArr2.length; i4++) {
                            fArr[i4] = Z0.g.f(cVar2.f5943a[i4], cVar3.f5943a[i4], f8);
                            iArr[i4] = E2.d.m(f8, iArr2[i4], iArr3[i4]);
                        }
                        for (int length2 = iArr2.length; length2 < fArr.length; length2++) {
                            fArr[length2] = fArr[iArr2.length - 1];
                            iArr[length2] = iArr[iArr2.length - 1];
                        }
                    } else {
                        StringBuilder sb = new StringBuilder("Cannot interpolate between gradients. Lengths vary (");
                        sb.append(iArr2.length);
                        sb.append(" vs ");
                        throw new IllegalArgumentException(AbstractC1149a.h(sb, iArr3.length, ")"));
                    }
                }
                return cVar;
            case 1:
                return l(c0414a, f8, f8, f8);
            default:
                C0416c c0416c = (C0416c) this.j;
                Object obj2 = c0414a.f7671b;
                if (obj2 != null && (obj = c0414a.f7672c) != null) {
                    C0416c c0416c2 = (C0416c) obj2;
                    C0416c c0416c3 = (C0416c) obj;
                    R3.r rVar = this.f4722e;
                    if (rVar != null) {
                        f9 = f8;
                        C0416c c0416c4 = (C0416c) rVar.T(c0414a.f7676g, c0414a.f7677h.floatValue(), c0416c2, c0416c3, f9, d(), this.f4721d);
                        if (c0416c4 != null) {
                            return c0416c4;
                        }
                    } else {
                        f9 = f8;
                    }
                    float f10 = Z0.g.f(c0416c2.f7691a, c0416c3.f7691a, f9);
                    float f11 = Z0.g.f(c0416c2.f7692b, c0416c3.f7692b, f9);
                    c0416c.f7691a = f10;
                    c0416c.f7692b = f11;
                    return c0416c;
                }
                throw new IllegalStateException("Missing values for keyframe.");
        }
    }

    @Override // Q0.e
    public /* bridge */ /* synthetic */ Object g(C0414a c0414a, float f8, float f9, float f10) {
        switch (this.f4736i) {
            case 1:
                return l(c0414a, f8, f9, f10);
            default:
                return super.g(c0414a, f8, f9, f10);
        }
    }

    public PointF l(C0414a c0414a, float f8, float f9, float f10) {
        Object obj;
        PointF pointF;
        PointF pointF2 = (PointF) this.j;
        Object obj2 = c0414a.f7671b;
        if (obj2 != null && (obj = c0414a.f7672c) != null) {
            PointF pointF3 = (PointF) obj2;
            PointF pointF4 = (PointF) obj;
            R3.r rVar = this.f4722e;
            if (rVar != null && (pointF = (PointF) rVar.T(c0414a.f7676g, c0414a.f7677h.floatValue(), pointF3, pointF4, f8, d(), this.f4721d)) != null) {
                return pointF;
            }
            float f11 = pointF3.x;
            float a3 = AbstractC1149a.a(pointF4.x, f11, f9, f11);
            float f12 = pointF3.y;
            pointF2.set(a3, AbstractC1149a.a(pointF4.y, f12, f10, f12));
            return pointF2;
        }
        throw new IllegalStateException("Missing values for keyframe.");
    }
}
