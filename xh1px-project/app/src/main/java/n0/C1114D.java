package n0;

import android.os.Bundle;
import android.os.Parcelable;
import java.io.Serializable;

/* renamed from: n0.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1114D extends AbstractC1117G {

    /* renamed from: r, reason: collision with root package name */
    public final Class f12720r;

    public C1114D(Class cls) {
        super(true);
        if (!Parcelable.class.isAssignableFrom(cls) && !Serializable.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException((cls + " does not implement Parcelable or Serializable.").toString());
        }
        this.f12720r = cls;
    }

    @Override // n0.AbstractC1117G
    public final Object a(String str, Bundle bundle) {
        o6.j.e(bundle, "bundle");
        return bundle.get(str);
    }

    @Override // n0.AbstractC1117G
    public final String b() {
        return this.f12720r.getName();
    }

    @Override // n0.AbstractC1117G
    public final Object d(String str) {
        o6.j.e(str, "value");
        throw new UnsupportedOperationException("Parcelables don't support default values.");
    }

    @Override // n0.AbstractC1117G
    public final void e(Bundle bundle, String str, Object obj) {
        o6.j.e(str, "key");
        this.f12720r.cast(obj);
        if (obj != null && !(obj instanceof Parcelable)) {
            if (obj instanceof Serializable) {
                bundle.putSerializable(str, (Serializable) obj);
                return;
            }
            return;
        }
        bundle.putParcelable(str, (Parcelable) obj);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C1114D.class.equals(obj.getClass())) {
            return o6.j.a(this.f12720r, ((C1114D) obj).f12720r);
        }
        return false;
    }

    public final int hashCode() {
        return this.f12720r.hashCode();
    }
}
