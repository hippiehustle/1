package X6;

import a6.AbstractC0438m;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final t f7021a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f7022b;

    /* renamed from: c, reason: collision with root package name */
    public final String f7023c;

    /* renamed from: d, reason: collision with root package name */
    public final n f7024d;

    public n(t tVar, ArrayList arrayList, String str) {
        t tVar2;
        t tVar3;
        this.f7021a = tVar;
        this.f7022b = arrayList;
        this.f7023c = str;
        n nVar = null;
        if (str != null) {
            if (tVar != null) {
                tVar2 = tVar.a();
            } else {
                tVar2 = null;
            }
            ArrayList arrayList2 = new ArrayList(AbstractC0438m.d0(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                t tVar4 = (t) it.next();
                if (tVar4 != null) {
                    tVar3 = tVar4.a();
                } else {
                    tVar3 = null;
                }
                arrayList2.add(tVar3);
            }
            nVar = new n(tVar2, arrayList2, null);
        }
        this.f7024d = nVar;
    }
}
