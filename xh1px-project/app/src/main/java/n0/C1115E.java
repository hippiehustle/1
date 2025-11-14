package n0;

import android.os.Bundle;
import java.io.Serializable;

/* renamed from: n0.E, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1115E extends AbstractC1117G {

    /* renamed from: r, reason: collision with root package name */
    public final Class f12721r;

    public C1115E(Class cls) {
        super(true);
        if (Serializable.class.isAssignableFrom(cls)) {
            try {
                this.f12721r = Class.forName("[L" + cls.getName() + ';');
                return;
            } catch (ClassNotFoundException e9) {
                throw new RuntimeException(e9);
            }
        }
        throw new IllegalArgumentException((cls + " does not implement Serializable.").toString());
    }

    @Override // n0.AbstractC1117G
    public final Object a(String str, Bundle bundle) {
        o6.j.e(bundle, "bundle");
        return (Serializable[]) bundle.get(str);
    }

    @Override // n0.AbstractC1117G
    public final String b() {
        return this.f12721r.getName();
    }

    @Override // n0.AbstractC1117G
    public final Object d(String str) {
        o6.j.e(str, "value");
        throw new UnsupportedOperationException("Arrays don't support default values.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.io.Serializable[], java.io.Serializable] */
    @Override // n0.AbstractC1117G
    public final void e(Bundle bundle, String str, Object obj) {
        ?? r42 = (Serializable[]) obj;
        o6.j.e(str, "key");
        this.f12721r.cast(r42);
        bundle.putSerializable(str, r42);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C1115E.class.equals(obj.getClass())) {
            return o6.j.a(this.f12721r, ((C1115E) obj).f12721r);
        }
        return false;
    }

    public final int hashCode() {
        return this.f12721r.hashCode();
    }
}
