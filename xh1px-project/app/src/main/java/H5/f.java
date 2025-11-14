package H5;

import A5.o;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
import com.google.android.material.sidesheet.SideSheetBehavior;

/* loaded from: classes.dex */
public final class f extends V.b {
    public static final Parcelable.Creator<f> CREATOR = new o(2);

    /* renamed from: f, reason: collision with root package name */
    public final int f2030f;

    public f(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f2030f = parcel.readInt();
    }

    @Override // V.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        super.writeToParcel(parcel, i4);
        parcel.writeInt(this.f2030f);
    }

    public f(SideSheetBehavior sideSheetBehavior) {
        super(AbsSavedState.EMPTY_STATE);
        this.f2030f = sideSheetBehavior.f10215h;
    }
}
