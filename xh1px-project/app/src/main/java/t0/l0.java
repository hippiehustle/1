package t0;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class l0 extends V.b {
    public static final Parcelable.Creator<l0> CREATOR = new A5.o(10);

    /* renamed from: f, reason: collision with root package name */
    public Parcelable f14885f;

    public l0(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f14885f = parcel.readParcelable(classLoader == null ? AbstractC1537c0.class.getClassLoader() : classLoader);
    }

    @Override // V.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        super.writeToParcel(parcel, i4);
        parcel.writeParcelable(this.f14885f, 0);
    }
}
