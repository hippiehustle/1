package u4;

import H3.t;
import H3.y;
import Y3.z;
import a6.AbstractC0438m;
import android.content.Context;
import androidx.lifecycle.Z;
import com.buzbuz.smartautoclicker.R;
import j2.C0902b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import k2.C0952b;
import l1.C0999a;
import l1.C1000b;

/* loaded from: classes.dex */
public final class m extends Z {

    /* renamed from: b, reason: collision with root package name */
    public final H3.n f15345b;

    /* renamed from: c, reason: collision with root package name */
    public final J2.b f15346c;

    /* renamed from: d, reason: collision with root package name */
    public final z f15347d;

    /* renamed from: e, reason: collision with root package name */
    public final t f15348e;

    public m(H3.n nVar, J2.b bVar) {
        o6.j.e(nVar, "editionRepository");
        o6.j.e(bVar, "monitoredViewsManager");
        this.f15345b = nVar;
        this.f15346c = bVar;
        y yVar = nVar.f1950e;
        this.f15347d = new z(yVar.f1983d, 17);
        this.f15348e = yVar.f1997t;
    }

    public final C0952b e(Context context, C0952b c0952b) {
        int i4;
        H3.b bVar = this.f15345b.f1949d;
        if (c0952b == null) {
            bVar.getClass();
            C0999a a3 = ((C1000b) bVar.f1906i).a();
            C0999a i8 = bVar.i();
            ((W0.d) bVar.f1905h).getClass();
            String string = context.getString(R.string.default_event_name);
            o6.j.d(string, "getString(...)");
            List list = (List) ((C3.e) bVar.f1904g).f599f.f890d.f();
            if (list != null) {
                i4 = list.size();
            } else {
                i4 = 0;
            }
            int i9 = i4;
            return new C0952b(a3, i8, string, 1, new ArrayList(), new ArrayList(), true, i9, false);
        }
        C0999a i10 = bVar.i();
        LinkedHashMap linkedHashMap = (LinkedHashMap) bVar.f1910o;
        C0999a a4 = ((C1000b) bVar.f1906i).a();
        String k = A.j.k(c0952b.f11961c);
        List<C0902b> list2 = c0952b.f11964f;
        ArrayList arrayList = new ArrayList(AbstractC0438m.d0(list2, 10));
        for (C0902b c0902b : list2) {
            C0902b d2 = bVar.d(c0902b, a4);
            linkedHashMap.put(c0902b.f11789a, d2.f11789a);
            arrayList.add(d2);
        }
        List list3 = c0952b.f11963e;
        ArrayList arrayList2 = new ArrayList(AbstractC0438m.d0(list3, 10));
        Iterator it = list3.iterator();
        while (it.hasNext()) {
            arrayList2.add(bVar.a((f2.a) it.next(), a4));
        }
        C0952b m6 = C0952b.m(c0952b, a4, i10, k, 0, arrayList2, arrayList, false, 0, false, 456);
        linkedHashMap.clear();
        return m6;
    }
}
