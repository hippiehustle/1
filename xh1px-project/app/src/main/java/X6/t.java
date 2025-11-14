package X6;

import a6.x;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f7044a;

    public t(LinkedHashMap linkedHashMap) {
        this.f7044a = linkedHashMap;
    }

    public final t a() {
        LinkedHashMap linkedHashMap = this.f7044a;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(x.N0(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object key = entry.getKey();
            e eVar = (e) entry.getValue();
            linkedHashMap2.put(key, new e(eVar.f6996a, eVar.f6997b, eVar.f6998c, true));
        }
        return new t(linkedHashMap2);
    }
}
