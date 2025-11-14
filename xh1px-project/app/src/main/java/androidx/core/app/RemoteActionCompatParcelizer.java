package androidx.core.app;

import L0.a;
import L0.b;
import L0.c;
import android.app.PendingIntent;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;

/* loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(a aVar) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        c cVar = remoteActionCompat.f8551a;
        boolean z8 = true;
        if (aVar.e(1)) {
            cVar = aVar.g();
        }
        remoteActionCompat.f8551a = (IconCompat) cVar;
        CharSequence charSequence = remoteActionCompat.f8552b;
        if (aVar.e(2)) {
            charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((b) aVar).f2751e);
        }
        remoteActionCompat.f8552b = charSequence;
        CharSequence charSequence2 = remoteActionCompat.f8553c;
        if (aVar.e(3)) {
            charSequence2 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((b) aVar).f2751e);
        }
        remoteActionCompat.f8553c = charSequence2;
        remoteActionCompat.f8554d = (PendingIntent) aVar.f(remoteActionCompat.f8554d, 4);
        boolean z9 = remoteActionCompat.f8555e;
        if (aVar.e(5)) {
            if (((b) aVar).f2751e.readInt() != 0) {
                z9 = true;
            } else {
                z9 = false;
            }
        }
        remoteActionCompat.f8555e = z9;
        boolean z10 = remoteActionCompat.f8556f;
        if (!aVar.e(6)) {
            z8 = z10;
        } else if (((b) aVar).f2751e.readInt() == 0) {
            z8 = false;
        }
        remoteActionCompat.f8556f = z8;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, a aVar) {
        aVar.getClass();
        IconCompat iconCompat = remoteActionCompat.f8551a;
        aVar.h(1);
        aVar.i(iconCompat);
        CharSequence charSequence = remoteActionCompat.f8552b;
        aVar.h(2);
        Parcel parcel = ((b) aVar).f2751e;
        TextUtils.writeToParcel(charSequence, parcel, 0);
        CharSequence charSequence2 = remoteActionCompat.f8553c;
        aVar.h(3);
        TextUtils.writeToParcel(charSequence2, parcel, 0);
        PendingIntent pendingIntent = remoteActionCompat.f8554d;
        aVar.h(4);
        parcel.writeParcelable(pendingIntent, 0);
        boolean z8 = remoteActionCompat.f8555e;
        aVar.h(5);
        parcel.writeInt(z8 ? 1 : 0);
        boolean z9 = remoteActionCompat.f8556f;
        aVar.h(6);
        parcel.writeInt(z9 ? 1 : 0);
    }
}
