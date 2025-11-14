package D3;

import Z5.y;
import d6.InterfaceC0617c;
import f6.AbstractC0720j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import m1.InterfaceC1053c;
import n6.InterfaceC1166e;

/* loaded from: classes.dex */
public final class c extends AbstractC0720j implements InterfaceC1166e {

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ List f884h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ List f885i;
    public /* synthetic */ Object j;
    public final /* synthetic */ boolean k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ d f886l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(boolean z8, d dVar, InterfaceC0617c interfaceC0617c) {
        super(4, interfaceC0617c);
        this.k = z8;
        this.f886l = dVar;
    }

    @Override // n6.InterfaceC1166e
    public final Object q(Object obj, Object obj2, Object obj3, Object obj4) {
        c cVar = new c(this.k, this.f886l, (InterfaceC0617c) obj4);
        cVar.f884h = (List) obj;
        cVar.f885i = (List) obj2;
        cVar.j = obj3;
        return cVar.v(y.f7506a);
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        boolean z8;
        int i4;
        List list = this.f884h;
        List list2 = this.f885i;
        Object obj2 = this.j;
        Z5.a.d(obj);
        boolean z9 = true;
        boolean z10 = false;
        if (list != null && list2 != null && !list.equals(list2)) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (list2 != null) {
            i4 = list2.size();
        } else {
            i4 = 0;
        }
        ArrayList arrayList = new ArrayList(i4);
        if (list2 != null) {
            if (list2.isEmpty()) {
                z10 = this.k;
            } else {
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    if (!this.f886l.c((InterfaceC1053c) it.next(), obj2)) {
                        arrayList.add(Boolean.FALSE);
                        z9 = false;
                    } else {
                        arrayList.add(Boolean.TRUE);
                    }
                }
                z10 = z9;
            }
        }
        return new I3.b(list2, arrayList, z8, z10);
    }
}
