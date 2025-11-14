package c;

import android.os.Bundle;
import androidx.lifecycle.EnumC0503n;
import i.AbstractActivityC0870i;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: c.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0550d implements B0.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9311a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC0870i f9312b;

    public /* synthetic */ C0550d(AbstractActivityC0870i abstractActivityC0870i, int i4) {
        this.f9311a = i4;
        this.f9312b = abstractActivityC0870i;
    }

    @Override // B0.d
    public final Bundle a() {
        AbstractActivityC0870i abstractActivityC0870i;
        switch (this.f9311a) {
            case 0:
                Bundle bundle = new Bundle();
                C0553g c0553g = this.f9312b.f9342o;
                c0553g.getClass();
                HashMap hashMap = c0553g.f9320b;
                bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(hashMap.values()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(hashMap.keySet()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(c0553g.f9322d));
                bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", (Bundle) c0553g.f9325g.clone());
                return bundle;
        }
        do {
            abstractActivityC0870i = this.f9312b;
        } while (AbstractActivityC0870i.q(abstractActivityC0870i.p()));
        abstractActivityC0870i.f11712x.d(EnumC0503n.ON_STOP);
        return new Bundle();
    }
}
