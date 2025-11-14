package j4;

import H3.y;
import O7.V;
import O7.i0;
import a6.AbstractC0438m;
import android.content.Context;
import androidx.lifecycle.Z;
import d6.InterfaceC0617c;
import f4.C0709b;
import j2.AbstractC0901a;
import j2.C0902b;
import j2.C0903c;
import j2.C0905e;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import u6.AbstractC1638C;

/* loaded from: classes.dex */
public final class l extends Z {

    /* renamed from: b, reason: collision with root package name */
    public final q1.e f11932b;

    /* renamed from: c, reason: collision with root package name */
    public final i0 f11933c;

    /* renamed from: d, reason: collision with root package name */
    public final A4.c f11934d;

    public l(Context context, q1.e eVar, H3.n nVar) {
        o6.j.e(eVar, "bitmapRepository");
        o6.j.e(nVar, "editionRepository");
        this.f11932b = eVar;
        InterfaceC0617c interfaceC0617c = null;
        i0 c6 = V.c(null);
        this.f11933c = c6;
        y yVar = nVar.f1950e;
        this.f11934d = new A4.c(new A4.c(yVar.f1986g, yVar.f1995r, new N3.i(this, context, interfaceC0617c, 2), 27), c6, new N3.h(3, interfaceC0617c, 2), 27);
    }

    public static final ArrayList e(l lVar, ArrayList arrayList) {
        Object obj;
        HashSet hashSet = new HashSet();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            i iVar = (i) next;
            if (iVar instanceof g) {
                obj = Integer.valueOf(((g) iVar).f11929a.f10757f.h());
            } else if (iVar instanceof h) {
                C0709b c0709b = ((h) iVar).f11930a;
                j2.g gVar = c0709b.f10762f;
                j2.g gVar2 = c0709b.f10762f;
                if (gVar2 instanceof C0903c) {
                    obj = Integer.valueOf(((C0903c) gVar).f11801d.hashCode() + ((C0903c) gVar2).f11800c.hashCode());
                } else if (gVar2 instanceof C0905e) {
                    obj = Integer.valueOf(((C0905e) gVar).f11812e.hashCode() + ((C0905e) gVar).f11813f.hashCode() + ((C0905e) gVar).f11811d.hashCode() + ((C0905e) gVar2).f11810c.hashCode());
                } else if (gVar2 instanceof j2.f) {
                    obj = Long.valueOf(((j2.f) gVar2).f11816c.hashCode() + ((j2.f) gVar).f11817d);
                } else {
                    obj = 0;
                }
            } else {
                throw new NoWhenBranchMatchedException();
            }
            if (hashSet.add(obj)) {
                arrayList2.add(next);
            }
        }
        return arrayList2;
    }

    public static final ArrayList f(l lVar, ArrayList arrayList, Context context) {
        i hVar;
        ArrayList arrayList2 = new ArrayList(AbstractC0438m.d0(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            AbstractC0901a abstractC0901a = (AbstractC0901a) it.next();
            if (abstractC0901a instanceof C0902b) {
                hVar = new g(AbstractC1638C.T((C0902b) abstractC0901a, context, true, !r0.d()));
            } else if (abstractC0901a instanceof j2.g) {
                j2.g gVar = (j2.g) abstractC0901a;
                hVar = new h(D2.f.N(gVar, context, true ^ gVar.d()));
            } else {
                throw new NoWhenBranchMatchedException();
            }
            arrayList2.add(hVar);
        }
        return arrayList2;
    }
}
