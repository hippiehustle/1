package androidx.lifecycle;

import java.util.Iterator;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class e0 {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f8840a = new LinkedHashMap();

    public final void a() {
        LinkedHashMap linkedHashMap = this.f8840a;
        Iterator it = linkedHashMap.values().iterator();
        while (it.hasNext()) {
            ((Z) it.next()).b();
        }
        linkedHashMap.clear();
    }
}
