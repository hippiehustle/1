package x5;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: x5.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1791a extends V.b {
    public static final Parcelable.Creator<C1791a> CREATOR = new A5.o(11);

    /* renamed from: f, reason: collision with root package name */
    public boolean f16133f;

    public C1791a(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f16133f = parcel.readInt() == 1;
    }

    @Override // V.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        super.writeToParcel(parcel, i4);
        parcel.writeInt(this.f16133f ? 1 : 0);
    }
}
