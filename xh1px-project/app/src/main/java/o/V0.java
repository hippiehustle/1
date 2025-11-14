package o;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class V0 extends V.b {
    public static final Parcelable.Creator<V0> CREATOR = new A5.o(8);

    /* renamed from: f, reason: collision with root package name */
    public boolean f13135f;

    public V0(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f13135f = ((Boolean) parcel.readValue(null)).booleanValue();
    }

    public final String toString() {
        return "SearchView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " isIconified=" + this.f13135f + "}";
    }

    @Override // V.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        super.writeToParcel(parcel, i4);
        parcel.writeValue(Boolean.valueOf(this.f13135f));
    }
}
