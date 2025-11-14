package H7;

import P.S;
import Z7.C0399u;
import java.util.Iterator;
import n6.InterfaceC1162a;
import p6.InterfaceC1315a;

/* loaded from: classes.dex */
public final class q implements Iterable, InterfaceC1315a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2076d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f2077e;

    public /* synthetic */ q(int i4, Object obj) {
        this.f2076d = i4;
        this.f2077e = obj;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f2076d) {
            case 0:
                return ((k) this.f2077e).iterator();
            case 1:
                return new S((C0399u) this.f2077e);
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                return o6.j.g((Object[]) this.f2077e);
            default:
                return new b((Iterator) ((InterfaceC1162a) this.f2077e).a());
        }
    }
}
