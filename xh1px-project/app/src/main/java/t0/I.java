package t0;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class I implements Parcelable {
    public static final Parcelable.Creator<I> CREATOR = new A5.j(19);

    /* renamed from: d, reason: collision with root package name */
    public int f14759d;

    /* renamed from: e, reason: collision with root package name */
    public int f14760e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f14761f;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        parcel.writeInt(this.f14759d);
        parcel.writeInt(this.f14760e);
        parcel.writeInt(this.f14761f ? 1 : 0);
    }
}
