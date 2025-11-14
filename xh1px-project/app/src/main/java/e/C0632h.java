package e;

import A5.j;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: e.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0632h implements Parcelable {
    public static final Parcelable.Creator<C0632h> CREATOR = new j(9);

    /* renamed from: d, reason: collision with root package name */
    public final IntentSender f10571d;

    /* renamed from: e, reason: collision with root package name */
    public final Intent f10572e;

    /* renamed from: f, reason: collision with root package name */
    public final int f10573f;

    /* renamed from: g, reason: collision with root package name */
    public final int f10574g;

    public C0632h(IntentSender intentSender, Intent intent, int i4, int i8) {
        this.f10571d = intentSender;
        this.f10572e = intent;
        this.f10573f = i4;
        this.f10574g = i8;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        o6.j.e(parcel, "dest");
        parcel.writeParcelable(this.f10571d, i4);
        parcel.writeParcelable(this.f10572e, i4);
        parcel.writeInt(this.f10573f);
        parcel.writeInt(this.f10574g);
    }
}
