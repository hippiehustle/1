package W4;

import Z5.y;
import a5.C0417a;
import a5.EnumC0424h;
import a6.AbstractC0436k;
import b6.C0535c;
import f6.AbstractC0713c;
import f6.AbstractC0720j;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import l2.C1001a;
import n6.InterfaceC1167f;

/* loaded from: classes.dex */
public final class b extends AbstractC0720j implements InterfaceC1167f {

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ List f6584h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ String f6585i;
    public /* synthetic */ C0417a j;
    public /* synthetic */ boolean k;

    /* JADX WARN: Type inference failed for: r0v0, types: [f6.j, W4.b] */
    @Override // n6.InterfaceC1167f
    public final Object b(Object obj, Object obj2, Object obj3, Object obj4, AbstractC0713c abstractC0713c) {
        boolean booleanValue = ((Boolean) obj4).booleanValue();
        ?? abstractC0720j = new AbstractC0720j(5, abstractC0713c);
        abstractC0720j.f6584h = (List) obj;
        abstractC0720j.f6585i = (String) obj2;
        abstractC0720j.j = (C0417a) obj3;
        abstractC0720j.k = booleanValue;
        return abstractC0720j.v(y.f7506a);
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        List L02;
        List<Z4.i> list = this.f6584h;
        String str = this.f6585i;
        C0417a c0417a = this.j;
        boolean z8 = this.k;
        Z5.a.d(obj);
        if (str == null) {
            if (z8) {
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    Z4.i iVar = (Z4.i) obj2;
                    if ((c0417a.f7732c && (iVar.b() instanceof C1001a)) || (c0417a.f7733d && (iVar.b() instanceof p2.e))) {
                        arrayList.add(obj2);
                    }
                }
                EnumC0424h enumC0424h = c0417a.f7730a;
                boolean z9 = c0417a.f7731b;
                int ordinal = enumC0424h.ordinal();
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        if (ordinal == 2) {
                            if (z9) {
                                L02 = AbstractC0436k.L0(arrayList, new A0.i(12));
                            } else {
                                L02 = AbstractC0436k.L0(arrayList, new A0.i(15));
                            }
                        } else {
                            throw new NoWhenBranchMatchedException();
                        }
                    } else if (z9) {
                        L02 = AbstractC0436k.L0(arrayList, new A0.i(11));
                    } else {
                        L02 = AbstractC0436k.L0(arrayList, new A0.i(14));
                    }
                } else if (z9) {
                    L02 = AbstractC0436k.L0(arrayList, new A0.i(13));
                } else {
                    L02 = AbstractC0436k.L0(arrayList, new A0.i(10));
                }
                Z4.j jVar = new Z4.j(c0417a.f7730a, c0417a.f7732c, c0417a.f7733d, z9);
                C0535c i4 = E2.d.i();
                if (!list.isEmpty()) {
                    i4.add(jVar);
                }
                i4.addAll(L02);
                return E2.d.f(i4);
            }
            return list;
        }
        ArrayList arrayList2 = new ArrayList();
        for (Z4.i iVar2 : list) {
            if (!I7.m.b0(iVar2.f7446a, str, true)) {
                iVar2 = null;
            }
            if (iVar2 != null) {
                arrayList2.add(iVar2);
            }
        }
        return arrayList2;
    }
}
