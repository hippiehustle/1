package n0;

import androidx.lifecycle.Z;
import androidx.lifecycle.e0;
import java.util.Iterator;
import java.util.LinkedHashMap;
import s3.AbstractC1492c;

/* renamed from: n0.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1135m extends Z {

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f12775b = new LinkedHashMap();

    @Override // androidx.lifecycle.Z
    public final void d() {
        LinkedHashMap linkedHashMap = this.f12775b;
        Iterator it = linkedHashMap.values().iterator();
        while (it.hasNext()) {
            ((e0) it.next()).a();
        }
        linkedHashMap.clear();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NavControllerViewModel{");
        int identityHashCode = System.identityHashCode(this);
        AbstractC1492c.f(16);
        sb.append(Z5.a.e(16, identityHashCode & 4294967295L));
        sb.append("} ViewModelStores (");
        Iterator it = this.f12775b.keySet().iterator();
        while (it.hasNext()) {
            sb.append((String) it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        String sb2 = sb.toString();
        o6.j.d(sb2, "toString(...)");
        return sb2;
    }
}
