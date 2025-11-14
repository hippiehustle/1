package T1;

import Z7.C0385f;
import Z7.InterfaceC0404z;
import Z7.T;
import Z7.d0;
import kotlinx.serialization.UnknownFieldException;
import s3.AbstractC1492c;

/* loaded from: classes.dex */
public final /* synthetic */ class v implements InterfaceC0404z {

    /* renamed from: a, reason: collision with root package name */
    public static final v f5650a;
    private static final X7.f descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [Z7.z, T1.v, java.lang.Object] */
    static {
        ?? obj = new Object();
        f5650a = obj;
        T t8 = new T("com.buzbuz.smartautoclicker.core.database.entity.EventEntity", obj, 8);
        t8.l("id", false);
        t8.l("scenarioId", false);
        t8.l("name", false);
        t8.l("conditionOperator", false);
        t8.l("priority", false);
        t8.l("enabledOnStart", true);
        t8.l("type", false);
        t8.l("keepDetecting", true);
        descriptor = t8;
    }

    @Override // V7.a
    public final Object a(Y7.b bVar) {
        X7.f fVar = descriptor;
        Y7.a j = bVar.j(fVar);
        Z5.g[] gVarArr = x.f5651i;
        C c6 = null;
        long j5 = 0;
        long j8 = 0;
        Boolean bool = null;
        String str = null;
        int i4 = 0;
        int i8 = 0;
        int i9 = 0;
        boolean z8 = false;
        boolean z9 = true;
        while (z9) {
            int n3 = j.n(fVar);
            switch (n3) {
                case -1:
                    z9 = false;
                    break;
                case 0:
                    j5 = j.i(fVar, 0);
                    i4 |= 1;
                    break;
                case 1:
                    j8 = j.i(fVar, 1);
                    i4 |= 2;
                    break;
                case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                    str = j.B(fVar, 2);
                    i4 |= 4;
                    break;
                case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                    i8 = j.o(fVar, 3);
                    i4 |= 8;
                    break;
                case Z.g.LONG_FIELD_NUMBER /* 4 */:
                    i9 = j.o(fVar, 4);
                    i4 |= 16;
                    break;
                case Z.g.STRING_FIELD_NUMBER /* 5 */:
                    z8 = j.k(fVar, 5);
                    i4 |= 32;
                    break;
                case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
                    c6 = (C) j.p(fVar, 6, (V7.a) gVarArr[6].getValue(), c6);
                    i4 |= 64;
                    break;
                case Z.g.DOUBLE_FIELD_NUMBER /* 7 */:
                    bool = (Boolean) j.y(fVar, 7, C0385f.f7596a, bool);
                    i4 |= 128;
                    break;
                default:
                    throw new UnknownFieldException(n3);
            }
        }
        j.g(fVar);
        return new x(i4, j5, j8, str, i8, i9, z8, c6, bool);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Z7.InterfaceC0404z
    public final V7.a[] b() {
        Z5.g[] gVarArr = x.f5651i;
        Z7.L l6 = Z7.L.f7554a;
        Z7.F f8 = Z7.F.f7545a;
        C0385f c0385f = C0385f.f7596a;
        return new V7.a[]{l6, l6, d0.f7591a, f8, f8, c0385f, gVarArr[6].getValue(), AbstractC1492c.t(c0385f)};
    }

    @Override // V7.a
    public final void c(kotlinx.serialization.json.internal.c cVar, Object obj) {
        x xVar = (x) obj;
        o6.j.e(xVar, "value");
        X7.f fVar = descriptor;
        kotlinx.serialization.json.internal.c a3 = cVar.a(fVar);
        Z5.g[] gVarArr = x.f5651i;
        long j = xVar.f5652a;
        Boolean bool = xVar.f5659h;
        boolean z8 = xVar.f5657f;
        a3.n(fVar, 0, j);
        a3.n(fVar, 1, xVar.f5653b);
        a3.u(fVar, 2, xVar.f5654c);
        a3.l(3, xVar.f5655d, fVar);
        a3.l(4, xVar.f5656e, fVar);
        if (a3.w(fVar) || !z8) {
            a3.c(fVar, 5, z8);
        }
        a3.q(fVar, 6, (V7.a) gVarArr[6].getValue(), xVar.f5658g);
        if (a3.w(fVar) || bool != null) {
            a3.p(fVar, 7, C0385f.f7596a, bool);
        }
        a3.v(fVar);
    }

    @Override // V7.a
    public final X7.f d() {
        return descriptor;
    }
}
