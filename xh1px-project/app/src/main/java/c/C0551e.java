package c;

import android.os.Bundle;
import g0.C0731A;
import i.AbstractActivityC0870i;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: c.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0551e implements d.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9313a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC0870i f9314b;

    public /* synthetic */ C0551e(AbstractActivityC0870i abstractActivityC0870i, int i4) {
        this.f9313a = i4;
        this.f9314b = abstractActivityC0870i;
    }

    @Override // d.b
    public final void a() {
        switch (this.f9313a) {
            case 0:
                AbstractActivityC0870i abstractActivityC0870i = this.f9314b;
                Bundle b4 = ((A.i) abstractActivityC0870i.f9337h.f89f).b("android:support:activity-result");
                if (b4 != null) {
                    C0553g c0553g = abstractActivityC0870i.f9342o;
                    HashMap hashMap = c0553g.f9320b;
                    HashMap hashMap2 = c0553g.f9319a;
                    Bundle bundle = c0553g.f9325g;
                    ArrayList<Integer> integerArrayList = b4.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
                    ArrayList<String> stringArrayList = b4.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
                    if (stringArrayList != null && integerArrayList != null) {
                        c0553g.f9322d = b4.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
                        bundle.putAll(b4.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT"));
                        for (int i4 = 0; i4 < stringArrayList.size(); i4++) {
                            String str = stringArrayList.get(i4);
                            if (hashMap.containsKey(str)) {
                                Integer num = (Integer) hashMap.remove(str);
                                if (!bundle.containsKey(str)) {
                                    hashMap2.remove(num);
                                }
                            }
                            Integer num2 = integerArrayList.get(i4);
                            num2.intValue();
                            String str2 = stringArrayList.get(i4);
                            hashMap2.put(num2, str2);
                            c0553g.f9320b.put(str2, num2);
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                C0731A c0731a = (C0731A) this.f9314b.f11711w.f6486e;
                c0731a.f10845l.b(c0731a, c0731a, null);
                return;
        }
    }
}
