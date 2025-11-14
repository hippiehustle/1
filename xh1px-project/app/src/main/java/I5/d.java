package I5;

import A5.j;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class d extends View.BaseSavedState {
    public static final Parcelable.Creator<d> CREATOR = new j(1);

    /* renamed from: d, reason: collision with root package name */
    public float f2106d;

    /* renamed from: e, reason: collision with root package name */
    public float f2107e;

    /* renamed from: f, reason: collision with root package name */
    public ArrayList f2108f;

    /* renamed from: g, reason: collision with root package name */
    public float f2109g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f2110h;

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        super.writeToParcel(parcel, i4);
        parcel.writeFloat(this.f2106d);
        parcel.writeFloat(this.f2107e);
        parcel.writeList(this.f2108f);
        parcel.writeFloat(this.f2109g);
        parcel.writeBooleanArray(new boolean[]{this.f2110h});
    }
}
