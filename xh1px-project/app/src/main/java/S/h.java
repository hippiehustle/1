package S;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import n1.AbstractC1149a;

/* loaded from: classes.dex */
public final class h extends View.BaseSavedState {
    public static final Parcelable.Creator<h> CREATOR = new A5.j(4);

    /* renamed from: d, reason: collision with root package name */
    public int f5168d;

    public final String toString() {
        StringBuilder sb = new StringBuilder("HorizontalScrollView.SavedState{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" scrollPosition=");
        return AbstractC1149a.h(sb, this.f5168d, "}");
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        super.writeToParcel(parcel, i4);
        parcel.writeInt(this.f5168d);
    }
}
