package n0;

import android.os.Bundle;
import android.os.Parcelable;

/* renamed from: n0.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1113C extends AbstractC1117G {

    /* renamed from: r, reason: collision with root package name */
    public final Class f12719r;

    public C1113C(Class cls) {
        super(true);
        if (Parcelable.class.isAssignableFrom(cls)) {
            try {
                this.f12719r = Class.forName("[L" + cls.getName() + ';');
                return;
            } catch (ClassNotFoundException e9) {
                throw new RuntimeException(e9);
            }
        }
        throw new IllegalArgumentException((cls + " does not implement Parcelable.").toString());
    }

    @Override // n0.AbstractC1117G
    public final Object a(String str, Bundle bundle) {
        o6.j.e(bundle, "bundle");
        return (Parcelable[]) bundle.get(str);
    }

    @Override // n0.AbstractC1117G
    public final String b() {
        return this.f12719r.getName();
    }

    @Override // n0.AbstractC1117G
    public final Object d(String str) {
        o6.j.e(str, "value");
        throw new UnsupportedOperationException("Arrays don't support default values.");
    }

    @Override // n0.AbstractC1117G
    public final void e(Bundle bundle, String str, Object obj) {
        Parcelable[] parcelableArr = (Parcelable[]) obj;
        o6.j.e(str, "key");
        this.f12719r.cast(parcelableArr);
        bundle.putParcelableArray(str, parcelableArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C1113C.class.equals(obj.getClass())) {
            return o6.j.a(this.f12719r, ((C1113C) obj).f12719r);
        }
        return false;
    }

    public final int hashCode() {
        return this.f12719r.hashCode();
    }
}
