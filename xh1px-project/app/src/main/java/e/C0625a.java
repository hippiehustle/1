package e;

import A5.j;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: e.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0625a implements Parcelable {
    public static final Parcelable.Creator<C0625a> CREATOR = new j(8);

    /* renamed from: d, reason: collision with root package name */
    public final int f10556d;

    /* renamed from: e, reason: collision with root package name */
    public final Intent f10557e;

    public C0625a(int i4, Intent intent) {
        this.f10556d = i4;
        this.f10557e = intent;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("ActivityResult{resultCode=");
        int i4 = this.f10556d;
        if (i4 != -1) {
            if (i4 != 0) {
                str = String.valueOf(i4);
            } else {
                str = "RESULT_CANCELED";
            }
        } else {
            str = "RESULT_OK";
        }
        sb.append(str);
        sb.append(", data=");
        sb.append(this.f10557e);
        sb.append('}');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int i8;
        parcel.writeInt(this.f10556d);
        Intent intent = this.f10557e;
        if (intent == null) {
            i8 = 0;
        } else {
            i8 = 1;
        }
        parcel.writeInt(i8);
        if (intent != null) {
            intent.writeToParcel(parcel, i4);
        }
    }

    public C0625a(Parcel parcel) {
        this.f10556d = parcel.readInt();
        this.f10557e = parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel);
    }
}
