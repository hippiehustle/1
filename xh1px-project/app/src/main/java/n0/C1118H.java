package n0;

import android.os.Bundle;
import androidx.lifecycle.EnumC0504o;
import java.util.UUID;

/* renamed from: n0.H, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1118H {
    public static C1131i a(c0.o oVar, AbstractC1143u abstractC1143u, Bundle bundle, EnumC0504o enumC0504o, C1135m c1135m) {
        String uuid = UUID.randomUUID().toString();
        o6.j.d(uuid, "toString(...)");
        o6.j.e(abstractC1143u, "destination");
        o6.j.e(enumC0504o, "hostLifecycleState");
        return new C1131i(oVar, abstractC1143u, bundle, enumC0504o, c1135m, uuid, null);
    }
}
