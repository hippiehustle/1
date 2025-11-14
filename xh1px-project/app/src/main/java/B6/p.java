package B6;

import C6.A;
import F6.E;
import f7.C0723c;
import p7.C1332n;
import p7.InterfaceC1333o;

/* loaded from: classes.dex */
public final class p extends E {
    public final /* synthetic */ int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(A a3, C0723c c0723c, int i4) {
        super(a3, c0723c);
        this.k = i4;
        switch (i4) {
            case 1:
                o6.j.e(a3, "module");
                o6.j.e(c0723c, "fqName");
                super(a3, c0723c);
                return;
            default:
                return;
        }
    }

    @Override // C6.F
    public final /* bridge */ /* synthetic */ InterfaceC1333o w0() {
        switch (this.k) {
            case 0:
                return C1332n.f13842b;
            default:
                return C1332n.f13842b;
        }
    }
}
