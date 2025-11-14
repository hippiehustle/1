package u0;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: u0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1612c implements InterfaceC1613d {

    /* renamed from: d, reason: collision with root package name */
    public IBinder f15223d;

    @Override // u0.InterfaceC1613d
    public final void a(String[] strArr) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(InterfaceC1613d.f15224b);
            obtain.writeStringArray(strArr);
            this.f15223d.transact(1, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f15223d;
    }
}
