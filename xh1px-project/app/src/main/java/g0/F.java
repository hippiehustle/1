package g0;

import a6.C0433h;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.navigation.fragment.NavHostFragment;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import n0.AbstractC1120J;
import n0.C1131i;
import n0.C1132j;
import n0.C1146x;
import q0.C1350f;

/* loaded from: classes.dex */
public final /* synthetic */ class F implements B0.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10857a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f10858b;

    public /* synthetic */ F(int i4, Object obj) {
        this.f10857a = i4;
        this.f10858b = obj;
    }

    @Override // B0.d
    public final Bundle a() {
        Z5.j[] jVarArr;
        Bundle bundle;
        switch (this.f10857a) {
            case 0:
                return ((T) this.f10858b).Y();
            case 1:
                A4.d dVar = (A4.d) this.f10858b;
                for (Map.Entry entry : a6.x.S0((LinkedHashMap) dVar.f298h).entrySet()) {
                    dVar.d(((O7.i0) ((O7.N) entry.getValue())).f(), (String) entry.getKey());
                }
                for (Map.Entry entry2 : a6.x.S0((LinkedHashMap) dVar.f296f).entrySet()) {
                    dVar.d(((B0.d) entry2.getValue()).a(), (String) entry2.getKey());
                }
                LinkedHashMap linkedHashMap = (LinkedHashMap) dVar.f295e;
                if (linkedHashMap.isEmpty()) {
                    jVarArr = new Z5.j[0];
                } else {
                    ArrayList arrayList = new ArrayList(linkedHashMap.size());
                    for (Map.Entry entry3 : linkedHashMap.entrySet()) {
                        arrayList.add(new Z5.j((String) entry3.getKey(), entry3.getValue()));
                    }
                    jVarArr = (Z5.j[]) arrayList.toArray(new Z5.j[0]);
                }
                return q4.X.k((Z5.j[]) Arrays.copyOf(jVarArr, jVarArr.length));
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                C1146x c1146x = (C1146x) this.f10858b;
                C1350f c1350f = c1146x.f12819b;
                LinkedHashMap linkedHashMap2 = c1350f.f13892l;
                C0433h c0433h = c1350f.f13888f;
                LinkedHashMap linkedHashMap3 = c1350f.k;
                ArrayList arrayList2 = new ArrayList();
                Bundle k = q4.X.k((Z5.j[]) Arrays.copyOf(new Z5.j[0], 0));
                for (Map.Entry entry4 : a6.x.S0(c1350f.f13898r.f12741a).entrySet()) {
                    String str = (String) entry4.getKey();
                    Bundle h8 = ((AbstractC1120J) entry4.getValue()).h();
                    if (h8 != null) {
                        arrayList2.add(str);
                        D2.f.E(k, str, h8);
                    }
                }
                if (!arrayList2.isEmpty()) {
                    bundle = q4.X.k((Z5.j[]) Arrays.copyOf(new Z5.j[0], 0));
                    D2.f.F(k, "android-support-nav:controller:navigatorState:names", arrayList2);
                    D2.f.E(bundle, "android-support-nav:controller:navigatorState", k);
                } else {
                    bundle = null;
                }
                if (!c0433h.isEmpty()) {
                    if (bundle == null) {
                        bundle = q4.X.k((Z5.j[]) Arrays.copyOf(new Z5.j[0], 0));
                    }
                    ArrayList<? extends Parcelable> arrayList3 = new ArrayList<>();
                    Iterator<E> it = c0433h.iterator();
                    while (it.hasNext()) {
                        C1131i c1131i = (C1131i) it.next();
                        o6.j.e(c1131i, "entry");
                        O7.Y y4 = new O7.Y(c1131i, c1131i.f12759e.f12813e.f13342a);
                        Bundle k6 = q4.X.k((Z5.j[]) Arrays.copyOf(new Z5.j[0], 0));
                        String str2 = (String) y4.f4114b;
                        o6.j.e(str2, "value");
                        k6.putString("nav-entry-state:id", str2);
                        k6.putInt("nav-entry-state:destination-id", y4.f4113a);
                        Bundle bundle2 = (Bundle) y4.f4115c;
                        if (bundle2 == null) {
                            bundle2 = q4.X.k((Z5.j[]) Arrays.copyOf(new Z5.j[0], 0));
                        }
                        D2.f.E(k6, "nav-entry-state:args", bundle2);
                        D2.f.E(k6, "nav-entry-state:saved-state", (Bundle) y4.f4116d);
                        arrayList3.add(k6);
                    }
                    bundle.putParcelableArrayList("android-support-nav:controller:backStack", arrayList3);
                }
                if (!linkedHashMap3.isEmpty()) {
                    if (bundle == null) {
                        bundle = q4.X.k((Z5.j[]) Arrays.copyOf(new Z5.j[0], 0));
                    }
                    int[] iArr = new int[linkedHashMap3.size()];
                    ArrayList arrayList4 = new ArrayList();
                    int i4 = 0;
                    for (Map.Entry entry5 : linkedHashMap3.entrySet()) {
                        int intValue = ((Number) entry5.getKey()).intValue();
                        String str3 = (String) entry5.getValue();
                        int i8 = i4 + 1;
                        iArr[i4] = intValue;
                        if (str3 == null) {
                            str3 = "";
                        }
                        arrayList4.add(str3);
                        i4 = i8;
                    }
                    bundle.putIntArray("android-support-nav:controller:backStackDestIds", iArr);
                    D2.f.F(bundle, "android-support-nav:controller:backStackIds", arrayList4);
                }
                if (!linkedHashMap2.isEmpty()) {
                    if (bundle == null) {
                        bundle = q4.X.k((Z5.j[]) Arrays.copyOf(new Z5.j[0], 0));
                    }
                    ArrayList arrayList5 = new ArrayList();
                    for (Map.Entry entry6 : linkedHashMap2.entrySet()) {
                        String str4 = (String) entry6.getKey();
                        C0433h c0433h2 = (C0433h) entry6.getValue();
                        arrayList5.add(str4);
                        ArrayList<? extends Parcelable> arrayList6 = new ArrayList<>();
                        Iterator it2 = c0433h2.iterator();
                        while (it2.hasNext()) {
                            O7.Y y5 = ((C1132j) it2.next()).f12764a;
                            y5.getClass();
                            Bundle k8 = q4.X.k((Z5.j[]) Arrays.copyOf(new Z5.j[0], 0));
                            String str5 = (String) y5.f4114b;
                            o6.j.e(str5, "value");
                            k8.putString("nav-entry-state:id", str5);
                            k8.putInt("nav-entry-state:destination-id", y5.f4113a);
                            Bundle bundle3 = (Bundle) y5.f4115c;
                            if (bundle3 == null) {
                                bundle3 = q4.X.k((Z5.j[]) Arrays.copyOf(new Z5.j[0], 0));
                            }
                            D2.f.E(k8, "nav-entry-state:args", bundle3);
                            D2.f.E(k8, "nav-entry-state:saved-state", (Bundle) y5.f4116d);
                            arrayList6.add(k8);
                        }
                        String str6 = "android-support-nav:controller:backStackStates:" + str4;
                        o6.j.e(str6, "key");
                        bundle.putParcelableArrayList(str6, arrayList6);
                    }
                    D2.f.F(bundle, "android-support-nav:controller:backStackStates", arrayList5);
                }
                if (c1146x.f12822e) {
                    if (bundle == null) {
                        bundle = q4.X.k((Z5.j[]) Arrays.copyOf(new Z5.j[0], 0));
                    }
                    bundle.putBoolean("android-support-nav:controller:deepLinkHandled", c1146x.f12822e);
                }
                if (bundle == null) {
                    Bundle bundle4 = Bundle.EMPTY;
                    o6.j.d(bundle4, "EMPTY");
                    return bundle4;
                }
                return bundle;
            default:
                int i9 = ((NavHostFragment) this.f10858b).f8872e0;
                if (i9 != 0) {
                    return q4.X.k(new Z5.j("android-support-nav:fragment:graphId", Integer.valueOf(i9)));
                }
                Bundle bundle5 = Bundle.EMPTY;
                o6.j.b(bundle5);
                return bundle5;
        }
    }
}
