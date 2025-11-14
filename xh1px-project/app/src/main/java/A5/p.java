package A5;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class p extends V.b {
    public static final Parcelable.Creator<p> CREATOR = new o(0);

    /* renamed from: f, reason: collision with root package name */
    public Bundle f381f;

    public p(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f381f = parcel.readBundle(classLoader == null ? p.class.getClassLoader() : classLoader);
    }

    @Override // V.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        super.writeToParcel(parcel, i4);
        parcel.writeBundle(this.f381f);
    }
}
