package n2;

import Z7.C0385f;
import Z7.F;
import Z7.InterfaceC0404z;
import Z7.L;
import Z7.T;
import Z7.d0;
import kotlinx.serialization.UnknownFieldException;

/* loaded from: classes.dex */
public final /* synthetic */ class k implements InterfaceC0404z {

    /* renamed from: a, reason: collision with root package name */
    public static final k f12910a;
    private static final X7.f descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [Z7.z, n2.k, java.lang.Object] */
    static {
        ?? obj = new Object();
        f12910a = obj;
        T t8 = new T("com.buzbuz.smartautoclicker.core.dumb.data.database.DumbScenarioEntity", obj, 7);
        t8.l("id", false);
        t8.l("name", false);
        t8.l("repeatCount", false);
        t8.l("isRepeatInfinite", false);
        t8.l("maxDurationMin", false);
        t8.l("isDurationInfinite", false);
        t8.l("randomize", false);
        descriptor = t8;
    }

    @Override // V7.a
    public final Object a(Y7.b bVar) {
        X7.f fVar = descriptor;
        Y7.a j = bVar.j(fVar);
        int i4 = 0;
        int i8 = 0;
        boolean z8 = false;
        int i9 = 0;
        boolean z9 = false;
        boolean z10 = false;
        long j5 = 0;
        String str = null;
        boolean z11 = true;
        while (z11) {
            int n3 = j.n(fVar);
            switch (n3) {
                case -1:
                    z11 = false;
                    break;
                case 0:
                    j5 = j.i(fVar, 0);
                    i4 |= 1;
                    break;
                case 1:
                    str = j.B(fVar, 1);
                    i4 |= 2;
                    break;
                case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                    i8 = j.o(fVar, 2);
                    i4 |= 4;
                    break;
                case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                    z8 = j.k(fVar, 3);
                    i4 |= 8;
                    break;
                case Z.g.LONG_FIELD_NUMBER /* 4 */:
                    i9 = j.o(fVar, 4);
                    i4 |= 16;
                    break;
                case Z.g.STRING_FIELD_NUMBER /* 5 */:
                    z9 = j.k(fVar, 5);
                    i4 |= 32;
                    break;
                case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
                    z10 = j.k(fVar, 6);
                    i4 |= 64;
                    break;
                default:
                    throw new UnknownFieldException(n3);
            }
        }
        j.g(fVar);
        return new m(i4, j5, str, i8, z8, i9, z9, z10);
    }

    @Override // Z7.InterfaceC0404z
    public final V7.a[] b() {
        F f8 = F.f7545a;
        C0385f c0385f = C0385f.f7596a;
        return new V7.a[]{L.f7554a, d0.f7591a, f8, c0385f, f8, c0385f, c0385f};
    }

    @Override // V7.a
    public final void c(kotlinx.serialization.json.internal.c cVar, Object obj) {
        m mVar = (m) obj;
        o6.j.e(mVar, "value");
        X7.f fVar = descriptor;
        kotlinx.serialization.json.internal.c a3 = cVar.a(fVar);
        a3.n(fVar, 0, mVar.f12911a);
        a3.u(fVar, 1, mVar.f12912b);
        a3.l(2, mVar.f12913c, fVar);
        a3.c(fVar, 3, mVar.f12914d);
        a3.l(4, mVar.f12915e, fVar);
        a3.c(fVar, 5, mVar.f12916f);
        a3.c(fVar, 6, mVar.f12917g);
        a3.v(fVar);
    }

    @Override // V7.a
    public final X7.f d() {
        return descriptor;
    }
}
