package F6;

import C6.AbstractC0021w;
import a6.AbstractC0436k;
import a6.AbstractC0438m;
import f7.C0723c;
import h6.AbstractC0837b;
import i.AbstractC0862a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import n6.InterfaceC1162a;
import p7.C1332n;

/* loaded from: classes.dex */
public final class x implements InterfaceC1162a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1606d;

    /* renamed from: e, reason: collision with root package name */
    public final y f1607e;

    public /* synthetic */ x(y yVar, int i4) {
        this.f1606d = i4;
        this.f1607e = yVar;
    }

    @Override // n6.InterfaceC1162a
    public final Object a() {
        switch (this.f1606d) {
            case 0:
                y yVar = this.f1607e;
                C c6 = yVar.f1609g;
                c6.L0();
                return AbstractC0021w.i((C0053m) c6.f1455o.getValue(), yVar.f1610h);
            case 1:
                y yVar2 = this.f1607e;
                C c9 = yVar2.f1609g;
                c9.L0();
                return Boolean.valueOf(AbstractC0021w.h((C0053m) c9.f1455o.getValue(), yVar2.f1610h));
            default:
                y yVar3 = this.f1607e;
                v7.i iVar = yVar3.j;
                u6.s[] sVarArr = y.f1608l;
                boolean booleanValue = ((Boolean) AbstractC0862a.j(iVar, sVarArr[1])).booleanValue();
                C0723c c0723c = yVar3.f1610h;
                C c10 = yVar3.f1609g;
                if (booleanValue) {
                    return C1332n.f13842b;
                }
                List list = (List) AbstractC0862a.j(yVar3.f1611i, sVarArr[0]);
                ArrayList arrayList = new ArrayList(AbstractC0438m.d0(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((C6.F) it.next()).w0());
                }
                return AbstractC0837b.f("package view scope for " + c0723c + " in " + c10.getName(), AbstractC0436k.D0(arrayList, new O(c10, c0723c)));
        }
    }
}
