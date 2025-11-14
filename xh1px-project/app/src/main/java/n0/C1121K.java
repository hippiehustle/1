package n0;

import i.AbstractC0863b;
import java.util.LinkedHashMap;

/* renamed from: n0.K, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1121K {

    /* renamed from: b, reason: collision with root package name */
    public static final LinkedHashMap f12740b = new LinkedHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f12741a = new LinkedHashMap();

    public final void a(AbstractC1120J abstractC1120J) {
        String n3 = AbstractC0863b.n(abstractC1120J.getClass());
        if (n3.length() > 0) {
            LinkedHashMap linkedHashMap = this.f12741a;
            AbstractC1120J abstractC1120J2 = (AbstractC1120J) linkedHashMap.get(n3);
            if (o6.j.a(abstractC1120J2, abstractC1120J)) {
                return;
            }
            if (abstractC1120J2 != null && abstractC1120J2.f12739b) {
                throw new IllegalStateException(("Navigator " + abstractC1120J + " is replacing an already attached " + abstractC1120J2).toString());
            }
            if (!abstractC1120J.f12739b) {
                return;
            }
            throw new IllegalStateException(("Navigator " + abstractC1120J + " is already attached to another NavController").toString());
        }
        throw new IllegalArgumentException("navigator name cannot be an empty string");
    }

    public final AbstractC1120J b(String str) {
        o6.j.e(str, "name");
        if (str.length() > 0) {
            AbstractC1120J abstractC1120J = (AbstractC1120J) this.f12741a.get(str);
            if (abstractC1120J != null) {
                return abstractC1120J;
            }
            throw new IllegalStateException(A.j.p("Could not find Navigator with name \"", str, "\". You must call NavController.addNavigator() for each navigation type."));
        }
        throw new IllegalArgumentException("navigator name cannot be an empty string");
    }
}
