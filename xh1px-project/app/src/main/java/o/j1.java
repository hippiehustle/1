package o;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class j1 extends V.b {
    public static final Parcelable.Creator<j1> CREATOR = new A5.o(9);

    /* renamed from: f, reason: collision with root package name */
    public int f13267f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f13268g;

    public j1(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        boolean z8;
        this.f13267f = parcel.readInt();
        if (parcel.readInt() != 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        this.f13268g = z8;
    }

    @Override // V.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        super.writeToParcel(parcel, i4);
        parcel.writeInt(this.f13267f);
        parcel.writeInt(this.f13268g ? 1 : 0);
    }
}
