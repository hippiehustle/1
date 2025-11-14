package N3;

import H3.n;
import H3.y;
import O7.V;
import O7.i0;
import a6.AbstractC0438m;
import android.content.Context;
import androidx.lifecycle.Z;
import d6.InterfaceC0617c;
import java.util.ArrayList;
import java.util.Iterator;
import k2.AbstractC0951a;

/* loaded from: classes.dex */
public final class j extends Z {

    /* renamed from: b, reason: collision with root package name */
    public final i0 f3755b;

    /* renamed from: c, reason: collision with root package name */
    public final A4.c f3756c;

    public j(Context context, n nVar) {
        o6.j.e(nVar, "editionRepository");
        InterfaceC0617c interfaceC0617c = null;
        i0 c6 = V.c(null);
        this.f3755b = c6;
        y yVar = nVar.f1950e;
        this.f3756c = new A4.c(new A4.c(yVar.f1986g, yVar.f1996s, new i(this, context, interfaceC0617c, 0), 27), c6, new h(3, interfaceC0617c, 0), 27);
    }

    public static final ArrayList e(j jVar, ArrayList arrayList, Context context, AbstractC0951a abstractC0951a) {
        ArrayList arrayList2 = new ArrayList(AbstractC0438m.d0(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new e(D2.f.M((f2.a) it.next(), context, abstractC0951a, !r0.d())));
        }
        return arrayList2;
    }
}
