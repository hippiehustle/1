package c;

import android.window.OnBackInvokedCallback;
import i.LayoutInflaterFactory2C0860C;
import n6.InterfaceC1162a;
import z5.InterfaceC1871b;

/* loaded from: classes.dex */
public final /* synthetic */ class u implements OnBackInvokedCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9359a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f9360b;

    public /* synthetic */ u(int i4, Object obj) {
        this.f9359a = i4;
        this.f9360b = obj;
    }

    public final void onBackInvoked() {
        switch (this.f9359a) {
            case 0:
                InterfaceC1162a interfaceC1162a = (InterfaceC1162a) this.f9360b;
                o6.j.e(interfaceC1162a, "$onBackInvoked");
                interfaceC1162a.a();
                return;
            case 1:
                ((LayoutInflaterFactory2C0860C) this.f9360b).D();
                return;
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                ((Runnable) this.f9360b).run();
                return;
            default:
                ((InterfaceC1871b) this.f9360b).a();
                return;
        }
    }
}
