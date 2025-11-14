package T6;

import a6.AbstractC0438m;
import i.AbstractC0862a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import n6.InterfaceC1162a;
import n7.C1169b;

/* loaded from: classes.dex */
public final class p implements InterfaceC1162a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f5877d;

    /* renamed from: e, reason: collision with root package name */
    public final q f5878e;

    public /* synthetic */ p(q qVar, int i4) {
        this.f5877d = i4;
        this.f5878e = qVar;
    }

    @Override // n6.InterfaceC1162a
    public final Object a() {
        switch (this.f5877d) {
            case 0:
                q qVar = this.f5878e;
                Y6.f fVar = ((S6.a) qVar.f5880l.f280e).f5407l;
                String str = qVar.f1461i.f10797a.f10800a;
                fVar.getClass();
                o6.j.e(str, "packageFqName");
                return a6.x.R0(new ArrayList());
            case 1:
                this.f5878e.k.getClass();
                return new ArrayList(AbstractC0438m.d0(a6.s.f7766d, 10));
            default:
                HashMap hashMap = new HashMap();
                for (Map.Entry entry : ((Map) AbstractC0862a.j(this.f5878e.f5881m, q.f5879q[0])).entrySet()) {
                    String str2 = (String) entry.getKey();
                    H6.b bVar = (H6.b) entry.getValue();
                    C1169b c6 = C1169b.c(str2);
                    Z6.b bVar2 = bVar.f2038b;
                    Z6.a aVar = bVar2.f7517a;
                    int ordinal = aVar.ordinal();
                    if (ordinal != 2) {
                        if (ordinal == 5) {
                            String str3 = bVar2.f7522f;
                            if (aVar != Z6.a.MULTIFILE_CLASS_PART) {
                                str3 = null;
                            }
                            if (str3 != null) {
                                hashMap.put(c6, C1169b.c(str3));
                            }
                        }
                    } else {
                        hashMap.put(c6, c6);
                    }
                }
                return hashMap;
        }
    }
}
