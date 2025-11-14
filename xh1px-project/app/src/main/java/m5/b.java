package m5;

import A5.o;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class b extends V.b {
    public static final Parcelable.Creator<b> CREATOR = new o(7);

    /* renamed from: f, reason: collision with root package name */
    public boolean f12525f;

    public b(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        if (classLoader == null) {
            b.class.getClassLoader();
        }
        this.f12525f = parcel.readInt() == 1;
    }

    @Override // V.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        super.writeToParcel(parcel, i4);
        parcel.writeInt(this.f12525f ? 1 : 0);
    }
}
