package N0;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* renamed from: N0.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0199g extends View.BaseSavedState {
    public static final Parcelable.Creator<C0199g> CREATOR = new A5.j(3);

    /* renamed from: d, reason: collision with root package name */
    public String f3587d;

    /* renamed from: e, reason: collision with root package name */
    public int f3588e;

    /* renamed from: f, reason: collision with root package name */
    public float f3589f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f3590g;

    /* renamed from: h, reason: collision with root package name */
    public String f3591h;

    /* renamed from: i, reason: collision with root package name */
    public int f3592i;
    public int j;

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        super.writeToParcel(parcel, i4);
        parcel.writeString(this.f3587d);
        parcel.writeFloat(this.f3589f);
        parcel.writeInt(this.f3590g ? 1 : 0);
        parcel.writeString(this.f3591h);
        parcel.writeInt(this.f3592i);
        parcel.writeInt(this.j);
    }
}
