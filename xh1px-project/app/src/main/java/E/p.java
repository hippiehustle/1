package E;

import android.app.Notification;
import android.os.Parcel;
import b.C0515a;
import n1.AbstractC1149a;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final String f1128a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1129b;

    /* renamed from: c, reason: collision with root package name */
    public final Notification f1130c;

    public p(String str, int i4, Notification notification) {
        this.f1128a = str;
        this.f1129b = i4;
        this.f1130c = notification;
    }

    public final void a(b.c cVar) {
        String str = this.f1128a;
        int i4 = this.f1129b;
        C0515a c0515a = (C0515a) cVar;
        c0515a.getClass();
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(b.c.f9010a);
            obtain.writeString(str);
            obtain.writeInt(i4);
            obtain.writeString(null);
            Notification notification = this.f1130c;
            if (notification != null) {
                obtain.writeInt(1);
                notification.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            c0515a.f9008d.transact(1, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NotifyTask[packageName:");
        sb.append(this.f1128a);
        sb.append(", id:");
        return AbstractC1149a.h(sb, this.f1129b, ", tag:null]");
    }
}
