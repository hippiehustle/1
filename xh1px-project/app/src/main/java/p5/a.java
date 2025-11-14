package p5;

import A5.j;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* loaded from: classes.dex */
public final class a extends View.BaseSavedState {
    public static final Parcelable.Creator<a> CREATOR = new j(18);

    /* renamed from: d, reason: collision with root package name */
    public int f13801d;

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("MaterialCheckBox.SavedState{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" CheckedState=");
        int i4 = this.f13801d;
        if (i4 != 1) {
            if (i4 != 2) {
                str = "unchecked";
            } else {
                str = "indeterminate";
            }
        } else {
            str = "checked";
        }
        return A.j.r(sb, str, "}");
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        super.writeToParcel(parcel, i4);
        parcel.writeValue(Integer.valueOf(this.f13801d));
    }
}
