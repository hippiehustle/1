package m7;

import C6.InterfaceC0002c;
import F6.U;
import a6.AbstractC0438m;
import a6.s;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: m7.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1095a implements F7.a {

    /* renamed from: e, reason: collision with root package name */
    public static final C1095a f12551e = new C1095a(0);

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f12552d;

    public /* synthetic */ C1095a(int i4) {
        this.f12552d = i4;
    }

    @Override // F7.a
    public final Iterable b(Object obj) {
        Collection s8;
        switch (this.f12552d) {
            case 0:
                int i4 = AbstractC1098d.f12556a;
                Collection s9 = ((U) obj).s();
                ArrayList arrayList = new ArrayList(AbstractC0438m.d0(s9, 10));
                Iterator it = ((ArrayList) s9).iterator();
                while (it.hasNext()) {
                    arrayList.add(((U) it.next()).a());
                }
                return arrayList;
            default:
                InterfaceC0002c interfaceC0002c = (InterfaceC0002c) obj;
                if (interfaceC0002c == null || (s8 = interfaceC0002c.s()) == null) {
                    return s.f7766d;
                }
                return s8;
        }
    }
}
