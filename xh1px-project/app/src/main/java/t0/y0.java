package t0;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class y0 implements Parcelable {
    public static final Parcelable.Creator<y0> CREATOR = new A5.j(20);

    /* renamed from: d, reason: collision with root package name */
    public int f15026d;

    /* renamed from: e, reason: collision with root package name */
    public int f15027e;

    /* renamed from: f, reason: collision with root package name */
    public int[] f15028f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f15029g;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "FullSpanItem{mPosition=" + this.f15026d + ", mGapDir=" + this.f15027e + ", mHasUnwantedGapAfter=" + this.f15029g + ", mGapPerSpan=" + Arrays.toString(this.f15028f) + '}';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        parcel.writeInt(this.f15026d);
        parcel.writeInt(this.f15027e);
        parcel.writeInt(this.f15029g ? 1 : 0);
        int[] iArr = this.f15028f;
        if (iArr != null && iArr.length > 0) {
            parcel.writeInt(iArr.length);
            parcel.writeIntArray(this.f15028f);
        } else {
            parcel.writeInt(0);
        }
    }
}
