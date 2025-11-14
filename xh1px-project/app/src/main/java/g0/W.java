package g0;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class W extends androidx.lifecycle.Z {

    /* renamed from: h, reason: collision with root package name */
    public static final V f10931h = new V(0);

    /* renamed from: e, reason: collision with root package name */
    public final boolean f10935e;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f10932b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f10933c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f10934d = new HashMap();

    /* renamed from: f, reason: collision with root package name */
    public boolean f10936f = false;

    /* renamed from: g, reason: collision with root package name */
    public boolean f10937g = false;

    public W(boolean z8) {
        this.f10935e = z8;
    }

    @Override // androidx.lifecycle.Z
    public final void d() {
        if (T.K(3)) {
            toString();
        }
        this.f10936f = true;
    }

    public final void e(String str, boolean z8) {
        HashMap hashMap = this.f10933c;
        W w8 = (W) hashMap.get(str);
        if (w8 != null) {
            if (z8) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(w8.f10933c.keySet());
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    w8.e((String) it.next(), true);
                }
            }
            w8.d();
            hashMap.remove(str);
        }
        HashMap hashMap2 = this.f10934d;
        androidx.lifecycle.e0 e0Var = (androidx.lifecycle.e0) hashMap2.get(str);
        if (e0Var != null) {
            e0Var.a();
            hashMap2.remove(str);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && W.class == obj.getClass()) {
            W w8 = (W) obj;
            if (this.f10932b.equals(w8.f10932b) && this.f10933c.equals(w8.f10933c) && this.f10934d.equals(w8.f10934d)) {
                return true;
            }
        }
        return false;
    }

    public final void f(AbstractComponentCallbacksC0755y abstractComponentCallbacksC0755y) {
        if (!this.f10937g && this.f10932b.remove(abstractComponentCallbacksC0755y.f11114h) != null && T.K(2)) {
            abstractComponentCallbacksC0755y.toString();
        }
    }

    public final int hashCode() {
        return this.f10934d.hashCode() + ((this.f10933c.hashCode() + (this.f10932b.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator it = this.f10932b.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator it2 = this.f10933c.keySet().iterator();
        while (it2.hasNext()) {
            sb.append((String) it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator it3 = this.f10934d.keySet().iterator();
        while (it3.hasNext()) {
            sb.append((String) it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
