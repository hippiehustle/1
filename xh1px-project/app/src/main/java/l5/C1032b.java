package l5;

import A5.o;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* renamed from: l5.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1032b extends V.b {
    public static final Parcelable.Creator<C1032b> CREATOR = new o(6);

    /* renamed from: f, reason: collision with root package name */
    public final int f12295f;

    /* renamed from: g, reason: collision with root package name */
    public final int f12296g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f12297h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f12298i;
    public final boolean j;

    public C1032b(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f12295f = parcel.readInt();
        this.f12296g = parcel.readInt();
        this.f12297h = parcel.readInt() == 1;
        this.f12298i = parcel.readInt() == 1;
        this.j = parcel.readInt() == 1;
    }

    @Override // V.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        super.writeToParcel(parcel, i4);
        parcel.writeInt(this.f12295f);
        parcel.writeInt(this.f12296g);
        parcel.writeInt(this.f12297h ? 1 : 0);
        parcel.writeInt(this.f12298i ? 1 : 0);
        parcel.writeInt(this.j ? 1 : 0);
    }

    public C1032b(BottomSheetBehavior bottomSheetBehavior) {
        super(AbsSavedState.EMPTY_STATE);
        this.f12295f = bottomSheetBehavior.f9946L;
        this.f12296g = bottomSheetBehavior.f9968e;
        this.f12297h = bottomSheetBehavior.f9962b;
        this.f12298i = bottomSheetBehavior.f9944I;
        this.j = bottomSheetBehavior.f9945J;
    }
}
