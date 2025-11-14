package L5;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

/* loaded from: classes.dex */
public final class A extends V.b {
    public static final Parcelable.Creator<A> CREATOR = new A5.o(4);

    /* renamed from: f, reason: collision with root package name */
    public CharSequence f2930f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f2931g;

    public A(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f2930f = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f2931g = parcel.readInt() == 1;
    }

    public final String toString() {
        return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + ((Object) this.f2930f) + "}";
    }

    @Override // V.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        super.writeToParcel(parcel, i4);
        TextUtils.writeToParcel(this.f2930f, parcel, i4);
        parcel.writeInt(this.f2931g ? 1 : 0);
    }
}
