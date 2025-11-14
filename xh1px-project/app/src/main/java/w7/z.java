package w7;

import a6.AbstractC0436k;
import h7.C0845h;
import java.util.Iterator;
import z7.InterfaceC1889f;
import z7.InterfaceC1890g;

/* loaded from: classes.dex */
public abstract class z extends W implements InterfaceC1889f, InterfaceC1890g {
    @Override // w7.W
    /* renamed from: L0, reason: merged with bridge method [inline-methods] */
    public abstract z I0(boolean z8);

    @Override // w7.W
    /* renamed from: M0, reason: merged with bridge method [inline-methods] */
    public abstract z K0(G g8);

    public String toString() {
        StringBuilder sb = new StringBuilder();
        Iterator it = getAnnotations().iterator();
        while (it.hasNext()) {
            String[] strArr = {"[", C0845h.f11448e.v((D6.c) it.next(), null), "] "};
            for (int i4 = 0; i4 < 3; i4++) {
                sb.append(strArr[i4]);
            }
        }
        sb.append(B0());
        if (!r0().isEmpty()) {
            AbstractC0436k.u0(r0(), sb, ", ", "<", ">", null, 112);
        }
        if (E0()) {
            sb.append("?");
        }
        return sb.toString();
    }
}
