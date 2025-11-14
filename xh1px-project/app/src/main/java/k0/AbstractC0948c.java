package k0;

import java.util.LinkedHashMap;
import o6.j;

/* renamed from: k0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0948c {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f11951a = new LinkedHashMap();

    public abstract Object a(InterfaceC0947b interfaceC0947b);

    public final boolean equals(Object obj) {
        if (obj instanceof AbstractC0948c) {
            if (j.a(this.f11951a, ((AbstractC0948c) obj).f11951a)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.f11951a.hashCode();
    }

    public final String toString() {
        return "CreationExtras(extras=" + this.f11951a + ')';
    }
}
