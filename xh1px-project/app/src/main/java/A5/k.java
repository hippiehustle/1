package A5;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class k implements Parcelable {
    public static final Parcelable.Creator<k> CREATOR = new j(0);

    /* renamed from: d, reason: collision with root package name */
    public int f375d;

    /* renamed from: e, reason: collision with root package name */
    public x5.h f376e;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        parcel.writeInt(this.f375d);
        parcel.writeParcelable(this.f376e, 0);
    }
}
