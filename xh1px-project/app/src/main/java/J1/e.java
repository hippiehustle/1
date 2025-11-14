package J1;

import M1.h;
import O7.V;
import O7.i0;
import a6.AbstractC0436k;
import android.util.Log;
import i.AbstractActivityC0870i;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import n6.InterfaceC1162a;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashSet f2358a = new LinkedHashSet();

    /* renamed from: b, reason: collision with root package name */
    public final i0 f2359b;

    /* renamed from: c, reason: collision with root package name */
    public final i0 f2360c;

    /* renamed from: d, reason: collision with root package name */
    public InterfaceC1162a f2361d;

    /* renamed from: e, reason: collision with root package name */
    public InterfaceC1162a f2362e;

    public e() {
        i0 c6 = V.c(null);
        this.f2359b = c6;
        this.f2360c = c6;
    }

    public final void a(AbstractActivityC0870i abstractActivityC0870i) {
        LinkedHashSet linkedHashSet = this.f2358a;
        boolean isEmpty = linkedHashSet.isEmpty();
        i0 i0Var = this.f2359b;
        if (isEmpty) {
            Log.i("PermissionsController", "All permission are granted !");
            InterfaceC1162a interfaceC1162a = this.f2361d;
            if (interfaceC1162a != null) {
                interfaceC1162a.a();
            }
            this.f2361d = null;
            this.f2362e = null;
            i0Var.g(null);
            linkedHashSet.clear();
            return;
        }
        L1.b bVar = (L1.b) AbstractC0436k.o0(linkedHashSet);
        linkedHashSet.remove(bVar);
        if (bVar.f2756a && bVar.b(abstractActivityC0870i)) {
            bVar.toString();
            a(abstractActivityC0870i);
            return;
        }
        Log.i("PermissionsController", "show permission dialog for " + bVar);
        abstractActivityC0870i.p().b0(":PermissionDialog:state", abstractActivityC0870i, new b(this, new a(bVar, this, abstractActivityC0870i, 0)));
        i0Var.getClass();
        i0Var.h(null, bVar);
        new h().V(abstractActivityC0870i.p(), "PermissionDialog");
    }

    public final void b(AbstractActivityC0870i abstractActivityC0870i, List list, InterfaceC1162a interfaceC1162a, InterfaceC1162a interfaceC1162a2) {
        if (list.isEmpty()) {
            return;
        }
        LinkedHashSet linkedHashSet = this.f2358a;
        linkedHashSet.clear();
        this.f2361d = interfaceC1162a;
        this.f2362e = interfaceC1162a2;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            L1.b bVar = (L1.b) it.next();
            if (!bVar.a(abstractActivityC0870i)) {
                linkedHashSet.add(bVar);
            }
        }
        Log.i("PermissionsController", "Requesting missing permissions " + list);
        a(abstractActivityC0870i);
    }
}
