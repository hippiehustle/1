package w4;

import H3.n;
import H3.v;
import H3.y;
import Y3.z;
import a6.AbstractC0438m;
import android.content.Context;
import androidx.lifecycle.Z;
import com.buzbuz.smartautoclicker.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import k2.C0953c;
import l1.C0999a;
import l1.C1000b;

/* renamed from: w4.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1706k extends Z {

    /* renamed from: b, reason: collision with root package name */
    public final n f15708b;

    /* renamed from: c, reason: collision with root package name */
    public final z f15709c;

    /* renamed from: d, reason: collision with root package name */
    public final v f15710d;

    public C1706k(n nVar) {
        o6.j.e(nVar, "editionRepository");
        this.f15708b = nVar;
        y yVar = nVar.f1950e;
        this.f15709c = new z(yVar.f1984e, 19);
        this.f15710d = yVar.f1998u;
    }

    public final C0953c e(Context context, C0953c c0953c) {
        H3.b bVar = this.f15708b.f1949d;
        if (c0953c == null) {
            bVar.getClass();
            C0999a a3 = ((C1000b) bVar.f1906i).a();
            C0999a i4 = bVar.i();
            ((W0.d) bVar.f1905h).getClass();
            String string = context.getString(R.string.default_event_name);
            o6.j.d(string, "getString(...)");
            return new C0953c(a3, i4, string, 1, new ArrayList(), new ArrayList(), true);
        }
        C0999a i8 = bVar.i();
        LinkedHashMap linkedHashMap = (LinkedHashMap) bVar.f1910o;
        C0999a a4 = ((C1000b) bVar.f1906i).a();
        String k = A.j.k(c0953c.f11970c);
        List<j2.g> list = c0953c.f11973f;
        ArrayList arrayList = new ArrayList(AbstractC0438m.d0(list, 10));
        for (j2.g gVar : list) {
            j2.g f8 = bVar.f(gVar, a4);
            linkedHashMap.put(gVar.getId(), f8.getId());
            arrayList.add(f8);
        }
        List list2 = c0953c.f11972e;
        ArrayList arrayList2 = new ArrayList(AbstractC0438m.d0(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList2.add(bVar.a((f2.a) it.next(), a4));
        }
        C0953c n3 = C0953c.n(c0953c, a4, i8, k, arrayList2, arrayList, 72);
        linkedHashMap.clear();
        return n3;
    }
}
