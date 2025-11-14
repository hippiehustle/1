package u0;

import android.os.IInterface;
import android.os.RemoteCallbackList;
import androidx.room.MultiInstanceInvalidationService;

/* renamed from: u0.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RemoteCallbackListC1619j extends RemoteCallbackList {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MultiInstanceInvalidationService f15238a;

    public RemoteCallbackListC1619j(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.f15238a = multiInstanceInvalidationService;
    }

    @Override // android.os.RemoteCallbackList
    public final void onCallbackDied(IInterface iInterface, Object obj) {
        o6.j.e((InterfaceC1613d) iInterface, "callback");
        o6.j.e(obj, "cookie");
        this.f15238a.f9004e.remove((Integer) obj);
    }
}
