package r1;

import E2.c;
import L7.AbstractC0166y;
import Z5.y;
import a6.AbstractC0436k;
import android.accessibilityservice.AccessibilityService;
import android.accessibilityservice.GestureDescription;
import android.util.Log;
import d6.C0624j;
import e6.EnumC0646a;
import f6.AbstractC0713c;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import o6.j;
import s1.C1478a;
import s1.C1479b;
import u1.C1626a;

/* renamed from: r1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1428b {

    /* renamed from: a, reason: collision with root package name */
    public final C1479b f14262a;

    /* renamed from: b, reason: collision with root package name */
    public final C1626a f14263b;

    /* renamed from: c, reason: collision with root package name */
    public final v1.a f14264c;

    /* renamed from: d, reason: collision with root package name */
    public WeakReference f14265d;

    public C1428b(C1479b c1479b, C1626a c1626a, v1.a aVar) {
        j.e(c1479b, "gestureExecutor");
        j.e(c1626a, "notificationRequestExecutor");
        j.e(aVar, "textExecutor");
        this.f14262a = c1479b;
        this.f14263b = c1626a;
        this.f14264c = aVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0086, code lost:
    
        if (r12 == r5) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(GestureDescription gestureDescription, AbstractC0713c abstractC0713c) {
        C1427a c1427a;
        Object obj;
        int i4;
        if (abstractC0713c instanceof C1427a) {
            c1427a = (C1427a) abstractC0713c;
            int i8 = c1427a.f14261i;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                c1427a.f14261i = i8 - Integer.MIN_VALUE;
                obj = c1427a.f14259g;
                i4 = c1427a.f14261i;
                y yVar = y.f7506a;
                EnumC0646a enumC0646a = EnumC0646a.f10656d;
                if (i4 == 0) {
                    if (i4 != 1) {
                        if (i4 == 2) {
                            Z5.a.d(obj);
                            return yVar;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Z5.a.d(obj);
                } else {
                    Z5.a.d(obj);
                    AccessibilityService b4 = b();
                    if (b4 != null) {
                        c1427a.f14261i = 1;
                        C1479b c1479b = this.f14262a;
                        if (c1479b.f14446b != null) {
                            Log.w("GestureExecutor", "Previous gesture result is not available yet, clearing listener to avoid stale events");
                            c1479b.f14445a = null;
                            c1479b.f14446b = null;
                        }
                        AccessibilityService.GestureResultCallback gestureResultCallback = c1479b.f14445a;
                        if (gestureResultCallback == null) {
                            gestureResultCallback = new C1478a(c1479b);
                        }
                        c1479b.f14445a = gestureResultCallback;
                        C0624j c0624j = new C0624j(c.d0(c1427a));
                        c1479b.f14446b = c0624j;
                        try {
                            b4.dispatchGesture(gestureDescription, c1479b.f14445a, null);
                        } catch (RuntimeException e9) {
                            Log.w("GestureExecutor", "System is not responsive, the user might be spamming gesture too quickly", e9);
                            c1479b.f14449e++;
                            c1479b.a(true);
                        }
                        obj = c0624j.a();
                    }
                    return yVar;
                }
                if (!((Boolean) obj).booleanValue()) {
                    Log.w("ServiceActionExecutor", "System did not execute the gesture properly, delaying processing to avoid spamming slow system");
                    c1427a.f14261i = 2;
                    if (AbstractC0166y.g(500L, c1427a) == enumC0646a) {
                        return enumC0646a;
                    }
                }
                return yVar;
            }
        }
        c1427a = new C1427a(this, abstractC0713c);
        obj = c1427a.f14259g;
        i4 = c1427a.f14261i;
        y yVar2 = y.f7506a;
        EnumC0646a enumC0646a2 = EnumC0646a.f10656d;
        if (i4 == 0) {
        }
        if (!((Boolean) obj).booleanValue()) {
        }
        return yVar2;
    }

    public final AccessibilityService b() {
        WeakReference weakReference = this.f14265d;
        if (weakReference == null) {
            Log.w("ServiceActionExecutor", "Can't get accessibility service, init has not been called");
            return null;
        }
        AccessibilityService accessibilityService = (AccessibilityService) weakReference.get();
        if (accessibilityService == null) {
            Log.w("ServiceActionExecutor", "Can't get accessibility service, it has been destroyed");
            return null;
        }
        return accessibilityService;
    }

    public final void c() {
        C1479b c1479b = this.f14262a;
        c1479b.f14447c = 0L;
        c1479b.f14448d = 0L;
        c1479b.f14449e = 0L;
        c1479b.f14445a = null;
        c1479b.f14446b = null;
        C1626a c1626a = this.f14263b;
        o1.a aVar = c1626a.f15296b;
        LinkedHashMap linkedHashMap = aVar.f13436a;
        Collection values = linkedHashMap.values();
        LinkedHashMap linkedHashMap2 = aVar.f13438c;
        ArrayList C02 = AbstractC0436k.C0(values, linkedHashMap2.values());
        linkedHashMap.values().clear();
        aVar.f13437b = 100;
        linkedHashMap2.values().clear();
        aVar.f13439d = -100;
        Iterator it = C02.iterator();
        while (it.hasNext()) {
            c1626a.f15298d.f1148b.cancel(null, ((Number) it.next()).intValue());
        }
    }
}
