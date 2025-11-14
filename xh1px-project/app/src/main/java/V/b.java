package V;

import A5.o;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public abstract class b implements Parcelable {

    /* renamed from: d, reason: collision with root package name */
    public final Parcelable f6209d;

    /* renamed from: e, reason: collision with root package name */
    public static final a f6208e = new b();
    public static final Parcelable.Creator<b> CREATOR = new o(5);

    public b() {
        this.f6209d = null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i4) {
        parcel.writeParcelable(this.f6209d, i4);
    }

    public b(Parcelable parcelable) {
        if (parcelable != null) {
            this.f6209d = parcelable == f6208e ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    public b(Parcel parcel, ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        this.f6209d = readParcelable == null ? f6208e : readParcelable;
    }
}
