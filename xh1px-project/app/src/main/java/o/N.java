package o;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* loaded from: classes.dex */
public final class N extends View.BaseSavedState {
    public static final Parcelable.Creator<N> CREATOR = new A5.j(17);

    /* renamed from: d, reason: collision with root package name */
    public boolean f13113d;

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        super.writeToParcel(parcel, i4);
        parcel.writeByte(this.f13113d ? (byte) 1 : (byte) 0);
    }
}
