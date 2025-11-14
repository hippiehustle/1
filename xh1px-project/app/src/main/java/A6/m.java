package A6;

import I7.v;
import a6.AbstractC0437l;
import f7.C0723c;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: b, reason: collision with root package name */
    public static final m f407b = new m(AbstractC0437l.X(g.f399c, j.f402c, h.f400c, i.f401c));

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f408a;

    public m(List list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : list) {
            C0723c c0723c = ((k) obj).f403a;
            Object obj2 = linkedHashMap.get(c0723c);
            if (obj2 == null) {
                obj2 = new ArrayList();
                linkedHashMap.put(c0723c, obj2);
            }
            ((List) obj2).add(obj);
        }
        this.f408a = linkedHashMap;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0065 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x001a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final l a(C0723c c0723c, String str) {
        Integer valueOf;
        o6.j.e(c0723c, "packageFqName");
        o6.j.e(str, "className");
        List<k> list = (List) this.f408a.get(c0723c);
        if (list != null) {
            for (k kVar : list) {
                if (v.a0(str, kVar.f404b)) {
                    String substring = str.substring(kVar.f404b.length());
                    o6.j.d(substring, "substring(...)");
                    if (substring.length() != 0) {
                        int length = substring.length();
                        int i4 = 0;
                        for (int i8 = 0; i8 < length; i8++) {
                            int charAt = substring.charAt(i8) - '0';
                            if (charAt >= 0 && charAt < 10) {
                                i4 = (i4 * 10) + charAt;
                            }
                        }
                        valueOf = Integer.valueOf(i4);
                        if (valueOf == null) {
                            return new l(kVar, valueOf.intValue());
                        }
                    }
                    valueOf = null;
                    if (valueOf == null) {
                    }
                }
            }
        }
        return null;
    }
}
