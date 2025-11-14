package c;

import android.view.View;
import android.view.Window;
import androidx.lifecycle.EnumC0503n;
import androidx.lifecycle.InterfaceC0508t;
import androidx.lifecycle.InterfaceC0510v;
import androidx.lifecycle.e0;
import i.AbstractActivityC0870i;

/* renamed from: c.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0554h implements InterfaceC0508t {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f9327d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC0870i f9328e;

    public /* synthetic */ C0554h(AbstractActivityC0870i abstractActivityC0870i, int i4) {
        this.f9327d = i4;
        this.f9328e = abstractActivityC0870i;
    }

    @Override // androidx.lifecycle.InterfaceC0508t
    public final void a(InterfaceC0510v interfaceC0510v, EnumC0503n enumC0503n) {
        View view;
        switch (this.f9327d) {
            case 0:
                if (enumC0503n == EnumC0503n.ON_STOP) {
                    Window window = this.f9328e.getWindow();
                    if (window != null) {
                        view = window.peekDecorView();
                    } else {
                        view = null;
                    }
                    if (view != null) {
                        view.cancelPendingInputEvents();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                if (enumC0503n == EnumC0503n.ON_DESTROY) {
                    this.f9328e.f9334e.f10363b = null;
                    if (!this.f9328e.isChangingConfigurations()) {
                        this.f9328e.f().a();
                    }
                    k kVar = this.f9328e.f9339l;
                    AbstractActivityC0870i abstractActivityC0870i = kVar.f9333g;
                    abstractActivityC0870i.getWindow().getDecorView().removeCallbacks(kVar);
                    abstractActivityC0870i.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(kVar);
                    return;
                }
                return;
            default:
                AbstractActivityC0870i abstractActivityC0870i2 = this.f9328e;
                if (abstractActivityC0870i2.f9338i == null) {
                    j jVar = (j) abstractActivityC0870i2.getLastNonConfigurationInstance();
                    if (jVar != null) {
                        abstractActivityC0870i2.f9338i = jVar.f9329a;
                    }
                    if (abstractActivityC0870i2.f9338i == null) {
                        abstractActivityC0870i2.f9338i = new e0();
                    }
                }
                abstractActivityC0870i2.f9336g.f(this);
                return;
        }
    }
}
