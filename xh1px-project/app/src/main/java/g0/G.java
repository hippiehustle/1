package g0;

import android.content.Intent;
import android.util.Log;
import e.C0625a;
import e.InterfaceC0626b;
import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public final class G implements InterfaceC0626b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f10859d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ T f10860e;

    public /* synthetic */ G(T t8, int i4) {
        this.f10859d = i4;
        this.f10860e = t8;
    }

    @Override // e.InterfaceC0626b
    public final void h(Object obj) {
        int i4;
        switch (this.f10859d) {
            case 0:
                Map map = (Map) obj;
                ArrayList arrayList = new ArrayList(map.values());
                int[] iArr = new int[arrayList.size()];
                for (int i8 = 0; i8 < arrayList.size(); i8++) {
                    if (((Boolean) arrayList.get(i8)).booleanValue()) {
                        i4 = 0;
                    } else {
                        i4 = -1;
                    }
                    iArr[i8] = i4;
                }
                T t8 = this.f10860e;
                M m6 = (M) t8.f10890G.pollFirst();
                if (m6 == null) {
                    Log.w("FragmentManager", "No permissions were requested for " + this);
                    return;
                }
                String str = m6.f10872d;
                if (t8.f10902c.f(str) == null) {
                    Log.w("FragmentManager", "Permission request result delivered for unknown Fragment " + str);
                    return;
                }
                return;
            default:
                C0625a c0625a = (C0625a) obj;
                T t9 = this.f10860e;
                M m8 = (M) t9.f10890G.pollFirst();
                if (m8 == null) {
                    Log.w("FragmentManager", "No IntentSenders were started for " + this);
                    return;
                }
                String str2 = m8.f10872d;
                AbstractComponentCallbacksC0755y f8 = t9.f10902c.f(str2);
                if (f8 == null) {
                    Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str2);
                    return;
                }
                int i9 = c0625a.f10556d;
                Intent intent = c0625a.f10557e;
                if (T.K(2)) {
                    f8.toString();
                    Objects.toString(intent);
                    return;
                }
                return;
        }
    }
}
