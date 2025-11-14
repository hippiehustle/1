package T;

import android.database.ContentObserver;
import android.database.Cursor;
import android.os.Handler;
import o.Y0;

/* loaded from: classes.dex */
public final class a extends ContentObserver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Y0 f5476a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Y0 y02) {
        super(new Handler());
        this.f5476a = y02;
    }

    @Override // android.database.ContentObserver
    public final boolean deliverSelfNotifications() {
        return true;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z8) {
        Cursor cursor;
        Y0 y02 = this.f5476a;
        if (y02.f5480e && (cursor = y02.f5481f) != null && !cursor.isClosed()) {
            y02.f5479d = y02.f5481f.requery();
        }
    }
}
