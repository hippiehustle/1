package n0;

import android.os.Bundle;
import java.io.Serializable;

/* renamed from: n0.F, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1116F extends AbstractC1117G {

    /* renamed from: r, reason: collision with root package name */
    public final Class f12722r;

    public C1116F(Class cls) {
        super(true);
        if (Serializable.class.isAssignableFrom(cls)) {
            if (!cls.isEnum()) {
                this.f12722r = cls;
                return;
            }
            throw new IllegalArgumentException((cls + " is an Enum. You should use EnumType instead.").toString());
        }
        throw new IllegalArgumentException((cls + " does not implement Serializable.").toString());
    }

    @Override // n0.AbstractC1117G
    public final Object a(String str, Bundle bundle) {
        o6.j.e(bundle, "bundle");
        return (Serializable) bundle.get(str);
    }

    @Override // n0.AbstractC1117G
    public String b() {
        return this.f12722r.getName();
    }

    @Override // n0.AbstractC1117G
    public final void e(Bundle bundle, String str, Object obj) {
        Serializable serializable = (Serializable) obj;
        o6.j.e(str, "key");
        o6.j.e(serializable, "value");
        this.f12722r.cast(serializable);
        bundle.putSerializable(str, serializable);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1116F)) {
            return false;
        }
        return o6.j.a(this.f12722r, ((C1116F) obj).f12722r);
    }

    @Override // n0.AbstractC1117G
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public Serializable d(String str) {
        o6.j.e(str, "value");
        throw new UnsupportedOperationException("Serializables don't support default values.");
    }

    public final int hashCode() {
        return this.f12722r.hashCode();
    }

    public C1116F(int i4, Class cls) {
        super(false);
        if (Serializable.class.isAssignableFrom(cls)) {
            this.f12722r = cls;
            return;
        }
        throw new IllegalArgumentException((cls + " does not implement Serializable.").toString());
    }
}
