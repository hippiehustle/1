package g0;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class M implements Parcelable {
    public static final Parcelable.Creator<M> CREATOR = new A5.j(12);

    /* renamed from: d, reason: collision with root package name */
    public String f10872d;

    /* renamed from: e, reason: collision with root package name */
    public int f10873e;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        parcel.writeString(this.f10872d);
        parcel.writeInt(this.f10873e);
    }
}
