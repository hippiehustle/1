package x3;

import Z5.y;
import android.content.ComponentName;
import android.content.Context;
import android.service.quicksettings.TileService;
import android.util.Log;
import com.buzbuz.smartautoclicker.feature.qstile.ui.QSTileService;
import d6.InterfaceC0617c;
import f6.AbstractC0720j;
import n6.InterfaceC1164c;

/* renamed from: x3.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1785b extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Context f16117h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1785b(Context context, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.f16117h = context;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        C1785b c1785b = (C1785b) p((InterfaceC0617c) obj2, (C1784a) obj);
        y yVar = y.f7506a;
        c1785b.v(yVar);
        return yVar;
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        return new C1785b(this.f16117h, interfaceC0617c);
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        Z5.a.d(obj);
        int i4 = QSTileService.f9803l;
        Context context = this.f16117h;
        try {
            TileService.requestListeningState(context, new ComponentName(context, (Class<?>) QSTileService.class));
        } catch (IllegalArgumentException unused) {
            Log.e("QSTileService", "Can't request tile update, system is denying it");
        }
        return y.f7506a;
    }
}
