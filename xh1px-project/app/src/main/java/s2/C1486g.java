package s2;

import I7.v;
import L7.InterfaceC0163v;
import Z5.y;
import android.accessibilityservice.AccessibilityService;
import android.os.Build;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import b6.C0538f;
import b6.C0539g;
import d6.InterfaceC0617c;
import f6.AbstractC0720j;
import g0.b0;
import java.util.Iterator;
import java.util.Map;
import n6.InterfaceC1164c;
import r1.C1428b;

/* renamed from: s2.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1486g extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ b0 f14465h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ f2.j f14466i;
    public final /* synthetic */ C0538f j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1486g(b0 b0Var, f2.j jVar, C0538f c0538f, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.f14465h = b0Var;
        this.f14466i = jVar;
        this.j = c0538f;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        C1486g c1486g = (C1486g) p((InterfaceC0617c) obj2, (InterfaceC0163v) obj);
        y yVar = y.f7506a;
        c1486g.v(yVar);
        return yVar;
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        return new C1486g(this.f14465h, this.f14466i, this.j, interfaceC0617c);
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction;
        Z5.a.d(obj);
        C1428b c1428b = (C1428b) this.f14465h.f10987d;
        f2.j jVar = this.f14466i;
        String str = jVar.f10728e;
        Iterator it = ((C0539g) this.j.entrySet()).iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            str = v.Z(str, A.j.p("{", (String) entry.getKey(), "}"), String.valueOf(((Number) entry.getValue()).intValue()));
        }
        boolean z8 = jVar.f10729f;
        c1428b.getClass();
        AccessibilityService b4 = c1428b.b();
        if (b4 != null) {
            c1428b.f14264c.getClass();
            AccessibilityNodeInfo findFocus = b4.findFocus(1);
            if (findFocus != null) {
                Bundle bundle = new Bundle();
                bundle.putCharSequence("ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE", str);
                if (findFocus.performAction(2097152, bundle) && z8 && Build.VERSION.SDK_INT >= 30) {
                    accessibilityAction = AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER;
                    o6.j.d(accessibilityAction, "ACTION_IME_ENTER");
                    if (findFocus.getActionList().contains(accessibilityAction)) {
                        findFocus.performAction(accessibilityAction.getId());
                    }
                }
            }
        }
        return y.f7506a;
    }
}
