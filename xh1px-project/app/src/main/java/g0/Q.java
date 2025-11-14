package g0;

import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Objects;
import p0.C1301i;

/* loaded from: classes.dex */
public final class Q implements O {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ T f10880a;

    public Q(T t8) {
        this.f10880a = t8;
    }

    @Override // g0.O
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        ArrayList arrayList3;
        ArrayList arrayList4;
        boolean U8;
        boolean K = T.K(2);
        T t8 = this.f10880a;
        if (K) {
            Objects.toString(t8.f10900a);
        }
        if (t8.f10903d.isEmpty()) {
            Log.i("FragmentManager", "Ignoring call to start back stack pop because the back stack is empty.");
            U8 = false;
            arrayList3 = arrayList;
            arrayList4 = arrayList2;
        } else {
            ArrayList arrayList5 = t8.f10903d;
            C0732a c0732a = (C0732a) arrayList5.get(arrayList5.size() - 1);
            t8.f10907h = c0732a;
            Iterator it = c0732a.f10951a.iterator();
            while (it.hasNext()) {
                AbstractComponentCallbacksC0755y abstractComponentCallbacksC0755y = ((c0) it.next()).f10994b;
                if (abstractComponentCallbacksC0755y != null) {
                    abstractComponentCallbacksC0755y.f11120p = true;
                }
            }
            arrayList3 = arrayList;
            arrayList4 = arrayList2;
            U8 = t8.U(arrayList3, arrayList4, null, -1, 0);
        }
        if (!t8.f10912o.isEmpty() && arrayList3.size() > 0) {
            boolean booleanValue = ((Boolean) arrayList4.get(arrayList3.size() - 1)).booleanValue();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                linkedHashSet.addAll(T.G((C0732a) it2.next()));
            }
            Iterator it3 = t8.f10912o.iterator();
            while (it3.hasNext()) {
                C1301i c1301i = (C1301i) it3.next();
                Iterator it4 = linkedHashSet.iterator();
                while (it4.hasNext()) {
                    c1301i.b((AbstractComponentCallbacksC0755y) it4.next(), booleanValue);
                }
            }
        }
        return U8;
    }
}
