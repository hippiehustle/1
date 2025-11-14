package U6;

import C6.T;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import m7.AbstractC1098d;
import o6.j;
import t0.C1536c;
import w7.AbstractC1759v;
import w7.E;
import w7.M;
import w7.U;
import w7.X;

/* loaded from: classes.dex */
public final class e {
    public static M a(T t8, a aVar, C1536c c1536c, AbstractC1759v abstractC1759v) {
        j.e(aVar, "typeAttr");
        j.e(c1536c, "typeParameterUpperBoundEraser");
        if (!aVar.f6172c) {
            aVar = a.a(aVar, b.f6176d, false, null, null, 61);
        }
        int ordinal = aVar.f6171b.ordinal();
        X x8 = X.INVARIANT;
        if (ordinal != 0 && ordinal != 1) {
            if (ordinal == 2) {
                return new E(abstractC1759v, x8);
            }
            throw new NoWhenBranchMatchedException();
        }
        if (!t8.e0().f15986e) {
            return new E(AbstractC1098d.e(t8).o(), x8);
        }
        List e9 = abstractC1759v.B0().e();
        j.d(e9, "getParameters(...)");
        if (!e9.isEmpty()) {
            return new E(abstractC1759v, X.OUT_VARIANCE);
        }
        return U.k(t8, aVar);
    }
}
