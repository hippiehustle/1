package n;

import android.view.View;
import androidx.appcompat.view.menu.ActionMenuItemView;
import o.AbstractViewOnTouchListenerC1219v0;
import o.C1187f;
import o.C1189g;
import o.C1193i;
import o.C1197k;

/* renamed from: n.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1105b extends AbstractViewOnTouchListenerC1219v0 {

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f12591m = 0;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ View f12592n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1105b(ActionMenuItemView actionMenuItemView) {
        super(actionMenuItemView);
        this.f12592n = actionMenuItemView;
    }

    @Override // o.AbstractViewOnTouchListenerC1219v0
    public final InterfaceC1101C b() {
        C1187f c1187f;
        switch (this.f12591m) {
            case 0:
                AbstractC1106c abstractC1106c = ((ActionMenuItemView) this.f12592n).f8313p;
                if (abstractC1106c != null && (c1187f = ((C1189g) abstractC1106c).f13254a.f13289x) != null) {
                    return c1187f.a();
                }
                return null;
            default:
                C1187f c1187f2 = ((C1193i) this.f12592n).f13265g.f13288w;
                if (c1187f2 == null) {
                    return null;
                }
                return c1187f2.a();
        }
    }

    @Override // o.AbstractViewOnTouchListenerC1219v0
    public final boolean c() {
        InterfaceC1101C b4;
        switch (this.f12591m) {
            case 0:
                ActionMenuItemView actionMenuItemView = (ActionMenuItemView) this.f12592n;
                l lVar = actionMenuItemView.f8311n;
                if (lVar != null && lVar.c(actionMenuItemView.k) && (b4 = b()) != null && b4.b()) {
                    return true;
                }
                return false;
            default:
                ((C1193i) this.f12592n).f13265g.n();
                return true;
        }
    }

    @Override // o.AbstractViewOnTouchListenerC1219v0
    public boolean d() {
        switch (this.f12591m) {
            case 1:
                C1197k c1197k = ((C1193i) this.f12592n).f13265g;
                if (c1197k.f13290y != null) {
                    return false;
                }
                c1197k.c();
                return true;
            default:
                return super.d();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1105b(C1193i c1193i, C1193i c1193i2) {
        super(c1193i2);
        this.f12592n = c1193i;
    }
}
