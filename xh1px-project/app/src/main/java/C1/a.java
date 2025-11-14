package C1;

import android.util.Log;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.TreeMap;
import k0.C0950e;
import n6.InterfaceC1163b;
import o6.j;
import u6.InterfaceC1642c;
import y0.AbstractC1829a;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f561a;

    public a(int i4) {
        switch (i4) {
            case 1:
                this.f561a = new LinkedHashMap();
                return;
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                this.f561a = new LinkedHashMap();
                return;
            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                this.f561a = new LinkedHashMap(0, 0.75f, true);
                return;
            case Z.g.LONG_FIELD_NUMBER /* 4 */:
                this.f561a = new LinkedHashMap();
                return;
            default:
                this.f561a = new LinkedHashMap();
                return;
        }
    }

    public void a(InterfaceC1642c interfaceC1642c, InterfaceC1163b interfaceC1163b) {
        j.e(interfaceC1642c, "clazz");
        LinkedHashMap linkedHashMap = this.f561a;
        if (!linkedHashMap.containsKey(interfaceC1642c)) {
            linkedHashMap.put(interfaceC1642c, new C0950e(interfaceC1642c, interfaceC1163b));
            return;
        }
        throw new IllegalArgumentException(("A `initializer` with the same `clazz` has already been added: " + interfaceC1642c.a() + '.').toString());
    }

    public void b(AbstractC1829a abstractC1829a) {
        j.e(abstractC1829a, "migration");
        int i4 = abstractC1829a.f16457a;
        int i8 = abstractC1829a.f16458b;
        Integer valueOf = Integer.valueOf(i4);
        LinkedHashMap linkedHashMap = this.f561a;
        Object obj = linkedHashMap.get(valueOf);
        if (obj == null) {
            obj = new TreeMap();
            linkedHashMap.put(valueOf, obj);
        }
        TreeMap treeMap = (TreeMap) obj;
        if (treeMap.containsKey(Integer.valueOf(i8))) {
            Log.w("ROOM", "Overriding migration " + treeMap.get(Integer.valueOf(i8)) + " with " + abstractC1829a);
        }
        treeMap.put(Integer.valueOf(i8), abstractC1829a);
    }

    public U5.d c() {
        Collection values = this.f561a.values();
        j.e(values, "initializers");
        C0950e[] c0950eArr = (C0950e[]) values.toArray(new C0950e[0]);
        return new U5.d((C0950e[]) Arrays.copyOf(c0950eArr, c0950eArr.length));
    }
}
