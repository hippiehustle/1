package u4;

import Z5.y;
import a6.AbstractC0437l;
import a6.AbstractC0438m;
import g4.C0779a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k2.C0952b;
import k2.C0953c;
import n6.InterfaceC1163b;
import u7.C1654g;
import u7.C1655h;
import w4.C1704i;
import x7.C1824f;

/* loaded from: classes.dex */
public final /* synthetic */ class d extends o6.i implements InterfaceC1163b {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f15325l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(int i4, Object obj, Class cls, String str, String str2, int i8, int i9, int i10) {
        super(i4, obj, cls, str, str2, i8, i9);
        this.f15325l = i10;
    }

    @Override // n6.InterfaceC1163b
    public final Object m(Object obj) {
        switch (this.f15325l) {
            case 0:
                List list = (List) obj;
                o6.j.e(list, "p0");
                m mVar = (m) this.f13629e;
                mVar.getClass();
                H3.n nVar = mVar.f15345b;
                ArrayList arrayList = new ArrayList(AbstractC0438m.d0(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((C0779a) it.next()).f11154e);
                }
                nVar.getClass();
                C3.e eVar = nVar.f1948c;
                ArrayList arrayList2 = new ArrayList(AbstractC0438m.d0(arrayList, 10));
                Iterator it2 = arrayList.iterator();
                int i4 = 0;
                while (it2.hasNext()) {
                    Object next = it2.next();
                    int i8 = i4 + 1;
                    if (i4 >= 0) {
                        arrayList2.add(C0952b.m((C0952b) next, null, null, null, 0, null, null, false, i4, false, 383));
                        i4 = i8;
                    } else {
                        AbstractC0437l.c0();
                        throw null;
                    }
                }
                eVar.getClass();
                eVar.f599f.i(arrayList2);
                return y.f7506a;
            case 1:
                C1824f c1824f = (C1824f) obj;
                o6.j.e(c1824f, "p0");
                return new C1654g((C1655h) this.f13629e, c1824f);
            default:
                C0953c c0953c = (C0953c) obj;
                o6.j.e(c0953c, "p0");
                C1704i c1704i = (C1704i) this.f13629e;
                c1704i.getClass();
                c1704i.c(new A1.n(c1704i, 27, c0953c));
                return y.f7506a;
        }
    }
}
